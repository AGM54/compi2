import org.antlr.v4.runtime.tree.ParseTree;
import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends gramaticaparenBaseVisitor<Integer> {
    private Map<String, Integer> memory = new HashMap<>();

    @Override
    public Integer visitAssign(gramaticaparenParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        int value = visit(ctx.expr());
        memory.put(id, value);
        System.out.println(id + " = " + value);
        return value;
    }

    @Override
    public Integer visitMulDiv(gramaticaparenParser.MulDivContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if (ctx.op.getType() == gramaticaparenParser.MUL) {
            return left * right;
        } else {
            return left / right;
        }
    }

    @Override
    public Integer visitAddSub(gramaticaparenParser.AddSubContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if (ctx.op.getType() == gramaticaparenParser.ADD) {
            return left + right;
        } else {
            return left - right;
        }
    }

    @Override
    public Integer visitInt(gramaticaparenParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public Integer visitId(gramaticaparenParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (memory.containsKey(id)) {
            return memory.get(id);
        }
        return 0;
    }

    @Override
    public Integer visitParens(gramaticaparenParser.ParensContext ctx) {
        return visit(ctx.expr());
    }
}
