package cn.ficos.Compiler.CodeGeneration;

import cn.ficos.Compiler.AST.*;
import cn.ficos.Compiler.ASTBuilder.ASTBuilder;
import cn.ficos.Compiler.ASTVisitor.Printer;
import cn.ficos.Compiler.ControlFlowGraph.BasicBlock;
import cn.ficos.Compiler.ControlFlowGraph.CFG;
import cn.ficos.Compiler.ControlFlowGraph.CFGs;
import cn.ficos.Compiler.Exceptions.Bug_TextError;
import cn.ficos.Compiler.Gadgets.BinaryOp;
import cn.ficos.Compiler.Gadgets.CONSTANT;
import cn.ficos.Compiler.Gadgets.Name;
import cn.ficos.Compiler.Gadgets.Operand.Constant;
import cn.ficos.Compiler.Gadgets.Operand.LocalRegister;
import cn.ficos.Compiler.Gadgets.Operand.Operand;
import cn.ficos.Compiler.Gadgets.Operand.Register;
import cn.ficos.Compiler.Gadgets.Symbol.FuncSymbol;
import cn.ficos.Compiler.Gadgets.Symbol.VarSymbol;
import cn.ficos.Compiler.Gadgets.Type.ArrayType;
import cn.ficos.Compiler.Gadgets.Type.BuiltInType;
import cn.ficos.Compiler.IR.*;
import cn.ficos.Compiler.Syntax.MangoLexer;
import cn.ficos.Compiler.Syntax.MangoParser;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.util.*;

/**
 * This class can be used to build up an IR using the AST.
 * Created by Ficos on 16/4/20.
 */
public class IRBuilder {
    Label MIPSMainLabel = null;
    private AST root;
    private LinkedList<LinkedList<IRNode>> functions = new LinkedList<>();
    private LinkedList<IRNode> nowFunction = null;
    private LinkedList<IRNode> initialization = new LinkedList<>();
    private LinkedList<String> data = new LinkedList<>();
    private LinkedList<FuncSymbol> funcInfo = new LinkedList<>();
    private FuncDecl main = null;

    public IRBuilder(AST root) {
        this.root = root;
        buildIR();
    }

    public static void main(String[] args) throws Exception {
        FileInputStream FileInput = new FileInputStream("MangoTestCase/local_final/mx/maxflow-5100379110-daibo.mx");
        org.antlr.v4.runtime.ANTLRInputStream input = new org.antlr.v4.runtime.ANTLRInputStream(FileInput);
        MangoLexer lexer = new MangoLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MangoParser parser = new MangoParser(tokens);
        parser.setErrorHandler(new BailErrorStrategy());
        ParseTree tree = parser.prog();

//        ASTBuilder AST_builder = new ASTBuilder(tree);
//        AST root = AST_builder.visit(tree);

//        IRBuilder IR_builder = new IRBuilder(root);
//        IR_builder.print();
////        CFGs CFGs = IR_builder.buildCFGs();
////        System.out.println("\nBegin output ControlFlowGraph");
////        for (CFG g : CFGs.getCFGList()) System.out.print(g);
////        System.out.println("\nBegin output LiveOut");
////        IR_builder.printLiveOut();
//        new MIPSGenerator(System.out, IR_builder.buildCFGs());

        ASTBuilder AST_builder = new ASTBuilder(tree);
        AST root = AST_builder.visit(tree);
        Printer printer = new Printer(root, System.out);
        printer.print();
        IRBuilder IR_builder = new IRBuilder(root);
//        IR_builder.print();
//        CFGs CFGs = IR_builder.buildCFGs();
//        new MIPSGenerator(new FileOutputStream("MangoTestCase/out.s"), IR_builder.buildCFGs());
        new MIPSGenerator(System.out, IR_builder.buildCFGs());
    }

    public LinkedList<LinkedList<IRNode>> getFunctions() {
        return functions;
    }

    public LinkedList<String> getData() {
        return data;
    }

    public LinkedList<IRNode> getInitialization() {
        return initialization;
    }

    public LinkedList<FuncSymbol> getFuncInfo() {
        return funcInfo;
    }

    public Label getMIPSMainLabel() {
        return MIPSMainLabel;
    }

