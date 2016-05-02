package cn.ficos.Compiler.Gadgets.Symbol;

import cn.ficos.Compiler.Gadgets.Name;
import cn.ficos.Compiler.Gadgets.Operand.LocalRegister;
import cn.ficos.Compiler.Gadgets.Operand.Register;
import cn.ficos.Compiler.Gadgets.Type.Type;
import cn.ficos.Compiler.IR.Label;

/**
 * This derived class represents a variable symbol
 * Created by Ficos on 16/3/30.
 */
public class VarSymbol extends Symbol {
    public static final int local = 0;
    public static final int global = 1;
    public static final int classField = 2;
    private Type type;
    private Register reg;
    private boolean isGlobal;
    private Label globalLabel;

    public VarSymbol(Name _varName, Type _type, int VarType) {
        super(_varName);
        type = _type;
//        VarType = 0 means local variable
//        VarType = 1 means parameter variable
//        VarType = 2 means global variable
        switch (VarType) {
            case local:
                isGlobal = false;
                reg = new LocalRegister();
                break;
            case global:
                isGlobal = true;
                globalLabel = new Label("var_" + _varName, true);
                reg = null;
                break;
            case classField:
                isGlobal = false;
                reg = null;
        }
    }

    public boolean isGlobal() {
        return isGlobal;
    }

    /**
     * To get the type the symbol represents.
     *
     * @return the representing type
     */
    public Type getType() {
        return type;
    }


    public Label getGlobalLabel() {
        return globalLabel;
    }

    public Register getReg() {
        return reg;
    }
}
