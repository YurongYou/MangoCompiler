package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;

/**
 * The continue statement node in AST.
 */
public class ContinueStmt extends Stmt {
    LoopScope continueTo;

    public ContinueStmt(LoopScope _continueTo, Position _pos) {
        super(_pos);
        continueTo = _continueTo;
    }

    /**
     * Get where the continue stmt breaks to, for the convenience in building IR
     *
     * @return the label where the break stmt breaks to
     */
    public LoopScope getContinueTo() {
        return continueTo;
    }
}