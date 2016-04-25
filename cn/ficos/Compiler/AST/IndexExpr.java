package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Operand.LocalRegister;
import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.Type.ArrayType;

/**
 * The get-index expression in AST.
 *
 * * The base operand is the result, the address operand means the address operand for the load result
 * Created by Ficos on 16/3/31.
 */
public class IndexExpr extends ExprStmt implements LValue, AddressFetch {
    ExprStmt base;
    ExprStmt index;
    LocalRegister address = new LocalRegister();

    public IndexExpr(ExprStmt _base, ExprStmt _index, Position _pos) {
        super(((ArrayType) _base.getType()).getBaseType(), _pos);
        base = _base;
        index = _index;
    }

    public ExprStmt getBase() {
        return base;
    }

    public ExprStmt getIndex() {
        return index;
    }

    public LocalRegister getAddressOperand() {
        return address;
    }

//    public LocalRegister getResultOperand() {
//        return (LocalRegister) getOperand();
//    }
}