package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;

/**
 * The abstract node class in AST
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