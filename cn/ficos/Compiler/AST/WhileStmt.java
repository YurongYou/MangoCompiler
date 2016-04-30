package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.IR.Label;

/**
 * The while-loop statement node in AST.
 * Created by Ficos on 16/3/31.
 */
public class WhileStmt extends Stmt implements LoopScope {
    ExprStmt condition;
    Stmt loop;
    Label afterLoop = new Label("While_AfterLoop", true);
    Label end = new Label("While_End", true);
    public WhileStmt(ExprStmt _condition, Stmt _loop, Position _pos) {
        super(_pos);
        condition = _condition;
        loop = _loop;
    }

    @Override
    public Label getBegin() {
        return afterLoop;
    }

    @Override
    public Label getEnd() {
        return end;
    }

    public void fillLoop(Stmt _loop) {
        loop = _loop;
    }

    public ExprStmt getCondition() {
        return condition;
    }

    public Stmt getLoop() {
        return loop;
    }
}