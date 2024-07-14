// Generated from C:/Users/marce/IdeaProjects/parentesis/src/compara.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link comparaParser}.
 */
public interface comparaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link comparaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(comparaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link comparaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(comparaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link comparaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(comparaParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link comparaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(comparaParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link comparaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(comparaParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link comparaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(comparaParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link comparaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(comparaParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link comparaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(comparaParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link comparaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(comparaParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link comparaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(comparaParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link comparaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(comparaParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link comparaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(comparaParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link comparaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompare(comparaParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link comparaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompare(comparaParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link comparaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(comparaParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link comparaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(comparaParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link comparaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(comparaParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link comparaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(comparaParser.IntContext ctx);
}