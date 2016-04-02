package Gadgets.Symbol;

import Gadgets.Name;
import Gadgets.Type.Type;

/**
 * This derived class represents a type symbol
 * Created by Ficos on 16/3/30.
 */
public class TypeSymbol extends Symbol {
    private Type type;

    public TypeSymbol(Name _typeName, Type _type) {
        //TypeSymbol's scope ID is default 0
        super(0, _typeName);
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