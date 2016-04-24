package cn.ficos.Compiler.Gadgets.Operand;

/**
 * This class means the operand is defined globally
 * Created by Ficos on 16/4/20.
 */
public class GlobalRegister extends Register {
    @Override
    public String toString() {
        return "$GR" + ID;
    }
}
