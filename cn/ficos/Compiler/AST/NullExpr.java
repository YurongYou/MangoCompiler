package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Operand.Constant;
import cn.ficos.Compiler.Gadgets.Position;

/**
 * The "null" node in AST
 */
public class NullExpr extends ExprStmt {
    public NullExpr(Position _pos) {
        super(null, _pos, new Constant(0));
    }
}