package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.Type.ClassType;

import java.util.List;

/**
 * The class declaration node in AST
 */
public class ClassDecl extends Decl {
    private ClassType classType;
    private List<VarDecl> variables;
    private List<FuncDecl> functions;

    public ClassDecl(List<VarDecl> _variables, List<FuncDecl> _functions, ClassType _classType, Position _pos) {
        super(_pos);
        classType = _classType;
        variables = _variables;
        functions = _functions;
    }

    public ClassType getClassType() {
        return classType;
    }

    public List<VarDecl> getVariables() {
        return variables;
    }

    public List<FuncDecl> getFunctions() {
        return functions;
    }
}