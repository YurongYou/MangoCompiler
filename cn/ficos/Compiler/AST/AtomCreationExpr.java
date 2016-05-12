package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;
import cn.ficos.Compiler.Gadgets.Type.ClassType;

/**
 * The atom creation expression (e.g. new A) node in AST
 */
public class AtomCreationExpr extends ExprStmt {
    public AtomCreationExpr(ClassType _type, Position _pos) {
        super(_type, _pos);
    }
}
