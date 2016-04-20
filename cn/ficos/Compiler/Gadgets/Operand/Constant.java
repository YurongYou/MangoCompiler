package cn.ficos.Compiler.Gadgets.Operand;

/**
 * This class means the constant operand
 * Created by Ficos on 16/4/20.
 */
public class Constant extends Operand {
    int value;

    public Constant(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        System.out.println(new Constant(23333));
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "C::" + value;
    }
}