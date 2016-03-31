package AST;

import Gadgets.Position;
import Gadgets.Scope.Scope;

/**
 * The for-loop statement node in AST.
 * Fields will be set as null if it's empty
 * Created by Ficos on 16/3/31.
 */
public class ForStatement extends Stmt {
    ExprStmt init;
    ExprStmt condition;
    ExprStmt after;
    Stmt loop;

    public ForStatement(ExprStmt _init, ExprStmt _condition, ExprStmt _after, Stmt _loop, Scope _currScope, Position _pos) {
        super(_currScope, _pos);
        init = _init;
        condition = _condition;
        after = _after;
        loop = _loop;
    }
}