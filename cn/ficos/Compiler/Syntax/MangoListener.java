// Generated from /Users/youyurong/Dropbox/course/Compiler/Mango/src/cn/ficos/Compiler/Syntax/Mango.g4 by ANTLR 4.5.1
package cn.ficos.Compiler.Syntax;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MangoParser}.
 */
public interface MangoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MangoParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MangoParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangoParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MangoParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangoParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(MangoParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangoParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(MangoParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangoParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(MangoParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangoParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(MangoParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangoParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(MangoParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangoParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(MangoParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangoParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MangoParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangoParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MangoParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangoParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(MangoParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangoParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(MangoParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangoParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(MangoParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangoParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(MangoParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangoParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(MangoParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangoParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(MangoParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangoParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MangoParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangoParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MangoParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyStmt}
	 * labeled alternative in {@link MangoParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStmt(MangoParser.EmptyStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyStmt}
	 * labeled alternative in {@link MangoParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStmt(MangoParser.EmptyStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link MangoParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(MangoParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link MangoParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(MangoParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompoundStmt}
	 * labeled alternative in {@link MangoParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStmt(MangoParser.CompoundStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompoundStmt}
	 * labeled alternative in {@link MangoParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStmt(MangoParser.CompoundStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectionStmt}
	 * labeled alternative in {@link MangoParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStmt(MangoParser.SelectionStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectionStmt}
	 * labeled alternative in {@link MangoParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStmt(MangoParser.SelectionStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IterationStmt}
	 * labeled alternative in {@link MangoParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterIterationStmt(MangoParser.IterationStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IterationStmt}
	 * labeled alternative in {@link MangoParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitIterationStmt(MangoParser.IterationStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JumpStmt}
	 * labeled alternative in {@link MangoParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterJumpStmt(MangoParser.JumpStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JumpStmt}
	 * labeled alternative in {@link MangoParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitJumpStmt(MangoParser.JumpStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDeclStmt}
	 * labeled alternative in {@link MangoParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclStmt(MangoParser.VarDeclStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDeclStmt}
	 * labeled alternative in {@link MangoParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclStmt(MangoParser.VarDeclStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link MangoParser#jump}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(MangoParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link MangoParser#jump}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(MangoParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link MangoParser#jump}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(MangoParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStmt}
	 * labeled alternative in {@link MangoParser#jump}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(MangoParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link MangoParser#jump}.
	 * @param ctx the parse tree
	 */
	void enterContinueStmt(MangoParser.ContinueStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueStmt}
	 * labeled alternative in {@link MangoParser#jump}.
	 * @param ctx the parse tree
	 */
	void exitContinueStmt(MangoParser.ContinueStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangoParser#selection}.
	 * @param ctx the parse tree
	 */
	void enterSelection(MangoParser.SelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangoParser#selection}.
	 * @param ctx the parse tree
	 */
	void exitSelection(MangoParser.SelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangoParser#subSelection}.
	 * @param ctx the parse tree
	 */
	void enterSubSelection(MangoParser.SubSelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangoParser#subSelection}.
	 * @param ctx the parse tree
	 */
	void exitSubSelection(MangoParser.SubSelectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link MangoParser#iteration}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(MangoParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileLoop}
	 * labeled alternative in {@link MangoParser#iteration}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(MangoParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link MangoParser#iteration}.
	 * @param ctx the parse tree
	 */
	void enterForLoop(MangoParser.ForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForLoop}
	 * labeled alternative in {@link MangoParser#iteration}.
	 * @param ctx the parse tree
	 */
	void exitForLoop(MangoParser.ForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bracket}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBracket(MangoParser.BracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bracket}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBracket(MangoParser.BracketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Call}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCall(MangoParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCall(MangoParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Creation}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCreation(MangoParser.CreationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Creation}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCreation(MangoParser.CreationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelfOpPost}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSelfOpPost(MangoParser.SelfOpPostContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelfOpPost}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSelfOpPost(MangoParser.SelfOpPostContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Index}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIndex(MangoParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Index}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIndex(MangoParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDLeaf}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIDLeaf(MangoParser.IDLeafContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDLeaf}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIDLeaf(MangoParser.IDLeafContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogNot}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogNot(MangoParser.LogNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogNot}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogNot(MangoParser.LogNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelfOpPre}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSelfOpPre(MangoParser.SelfOpPreContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelfOpPre}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSelfOpPre(MangoParser.SelfOpPreContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LogBinary}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogBinary(MangoParser.LogBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LogBinary}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogBinary(MangoParser.LogBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ConstantLeaf}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConstantLeaf(MangoParser.ConstantLeafContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ConstantLeaf}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConstantLeaf(MangoParser.ConstantLeafContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binary}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinary(MangoParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binary}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinary(MangoParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sign}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSign(MangoParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sign}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSign(MangoParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign(MangoParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign(MangoParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BitNot}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBitNot(MangoParser.BitNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BitNot}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBitNot(MangoParser.BitNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FieldAccess}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(MangoParser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FieldAccess}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(MangoParser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassFuncAccess}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterClassFuncAccess(MangoParser.ClassFuncAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassFuncAccess}
	 * labeled alternative in {@link MangoParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitClassFuncAccess(MangoParser.ClassFuncAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayCreate}
	 * labeled alternative in {@link MangoParser#creationExpr}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreate(MangoParser.ArrayCreateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayCreate}
	 * labeled alternative in {@link MangoParser#creationExpr}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreate(MangoParser.ArrayCreateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AtomCreate}
	 * labeled alternative in {@link MangoParser#creationExpr}.
	 * @param ctx the parse tree
	 */
	void enterAtomCreate(MangoParser.AtomCreateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AtomCreate}
	 * labeled alternative in {@link MangoParser#creationExpr}.
	 * @param ctx the parse tree
	 */
	void exitAtomCreate(MangoParser.AtomCreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangoParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(MangoParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangoParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(MangoParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangoParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(MangoParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangoParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(MangoParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangoParser#classBlock}.
	 * @param ctx the parse tree
	 */
	void enterClassBlock(MangoParser.ClassBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangoParser#classBlock}.
	 * @param ctx the parse tree
	 */
	void exitClassBlock(MangoParser.ClassBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassField}
	 * labeled alternative in {@link MangoParser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassField(MangoParser.ClassFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassField}
	 * labeled alternative in {@link MangoParser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassField(MangoParser.ClassFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassFunction}
	 * labeled alternative in {@link MangoParser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassFunction(MangoParser.ClassFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassFunction}
	 * labeled alternative in {@link MangoParser#memberDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassFunction(MangoParser.ClassFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MangoParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(MangoParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MangoParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(MangoParser.ConstantContext ctx);
}