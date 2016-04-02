package AST;

import Gadgets.Position;

import java.util.List;

/**
 * The root of AST
 * Created by Ficos on 16/3/31.
 */
public class Program extends AST {
    List<Decl> decls;

    public Program(List<Decl> _decls, Position _pos) {
        super(_pos);
        decls = _decls;
    }
}