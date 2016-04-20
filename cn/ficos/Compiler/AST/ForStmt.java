package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.IR.Label;

/**
 * The for-loop statement node in AST.
 * Fields will be set as null if it's empty
 * Created by Ficos on 16/3/31.
 */
public class ForStmt extends Stmt implements LoopScope {
    ExprStmt init;
    ExprStmt condition;
    ExprStmt after;
    Stmt loop;

    Label begin = new Label("For_Begin");
    Label end = new Label("For_End");

    public ForStmt(ExprStmt _init, ExprStmt _condition, ExprStmt _after, Stmt _loop, Position _pos) {
        super(_pos);
        init = _init;
        condition = _condition;
        after = _after;
        loop = _loop;
    }

    @Override
    public Label getBegin() {
        return begin;
    }

    @Override
    public Label getEnd() {
        return end;
    }

    public void fillLoop(Stmt _loop) {
        loop = _loop;
    }

    public ExprStmt getInit() {
        return init;
    }

    public ExprStmt getCondition() {
        return condition;
    }

    public ExprStmt getAfter() {
        return after;
    }

    public Stmt getLoop() {
        return loop;
    }
}