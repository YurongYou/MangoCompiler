package AST;

import Gadgets.Position;

/**
 * The break statement node in AST.
 * Created by Ficos on 16/3/31.
 */
public class BreakStmt extends Stmt {
    LoopScope breakTo;

    public BreakStmt(LoopScope _breakTo, Position _pos) {
        super(_pos);
        breakTo = _breakTo;
    }
}