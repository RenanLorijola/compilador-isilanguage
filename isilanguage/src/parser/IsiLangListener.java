// Generated from IsiLang.g4 by ANTLR 4.10.1
package isilanguage.src.parser;

    import isilanguage.src.datastructures.*;
    import isilanguage.src.ast.*;
    import isilanguage.src.exceptions.IsiSemanticException;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Stack;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IsiLangParser}.
 */
public interface IsiLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(IsiLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(IsiLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(IsiLangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(IsiLangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(IsiLangParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(IsiLangParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(IsiLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(IsiLangParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(IsiLangParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(IsiLangParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#commandread}.
	 * @param ctx the parse tree
	 */
	void enterCommandread(IsiLangParser.CommandreadContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#commandread}.
	 * @param ctx the parse tree
	 */
	void exitCommandread(IsiLangParser.CommandreadContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#commandwrite}.
	 * @param ctx the parse tree
	 */
	void enterCommandwrite(IsiLangParser.CommandwriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#commandwrite}.
	 * @param ctx the parse tree
	 */
	void exitCommandwrite(IsiLangParser.CommandwriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#commandattrib}.
	 * @param ctx the parse tree
	 */
	void enterCommandattrib(IsiLangParser.CommandattribContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#commandattrib}.
	 * @param ctx the parse tree
	 */
	void exitCommandattrib(IsiLangParser.CommandattribContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#commandif}.
	 * @param ctx the parse tree
	 */
	void enterCommandif(IsiLangParser.CommandifContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#commandif}.
	 * @param ctx the parse tree
	 */
	void exitCommandif(IsiLangParser.CommandifContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#commandwhile}.
	 * @param ctx the parse tree
	 */
	void enterCommandwhile(IsiLangParser.CommandwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#commandwhile}.
	 * @param ctx the parse tree
	 */
	void exitCommandwhile(IsiLangParser.CommandwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(IsiLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(IsiLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(IsiLangParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(IsiLangParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link IsiLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(IsiLangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IsiLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(IsiLangParser.TypeContext ctx);
}