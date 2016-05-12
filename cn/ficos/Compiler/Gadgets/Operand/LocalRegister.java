package cn.ficos.Compiler.Gadgets.Operand;

/**
 * This class means that the variable is defined locally.
 */
public class LocalRegister extends Register {
    @Override
    public String toString() {
        return "$LR" + ID;
    }
}