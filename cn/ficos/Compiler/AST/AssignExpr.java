package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;

/**
 * The assignment expression (e.g. a = b, t = 1, a.b = 1,  etc.) node in AST
 */
public class AssignExpr extends ExprStmt {
    ExprStmt lhs;
    ExprStmt rhs;

    public AssignExpr(ExprStmt _lhs, ExprStmt _rhs, Position _pos) {
        super(_rhs.getType(), _pos);
        lhs = _lhs;
        rhs = _rhs;
    }

    public ExprStmt getLhs() {
        return lhs;
    }

    public ExprStmt getRhs() {
        return rhs;
    }
}