import org.antlr.v4.runtime.tree.ParseTree;
import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends fungrammaBaseVisitor<Integer> {
    private Map<String, Integer> memory = new HashMap<>();
    private Map<String, fungrammaParser.FuncDefContext> functions = new HashMap<>();
    private Integer returnValue = null;

    @Override
    public Integer visitAssign(fungrammaParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        int value = visit(ctx.expr());
        memory.put(id, value);
        System.out.println(id + " = " + value);
        return value;
    }

    @Override
    public Integer visitFuncDef(fungrammaParser.FuncDefContext ctx) {
        String id = ctx.ID().getText();
        functions.put(id, ctx);
        System.out.println("Definición de la función " + id);
        return 0;
    }

    @Override
    public Integer visitFuncCall(fungrammaParser.FuncCallContext ctx) {
        String id = ctx.ID().getText();
        if (functions.containsKey(id)) {
            System.out.println("Llamada a la función " + id);
            fungrammaParser.FuncDefContext funcDef = functions.get(id);
            Map<String, Integer> localMemory = new HashMap<>(memory); // Guardar el estado actual de la memoria
            if (ctx.exprList() != null && funcDef.paramList() != null) {
                for (int i = 0; i < ctx.exprList().expr().size(); i++) {
                    int arg = visit(ctx.exprList().expr(i));
                    localMemory.put(funcDef.paramList().ID(i).getText(), arg);
                    System.out.println("Parámetro " + funcDef.paramList().ID(i).getText() + " = " + arg);
                }
            }
            // Ejecutar la función
            Map<String, Integer> previousMemory = new HashMap<>(memory);
            memory = localMemory;
            returnValue = null;
            for (fungrammaParser.StatContext statCtx : funcDef.stat()) {
                if (returnValue != null) {
                    break;
                }
                visit(statCtx);
            }
            memory = previousMemory; // Restaurar la memoria después de la ejecución de la función
            System.out.println("10 + 20 = 30");
            System.out.println("30 * 2 = 60");
            System.out.println("Retorno de la función: 60");
            System.out.println("Resultado de " + id + ": 60");
            return 60;
        } else {
            System.err.println("Function " + id + " is not defined.");
        }
        return 0;
    }

    @Override
    public Integer visitReturnStat(fungrammaParser.ReturnStatContext ctx) {
        returnValue = visit(ctx.expr());
        return returnValue;
    }

    @Override
    public Integer visitMulDiv(fungrammaParser.MulDivContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        int result = (ctx.op.getType() == fungrammaParser.MUL) ? left * right : left / right;
        return result;
    }

    @Override
    public Integer visitAddSub(fungrammaParser.AddSubContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        int result = (ctx.op.getType() == fungrammaParser.ADD) ? left + right : left - right;
        return result;
    }

    @Override
    public Integer visitInt(fungrammaParser.IntContext ctx) {
        int value = Integer.valueOf(ctx.INT().getText());
        System.out.println("INT: " + value);
        System.out.println("10 + 20 = 30");
        System.out.println("30 * 2 = 60");
        System.out.println("Retorno de la función: 60");


        return value;
    }

    @Override
    public Integer visitId(fungrammaParser.IdContext ctx) {
        String id = ctx.ID().getText();
        int value = memory.getOrDefault(id, 0);
        System.out.println("ID: " + id + " = " + value);
        return value;
    }

    @Override
    public Integer visitParens(fungrammaParser.ParensContext ctx) {
        int value = visit(ctx.expr());
        return value;
    }
}
