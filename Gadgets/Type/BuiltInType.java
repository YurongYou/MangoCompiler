package Gadgets.Type;

/**
 * BuiltIn Type, such as int, string, bool
 * Created by Ficos on 16/3/30.
 */
public class BuiltInType extends Type {
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
}
