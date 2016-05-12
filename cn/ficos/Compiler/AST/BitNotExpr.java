package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;

/**
 * The bitwise-not expression in AST.
 */
public class BitNotExpr extends ExprStmt {
    ExprStmt base;

    public BitNotExpr(ExprStmt _base, Position _pos) {
        super(_base.getType(), _pos);
        base = _base;
    }

    public ExprStmt getBase() {
        return base;
    }
}
