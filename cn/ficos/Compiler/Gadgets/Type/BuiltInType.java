package cn.ficos.Compiler.Gadgets.Type;

import cn.ficos.Compiler.Exceptions.Bug_New_a_BuiltIn_Type;
import cn.ficos.Compiler.Gadgets.Name;

/**
 * BuiltIn Type, such as int, string, bool

 */
public class BuiltInType extends Type {
    private Name className;
    private int byteSize;

    public BuiltInType(Name _className, int _byteSize) {
        className = _className;
        byteSize = _byteSize;
    }

    /**
     * To check whether two BuiltIn Type is suitable
     * just compare the memory address of two type is OK, for every built-in type will only be created once
     *
     * @param rhs the other type
     * @return whether or not this is suitable to be as rhs
     */
    @Override
    public Boolean isSuitableAs(Type rhs) {
        return rhs == this;
    }

    @Override
    public String toString() {
        return className.toString();
    }

    @Override
    public int variableSize() {
        return byteSize;
    }

    @Override
    public int sizeInHeap() {
        throw new Bug_New_a_BuiltIn_Type();
    }
}
