// Generated from /Users/youyurong/Dropbox/课程/Compiler/Mango/src/SyntaxAnalysis/Mango.g4 by ANTLR 4.5.1
package Syntax;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MangoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface MangoVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link MangoParser#prog}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitProg(MangoParser.ProgContext ctx);

    /**
     * Visit a parse tree produced by {@link MangoParser#decl}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDecl(MangoParser.DeclContext ctx);

    /**
     * Visit a parse tree produced by {@link MangoParser#varDecl}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitVarDecl(MangoParser.VarDeclContext ctx);

    /**
     * Visit a parse tree produced by {@link MangoParser#creationExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCreationExpr(MangoParser.CreationExprContext ctx);

    /**
     * Visit a parse tree produced by {@link MangoParser#dimExpr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDimExpr(MangoParser.DimExprContext ctx);

    /**
     * Visit a parse tree produced by {@link MangoParser#type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitType(MangoParser.TypeContext ctx);

    /**
     * Visit a parse tree produced by {@link MangoParser#returnType}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReturnType(MangoParser.ReturnTypeContext ctx);

    /**
     * Visit a parse tree produced by {@link MangoParser#funcDecl}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFuncDecl(MangoParser.FuncDeclContext ctx);

    /**
     * Visit a parse tree produced by {@link MangoParser#formalParameterList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFormalParameterList(MangoParser.FormalParameterListContext ctx);

    /**
     * Visit a parse tree produced by {@link MangoParser#formalParameter}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFormalParameter(MangoParser.FormalParameterContext ctx);

    /**
     * Visit a parse tree produced by {@link MangoParser#block}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBlock(MangoParser.BlockContext ctx);

    /**
     * Visit a parse tree produced by {@link MangoParser#stmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStmt(MangoParser.StmtContext ctx);

    /**
     * Visit a parse tree produced by the {@code ReturnStmt}
     * labeled alternative in {@link MangoParser#jumpStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitReturnStmt(MangoParser.ReturnStmtContext ctx);

    /**
     * Visit a parse tree produced by the {@code BreakStmt}
     * labeled alternative in {@link MangoParser#jumpStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBreakStmt(MangoParser.BreakStmtContext ctx);

    /**
     * Visit a parse tree produced by the {@code ContinueStmt}
     * labeled alternative in {@link MangoParser#jumpStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitContinueStmt(MangoParser.ContinueStmtContext ctx);

    /**
     * Visit a parse tree produced by {@link MangoParser#selectionStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSelectionStmt(MangoParser.SelectionStmtContext ctx);

    /**
     * Visit a parse tree produced by the {@code WhileLoop}
     * labeled alternative in {@link MangoParser#iterationStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitWhileLoop(MangoParser.WhileLoopContext ctx);

    /**
     * Visit a parse tree produced by the {@code ForLoop}
     * labeled alternative in {@link MangoParser#iterationStmt}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitForLoop(MangoParser.ForLoopContext ctx);

    /**
     * Visit a parse tree produced by the {@code Shift}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitShift(MangoParser.ShiftContext ctx);

    /**
     * Visit a parse tree produced by the {@code Bracket}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBracket(MangoParser.BracketContext ctx);

    /**
     * Visit a parse tree produced by the {@code Call}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCall(MangoParser.CallContext ctx);

    /**
     * Visit a parse tree produced by the {@code FieldAndMethod}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitFieldAndMethod(MangoParser.FieldAndMethodContext ctx);

    /**
     * Visit a parse tree produced by the {@code BitOr}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBitOr(MangoParser.BitOrContext ctx);

    /**
     * Visit a parse tree produced by the {@code Creation}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCreation(MangoParser.CreationContext ctx);

    /**
     * Visit a parse tree produced by the {@code SelfOpPost}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSelfOpPost(MangoParser.SelfOpPostContext ctx);

    /**
     * Visit a parse tree produced by the {@code LogOr}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLogOr(MangoParser.LogOrContext ctx);

    /**
     * Visit a parse tree produced by the {@code Constant}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConstant(MangoParser.ConstantContext ctx);

    /**
     * Visit a parse tree produced by the {@code Index}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitIndex(MangoParser.IndexContext ctx);

    /**
     * Visit a parse tree produced by the {@code LogAnd}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLogAnd(MangoParser.LogAndContext ctx);

    /**
     * Visit a parse tree produced by the {@code PlusMinus}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPlusMinus(MangoParser.PlusMinusContext ctx);

    /**
     * Visit a parse tree produced by the {@code Relation}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitRelation(MangoParser.RelationContext ctx);

    /**
     * Visit a parse tree produced by the {@code LogNot}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitLogNot(MangoParser.LogNotContext ctx);

    /**
     * Visit a parse tree produced by the {@code BitXor}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBitXor(MangoParser.BitXorContext ctx);

    /**
     * Visit a parse tree produced by the {@code SelfOpPre}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSelfOpPre(MangoParser.SelfOpPreContext ctx);

    /**
     * Visit a parse tree produced by the {@code Equal}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitEqual(MangoParser.EqualContext ctx);

    /**
     * Visit a parse tree produced by the {@code MulDicMod}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMulDicMod(MangoParser.MulDicModContext ctx);

    /**
     * Visit a parse tree produced by the {@code BitAnd}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBitAnd(MangoParser.BitAndContext ctx);

    /**
     * Visit a parse tree produced by the {@code Sign}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSign(MangoParser.SignContext ctx);

    /**
     * Visit a parse tree produced by the {@code Assign}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitAssign(MangoParser.AssignContext ctx);

    /**
     * Visit a parse tree produced by the {@code BitNot}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBitNot(MangoParser.BitNotContext ctx);

    /**
     * Visit a parse tree produced by the {@code Id}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitId(MangoParser.IdContext ctx);

    /**
     * Visit a parse tree produced by {@link MangoParser#exprList}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitExprList(MangoParser.ExprListContext ctx);

    /**
     * Visit a parse tree produced by {@link MangoParser#classDecl}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitClassDecl(MangoParser.ClassDeclContext ctx);

    /**
     * Visit a parse tree produced by {@link MangoParser#classBlock}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitClassBlock(MangoParser.ClassBlockContext ctx);

    /**
     * Visit a parse tree produced by {@link MangoParser#memberDecl}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitMemberDecl(MangoParser.MemberDeclContext ctx);
}