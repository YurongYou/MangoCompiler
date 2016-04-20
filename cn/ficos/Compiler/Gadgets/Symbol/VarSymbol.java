package cn.ficos.Compiler.Gadgets.Symbol;

import cn.ficos.Compiler.Gadgets.Name;
import cn.ficos.Compiler.Gadgets.Operand.Register;
import cn.ficos.Compiler.Gadgets.Type.Type;

/**
 * This derived class represents a variable symbol
 * Created by Ficos on 16/3/30.
 */
public class VarSymbol extends Symbol {
    private Type type;
    private Register reg;

    public VarSymbol(Name _varName, Type _type, Register _reg) {
        super(_varName);
        type = _type;
        reg = _reg;
    }

    /**
     * To get the type the symbol represents.
     *
     * @return the representing type
     */
    public Type getType() {
        return type;
    }


    public Register getReg() {
        return reg;
    }
}
