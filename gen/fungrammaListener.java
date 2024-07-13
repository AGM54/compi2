// Generated from C:/Users/marce/IdeaProjects/funciones/src/fungramma.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link fungrammaParser}.
 */
public interface fungrammaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link fungrammaParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(fungrammaParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link fungrammaParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(fungrammaParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link fungrammaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(fungrammaParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link fungrammaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(fungrammaParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcDef}
	 * labeled alternative in {@link fungrammaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(fungrammaParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcDef}
	 * labeled alternative in {@link fungrammaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(fungrammaParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link fungrammaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(fungrammaParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcCall}
	 * labeled alternative in {@link fungrammaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(fungrammaParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStat}
	 * labeled alternative in {@link fungrammaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(fungrammaParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStat}
	 * labeled alternative in {@link fungrammaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(fungrammaParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link fungrammaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(fungrammaParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link fungrammaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(fungrammaParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by {@link fungrammaParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(fungrammaParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link fungrammaParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(fungrammaParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link fungrammaParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(fungrammaParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link fungrammaParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(fungrammaParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link fungrammaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(fungrammaParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link fungrammaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(fungrammaParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link fungrammaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(fungrammaParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link fungrammaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(fungrammaParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link fungrammaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(fungrammaParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link fungrammaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(fungrammaParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link fungrammaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(fungrammaParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link fungrammaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(fungrammaParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link fungrammaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(fungrammaParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link fungrammaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(fungrammaParser.IntContext ctx);
}