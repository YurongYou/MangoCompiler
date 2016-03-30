package Gadgets.Type;

/**
 * Created by Ficos on 16/3/30.
 */
public class ArrayType extends Type {
    int dim;
    AtomType baseType;

    ArrayType(int _dim, AtomType _base) {
        dim = _dim;
        baseType = _base;
    }

    /**
     * To check whether two Array Type is suitable
     * @param rhs The other Type instance to compare with
     * @return whether this equals to rhs
     */
    @Override
    public Boolean isSuitableAs(Type rhs) {
        if (rhs instanceof ArrayType
                && ((ArrayType) rhs).dim == dim
                && ((ArrayType) rhs).baseType.isSuitableAs(baseType)) return true;
        //since an array can be null
        if (rhs == null) return true;
        return false;
    }
}