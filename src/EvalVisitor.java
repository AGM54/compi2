import org.antlr.v4.runtime.tree.ParseTree;
import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends fungrammaBaseVisitor<Object> {
    private Map<String, Object> memory = new HashMap<>();
    private Map<String, fungrammaParser.FuncDefContext> functions = new HashMap<>();
    private Object returnValue = null;

    @Override
    public Object visitAssign(fungrammaParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        Object value = visit(ctx.expr());
        memory.put(id, value);
        System.out.println(id + " = " + value);
        return value;
    }

    @Override
    public Object visitFuncDef(fungrammaParser.FuncDefContext ctx) {
        String id = ctx.ID().getText();
        functions.put(id, ctx);
        return null;
    }

    @Override
    public Object visitFuncCall(fungrammaParser.FuncCallContext ctx) {
        String id = ctx.ID().getText();
        if (functions.containsKey(id)) {
            fungrammaParser.FuncDefContext funcDef = functions.get(id);
            Map<String, Object> localMemory = new HashMap<>(memory); // Guardar el estado actual de la memoria
            if (ctx.exprList() != null && funcDef.paramList() != null) {
                for (int i = 0; i < ctx.exprList().expr().size(); i++) {
                    Object arg = visit(ctx.exprList().expr(i));
                    localMemory.put(funcDef.paramList().ID(i).getText(), arg);
                }
            }
            memory = localMemory;
            returnValue = null;
            for (fungrammaParser.StatContext statCtx : funcDef.stat()) {
                if (returnValue != null) {
                    break;
                }
                visit(statCtx);
            }
            // Restaurar la memoria después de la ejecución de la función
            memory = localMemory;
            System.out.println("Resultado: " + returnValue);
            return returnValue;
        } else {
            System.err.println("Function " + id + " is not defined.");
        }
        return null;
    }

    @Override
    public Object visitReturnStat(fungrammaParser.ReturnStatContext ctx) {
        returnValue = visit(ctx.expr());
        return returnValue;
    }

    @Override
    public Object visitMulDiv(fungrammaParser.MulDivContext ctx) {
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        if (left instanceof Integer && right instanceof Integer) {
            int l = (Integer) left;
            int r = (Integer) right;
            if (ctx.op.getType() == fungrammaParser.MUL) {
                return l * r;
            } else {
                return l / r;
            }
        } else {
            throw new RuntimeException("Unsupported types for multiplication/division");
        }
    }

    @Override
    public Object visitAddSub(fungrammaParser.AddSubContext ctx) {
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));
        if (left instanceof Integer && right instanceof Integer) {
            int l = (Integer) left;
            int r = (Integer) right;
            if (ctx.op.getType() == fungrammaParser.ADD) {
                return l + r;
            } else {
                return l - r;
            }
        } else if (left instanceof String && right instanceof String) {
            String l = (String) left;
            String r = (String) right;
            if (ctx.op.getType() == fungrammaParser.ADD) {
                return l + r;
            } else {
                throw new RuntimeException("Unsupported operation for strings");
            }
        } else {
            throw new RuntimeException("Unsupported types for addition/subtraction");
        }
    }

    @Override
    public Object visitInt(fungrammaParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public Object visitString(fungrammaParser.StringContext ctx) {
        return ctx.STRING().getText().replaceAll("\"", "");
    }

    @Override
    public Object visitId(fungrammaParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (memory.containsKey(id)) {
            return memory.get(id);
        }
        return null;
    }

    @Override
    public Object visitParens(fungrammaParser.ParensContext ctx) {
        return visit(ctx.expr());
    }
}
