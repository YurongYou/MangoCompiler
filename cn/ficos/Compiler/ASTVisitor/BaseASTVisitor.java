package cn.ficos.Compiler.ASTVisitor;

import cn.ficos.Compiler.AST.*;

/**
 * This class serves as the base AST visitor abstract class
 * Created by Ficos on 16/4/3.
 */
abstract public class BaseASTVisitor<T> {
    abstract public T visit(ArrayCreationExpr expr);

    abstract public T visit(AssignExpr expr);

    abstract public T visit(AtomCreationExpr expr);

    abstract public T visit(BinaryExpr expr);

    abstract public T visit(BitNotExpr expr);

    abstract public T visit(Boolean expr);

    abstract public T visit(BreakStmt expr);

    abstract public T visit(CallExpr expr);

    abstract public T visit(ClassDecl expr);

    abstract public T visit(ClassFuncAccessExpr expr);

    abstract public T visit(CompoundStmt expr);

    abstract public T visit(ContinueStmt expr);

    abstract public T visit(FieldAccessExpr expr);

    abstract public T visit(ForStmt expr);

    abstract public T visit(FuncDecl expr);

    abstract public T visit(IndexExpr expr);

    abstract public T visit(IntExpr expr);

    abstract public T visit(LogBinaryExpr expr);

    abstract public T visit(LogNotExpr expr);

    abstract public T visit(NullExpr expr);

    abstract public T visit(Program expr);

    abstract public T visit(ReturnStmt expr);

    abstract public T visit(SelectionStmt expr);

    abstract public T visit(SelfOpPostExpr expr);

    abstract public T visit(SelfOpPreExpr expr);

    abstract public T visit(SignExpr expr);

    abstract public T visit(StringExpr expr);

    abstract public T visit(VarDecl expr);

    abstract public T visit(VarDeclStmt expr);

    abstract public T visit(VarExpr expr);

    abstract public T visit(WhileStmt expr);
}
