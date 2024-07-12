// Generated from C:/Users/marce/IdeaProjects/ifywhile/src/ifgrama.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ifgramaParser}.
 */
public interface ifgramaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ifgramaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ifgramaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ifgramaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ifgramaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ifgramaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(ifgramaParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link ifgramaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(ifgramaParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link ifgramaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(ifgramaParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link ifgramaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(ifgramaParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link ifgramaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(ifgramaParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link ifgramaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(ifgramaParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ifgramaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(ifgramaParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link ifgramaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(ifgramaParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ifgramaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(ifgramaParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link ifgramaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(ifgramaParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ifgramaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(ifgramaParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link ifgramaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(ifgramaParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ifgramaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(ifgramaParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link ifgramaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(ifgramaParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link ifgramaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompare(ifgramaParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link ifgramaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompare(ifgramaParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link ifgramaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(ifgramaParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ifgramaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(ifgramaParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link ifgramaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(ifgramaParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ifgramaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(ifgramaParser.IntContext ctx);
}