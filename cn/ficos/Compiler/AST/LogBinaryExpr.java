package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.BinaryOp;
import cn.ficos.Compiler.Gadgets.Operand.Operand;
import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.SymbolTable;

/**
 * The logical binary expression (< > == != >= <=) node in AST.
 * The difference between LogBinary and CalcBinary is their result type
 */
public class LogBinaryExpr extends ExprStmt implements BinaryExpr {
    BinaryOp op;
    ExprStmt lhs;
    ExprStmt rhs;

    public LogBinaryExpr(ExprStmt _lhs, BinaryOp _op, ExprStmt _rhs, Position _pos) {
        super(SymbolTable.BOOL, _pos);
        op = _op;
        lhs = _lhs;
        rhs = _rhs;
    }

    @Override
    public BinaryOp getOp() {
        return op;
    }

    @Override
    public ExprStmt getLhs() {
        return lhs;
    }

    @Override
    public ExprStmt getRhs() {
        return rhs;
    }

    @Override
    public Operand getOperand() {
        return super.getOperand();
    }
}