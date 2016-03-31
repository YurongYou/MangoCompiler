package AST;

import Gadgets.Position;
import Gadgets.Scope.Scope;

/**
 * The while-loop statement node in AST.
 * Created by Ficos on 16/3/31.
 */
public class WhileStatement extends Stmt {
    ExprStmt condition;
    Stmt loop;

    public WhileStatement(ExprStmt _condition, Stmt _loop, Scope _currScope, Position _pos) {
        super(_currScope, _pos);
        condition = _condition;
        loop = _loop;
    }
}