package AST;

import Gadgets.Position;
import Gadgets.Scope.Scope;

/**
 * The return statement node in AST.
 * Created by Ficos on 16/3/31.
 */
public class ReturnStmt extends Stmt {
    ExprStmt returnExpr;

    public ReturnStmt(ExprStmt _returnExpr, Scope _currScope, Position _pos) {
        super(_currScope, _pos);
        returnExpr = _returnExpr;
    }
}
