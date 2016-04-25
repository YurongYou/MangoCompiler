package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Name;
import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.Type.Type;

/**
 * The field-access expression in AST.
 * The base operand is the result, the address operand means the address operand for the load result
 * Created by Ficos on 16/3/31.
 */
public class FieldAccessExpr extends ExprStmt implements LValue, AddressFetch {
    ExprStmt lhs;
    Name field;
    //    LocalRegister address = new LocalRegister();
    int shift = 0;

    public FieldAccessExpr(Type _type, ExprStmt _lhs, Name _field, int _shift, Position _pos) {
        super(_type, _pos);
        lhs = _lhs;
        field = _field;
        shift = _shift;
    }

    public int getShift() {
        return shift;
    }

    public ExprStmt getLhs() {
        return lhs;
    }

    public Name getField() {
        return field;
    }

//    @Override
//    public LocalRegister getAddressOperand() {
//        return address;
//    }

//    @Override
//    public LocalRegister getResultOperand() {
//        return (LocalRegister) getOperand();
//    }
}