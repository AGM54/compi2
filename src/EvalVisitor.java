import org.antlr.v4.runtime.tree.ParseTree;
import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends ifgramaBaseVisitor<Integer> {
    private Map<String, Integer> memory = new HashMap<>();

    @Override
    public Integer visitAssign(ifgramaParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        int value = visit(ctx.expr());
        memory.put(id, value);
        System.out.println(id + " = " + value);
        return value;
    }

    @Override
    public Integer visitIfStat(ifgramaParser.IfStatContext ctx) {
        int condition = visit(ctx.expr());
        if (condition != 0) {
            visit(ctx.stat());
        }
        return 0;
    }

    @Override
    public Integer visitMulDiv(ifgramaParser.MulDivContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if (ctx.op.getType() == ifgramaParser.MUL) {
            return left * right;
        } else {
            return left / right;
        }
    }

    @Override
    public Integer visitAddSub(ifgramaParser.AddSubContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if (ctx.op.getType() == ifgramaParser.ADD) {
            return left + right;
        } else {
            return left - right;
        }
    }

    @Override
    public Integer visitCompare(ifgramaParser.CompareContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        switch (ctx.op.getType()) {
            case ifgramaParser.EQ:
                return left == right ? 1 : 0;
            case ifgramaParser.NEQ:
                return left != right ? 1 : 0;
            case ifgramaParser.LT:
                return left < right ? 1 : 0;
            case ifgramaParser.GT:
                return left > right ? 1 : 0;
            case ifgramaParser.LEQ:
                return left <= right ? 1 : 0;
            case ifgramaParser.GEQ:
                return left >= right ? 1 : 0;
            default:
                return 0;
        }
    }

    @Override
    public Integer visitInt(ifgramaParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public Integer visitId(ifgramaParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if (memory.containsKey(id)) {
            return memory.get(id);
        }
        return 0;
    }

    @Override
    public Integer visitParens(ifgramaParser.ParensContext ctx) {
        return visit(ctx.expr());
    }
}
