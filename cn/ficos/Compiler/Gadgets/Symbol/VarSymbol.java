package cn.ficos.Compiler.Gadgets.Symbol;

import cn.ficos.Compiler.Gadgets.Name;
import cn.ficos.Compiler.Gadgets.Type.Type;

/**
 * This derived class represents a variable symbol
 * Created by Ficos on 16/3/30.
 */
public class VarSymbol extends Symbol {
    private Type type;

    public VarSymbol(Name _varName, Type _type) {
        super(_varName);
        type = _type;
    }

    /**
     * To get the type the symbol represents.
     *
     * @return the representing type
     */
    public Type getType() {
        return type;
    }
}
