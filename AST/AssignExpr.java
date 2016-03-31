package AST;

import Gadgets.Position;
import Gadgets.Scope.Scope;

/**
 * The assignment expression (e.g. a = b, t = 1, etc.) node in AST
 * Created by Ficos on 16/3/31.
 */
public class AssignExpr extends ExprStmt {
    ExprStmt lhs;
    ExprStmt rhs;

    public AssignExpr(ExprStmt _lhs, ExprStmt _rhs, Scope _currScope, Position _pos) {
        super(_rhs.getType(), _currScope, _pos);
        lhs = _lhs;
        rhs = _rhs;
    }
}