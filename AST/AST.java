package AST;

import Gadgets.Position;
import Gadgets.Scope;

/**
 * The abstract node class in AST
 * Created by Ficos on 16/3/31.
 */
public abstract class AST {
    private Scope scope;
    private Position position;

    AST(Scope _currScope, Position _pos) {
        scope = _currScope;
        position = _pos;
    }

    public Scope getScope() {
        return scope;
    }

    public Position getPosition() {
        return position;
    }
}