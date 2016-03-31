package AST;

import Gadgets.Position;
import Gadgets.Scope.GlobalScope;
import Gadgets.Scope.Scope;

/**
 * The logical-not expression in AST.
 * Created by Ficos on 16/3/31.
 */
public class LogNotExpr extends ExprStmt {
    ExprStmt base;

    public LogNotExpr(ExprStmt _base, Scope _currScope, Position _pos) {
        super(GlobalScope.BOOL, _currScope, _pos);
        base = _base;
    }
}