    public LinkedList<LinkedList<IRNode>> buildIR() {
        funcInfo.add(null);
        MIPSMainLabel = new Label("main", false);
        initialization.add(MIPSMainLabel);
//        initialization.add(new Call(new Label("_buffer_init", false), null, null));
        visit(root);
        if (main != null) {
            initialization.add(new Call(main.getFuncInfo(), null, null));
        }
        return functions;
    }

    public void print() {
        System.out.println("data:");
        for (String s : data) {
            System.out.println(s);
        }
        System.out.println();
        for (IRNode e : initialization) {
            System.out.println(e);
            if (e instanceof Branch || e instanceof Jump) System.out.println();
        }
        for (List<IRNode> list : functions) {
            System.out.println();
            for (IRNode e : list) {
                System.out.println(e);
                if (e instanceof Branch || e instanceof Jump) System.out.println();
            }
        }
    }

    public void printLiveOut() {
        for (List<IRNode> list : functions) {
            System.out.println();
            for (IRNode e : list) {
                System.out.println(e);
                System.out.println("\tLiveOut:" + e.getLiveOut());
                if (e instanceof Branch || e instanceof Jump) System.out.println();
            }
        }
    }

    public CFG buildCFG(LinkedList<IRNode> func) {
        LinkedList<BasicBlock> CFG;
        CFG = new LinkedList<>();
        Map<Label, BasicBlock> dict = new HashMap<>();
        LinkedList<LinkedList<Label>> successorList = new LinkedList<>();
        int maxArgu = 0;
        boolean isLeaf = true;

        boolean isFinishedBB = false;
        BasicBlock nowBB = null;
        LinkedList<Label> nowSucc = null;
        IRNode temp;
        ListIterator<IRNode> IRItr = func.listIterator(0);

        while (IRItr.hasNext()) {
            temp = IRItr.next();
            if (temp instanceof Label) {
                if (nowSucc != null) {
                    nowSucc.add((Label) temp);
                }

                nowBB = new BasicBlock();
                dict.put((Label) temp, nowBB);
                nowBB.addInstruction(temp);
                nowSucc = new LinkedList<>();

                successorList.add(nowSucc);
                CFG.add(nowBB);

                isFinishedBB = false;
                continue;
            }
            if (isFinishedBB) continue;
            if (temp instanceof Jump) {
                nowBB.addInstruction(temp);
                nowSucc.add(((Jump) temp).getTarget());
                isFinishedBB = true;
                // prevent the following add edge to it
                nowSucc = null;
            } else if (temp instanceof Branch) {
                nowBB.addInstruction(temp);
                nowSucc.add(((Branch) temp).getT());
                nowSucc.add(((Branch) temp).getF());
                isFinishedBB = true;
                // prevent the following add edge to it
                nowSucc = null;
            } else if (temp instanceof Return) {
                nowBB.addInstruction(temp);
                isFinishedBB = true;
                // prevent the following add edge to it
                nowSucc = null;
            } else {
                if (nowBB == null) {
                    throw new Bug_TextError();
                }
                if (temp instanceof Call) {
                    if (((Call) temp).getParameters() != null &&
                            ((Call) temp).getParameters().size() > maxArgu) {
                        maxArgu = ((Call) temp).getParameters().size();
                        isLeaf = false;
                    }
                }
                nowBB.addInstruction(temp);
            }
        }

        ListIterator<BasicBlock> BBItr = CFG.listIterator(0);
        ListIterator<LinkedList<Label>> succItr = successorList.listIterator(0);
        while (BBItr.hasNext()) {
            BasicBlock nowBBB = BBItr.next();
            LinkedList<Label> nowSuccc = succItr.next();
            for (Label l : nowSuccc) nowBBB.addSuccessor(dict.get(l));
        }

        Iterator<BasicBlock> Itr = CFG.descendingIterator();
        if (Itr.hasNext()) {
            Label pre = (Label) Itr.next().getInstructions().getFirst();
            while (Itr.hasNext()) {
                BasicBlock bb = Itr.next();
                bb.setIROrderSucc(pre);
                pre = (Label) bb.getInstructions().getFirst();
            }
        }
        return new CFG(CFG, maxArgu, isLeaf);
    }

