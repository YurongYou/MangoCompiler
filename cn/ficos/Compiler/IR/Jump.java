package cn.ficos.Compiler.IR;

/**
 * This class serves as a jump node of IR
 * Created by Ficos on 16/4/18.
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
}