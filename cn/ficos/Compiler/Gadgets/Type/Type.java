package cn.ficos.Compiler.Gadgets.Type;

import cn.ficos.Compiler.Gadgets.CONSTANT;

/**
 * Type abstract class.
 * Note when referring to a type, we should carefully retrieve it from the SymbolTable
 * Created by Ficos on 16/3/30.
 */
public abstract class Type {
    public abstract Boolean isSuitableAs(Type rhs);

    public abstract String toString();

//    public abstract int sizeOf();

    public int totalSize() {
        return CONSTANT.wordSize;
    }
}