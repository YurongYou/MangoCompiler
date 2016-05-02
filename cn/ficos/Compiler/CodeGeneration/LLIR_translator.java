package cn.ficos.Compiler.CodeGeneration;

import cn.ficos.Compiler.AST.AST;
import cn.ficos.Compiler.ASTBuilder.ASTBuilder;
import cn.ficos.Compiler.Gadgets.Operand.Operand;
import cn.ficos.Compiler.Gadgets.Symbol.FuncSymbol;
import cn.ficos.Compiler.Gadgets.Symbol.VarSymbol;
import cn.ficos.Compiler.IR.*;
import cn.ficos.Compiler.Syntax.MangoLexer;
import cn.ficos.Compiler.Syntax.MangoParser;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This class is designed to translate my own IR to the IR that can run on LLIRInterpreter
 * Note: do support global variable and string
 * Created by Ficos on 16/5/2.
 */
public class LLIR_translator {
    IRBuilder ori;
    PrintStream out;

    public LLIR_translator(IRBuilder ori, PrintStream out) {
        this.ori = ori;
        this.out = out;
        translate();
    }

    public static void main(String[] args) throws Exception {
        FileInputStream FileInput = new FileInputStream("MangoTestCase/LLIRtestcase/ir/gcd.mx");
        org.antlr.v4.runtime.ANTLRInputStream input = new org.antlr.v4.runtime.ANTLRInputStream(FileInput);
        MangoLexer lexer = new MangoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MangoParser parser = new MangoParser(tokens);
//        parser.setErrorHandler(new BailErrorStrategy());
        ParseTree tree = parser.prog();

        ASTBuilder AST_builder = new ASTBuilder(tree);
        AST root = AST_builder.visit(tree);
        IRBuilder IR_builder = new IRBuilder(root);
        IR_builder.buildIR();
        new LLIR_translator(IR_builder, System.out);
    }

    public void translate() {
        FuncSymbol nowFunc;
        ListIterator<FuncSymbol> FItr = ori.getFuncInfo().listIterator();
        for (LinkedList<IRNode> func : ori.getFunctions()) {
            nowFunc = FItr.next();
            out.print("func " + nowFunc.getFuncLabel());
            for (VarSymbol e : nowFunc.getParameter()) {
                out.print(" " + e.getReg());
            }
            out.println(" {");

            ListIterator<IRNode> funcItr = func.listIterator(0);
//            funcItr.next();
            while (funcItr.hasNext()) {
                IRNode node = funcItr.next();
                if (node instanceof Binary) {
                    out.println("\t" + ((Binary) node).getTarget() + " = " + ((Binary) node).getOP() + " " + ((Binary) node).getLhs() + " " + ((Binary) node).getRhs());
                } else if (node instanceof Branch) {
                    out.println("\tbr " + ((Branch) node).getCondition() + " %" + ((Branch) node).getT() + " %" + ((Branch) node).getF());
                } else if (node instanceof Call) {
                    if (((Call) node).getTarget() != null) {
                        out.print("\t" + ((Call) node).getTarget() + " = ");
                    }
                    out.print("\tcall " + ((Call) node).getFuncLabel());
                    if (((Call) node).getParameters() != null) {
                        for (Operand o : ((Call) node).getParameters()) {
                            out.print(" " + o);
                        }
                    }
                    out.println();
                } else if (node instanceof Jump) {
                    out.println("\tjump %" + ((Jump) node).getTarget());
                } else if (node instanceof Label) {
                    out.println("%" + node + ":");
                } else if (node instanceof Load) {
                    out.println("\t" + ((Load) node).getTarget() + " = load "
                            + ((Load) node).getSize() + " "
                            + ((Load) node).getSource() + " "
                            + ((Load) node).getOffset());
                } else if (node instanceof LoadAddress) {
                } else if (node instanceof LoadFromLabel) {
                } else if (node instanceof LoadImm) {
                    out.println("\t" + ((LoadImm) node).getReg() + " =  move " + ((LoadImm) node).getImm());
                } else if (node instanceof Move) {
                    out.println("\t" + ((Move) node).getTarget() + " = move " + ((Move) node).getSource());
                } else if (node instanceof Neg) {
                    out.println("\t" + ((Neg) node).getTarget() + " = neg " + ((Neg) node).getSource());
                } else if (node instanceof New) {
                    out.println("\t" + ((New) node).getTarget() + " = alloc " + ((New) node).getSize());
                } else if (node instanceof Return) {
                    out.print("\tret");
                    if (((Return) node).getResult() != null) {
                        out.print(" " + ((Return) node).getResult());
                    }
                    out.println();
                } else if (node instanceof Store) {
                    out.println("\tstore " + ((Store) node).getSize() + " "
                            + ((Store) node).getTarget() + " "
                            + ((Store) node).getSource() + " "
                            + ((Store) node).getOffset());
                } else if (node instanceof StoreLabel) {
                }
            }

            out.println("}");
        }
    }
}
