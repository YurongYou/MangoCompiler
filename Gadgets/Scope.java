package Gadgets;

import CompileException.Redefine;
import CompileException.Undefine;
import Gadgets.Symbol.Symbol;

import java.util.HashMap;
import java.util.Map;


/**
 * This class acts as typically known as Symbol Table in a compiler.
 * It uses a tree-structure to represent the nested relation between scopes,
 * and it also uses a path-compression method dynamically speed up the looking up.
 * Created by Ficos on 16/3/30.
 */
public class Scope {
    private Scope OuterScope;
    private Map<Name, Symbol> dict = new HashMap<>();

    public Scope(Scope _OuterScope) {
        OuterScope = _OuterScope;
    }

    public Scope getOuterScope() {
        return OuterScope;
    }

    /**
     * To define a name in current scope
     *
     * @param key   the corresponding {@link Name} object
     * @param value the corresponding {@link Symbol} object that contains corresponding information
     * @throws Redefine
     */
    public void define(Name key, Symbol value) throws Redefine {
        Symbol prev = dict.get(key);
        if (prev != null && prev.getScope() == this) throw new Redefine();
        dict.put(key, value);
    }

    /**
     * To find a {@link Name}'s corresponding information, which is stored as {@link Symbol}
     *
     * @param key the {@link Name} to be looked up
     * @return the corresponding {@link Symbol}
     * @throws Undefine
     */
    public Symbol resolve(Name key) throws Undefine {
        Symbol value = dict.get(key);
        if (value == null) value = getOuterScope().resolve(key);
        // path compression
        if (value != null) {
            dict.put(key, value);
            return value;
        }
        throw new Undefine();
    }
}
