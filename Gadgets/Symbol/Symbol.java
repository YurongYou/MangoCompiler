package Gadgets.Symbol;

import Gadgets.Name;
import Gadgets.SymbolTable;

/**
 * This abstract class serves as Value in {@link SymbolTable} (which serves as a SymbolTable).
 * There are several extended Symbol type, all of these is intended to record the useful information of a {@link Gadgets.Name}.
 * Created by Ficos on 16/3/30.
 */
public abstract class Symbol {
    private int scopeID;
    private Name name;

    public Symbol(int _scopeID, Name _name) {
        scopeID = _scopeID;
        name = _name;
    }

    public int getScopeID() {
        return scopeID;
    }

    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        return name.toString();
    }
}