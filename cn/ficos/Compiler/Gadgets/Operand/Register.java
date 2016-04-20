package cn.ficos.Compiler.Gadgets.Operand;

/**
 * This class means the operand is a reg
 * Created by Ficos on 16/4/20.
 */
public abstract class Register extends Operand {
    private static int count = 0;
    private int ID;

    Register() {
        ID = count++;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "$R" + ID;
    }
}
