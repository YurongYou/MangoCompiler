package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;

/**
 * The abstract node class for statements in AST
 */
public abstract class Stmt extends AST {
    Stmt(Position _pos) {
        super(_pos);
    }
}