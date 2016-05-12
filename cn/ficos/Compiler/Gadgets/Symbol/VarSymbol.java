package cn.ficos.Compiler.Gadgets.Symbol;

import cn.ficos.Compiler.Gadgets.Name;
import cn.ficos.Compiler.Gadgets.Operand.LocalRegister;
import cn.ficos.Compiler.Gadgets.Operand.Register;
import cn.ficos.Compiler.Gadgets.Type.Type;
import cn.ficos.Compiler.IR.Label;

/**
 * This derived class represents a variable symbol
 */
public class VarSymbol extends Symbol {
    public static final int local = 0;
    public static final int global = 1;
    public static final int classField = 2;
    //    the parameter identifier is intended to specify the No.>4 args, such as f(a0, a1, a2, a3, a4), a4 will be set as parameter.
    //    Because the No.>4 args are stored in MeM, you need you fetch it from mem
    public static final int parameter = 3;
    private Type type;
    private Register reg;
    //    private boolean isGlobal;
    private int varType;
    private Label globalLabel;

    public VarSymbol(Name _varName, Type _type, int _VarType) {
        super(_varName);
        type = _type;
        varType = _VarType;
//        VarType = 0 means local variable
//        VarType = 1 means parameter variable
//        VarType = 2 means global variable
        switch (_VarType) {
            case local:
                reg = new LocalRegister();
                break;
            case global:
                globalLabel = new Label("var_" + _varName, true);
                reg = null;
                break;
            case classField:
                reg = null;
                break;
            case parameter:
                reg = new LocalRegister();
        }
    }

    public boolean isGlobal() {
        return varType == global;
    }

    public boolean isParameter() {
        return varType == parameter;
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