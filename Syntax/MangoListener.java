// Generated from /Users/youyurong/Dropbox/课程/Compiler/Mango/src/SyntaxAnalysis/Mango.g4 by ANTLR 4.5.1
package Syntax;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MangoParser}.
 */
public interface MangoListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link MangoParser#prog}.
     *
     * @param ctx the parse tree
     */
    void enterProg(MangoParser.ProgContext ctx);

    /**
     * Exit a parse tree produced by {@link MangoParser#prog}.
     *
     * @param ctx the parse tree
     */
    void exitProg(MangoParser.ProgContext ctx);

    /**
     * Enter a parse tree produced by {@link MangoParser#decl}.
     *
     * @param ctx the parse tree
     */
    void enterDecl(MangoParser.DeclContext ctx);

    /**
     * Exit a parse tree produced by {@link MangoParser#decl}.
     *
     * @param ctx the parse tree
     */
    void exitDecl(MangoParser.DeclContext ctx);

    /**
     * Enter a parse tree produced by {@link MangoParser#varDecl}.
     *
     * @param ctx the parse tree
     */
    void enterVarDecl(MangoParser.VarDeclContext ctx);

    /**
     * Exit a parse tree produced by {@link MangoParser#varDecl}.
     *
     * @param ctx the parse tree
     */
    void exitVarDecl(MangoParser.VarDeclContext ctx);

    /**
     * Enter a parse tree produced by {@link MangoParser#creationExpr}.
     *
     * @param ctx the parse tree
     */
    void enterCreationExpr(MangoParser.CreationExprContext ctx);

    /**
     * Exit a parse tree produced by {@link MangoParser#creationExpr}.
     *
     * @param ctx the parse tree
     */
    void exitCreationExpr(MangoParser.CreationExprContext ctx);

    /**
     * Enter a parse tree produced by {@link MangoParser#dimExpr}.
     *
     * @param ctx the parse tree
     */
    void enterDimExpr(MangoParser.DimExprContext ctx);

    /**
     * Exit a parse tree produced by {@link MangoParser#dimExpr}.
     *
     * @param ctx the parse tree
     */
    void exitDimExpr(MangoParser.DimExprContext ctx);

    /**
     * Enter a parse tree produced by {@link MangoParser#type}.
     *
     * @param ctx the parse tree
     */
    void enterType(MangoParser.TypeContext ctx);

    /**
     * Exit a parse tree produced by {@link MangoParser#type}.
     *
     * @param ctx the parse tree
     */
    void exitType(MangoParser.TypeContext ctx);

    /**
     * Enter a parse tree produced by {@link MangoParser#returnType}.
     *
     * @param ctx the parse tree
     */
    void enterReturnType(MangoParser.ReturnTypeContext ctx);

    /**
     * Exit a parse tree produced by {@link MangoParser#returnType}.
     *
     * @param ctx the parse tree
     */
    void exitReturnType(MangoParser.ReturnTypeContext ctx);

    /**
     * Enter a parse tree produced by {@link MangoParser#funcDecl}.
     *
     * @param ctx the parse tree
     */
    void enterFuncDecl(MangoParser.FuncDeclContext ctx);

    /**
     * Exit a parse tree produced by {@link MangoParser#funcDecl}.
     *
     * @param ctx the parse tree
     */
    void exitFuncDecl(MangoParser.FuncDeclContext ctx);

    /**
     * Enter a parse tree produced by {@link MangoParser#formalParameterList}.
     *
     * @param ctx the parse tree
     */
    void enterFormalParameterList(MangoParser.FormalParameterListContext ctx);

    /**
     * Exit a parse tree produced by {@link MangoParser#formalParameterList}.
     *
     * @param ctx the parse tree
     */
    void exitFormalParameterList(MangoParser.FormalParameterListContext ctx);

    /**
     * Enter a parse tree produced by {@link MangoParser#formalParameter}.
     *
     * @param ctx the parse tree
     */
    void enterFormalParameter(MangoParser.FormalParameterContext ctx);

    /**
     * Exit a parse tree produced by {@link MangoParser#formalParameter}.
     *
     * @param ctx the parse tree
     */
    void exitFormalParameter(MangoParser.FormalParameterContext ctx);

    /**
     * Enter a parse tree produced by {@link MangoParser#block}.
     *
     * @param ctx the parse tree
     */
    void enterBlock(MangoParser.BlockContext ctx);

    /**
     * Exit a parse tree produced by {@link MangoParser#block}.
     *
     * @param ctx the parse tree
     */
    void exitBlock(MangoParser.BlockContext ctx);

    /**
     * Enter a parse tree produced by {@link MangoParser#stmt}.
     *
     * @param ctx the parse tree
     */
    void enterStmt(MangoParser.StmtContext ctx);

    /**
     * Exit a parse tree produced by {@link MangoParser#stmt}.
     *
     * @param ctx the parse tree
     */
    void exitStmt(MangoParser.StmtContext ctx);

    /**
     * Enter a parse tree produced by the {@code ReturnStmt}
     * labeled alternative in {@link MangoParser#jumpStmt}.
     *
     * @param ctx the parse tree
     */
    void enterReturnStmt(MangoParser.ReturnStmtContext ctx);

    /**
     * Exit a parse tree produced by the {@code ReturnStmt}
     * labeled alternative in {@link MangoParser#jumpStmt}.
     *
     * @param ctx the parse tree
     */
    void exitReturnStmt(MangoParser.ReturnStmtContext ctx);

    /**
     * Enter a parse tree produced by the {@code BreakStmt}
     * labeled alternative in {@link MangoParser#jumpStmt}.
     *
     * @param ctx the parse tree
     */
    void enterBreakStmt(MangoParser.BreakStmtContext ctx);

    /**
     * Exit a parse tree produced by the {@code BreakStmt}
     * labeled alternative in {@link MangoParser#jumpStmt}.
     *
     * @param ctx the parse tree
     */
    void exitBreakStmt(MangoParser.BreakStmtContext ctx);

    /**
     * Enter a parse tree produced by the {@code ContinueStmt}
     * labeled alternative in {@link MangoParser#jumpStmt}.
     *
     * @param ctx the parse tree
     */
    void enterContinueStmt(MangoParser.ContinueStmtContext ctx);

    /**
     * Exit a parse tree produced by the {@code ContinueStmt}
     * labeled alternative in {@link MangoParser#jumpStmt}.
     *
     * @param ctx the parse tree
     */
    void exitContinueStmt(MangoParser.ContinueStmtContext ctx);

    /**
     * Enter a parse tree produced by {@link MangoParser#selectionStmt}.
     *
     * @param ctx the parse tree
     */
    void enterSelectionStmt(MangoParser.SelectionStmtContext ctx);

    /**
     * Exit a parse tree produced by {@link MangoParser#selectionStmt}.
     *
     * @param ctx the parse tree
     */
    void exitSelectionStmt(MangoParser.SelectionStmtContext ctx);

    /**
     * Enter a parse tree produced by the {@code WhileLoop}
     * labeled alternative in {@link MangoParser#iterationStmt}.
     *
     * @param ctx the parse tree
     */
    void enterWhileLoop(MangoParser.WhileLoopContext ctx);

    /**
     * Exit a parse tree produced by the {@code WhileLoop}
     * labeled alternative in {@link MangoParser#iterationStmt}.
     *
     * @param ctx the parse tree
     */
    void exitWhileLoop(MangoParser.WhileLoopContext ctx);

    /**
     * Enter a parse tree produced by the {@code ForLoop}
     * labeled alternative in {@link MangoParser#iterationStmt}.
     *
     * @param ctx the parse tree
     */
    void enterForLoop(MangoParser.ForLoopContext ctx);

    /**
     * Exit a parse tree produced by the {@code ForLoop}
     * labeled alternative in {@link MangoParser#iterationStmt}.
     *
     * @param ctx the parse tree
     */
    void exitForLoop(MangoParser.ForLoopContext ctx);

    /**
     * Enter a parse tree produced by the {@code Shift}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterShift(MangoParser.ShiftContext ctx);

    /**
     * Exit a parse tree produced by the {@code Shift}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitShift(MangoParser.ShiftContext ctx);

    /**
     * Enter a parse tree produced by the {@code Bracket}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterBracket(MangoParser.BracketContext ctx);

    /**
     * Exit a parse tree produced by the {@code Bracket}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitBracket(MangoParser.BracketContext ctx);

    /**
     * Enter a parse tree produced by the {@code Call}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterCall(MangoParser.CallContext ctx);

    /**
     * Exit a parse tree produced by the {@code Call}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitCall(MangoParser.CallContext ctx);

    /**
     * Enter a parse tree produced by the {@code FieldAndMethod}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterFieldAndMethod(MangoParser.FieldAndMethodContext ctx);

    /**
     * Exit a parse tree produced by the {@code FieldAndMethod}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitFieldAndMethod(MangoParser.FieldAndMethodContext ctx);

    /**
     * Enter a parse tree produced by the {@code BitOr}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterBitOr(MangoParser.BitOrContext ctx);

    /**
     * Exit a parse tree produced by the {@code BitOr}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitBitOr(MangoParser.BitOrContext ctx);

    /**
     * Enter a parse tree produced by the {@code Creation}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterCreation(MangoParser.CreationContext ctx);

    /**
     * Exit a parse tree produced by the {@code Creation}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitCreation(MangoParser.CreationContext ctx);

    /**
     * Enter a parse tree produced by the {@code SelfOpPost}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterSelfOpPost(MangoParser.SelfOpPostContext ctx);

    /**
     * Exit a parse tree produced by the {@code SelfOpPost}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitSelfOpPost(MangoParser.SelfOpPostContext ctx);

    /**
     * Enter a parse tree produced by the {@code LogOr}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterLogOr(MangoParser.LogOrContext ctx);

    /**
     * Exit a parse tree produced by the {@code LogOr}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitLogOr(MangoParser.LogOrContext ctx);

    /**
     * Enter a parse tree produced by the {@code Constant}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterConstant(MangoParser.ConstantContext ctx);

    /**
     * Exit a parse tree produced by the {@code Constant}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitConstant(MangoParser.ConstantContext ctx);

    /**
     * Enter a parse tree produced by the {@code Index}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterIndex(MangoParser.IndexContext ctx);

    /**
     * Exit a parse tree produced by the {@code Index}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitIndex(MangoParser.IndexContext ctx);

    /**
     * Enter a parse tree produced by the {@code LogAnd}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterLogAnd(MangoParser.LogAndContext ctx);

    /**
     * Exit a parse tree produced by the {@code LogAnd}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitLogAnd(MangoParser.LogAndContext ctx);

    /**
     * Enter a parse tree produced by the {@code PlusMinus}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterPlusMinus(MangoParser.PlusMinusContext ctx);

    /**
     * Exit a parse tree produced by the {@code PlusMinus}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitPlusMinus(MangoParser.PlusMinusContext ctx);

    /**
     * Enter a parse tree produced by the {@code Relation}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterRelation(MangoParser.RelationContext ctx);

    /**
     * Exit a parse tree produced by the {@code Relation}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitRelation(MangoParser.RelationContext ctx);

    /**
     * Enter a parse tree produced by the {@code LogNot}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterLogNot(MangoParser.LogNotContext ctx);

    /**
     * Exit a parse tree produced by the {@code LogNot}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitLogNot(MangoParser.LogNotContext ctx);

    /**
     * Enter a parse tree produced by the {@code BitXor}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterBitXor(MangoParser.BitXorContext ctx);

    /**
     * Exit a parse tree produced by the {@code BitXor}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitBitXor(MangoParser.BitXorContext ctx);

    /**
     * Enter a parse tree produced by the {@code SelfOpPre}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterSelfOpPre(MangoParser.SelfOpPreContext ctx);

    /**
     * Exit a parse tree produced by the {@code SelfOpPre}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitSelfOpPre(MangoParser.SelfOpPreContext ctx);

    /**
     * Enter a parse tree produced by the {@code Equal}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterEqual(MangoParser.EqualContext ctx);

    /**
     * Exit a parse tree produced by the {@code Equal}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitEqual(MangoParser.EqualContext ctx);

    /**
     * Enter a parse tree produced by the {@code MulDicMod}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterMulDicMod(MangoParser.MulDicModContext ctx);

    /**
     * Exit a parse tree produced by the {@code MulDicMod}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitMulDicMod(MangoParser.MulDicModContext ctx);

    /**
     * Enter a parse tree produced by the {@code BitAnd}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterBitAnd(MangoParser.BitAndContext ctx);

    /**
     * Exit a parse tree produced by the {@code BitAnd}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitBitAnd(MangoParser.BitAndContext ctx);

    /**
     * Enter a parse tree produced by the {@code Sign}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterSign(MangoParser.SignContext ctx);

    /**
     * Exit a parse tree produced by the {@code Sign}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitSign(MangoParser.SignContext ctx);

    /**
     * Enter a parse tree produced by the {@code Assign}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterAssign(MangoParser.AssignContext ctx);

    /**
     * Exit a parse tree produced by the {@code Assign}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitAssign(MangoParser.AssignContext ctx);

    /**
     * Enter a parse tree produced by the {@code BitNot}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterBitNot(MangoParser.BitNotContext ctx);

    /**
     * Exit a parse tree produced by the {@code BitNot}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitBitNot(MangoParser.BitNotContext ctx);

    /**
     * Enter a parse tree produced by the {@code Id}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterId(MangoParser.IdContext ctx);

    /**
     * Exit a parse tree produced by the {@code Id}
     * labeled alternative in {@link MangoParser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitId(MangoParser.IdContext ctx);

    /**
     * Enter a parse tree produced by {@link MangoParser#exprList}.
     *
     * @param ctx the parse tree
     */
    void enterExprList(MangoParser.ExprListContext ctx);

    /**
     * Exit a parse tree produced by {@link MangoParser#exprList}.
     *
     * @param ctx the parse tree
     */
    void exitExprList(MangoParser.ExprListContext ctx);

    /**
     * Enter a parse tree produced by {@link MangoParser#classDecl}.
     *
     * @param ctx the parse tree
     */
    void enterClassDecl(MangoParser.ClassDeclContext ctx);

    /**
     * Exit a parse tree produced by {@link MangoParser#classDecl}.
     *
     * @param ctx the parse tree
     */
    void exitClassDecl(MangoParser.ClassDeclContext ctx);

    /**
     * Enter a parse tree produced by {@link MangoParser#classBlock}.
     *
     * @param ctx the parse tree
     */
    void enterClassBlock(MangoParser.ClassBlockContext ctx);

    /**
     * Exit a parse tree produced by {@link MangoParser#classBlock}.
     *
     * @param ctx the parse tree
     */
    void exitClassBlock(MangoParser.ClassBlockContext ctx);

    /**
     * Enter a parse tree produced by {@link MangoParser#memberDecl}.
     *
     * @param ctx the parse tree
     */
    void enterMemberDecl(MangoParser.MemberDeclContext ctx);

    /**
     * Exit a parse tree produced by {@link MangoParser#memberDecl}.
     *
     * @param ctx the parse tree
     */
    void exitMemberDecl(MangoParser.MemberDeclContext ctx);
}