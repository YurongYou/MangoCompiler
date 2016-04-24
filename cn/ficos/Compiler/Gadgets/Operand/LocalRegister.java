package cn.ficos.Compiler.Gadgets.Operand;

/**
 * This class means that the variable is defined locally.
 * Created by Ficos on 16/4/20.
 */
public class LocalRegister extends Register {
    @Override
    public String toString() {
        return "$LR" + ID;
    }
}
