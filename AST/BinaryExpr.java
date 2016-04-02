package AST;

import Gadgets.BinaryOp;
import Gadgets.Position;

/**
 * The binary expression (e.g. 1 + 2, i % j, etc.) node in AST.
 * Note that such expression does not include logical binary expression
 * Created by Ficos on 16/3/31.
 */
public class BinaryExpr extends ExprStmt {
    BinaryOp op;
    ExprStmt lhs;
    ExprStmt rhs;

    public BinaryExpr(ExprStmt _lhs, BinaryOp _op, ExprStmt _rhs, Position _pos) {
        super(_lhs.getType(), _pos);
        op = _op;
        lhs = _lhs;
        rhs = _rhs;
    }
}