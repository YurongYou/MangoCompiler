package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Name;
import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.Type.Type;

/**
 * The field-access expression in AST.
 * The corresponding register can vary, sometimes means the contents, otherwise it means the address
 */
public class FieldAccessExpr extends ExprStmt implements LValue, AddressFetch {
    ExprStmt base;
    Name field;
    int shift = 0;

    public FieldAccessExpr(Type _type, ExprStmt _lhs, Name _field, int _shift, Position _pos) {
        super(_type, _pos);
        base = _lhs;
        field = _field;
        shift = _shift;
    }

    public int getShift() {
        return shift;
    }

    public ExprStmt getLhs() {
        return base;
    }

    public Name getField() {
        return field;
    }

    @Override
    public ExprStmt getBase() {
        return base;
    }

}