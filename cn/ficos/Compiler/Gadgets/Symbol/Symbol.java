package cn.ficos.Compiler.Gadgets.Symbol;

import cn.ficos.Compiler.Gadgets.Name;

/**
 * This abstract class serves as Value in {@link cn.ficos.Compiler.Gadgets.SymbolTable} (which serves as a SymbolTable).
 * There are several extended Symbol type, all of these is intended to record the useful information of a {@link cn.ficos.Compiler.Gadgets.Name}.
 * Created by Ficos on 16/3/30.
 */
public abstract class Symbol {
    private Name name;

    public Symbol(Name _name) {
        name = _name;
    }

    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        return name.toString();
    }
}