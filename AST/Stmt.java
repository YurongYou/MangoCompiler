package AST;

import Gadgets.Position;
import Gadgets.Scope.Scope;

/**
 * The abstract node class for statements in AST
 * Created by Ficos on 16/3/31.
 */
public abstract class Stmt extends AST {
    Stmt(Scope _currScope, Position _pos) {
        super(_currScope, _pos);
    }
}