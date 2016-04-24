package cn.ficos.Compiler.Gadgets.Operand;

/**
 * This class means the variable is defined in the parameter list
 * Created by Ficos on 16/4/20.
 */
public class ParameterRegister extends Register {
    @Override
    public String toString() {
        return "$PR" + ID;
    }
}
