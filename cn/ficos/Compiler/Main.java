package cn.ficos.Compiler;

import cn.ficos.Compiler.ASTBuilder.ASTBuilder;
import cn.ficos.Compiler.Syntax.MangoLexer;
import cn.ficos.Compiler.Syntax.MangoParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author YurongYou
 *
 * This class is intended to accomplish the main procedure of compiling.
 * Created by Ficos on 16/3/30.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // File Read In
        FileInputStream FileInput = new FileInputStream("MangoTestCase/semantic/compile_error/class-2-5120309049-liaochao.mx");
        ANTLRInputStream input = new ANTLRInputStream(FileInput);
        MangoLexer lexer = new MangoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MangoParser parser = new MangoParser(tokens);

        try {
            parser.setErrorHandler(new BailErrorStrategy());
            ParseTree tree = parser.prog();
            ASTBuilder builder = new ASTBuilder(tree);
            builder.visit(tree);
        } catch (Exception e) {
//            System.out.println(1);
            System.exit(1);
        }
        System.exit(0);
//        System.exit(0);
//        PrintStream out = new PrintStream("MangoTestCase/output/Built_In_Functions-5140519064-ficos.AST");
//        Printer print = new Printer(root, out);
//        print.print();
    }
}