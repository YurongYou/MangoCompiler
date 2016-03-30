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
     * @param rhs The other Type instance to compare with
     * @return whether this equals to rhs
     */
    @Override
    Boolean equals(Type rhs) {
        if (rhs instanceof ArrayType
                && ((ArrayType) rhs).dim == dim
                && ((ArrayType) rhs).baseType == baseType) return true;
        return false;
    }
}
