package cn.ficos.Compiler;

import cn.ficos.Compiler.AST.AST;
import cn.ficos.Compiler.ASTBuilder.ASTBuilder;
import cn.ficos.Compiler.CodeGeneration.IRBuilder;
import cn.ficos.Compiler.CodeGeneration.NaiveMIPSGenerator;
import cn.ficos.Compiler.Syntax.MangoLexer;
import cn.ficos.Compiler.Syntax.MangoParser;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author YurongYou
 *
 * This class is intended to accomplish the main procedure of compiling.

 */
public class Main {
    public static void main(String[] args) throws IOException {
        try {
            compile(System.in, System.out);
        } catch (Exception e) {
            System.exit(1);
        }
        System.exit(0);
    }

    public static void compile(InputStream in, OutputStream out) throws Exception {
        org.antlr.v4.runtime.ANTLRInputStream input = new org.antlr.v4.runtime.ANTLRInputStream(in);
        MangoLexer lexer = new MangoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MangoParser parser = new MangoParser(tokens);
        parser.setErrorHandler(new BailErrorStrategy());
        ParseTree tree = parser.prog();

        ASTBuilder AST_builder = new ASTBuilder(tree);
        AST root = AST_builder.visit(tree);
        IRBuilder IR_builder = new IRBuilder(root);
//        CFGs CFGs = IR_builder.buildCFGs();
//        new MIPSGenerator(out, IR_builder.buildCFGs());
        new NaiveMIPSGenerator(IR_builder, out);
    }
}