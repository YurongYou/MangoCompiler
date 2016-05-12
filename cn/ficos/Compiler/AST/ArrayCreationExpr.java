package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.Type.ArrayType;

/**
 * The array creation expression (e.g. new int[2][]) node in AST
 */
public class ArrayCreationExpr extends ExprStmt {
    ExprStmt dim;

    public ArrayCreationExpr(ArrayType _type, ExprStmt _dim, Position _pos) {
        super(_type, _pos);
        dim = _dim;
    }

    public ExprStmt getDim() {
        return dim;
    }
}