    public CFGs buildCFGs() {
        refine();
        LinkedList<CFG> CFGList = new LinkedList<>();
        CFGList.add(buildCFG(initialization));
        for (LinkedList<IRNode> func : functions) {
            CFGList.add(buildCFG(func));
        }
        return new CFGs(CFGList, data, MIPSMainLabel);
    }

    private void refine() {
        for (LinkedList<IRNode> func : functions) {
            ListIterator<IRNode> IRItr = func.listIterator();
            IRNode pre = IRItr.next();
            IRNode now;
            while (IRItr.hasNext()) {
                now = IRItr.next();
                if (now instanceof Label &&
                        pre instanceof Jump &&
                        ((Jump) pre).getTarget() == now) {
                    IRItr.previous();
                    IRItr.previous();
                    IRItr.remove();
                    IRItr.next();
                }
                pre = now;
            }
        }
    }

    private void visit(AST node) {
        if (node instanceof Program) {
            visit((Program) node);
            return;
        }
        if (node instanceof VarDecl) {
            visit((VarDecl) node);
            return;
        }
        if (node instanceof VarDeclStmt) {
            visit((VarDeclStmt) node);
            return;
        }
        if (node instanceof ClassDecl) {
            visit((ClassDecl) node);
            return;
        }
        if (node instanceof FuncDecl) {
            visit((FuncDecl) node);
            return;
        }
        if (node instanceof VarExpr) {
            visit((VarExpr) node);
            return;
        }
        if (node instanceof FieldAccessExpr) {
            visit((FieldAccessExpr) node);
            return;
        }
        if (node instanceof IndexExpr) {
            visit((IndexExpr) node);
            return;
        }
        if (node instanceof CallExpr) {
            visit((CallExpr) node);
            return;
        }
        if (node instanceof AtomCreationExpr) {
            visit((AtomCreationExpr) node);
            return;
        }
        if (node instanceof ArrayCreationExpr) {
            visit((ArrayCreationExpr) node);
            return;
        }
        if (node instanceof SignExpr) {
            visit((SignExpr) node);
            return;
        }
        if (node instanceof IntExpr) {
            visit((IntExpr) node);
            return;
        }
        if (node instanceof BoolExpr) {
            visit((BoolExpr) node);
            return;
        }

        if (node instanceof BitNotExpr) {
            visit((BitNotExpr) node);
            return;
        }
        if (node instanceof LogNotExpr) {
            visit((LogNotExpr) node);
            return;
        }
        if (node instanceof StringExpr) {
            visit((StringExpr) node);
            return;
        }
        if (node instanceof LogRelationExpr) {
            visit((LogRelationExpr) node);
            return;
        }
        if (node instanceof BinaryExpr) {
            visit((BinaryExpr) node);
            return;
        }
        if (node instanceof AssignExpr) {
            visit((AssignExpr) node);
            return;
        }
        if (node instanceof SelfOpPostExpr) {
            visit((SelfOpPostExpr) node);
            return;
        }
        if (node instanceof SelfOpPreExpr) {
            visit((SelfOpPreExpr) node);
            return;
        }
        if (node instanceof ReturnStmt) {
            visit((ReturnStmt) node);
            return;
        }
        if (node instanceof ContinueStmt) {
            visit((ContinueStmt) node);
            return;
        }
        if (node instanceof SelectionStmt) {
            visit((SelectionStmt) node);
            return;
        }
        if (node instanceof ForStmt) {
            visit((ForStmt) node);
            return;
        }
        if (node instanceof WhileStmt) {
            visit((WhileStmt) node);
            return;
        }
        if (node instanceof CompoundStmt) {
            visit((CompoundStmt) node);
            return;
        }
        if (node instanceof BreakStmt) {
            visit((BreakStmt) node);
        }
        if (node instanceof NullExpr) {
            visit((NullExpr) node);
        }
    }

    private void visit(Program ast) {
        ListIterator<Decl> itr = ast.getDecls().listIterator();
        while (itr.hasNext()) {
            visit(itr.next());
        }
    }

