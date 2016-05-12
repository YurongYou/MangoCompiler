package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;

/**
 * The abstract node class for declaration in AST
 */
public abstract class Decl extends AST {
    Decl(Position _pos) {
        super(_pos);
    }
}