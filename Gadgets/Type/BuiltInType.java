package Gadgets.Type;

/**
 * Created by Ficos on 16/3/30.
 */
public class BuiltInType extends AtomType {
    /**
     * To check whether two BuiltIn Type is suitable
     * just compare the memory address of two type is OK, for every built-in type will only be created once
     *
     * @param rhs the other type
     * @return
     */
    @Override
    public Boolean isSuitableAs(Type rhs) {
        return rhs == this;
    }
}
