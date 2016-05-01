package cn.ficos.Compiler.Gadgets.Type;

import cn.ficos.Compiler.Exceptions.FalseArrayInit;
import cn.ficos.Compiler.Gadgets.CONSTANT;
import cn.ficos.Compiler.Gadgets.Name;

/**
 * Array Type, note that the base type can also be an ArrayType, and can not be null
 * This is the only Type class that can be arbitrarily created
 * Created by Ficos on 16/3/30.
 */
public class ArrayType extends Type {
    public static ArrayType virtualArrayType = new ArrayType();
    private Type baseType;

    private ArrayType() {
        baseType = null;
    }

    public ArrayType(Type _base) {
        baseType = _base;
        if (baseType == null) throw new FalseArrayInit();
    }

    public static void main(String[] args) {
        Type base1 = new BuiltInType(Name.getName("ficos"), CONSTANT.wordSize);
        Type base2 = base1;

        ArrayType a1 = new ArrayType(base1);
//        ArrayType aa1 = new ArrayType(a1);
//        ArrayType b1 = new ArrayType(base2);
//        ArrayType bb1 = new ArrayType(b1);
//
//        System.out.println(aa1.isSuitableAs(bb1));
//        System.out.println(aa1.isSuitableAs(null));
        System.out.println(a1.isSuitableAs(virtualArrayType));
    }

    /**
     * To check whether two Array Type is suitable
     *
     * @param rhs The other Type instance to compare with
     * @return whether this equals to rhs
     */
    @Override
    public Boolean isSuitableAs(Type rhs) {
        //since an array can be null
        if (rhs == null || rhs == virtualArrayType) return true;
        return rhs instanceof ArrayType
                && baseType.isSuitableAs(((ArrayType) rhs).baseType);
    }

    @Override
    public String toString() {
        if (this == virtualArrayType) return "virtualArray";
        return baseType.toString() + "[]";
    }

    public Type getBaseType() {
        return baseType;
    }

    @Override
    public int variableSize() {
        //the address is 4 words
        return CONSTANT.wordSize;
    }

    @Override
    public int totalSize() {
        return CONSTANT.wordSize;
    }

}