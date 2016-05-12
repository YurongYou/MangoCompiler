package cn.ficos.Compiler.IR;

/**
 * This class serves as a label in IR
 */
public class Label extends IRNode {
    private static int count = 0;
    String labelName;
    private int ID = count++;

    public Label(String _name, boolean isCount) {
        if (isCount) labelName = _name + "_" + ID;
        else labelName = _name;
    }

    public String getLabelName() {
        return labelName;
    }

    @Override
    public String toString() {
        return labelName;
    }
}