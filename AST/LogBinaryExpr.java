package AST;

import Gadgets.LogBinaryOp;
import Gadgets.Position;
import Gadgets.SymbolTable;

/**
 * The logical binary expression (e.g. 1 != 2, a == b, e | d, etc.) node in AST.
 * Created by Ficos on 16/3/31.
 */
public class LogBinaryExpr extends ExprStmt {
    LogBinaryOp op;
    ExprStmt lhs;
    ExprStmt rhs;

    public LogBinaryExpr(ExprStmt _lhs, LogBinaryOp _op, ExprStmt _rhs, Position _pos) {
        super(SymbolTable.BOOL, _pos);
        op = _op;
        lhs = _lhs;
        rhs = _rhs;
    }
}