    private void visit(VarDecl ast) {
        String init = ast.getVar().getGlobalLabel() + ": .word ";
//        data.add(ast.getVar().getGlobalLabel() + ": " + ".word 0");
        if (ast.getCreation() != null) {
            nowFunction = initialization;

            visit(ast.getCreation());
            if (ast.getCreation().getOperand() instanceof Constant)
                data.add(init + ((Constant) ast.getCreation().getOperand()).getValue());
            else {
                data.add(init + "0");
                nowFunction.add(new StoreLabel(ast.getVar().getGlobalLabel(), (Register) ast.getCreation().getOperand(), CONSTANT.wordSize));
            }

            nowFunction = null;
        } else {
            data.add(init + "0");
        }
    }

    //    If the creation expression is null then there is no need to represent this expression in the IR
    private void visit(VarDeclStmt ast) {
        if (ast.getCreation() != null) {
            // if it's a declaration of built-in type, just move the creation result to the register
            if (ast.getVarInfo().getType() instanceof BuiltInType) {
                visit(ast.getCreation());
                if (ast.getCreation().getOperand() instanceof Constant) {
                    nowFunction.add(new LoadImm((LocalRegister) (ast.getVarInfo().getReg()), ((Constant) ast.getCreation().getOperand()).getValue()));
                } else {
                    nowFunction.add(new Move(ast.getVarInfo().getReg(), (Register) ast.getCreation().getOperand()));
                }
            }
            // if it's a declaration of array type or class type, the creation part can only
            // be "new" expression, just call the new function
            else {
                // Change the result of the creation to the target variable register
                ast.getCreation().changeOperand(ast.getVarInfo().getReg());
                visit(ast.getCreation());
            }
        }
    }

    private void visit(ClassDecl ast) {
        if (ast.getFunctions() != null) {
            for (FuncDecl e : ast.getFunctions()) {
                visit(e);
            }
        }
    }

    private void visit(FuncDecl ast) {
        functions.add(new LinkedList<>());
        funcInfo.add(ast.getFuncInfo());
        if (ast.getFuncInfo().getName() == Name.getName("main")) {
            main = ast;
        }
        nowFunction = functions.getLast();
        nowFunction.add(ast.getFuncInfo().getFuncLabel());
        if (ast.getFuncInfo().getParameter() != null) {
            int count = 0;
            for (VarSymbol var : ast.getFuncInfo().getParameter()) {
                nowFunction.add(new LoadParameter(var.getReg(), count++));
            }
        }
        for (Stmt s : ast.getStmts()) {
            visit(s);
        }
    }

    private void visit(CallExpr ast) {
        LinkedList<Operand> aps = null;
        if (ast.getActualParameter() != null) {
            aps = new LinkedList<>();
            for (ExprStmt e : ast.getActualParameter()) {
                visit(e);
                aps.add(e.getOperand());
            }
//            System.out.println(aps);
        }
        nowFunction.add(new Call(ast.getFuncInfo(), aps, (Register) ast.getOperand()));
    }

    private void visit(AtomCreationExpr ast) {
        nowFunction.add(new New((Register) ast.getOperand(),
                new Constant((ast.getType()).sizeInHeap())));
    }

    private void visit(ArrayCreationExpr ast) {
        visit(ast.getDim());
        Operand size;
        if (ast.getDim() instanceof IntExpr) {
            size = new Constant(((IntExpr) ast.getDim()).getValue()
                    * ((ArrayType) ast.getType()).getBaseType().variableSize()
                    + CONSTANT.wordSize);
            nowFunction.add(new New((Register) ast.getOperand(), size));
            LocalRegister temp = new LocalRegister();
            nowFunction.add(new LoadImm(temp, ((IntExpr) ast.getDim()).getValue()));
            nowFunction.add(new Store(CONSTANT.wordSize, temp, (Register) ast.getOperand(), 0));
            nowFunction.add(new Binary((Register) ast.getOperand(), (Register) ast.getOperand(),
                    new Constant(CONSTANT.wordSize), BinaryOp.add));
        } else {
            size = new LocalRegister();
            nowFunction.add(new Binary((Register) size, (Register) ast.getDim().getOperand(),
                    new Constant(((ArrayType) ast.getType()).getBaseType().variableSize()), BinaryOp.mul));
            nowFunction.add(new Binary((Register) size, (Register) size, new Constant(CONSTANT.wordSize), BinaryOp.add));
            nowFunction.add(new New((Register) ast.getOperand(), size));
            nowFunction.add(new Store(CONSTANT.wordSize, (Register) ast.getDim().getOperand(),
                    (Register) ast.getOperand(), 0));
            nowFunction.add(new Binary((Register) ast.getOperand(), (Register) ast.getOperand(),
                    new Constant(CONSTANT.wordSize), BinaryOp.add));
        }

    }

