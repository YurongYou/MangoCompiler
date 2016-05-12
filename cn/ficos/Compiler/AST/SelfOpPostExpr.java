package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;

/**
 * The postfix self increase/decrease expression (e.g. a++, a--) in AST.
 */
public class SelfOpPostExpr extends ExprStmt {
    ExprStmt base;
    // 0:--, 1:++
    Boolean op;

    public SelfOpPostExpr(Boolean _op, ExprStmt _base, Position _pos) {
        super(_base.getType(), _pos);
        base = _base;
        op = _op;
    }

    public ExprStmt getBase() {
        return base;
    }

    public Boolean getOp() {
        return op;
    }
}