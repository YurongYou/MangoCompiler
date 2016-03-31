package AST;

import Gadgets.LogBinaryOp;
import Gadgets.Position;
import Gadgets.Scope.GlobalScope;
import Gadgets.Scope.Scope;

/**
 * The logical binary expression (e.g. 1 != 2, a == b, e | d, etc.) node in AST.
 * Created by Ficos on 16/3/31.
 */
public class LogBinaryExpr extends ExprStmt {
    LogBinaryOp op;
    ExprStmt lhs;
    ExprStmt rhs;

    public LogBinaryExpr(ExprStmt _lhs, LogBinaryOp _op, ExprStmt _rhs, Scope _currScope, Position _pos) {
        super(GlobalScope.BOOL, _currScope, _pos);
        op = _op;
        lhs = _lhs;
        rhs = _rhs;
    }
}