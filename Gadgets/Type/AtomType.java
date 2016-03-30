package Gadgets.Type;

/**
 * Created by Ficos on 16/3/30.
 */
public class AtomType extends Type {

    /**
     * To check whether two Atom Type is suitable
     * Current version of language does not support inherent, thus just compare the memory address of two type
     *
     * @param rhs the other type
     * @return
     */
    @Override
    public Boolean isSuitableAs(Type rhs) {
        return rhs == this;
    }
}
