package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;

/**
 * The break statement node in AST.
 */
public class BreakStmt extends Stmt {
    LoopScope breakTo;

    public BreakStmt(LoopScope _breakTo, Position _pos) {
        super(_pos);
        breakTo = _breakTo;
    }

    /**
     * Get where the break stmt breaks to, for the convenience in building IR
     *
     * @return the label where the break stmt breaks to
     */
    public LoopScope getBreakTo() {
        return breakTo;
    }
}