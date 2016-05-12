package cn.ficos.Compiler.Gadgets.Symbol;

import cn.ficos.Compiler.Gadgets.Name;
import cn.ficos.Compiler.Gadgets.Type.Type;

/**
 * This derived class represents a type symbol
 */
public class TypeSymbol extends Symbol {
    private Type type;

    public TypeSymbol(Name _typeName, Type _type) {
        //TypeSymbol's scope ID is default 0
        super(_typeName);
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