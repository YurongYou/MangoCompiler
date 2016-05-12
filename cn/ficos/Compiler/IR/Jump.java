package cn.ficos.Compiler.IR;

/**
 * This class serves as a jump node of IR
 */
public class Jump extends IRNode {
    Label target;

    public Jump(Label target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return "Jump " + target;
    }

    public Label getTarget() {
        return target;
    }
}