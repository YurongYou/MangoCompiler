package cn.ficos.Compiler.AST;

import cn.ficos.Compiler.Gadgets.Position;

import java.util.List;

/**
 * The root of AST
 * Created by Ficos on 16/3/31.
 */
public class Program extends AST {
    private List<Decl> decls;

    public Program(List<Decl> _decls, Position _pos) {
        super(_pos);
        decls = _decls;
    }

    public List<Decl> getDecls() {
        return decls;
    }
}