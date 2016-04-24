package cn.ficos.Compiler.IR;

/**
 * This class serves as a label in IR
 * Created by Ficos on 16/4/19.
 */
public class Label extends IRNode {
    private static int count = 0;
    String labelName;
    private int ID = count++;

    public Label(String _name) {
        labelName = _name;
//        System.out.println("create label " + ID + ": " + _name);
    }

    public String getLabelName() {
        return labelName;
    }

    @Override
    public String toString() {
        return "Label " + ID + "::" + labelName;
    }
}