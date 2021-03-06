package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.BinaryOp;
import cn.ficos.Compiler.Gadgets.Operand.Operand;

/**
 * This tag is for the convenience of creating IR
 */
public interface BinaryExpr {
    ExprStmt getLhs();

    ExprStmt getRhs();

    BinaryOp getOp();

    Operand getOperand();
}