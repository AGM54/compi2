// Generated from C:/Users/marce/IdeaProjects/parentesis/src/gramaticaparen.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaparenParser}.
 */
public interface gramaticaparenListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaparenParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(gramaticaparenParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaparenParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(gramaticaparenParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link gramaticaparenParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(gramaticaparenParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link gramaticaparenParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(gramaticaparenParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link gramaticaparenParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(gramaticaparenParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link gramaticaparenParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(gramaticaparenParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link gramaticaparenParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(gramaticaparenParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link gramaticaparenParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(gramaticaparenParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link gramaticaparenParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(gramaticaparenParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link gramaticaparenParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(gramaticaparenParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link gramaticaparenParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(gramaticaparenParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link gramaticaparenParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(gramaticaparenParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link gramaticaparenParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(gramaticaparenParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link gramaticaparenParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(gramaticaparenParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link gramaticaparenParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(gramaticaparenParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link gramaticaparenParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(gramaticaparenParser.IntContext ctx);
}