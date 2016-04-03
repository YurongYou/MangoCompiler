package AST;

import Gadgets.Position;

/**
 * The while-loop statement node in AST.
 * Created by Ficos on 16/3/31.
 */
public class WhileStmt extends Stmt implements LoopScope {
    ExprStmt condition;
    Stmt loop;

    public WhileStmt(ExprStmt _condition, Stmt _loop, Position _pos) {
        super(_pos);
        condition = _condition;
        loop = _loop;
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