    private void visit(SignExpr ast) {
        if (ast.getOp()) {
            ast.changeOperand(ast.getBase().getOperand());
        } else {
            if (ast.getBase() instanceof IntExpr) {
                ast.changeOperand(new Constant(-1 * ((IntExpr) ast.getBase()).getValue()));
            } else {
                visit(ast.getBase());
                nowFunction.add(new Neg((Register) ast.getOperand(), (Register) ast.getBase().getOperand()));
            }
        }
    }

    private void visit(IntExpr ast) {
        // left empty intendedly
    }

    private void visit(BoolExpr ast) {
        // left empty intendedly
    }

    private void visit(NullExpr ast) {
        // left empty intendedly
    }

    private void visit(VarExpr ast) {
//        If the Var is a global var, we need to load it by the label
        if (ast.getVar().isGlobal()) {
            nowFunction.add(new LoadFromLabel(ast.getVar().getGlobalLabel(), (Register) ast.getOperand(), CONSTANT.wordSize));
        }
    }

    private int getLength(String s) {
        int count = s.length();
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '\\') --count;
        }
        return count;
    }

    private void visit(StringExpr ast) {
        // left empty intendedly
        nowFunction.add(new LoadAddress((Register) ast.getOperand(), ast.getLabel()));
        data.add("\t.word " + getLength(ast.getText()));
        data.add(ast.getLabel() + ": " + ".asciiz \"" + ast.getText() + "\"");
        data.add(".align 2");
    }

    private void visit(BitNotExpr ast) {
        visit(ast.getBase());
        nowFunction.add(new Not((Register) ast.getOperand(), (Register) ast.getBase().getOperand()));
    }

    private void visit(BinaryExpr ast) {
        visit(ast.getLhs());
        visit(ast.getRhs());
        if (ast.getLhs().getOperand() instanceof Constant) {
            LocalRegister temp = new LocalRegister();
            nowFunction.add(new LoadImm(temp, ((Constant) ast.getLhs().getOperand()).getValue()));
            nowFunction.add(new Binary((Register) ast.getOperand(),
                    temp,
                    ast.getRhs().getOperand(),
                    ast.getOp()));
        } else nowFunction.add(new Binary((Register) ast.getOperand(),
                (Register) ast.getLhs().getOperand(),
                ast.getRhs().getOperand(),
                ast.getOp()));
    }

    private void visit(FieldAccessExpr ast) {
        // first get the base address
        visit(ast.getBase());
        nowFunction.add(new Load(ast.getType().variableSize(),
                (Register) ast.getOperand(),
                (Register) ast.getBase().getOperand(),
                ast.getShift()));
    }

    private void visit(IndexExpr ast) {
        visit(ast.getBase());
        if (!(ast.getIndex() instanceof IntExpr)) {
            visit(ast.getIndex());
            LocalRegister temp = new LocalRegister();
            nowFunction.add(new Binary(temp, (Register) ast.getIndex().getOperand(),
                    new Constant(ast.getType().variableSize()), BinaryOp.mul));
//            LocalRegister address = new LocalRegister();
            nowFunction.add(new Binary(temp, (Register) ast.getBase().getOperand(),
                    temp, BinaryOp.add));
            nowFunction.add(new Load(ast.getType().variableSize(), (Register) ast.getOperand(),
                    temp, 0));
        } else nowFunction.add(new Load(ast.getType().variableSize(), (Register) ast.getOperand(),
                    (Register) ast.getBase().getOperand(),
                ((IntExpr) ast.getIndex()).getValue() * ast.getType().variableSize()));

    }

    private void getStoreIR(AddressFetch ast, Register source) {
        if (ast instanceof IndexExpr) {
            visit((ast).getBase());
            if (!(((IndexExpr) ast).getIndex() instanceof IntExpr)) {
                visit(((IndexExpr) ast).getIndex());

                LocalRegister temp = new LocalRegister();
//                LocalRegister address = new LocalRegister();
                nowFunction.add(new Binary(temp, (Register) ((IndexExpr) ast).getIndex().getOperand(),
                        new Constant(((IndexExpr) ast).getType().variableSize()), BinaryOp.mul));
                nowFunction.add(new Binary(temp, (Register) (ast).getBase().getOperand(),
                        temp, BinaryOp.add));

                nowFunction.add(new Store(((IndexExpr) ast).getType().variableSize(), source,
                        temp, 0));
            } else {
                nowFunction.add(new Store(((IndexExpr) ast).getType().variableSize(), source,
                        (Register) (ast).getBase().getOperand(),
                        ((IntExpr) ((IndexExpr) ast).getIndex()).getValue() * ((IndexExpr) ast).getType().variableSize()));
            }
        } else {
//            computeBaseAddress((FieldAccessExpr) ast);
            visit(ast.getBase());
            nowFunction.add(new Store(((FieldAccessExpr) ast).getType().variableSize(), source,
                        (Register) ((FieldAccessExpr) ast).getLhs().getOperand(),
                        ((FieldAccessExpr) ast).getShift()));
        }
    }

    private void visit(AssignExpr ast) {
        visit(ast.getRhs());
        if (ast.getLhs() instanceof AddressFetch) {
            LocalRegister source;
            if (ast.getRhs().getOperand() instanceof Constant) {
                source = new LocalRegister();
                nowFunction.add(new LoadImm(source, ((Constant) ast.getRhs().getOperand()).getValue()));
            } else source = (LocalRegister) ast.getRhs().getOperand();

            getStoreIR((AddressFetch) ast.getLhs(), source);
        } else if (ast.getLhs() instanceof VarExpr && ((VarExpr) ast.getLhs()).getVar().isGlobal()) {
            if (ast.getRhs().getOperand() instanceof Constant) {
                LocalRegister temp = new LocalRegister();
                nowFunction.add(new LoadImm(temp, ((Constant) ast.getRhs().getOperand()).getValue()));
                nowFunction.add(new StoreLabel(((VarExpr) ast.getLhs()).getVar().getGlobalLabel(),
                        temp, CONSTANT.wordSize));
            } else
                nowFunction.add(new StoreLabel(((VarExpr) ast.getLhs()).getVar().getGlobalLabel(), (Register) ast.getRhs().getOperand(), CONSTANT.wordSize));
        } else {
            if (ast.getRhs().getOperand() instanceof Constant) {
                nowFunction.add(new LoadImm((LocalRegister) ast.getLhs().getOperand(), ((Constant) ast.getRhs().getOperand()).getValue()));
            } else
                nowFunction.add(new Move((Register) ast.getLhs().getOperand(), (Register) ast.getRhs().getOperand()));
        }
//        !!! Note that the result operand of the AssignExpr is the Rhs's operand
        ast.changeOperand(ast.getRhs().getOperand());
    }

    private void visit(SelfOpPostExpr ast) {
        visit(ast.getBase());
        nowFunction.add(new Move((Register) ast.getOperand(), (Register) ast.getBase().getOperand()));
        if (ast.getOp()) nowFunction.add(new Binary((Register) ast.getBase().getOperand(),
                (Register) ast.getBase().getOperand(),
                new Constant(1), BinaryOp.add));
        else nowFunction.add(new Binary((Register) ast.getBase().getOperand(),
                (Register) ast.getBase().getOperand(),
                new Constant(1), BinaryOp.sub));
        if (ast.getBase() instanceof VarExpr) {
            if (((VarExpr) ast.getBase()).getVar().isGlobal()) {
                nowFunction.add(new StoreLabel(((VarExpr) ast.getBase()).getVar().getGlobalLabel(),
                        (Register) ast.getBase().getOperand(), CONSTANT.wordSize));
            }
        } else if (ast.getBase() instanceof AddressFetch) {
            getStoreIR((AddressFetch) ast.getBase(), (Register) ast.getBase().getOperand());
        }
    }

    private void visit(SelfOpPreExpr ast) {
        visit(ast.getBase());
        if (ast.getOp())
            nowFunction.add(new Binary((Register) ast.getBase().getOperand(),
                    (Register) ast.getBase().getOperand(),
                    new Constant(1), BinaryOp.add));
        else nowFunction.add(new Binary((Register) ast.getBase().getOperand(),
                (Register) ast.getBase().getOperand(),
                new Constant(1), BinaryOp.sub));
        if (ast.getBase() instanceof VarExpr) {
            if (((VarExpr) ast.getBase()).getVar().isGlobal()) {
                nowFunction.add(new StoreLabel(((VarExpr) ast.getBase()).getVar().getGlobalLabel(),
                        (Register) ast.getBase().getOperand(), CONSTANT.wordSize));
            }
        } else if (ast.getBase() instanceof AddressFetch) {
            getStoreIR((AddressFetch) ast.getBase(), (Register) ast.getBase().getOperand());
        }
        ast.changeOperand(ast.getBase().getOperand());
//        nowFunction.add(new Move((Register) ast.getOperand(), ast.getBase().getOperand()));
    }

    private void visit(ReturnStmt ast) {
        if (ast.getReturnExpr() != null) {
            visit(ast.getReturnExpr());
            nowFunction.add(new Return(ast.getReturnExpr().getOperand()));
        } else {
            nowFunction.add(new Return(null));
        }
    }

    private void visit(LogNotExpr ast) {
        if (ast.getBase().getOperand() instanceof Constant) {
            if (((Constant) ast.getBase().getOperand()).getValue() == 1) ast.changeOperand(new Constant(0));
            else ast.changeOperand(new Constant(1));
            return;
        }
        Label T = new Label("Log_true", true);
        Label F = new Label("Log_false", true);
        Label FINAL = new Label("Log_final", true);
        buildCondition(T, F, ast);

        nowFunction.add(T);
        nowFunction.add(new LoadImm((LocalRegister) ast.getOperand(), 1));
        nowFunction.add(new Jump(FINAL));

        nowFunction.add(F);
        nowFunction.add(new LoadImm((LocalRegister) ast.getOperand(), 0));
        nowFunction.add(new Jump(FINAL));

        nowFunction.add(FINAL);
    }

    private void visit(LogRelationExpr ast) {
//        visit(ast.getLhs());
//        visit(ast.getRhs());
//        if (ast.isAnd()) {
//            if (ast.getLhs().getOperand() instanceof Constant) {
//                nowFunction.add(new Binary((Register) ast.getOperand(),
//                        (Register) ast.getRhs().getOperand(), ast.getLhs().getOperand(),
//                        BinaryOp.and));
//            } else nowFunction.add(new Binary((Register) ast.getOperand(),
//                    (Register) ast.getLhs().getOperand(), ast.getRhs().getOperand(),
//                    BinaryOp.and));
//        } else {
//            if (ast.getLhs().getOperand() instanceof Constant) {
//                nowFunction.add(new Binary((Register) ast.getOperand(),
//                        (Register) ast.getRhs().getOperand(), ast.getLhs().getOperand(),
//                        BinaryOp.or));
//            } else nowFunction.add(new Binary((Register) ast.getOperand(),
//                    (Register) ast.getLhs().getOperand(), ast.getRhs().getOperand(),
//                    BinaryOp.or));
//        }

        Label T = new Label("Log_true", true);
        Label F = new Label("Log_false", true);
        Label FINAL = new Label("Log_final", true);
        buildCondition(T, F, ast);

        nowFunction.add(T);
        nowFunction.add(new LoadImm((LocalRegister) ast.getOperand(), 1));
        nowFunction.add(new Jump(FINAL));

        nowFunction.add(F);
        nowFunction.add(new LoadImm((LocalRegister) ast.getOperand(), 0));
        nowFunction.add(new Jump(FINAL));

        nowFunction.add(FINAL);
    }

    private void buildCondition(Label T, Label F, ExprStmt condition) {
        if (condition instanceof LogRelationExpr) {
            Label temp = new Label("temp", true);
            if (((LogRelationExpr) condition).isAnd()) {
                buildCondition(temp, F, ((LogRelationExpr) condition).getLhs());
                nowFunction.add(temp);
                buildCondition(T, F, ((LogRelationExpr) condition).getRhs());
            } else {
                buildCondition(T, temp, ((LogRelationExpr) condition).getLhs());
                nowFunction.add(temp);
                buildCondition(T, F, ((LogRelationExpr) condition).getRhs());
            }
        } else if (condition instanceof LogNotExpr) {
//            visit(((LogNotExpr) condition).getBase());
            buildCondition(F, T, ((LogNotExpr) condition).getBase());
        } else if (condition instanceof LogBinaryExpr) {
            visit(condition);
            nowFunction.add(new Branch((Register) condition.getOperand(), T, F));
        } else {
            visit(condition);
            if (condition instanceof BoolExpr) {
                if (((BoolExpr) condition).getValue()) {
                    nowFunction.add(new Jump(T));
                    return;
                } else {
                    nowFunction.add(new Jump(F));
                    return;
                }
            }
            nowFunction.add(new Branch((Register) condition.getOperand(), T, F));
        }
//        else {
//
//            System.err.println("at line: " + condition.getPosition().line);
//            throw new Bug_TextError();
//        }
//        else {
//            visit(condition);
//            nowFunction.add(new Branch(condition.getOperand(), T, F));
//        }
    }

    private void visit(SelectionStmt ast) {
        Label LT = new Label("if_true", true);
        Label LF = new Label("if_false", true);
        Label FINAL = new Label("if_finally", true);
        buildCondition(LT, LF, ast.getCondition());
        nowFunction.add(LT);
        visit(ast.getThenStmt());
        nowFunction.add(new Jump(FINAL));
        nowFunction.add(LF);
        if (ast.getSubSelectionConditions() != null) {
            ListIterator<ExprStmt> condI = ast.getSubSelectionConditions().listIterator(0);
            ListIterator<Stmt> stmtI = ast.getSubSelectionThenStmts().listIterator(0);
            while (condI.hasNext()) {
                LT = new Label("elseif_true", true);
                LF = new Label("elseif_false", true);
                buildCondition(LT, LF, condI.next());
                nowFunction.add(LT);
                visit(stmtI.next());
                nowFunction.add(new Jump(FINAL));
                nowFunction.add(LF);
            }
        }
        if (ast.getElseStmt() != null) {
//            System.out.println("Entered!!!");
            visit(ast.getElseStmt());
            nowFunction.add(new Jump(FINAL));
//            nowFunction.add(new Label("exitElse", true));
        }
        nowFunction.add(FINAL);
    }

    private void visit(ForStmt ast) {
        if (ast.getInit() != null) visit(ast.getInit());
        Label begin = new Label("For_Begin", true);
        if (ast.getCondition() != null) buildCondition(begin, ast.getEnd(), ast.getCondition());
        nowFunction.add(begin);
        visit(ast.getLoop());

//        nowFunction.add(new Jump(ast.getBegin()));

        nowFunction.add(ast.getBegin());
        if (ast.getAfter() != null) visit(ast.getAfter());
        if (ast.getCondition() != null) {
            buildCondition(begin, ast.getEnd(), ast.getCondition());
        } else {
            nowFunction.add(new Jump(begin));
        }
        nowFunction.add(ast.getEnd());
    }

    private void visit(WhileStmt ast) {
        Label begin = new Label("While_Begin", true);
        buildCondition(begin, ast.getEnd(), ast.getCondition());
        nowFunction.add(begin);
        visit(ast.getLoop());

//        nowFunction.add(new Jump(ast.getBegin()));

        nowFunction.add(ast.getBegin());
        buildCondition(begin, ast.getEnd(), ast.getCondition());
        nowFunction.add(ast.getEnd());
    }

    private void visit(CompoundStmt ast) {
        if (ast.getStmts() != null) {
            for (Stmt s : ast.getStmts()) {
                visit(s);
            }
        }
    }

    private void visit(BreakStmt ast) {
        nowFunction.add(new Jump(ast.getBreakTo().getEnd()));
    }

    private void visit(ContinueStmt ast) {
        nowFunction.add(new Jump(ast.getContinueTo().getBegin()));
    }
}
