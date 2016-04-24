package cn.ficos.Compiler.Gadgets.Type;

import cn.ficos.Compiler.Gadgets.CONSTANT;
import cn.ficos.Compiler.Gadgets.Name;

import java.util.HashMap;
import java.util.Map;

/**
 * Type for user defined class.
 * It stores all class information, including all class variable, class functions
 * Remember to call ".equals(Type rhs)" to compare types
 * Created by Ficos on 16/3/30.
 */
public class ClassType extends Type {

    //    private Map<Name, FuncSymbol> funcDict = new HashMap<>();
    private Map<Name, Integer> varShift = new HashMap<>();
    private Name className;

    /**
     * Creation of a ClassType. Note that every class will only be created once.
     * variables and functions information will be filled later
     */
    public ClassType(Name _className) {
        className = _className;
    }

    public Name getName() {
        return className;
    }

    @Override
    public String toString() {
        return className.toString();
    }

    @Override
    public Boolean isSuitableAs(Type rhs) {
        return (this == rhs);
    }

//    @Override
//    public int sizeOf() {
//        return CONSTANT.regSize;
//    }

    @Override
    public int totalSize() {
        return CONSTANT.wordSize * varShift.size();
    }

    public void addVar(Name name) {
        varShift.put(name, varShift.size() * 4);
    }

    public int getShift(Name name) {
        return varShift.get(name);
    }
}