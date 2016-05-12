package cn.ficos.Compiler.AST;

/**
 * This interface is intended to identify Index and FieldAccess note when constructing IR
 */
public interface AddressFetch {
    ExprStmt getBase();
}