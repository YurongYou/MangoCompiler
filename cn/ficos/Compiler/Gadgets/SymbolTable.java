package cn.ficos.Compiler.Gadgets;

import cn.ficos.Compiler.Exceptions.Bug_SymbolTableInitializationFault;
import cn.ficos.Compiler.Exceptions.Redefine;
import cn.ficos.Compiler.Exceptions.Undefined;
import cn.ficos.Compiler.Gadgets.Operand.GlobalRegister;
import cn.ficos.Compiler.Gadgets.Symbol.FuncSymbol;
import cn.ficos.Compiler.Gadgets.Symbol.Symbol;
import cn.ficos.Compiler.Gadgets.Symbol.TypeSymbol;
import cn.ficos.Compiler.Gadgets.Symbol.VarSymbol;
import cn.ficos.Compiler.Gadgets.Type.ArrayType;
import cn.ficos.Compiler.Gadgets.Type.BuiltInType;
import cn.ficos.Compiler.Gadgets.Type.Type;

import java.util.*;

/**
 * This is the symbol table for reference when building the AST
 * Created by Ficos on 16/3/31.
 */
public class SymbolTable {
    /**
     * this serves as reference to built-in type int
     */
    public static BuiltInType INT = new BuiltInType(Name.getName("int"), CONSTANT.wordSize);
    /**
     * this serves as reference to built-in type string
     */
    public static BuiltInType STRING = new BuiltInType(Name.getName("string"), CONSTANT.wordSize);
    /**
     * this serves as reference to built-in type boll
     */
    public static BuiltInType BOOL = new BuiltInType(Name.getName("bool"), 1);

    //serve as a dictionary for symbol fetching
    private Map<Name, Stack<Symbol>> dict = new HashMap<>();
    //it counts the currentScope, for detecting the Redefining
    private int currentScope = 0;
    //stores the new defined symbols' name in a scope
    private Stack<Set<Name>> nowScope = new Stack<>();

    public SymbolTable() {
        try {
            initialize();
        } catch (Redefine err) {
            throw new Bug_SymbolTableInitializationFault();
        }
    }

    public static void main(String[] args) throws Redefine, Undefined {
        SymbolTable test = new SymbolTable();
        test.define(Name.getName("ficos"), new VarSymbol(Name.getName("ficos"), INT, new GlobalRegister()));
        Symbol yyr1 = test.resolve(Name.getName("ficos"));
        test.beginScope();
        test.define(Name.getName("ficos"), new VarSymbol(Name.getName("ficos"), INT, new GlobalRegister()));
        Symbol yyr2 = test.resolve(Name.getName("ficos"));
        System.out.println(yyr1 == yyr2);
        test.endScope();
        yyr2 = test.resolve(Name.getName("ficos"));
        System.out.println(yyr1 == yyr2);
        System.out.println(test.resolve(Name.getName("string.ord")).getName());
    }

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

        //int string.length(string this)
        name = Name.getName("string.length");
        FuncSymbol string_length = new FuncSymbol(name, INT, Arrays.asList(Name.getName("this")), Arrays.asList(STRING));
        define(name, string_length);

        //string string.substring(string this, int left, int right)
        name = Name.getName("string.substring");
        FuncSymbol string_substring = new FuncSymbol(name, STRING, Arrays.asList(Name.getName("this"), Name.getName("left"), Name.getName("right"))
                , Arrays.asList(STRING, INT, INT));
        define(name, string_substring);

        //int string.parseInt(string this)
        name = Name.getName("string.parseInt");
        FuncSymbol string_parseInt = new FuncSymbol(name, INT, Arrays.asList(Name.getName("this")), Arrays.asList(STRING));
        define(name, string_parseInt);

        //int string.ord(string this, int pos)
        name = Name.getName("string.ord");
        FuncSymbol string_ord = new FuncSymbol(name, INT, Arrays.asList(Name.getName("this"), Name.getName("pos")), Arrays.asList(STRING, INT));
        define(name, string_ord);

        //int ~array.size(~array this)
        name = Name.getName("~array.size");
        FuncSymbol _array_size = new FuncSymbol(name, INT, Arrays.asList(Name.getName("this")), Arrays.asList(ArrayType.virtualArrayType));
        define(name, _array_size);

        //string stringConcatenate(string lhs, string rhs)
        name = Name.getName("stringConcatenate");
        FuncSymbol stringConcatenate = new FuncSymbol(name, STRING, Arrays.asList(Name.getName("lhs"), Name.getName("rhs")),
                Arrays.asList(STRING, STRING));
        define(name, stringConcatenate);

        //bool stringIsEqual(string lhs, string rhs)
        name = Name.getName("stringIsEqual");
        FuncSymbol stringIsEqual = new FuncSymbol(name, BOOL, Arrays.asList(Name.getName("lhs"), Name.getName("rhs")),
                Arrays.asList(STRING, STRING));
        define(name, stringIsEqual);

        //bool stringLess(string lhs, string rhs)
        name = Name.getName("stringLess");
        FuncSymbol stringLess = new FuncSymbol(name, BOOL, Arrays.asList(Name.getName("lhs"), Name.getName("rhs")),
                Arrays.asList(STRING, STRING));
        define(name, stringLess);
    }

    /**
     * To define a name in current scope
     *
     * @param key   the corresponding {@link cn.ficos.Compiler.Gadgets.Name} object
     * @param value the corresponding {@link cn.ficos.Compiler.Gadgets.Symbol} object that contains corresponding information
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
     * To find a {@link cn.ficos.Compiler.Gadgets.Name}'s corresponding information, which is stored as {@link cn.ficos.Compiler.Gadgets.Symbol}
     *
     * @param key the {@link cn.ficos.Compiler.Gadgets.Name} to be looked up
     * @return the corresponding {@link cn.ficos.Compiler.Gadgets.Symbol}
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
}