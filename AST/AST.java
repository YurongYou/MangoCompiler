package AST;

import Gadgets.Position;

/**
 * The abstract node class in AST
 * Created by Ficos on 16/3/31.
 */
public abstract class AST {
    private Position position;

    AST(Position _pos) {
        position = _pos;
    }

    public Position getPosition() {
        return position;
    }
}