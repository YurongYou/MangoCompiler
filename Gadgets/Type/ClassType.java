package Gadgets.Type;

/**
 * Type for user defined class.
 * Remember to call ".equals(Type rhs)" to compare types
 * Created by Ficos on 16/3/30.
 */
public class ClassType extends Type {
    public Boolean isSuitableAs(Type rhs) {
        return (this == rhs);
    }
}