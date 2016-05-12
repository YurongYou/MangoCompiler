package cn.ficos.Compiler.Gadgets.Operand;

/**
 * This class means the constant operand.
 */
public class Constant extends Operand {
    int value;

    public Constant(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        System.out.println(new Constant(23333));
    }

    /**
     * The actual value of the imm
     *
     * @return the actual value
     */
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}