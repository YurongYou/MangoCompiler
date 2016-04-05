package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;

/**
 * The continue statement node in AST.
 * Created by Ficos on 16/3/31.
 */
public class ContinueStmt extends Stmt {
    LoopScope continueTo;

    public ContinueStmt(LoopScope _continueTo, Position _pos) {
        super(_pos);
        continueTo = _continueTo;
    }
}