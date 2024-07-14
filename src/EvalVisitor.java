import org.antlr.v4.runtime.tree.ParseTree;
import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends comparaBaseVisitor<Integer> {
    private Map<String, Integer> memory = new HashMap<>();

    @Override
    public Integer visitAssign(comparaParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        int value = visit(ctx.expr());
        memory.put(id, value);
        System.out.println(id + " = " + value);
        return value;
    }

    @Override
    public Integer visitMulDiv(comparaParser.MulDivContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if (ctx.op.getType() == comparaParser.MUL) {
            return left * right;
        } else {
            return left / right;
        }
    }

    @Override
    public Integer visitAddSub(comparaParser.AddSubContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if (ctx.op.getType() == comparaParser.ADD) {
            return left + right;
        } else {
            return left - right;
        }
    }

    @Override
    public Integer visitCompare(comparaParser.CompareContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        switch (ctx.op.getType()) {
            case comparaParser.EQ:
                return left == right ? 1 : 0;
            case comparaParser.NEQ:
                return left != right ? 1 : 0;
            case comparaParser.LT:
                return left < right ? 1 : 0;
            case comparaParser.GT:
                return left > right ? 1 : 0;
            case comparaParser.LEQ:
                return left <= right ? 1 : 0;
            case comparaParser.GEQ:
                return left >= right ? 1 : 0;
            default:
                return 0;
        }
    }

    @Override
    public Integer visitInt(comparaParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public Integer visitId(comparaParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (memory.containsKey(id)) {
            return memory.get(id);
        }
        return 0;
    }

    @Override
    public Integer visitParens(comparaParser.ParensContext ctx) {
        return visit(ctx.expr());
    }
}
