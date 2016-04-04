package Gadgets;

import Exceptions.Bug_SymbolTableInitializationFault;
import Exceptions.Redefine;
import Exceptions.Undefined;
import Gadgets.Symbol.FuncSymbol;
import Gadgets.Symbol.Symbol;
import Gadgets.Symbol.TypeSymbol;
import Gadgets.Symbol.VarSymbol;
import Gadgets.Type.BuiltInType;
import Gadgets.Type.Type;

import java.util.*;

/**
 * This is the symbol table for reference when building the AST
 * Created by Ficos on 16/3/31.
 */
public class SymbolTable {
    /**
     * this serves as reference to built-in type int
     */
    public static BuiltInType INT = new BuiltInType(Name.getName("int"));
    /**
     * this serves as reference to built-in type string
     */
    public static BuiltInType STRING = new BuiltInType(Name.getName("string"));
    /**
     * this serves as reference to built-in type boll
     */
    public static BuiltInType BOOL = new BuiltInType(Name.getName("bool"));

    //serve as a dictionary for symbol fetching
    private Map<Name, Stack<Symbol>> dict = new HashMap<>();
    //it counts the currentScope, for detecting the Redefining
    private int currentScope = 0;
    //stores the new defined symbols' name in a scope
    private Stack<Set<Name>> nowScope = new Stack<>();

    private void initialize() throws Redefine {
//        currentNewSymbols.push(new LinkedList<>());
        nowScope.push(new HashSet<>());
        Name name;

        //define several built-in types in the Global Scope
        name = Name.getName("int");
        TypeSymbol IntType = new TypeSymbol(name, INT);
        define(name, IntType);

        name = Name.getName("string");
        TypeSymbol StringType = new TypeSymbol(name, STRING);
        define(name, StringType);

        name = Name.getName("bool");
        TypeSymbol BoolType = new TypeSymbol(name, BOOL);
        define(name, BoolType);

        //define several built-in functions
        //void print(string arg)
        name = Name.getName("print");
        FuncSymbol print = new FuncSymbol(name, null, Arrays.asList(Name.getName("arg")), Arrays.asList(STRING));
        define(name, print);

        //void println(string arg)
        name = Name.getName("println");
        FuncSymbol println = new FuncSymbol(name, null, Arrays.asList(Name.getName("arg")), Arrays.asList(STRING));
        define(name, println);

        //string getString()
        name = Name.getName("getString");
        FuncSymbol getString = new FuncSymbol(name, STRING, null, null);
        define(name, getString);

        //int getInt()
        name = Name.getName("getInt");
        FuncSymbol getInt = new FuncSymbol(name, INT, null, null);
        define(name, getInt);

        //string toString(int i)
        name = Name.getName("toString");
        FuncSymbol toString = new FuncSymbol(name, STRING, Arrays.asList(Name.getName("i")), Arrays.asList(INT));
        define(name, toString);

        //int string.length()
        name = Name.getName("string.length");
        FuncSymbol string_length = new FuncSymbol(name, INT, null, null);
        define(name, string_length);

        //string string.substring(int left, int right)
        name = Name.getName("string.substring");
        FuncSymbol string_substring = new FuncSymbol(name, STRING, Arrays.asList(Name.getName("left"), Name.getName("right"))
                , Arrays.asList(INT, INT));
        define(name, string_substring);

        //int parseInt()
        name = Name.getName("string.parseInt");
        FuncSymbol string_parseInt = new FuncSymbol(name, INT, null, null);
        define(name, string_parseInt);

        //int ord(int pos)
        name = Name.getName("string.ord");
        FuncSymbol string_ord = new FuncSymbol(name, INT, Arrays.asList(Name.getName("pos")), Arrays.asList(INT));
        define(name, string_ord);
    }

    public SymbolTable() {
        try {
            initialize();
        } catch (Redefine err) {
            throw new Bug_SymbolTableInitializationFault();
        }
    }


    /**
     * To define a name in current scope
     *
     * @param key   the corresponding {@link Name} object
     * @param value the corresponding {@link Symbol} object that contains corresponding information
     * @throws Redefine throw if the key has been defined in current scope
     */
    public void define(Name key, Symbol value) throws Redefine {
//        if (value.getScopeID() != currentScope) throw new FalseSymbol();
        if (nowScope.peek().contains(key)) {
            throw new Redefine();
        }
        Stack<Symbol> entry = dict.get(key);
        if (entry == null) {
            entry = new Stack<>();
            dict.put(key, entry);
            entry.push(value);

        } else {
            entry.push(value);
        }
        nowScope.peek().add(key);
    }

    /**
     * To find a {@link Name}'s corresponding information, which is stored as {@link Symbol}
     *
     * @param key the {@link Name} to be looked up
     * @return the corresponding {@link Symbol}
     * @throws Undefined throw if the key has not been defined in current or formal scopes
     */
    public Symbol resolve(Name key) throws Undefined {
        Stack<Symbol> entry = dict.get(key);
        if (entry == null || entry.isEmpty()) throw new Undefined();
        return entry.peek();
    }

    /**
     * A shortcut for type looking up
     *
     * @param typeName the name of type to look up
     * @return the required type
     * @throws Undefined
     */
    public Type lookUpType(String typeName) throws Undefined {
        return ((TypeSymbol) resolve(Name.getName(typeName))).getType();
    }

    /**
     * @return current scope ID
     */
    public int getCurrentScope() {
        return currentScope;
    }

    /**
     * to begin a new scope, such as entering a class definition, function, compound statement
     */
    public void beginScope() {
        nowScope.push(new HashSet<>());
        currentScope++;
    }

    /**
     * to end a scope, recover previous scope
     */
    public void endScope() {
        for (Name key : nowScope.peek()) {
            dict.get(key).pop();
        }
        nowScope.pop();
        currentScope--;
    }


    public static void main(String[] args) throws Redefine, Undefined {
        SymbolTable test = new SymbolTable();
        test.define(Name.getName("ficos"), new VarSymbol(Name.getName("ficos"), INT));
        Symbol yyr1 = test.resolve(Name.getName("ficos"));
        test.beginScope();
        test.define(Name.getName("ficos"), new VarSymbol(Name.getName("ficos"), INT));
        Symbol yyr2 = test.resolve(Name.getName("ficos"));
        System.out.println(yyr1 == yyr2);
        test.endScope();
        yyr2 = test.resolve(Name.getName("ficos"));
        System.out.println(yyr1 == yyr2);
        System.out.println(test.resolve(Name.getName("string.ord")).getName());
    }
}