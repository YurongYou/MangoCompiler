package Gadgets.Type;

import CompileException.FalseArrayInit;

/**
 * Array Type, note that the base type can also be an ArrayType, and can not be null
 * Created by Ficos on 16/3/30.
 */
public class ArrayType extends Type {
    Type baseType;


    public ArrayType(Type _base) {
        baseType = _base;
        if (baseType == null) throw new FalseArrayInit();
    }

    /**
     * To check whether two Array Type is suitable
     * @param rhs The other Type instance to compare with
     * @return whether this equals to rhs
     */
    @Override
    public Boolean isSuitableAs(Type rhs) {
        //since an array can be null
        if (rhs == null) return true;
        return rhs instanceof ArrayType
                && baseType.isSuitableAs(((ArrayType) rhs).baseType);
    }

    public static void main(String[] args) {
        Type base1 = new BuiltInType();
        Type base2 = base1;

        ArrayType a1 = new ArrayType(base1);
        ArrayType aa1 = new ArrayType(a1);
        ArrayType b1 = new ArrayType(base2);
        ArrayType bb1 = new ArrayType(b1);

        System.out.println(aa1.isSuitableAs(bb1));
    }
}