package cn.ficos.Compiler.Gadgets.Type;

/**
 * Type abstract class.
 * Note when referring to a type, we should carefully retrieve it from the SymbolTable

 */
public abstract class Type {
    public abstract Boolean isSuitableAs(Type rhs);

    public abstract String toString();

    public abstract int variableSize();

    public abstract int sizeInHeap();

}