// Generated from /Users/youyurong/Dropbox/课程/Compiler/Mango/src/Syntax/Mango.g4 by ANTLR 4.5.1
package Syntax;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MangoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MangoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MangoParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(MangoParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangoParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(MangoParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangoParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(MangoParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangoParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(MangoParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayType}
	 * labeled alternative in {@link MangoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayType(MangoParser.ArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomType}
	 * labeled alternative in {@link MangoParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomType(MangoParser.AtomTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangoParser#funcDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(MangoParser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangoParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(MangoParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangoParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(MangoParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangoParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MangoParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyStmt}
	 * labeled alternative in {@link MangoParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStmt(MangoParser.EmptyStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link MangoParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(MangoParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompoundStmt}
	 * labeled alternative in {@link MangoParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStmt(MangoParser.CompoundStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectionStmt}
	 * labeled alternative in {@link MangoParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStmt(MangoParser.SelectionStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IterationStmt}
	 * labeled alternative in {@link MangoParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStmt(MangoParser.IterationStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JumpStmt}
	 * labeled alternative in {@link MangoParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJumpStmt(MangoParser.JumpStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclStmt}
	 * labeled alternative in {@link MangoParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclStmt(MangoParser.VarDeclStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link MangoParser#jump}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(MangoParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link MangoParser#jump}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(MangoParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link MangoParser#jump}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStmt(MangoParser.ContinueStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangoParser#selection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelection(MangoParser.SelectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangoParser#subSelection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubSelection(MangoParser.SubSelectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link MangoParser#iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(MangoParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link MangoParser#iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(MangoParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bracket}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracket(MangoParser.BracketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(MangoParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Creation}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreation(MangoParser.CreationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelfOpPost}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfOpPost(MangoParser.SelfOpPostContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Node}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode(MangoParser.NodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Index}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(MangoParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogNot}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogNot(MangoParser.LogNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ConstantNode}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantNode(MangoParser.ConstantNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelfOpPre}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfOpPre(MangoParser.SelfOpPreContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogBinary}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogBinary(MangoParser.LogBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binary}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(MangoParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sign}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(MangoParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(MangoParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BitNot}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitNot(MangoParser.BitNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FieldAccess}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldAccess(MangoParser.FieldAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ClassFuncAccess}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassFuncAccess(MangoParser.ClassFuncAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayCreate}
	 * labeled alternative in {@link MangoParser#creationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreate(MangoParser.ArrayCreateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AtomCreate}
	 * labeled alternative in {@link MangoParser#creationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomCreate(MangoParser.AtomCreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangoParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(MangoParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangoParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(MangoParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangoParser#classBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBlock(MangoParser.ClassBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MangoParser#memberDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDecl(MangoParser.MemberDeclContext ctx);
}