grammar Mango;

/*
	Built by YurongYou.
	Based on Mx* Language Reference Manual 2016/3/29
 */

prog:
    decl*
    ;

decl:
    varDecl
    | funcDecl
    | classDecl
    ;

varDecl:
    type ID ';'
    | type ID '=' expr ';'
	;



atomType:
    'bool'
    | 'int'
    | 'string'
    | ID
    ;

type:
    atomType               # atom
    |type DIM              # ArrayType
	;

funcDecl:
    type ID '(' formalParameterList? ')' block          # FuncWithReturn
    | 'void' ID '(' formalParameterList? ')' block      # Prosedure
    ;

formalParameterList: formalParameter (',' formalParameter)*;

formalParameter: type ID;

block: '{' stmt* '}';

stmt:
    ';'                 # EmptyStmt
    | expr ';'          # ExprStmt
    | block             # CompoundStmt
    | selection         # SelectionStmt
    | iteration         # IterationStmt
    | jump              # JumpStmt
    | varDecl           # VarDeclStmt
    ;

jump:
    RETURN expr ';'     # ReturnStmt
    | BREAK ';'         # BreakStmt
    | CONTINUE ';'      # ContinueStmt
    ;

selection: IF '(' expr ')' stmt (subSelection)* (ELSE stmt)?;

subSelection: ELSEIF '(' expr ')' stmt;

iteration:
    WHILE '(' expr? ')' stmt                        # WhileLoop
    | FOR '(' expr? ';' expr? ';' expr? ')' stmt    # ForLoop
    ;

expr:
    '(' expr ')'                            # Bracket
    | CONSTANT                              # Node
    | ID                                    # Node
    | expr op = (PPLUS|MMINUS)              # SelfOpPost
    | ID '(' exprList? ')'                  # Call
    | expr '[' expr ']'                     # Index
    | expr '.' ID                           # FieldAccess
    | expr '.' ID '(' exprList? ')'         # ClassFuncAccess
    | op = (PPLUS|MMINUS) expr              # SelfOpPre
    | op = (PLUS | MINUS) expr              # Sign
    | op = LOG_NOT expr                     # LogNot
    | op = BIT_NOT expr                     # BitNot
    | creationExpr                          # Creation
    | expr op = (MULT | DIV | MOD) expr     # binary
    | expr op = (PLUS | MINUS) expr         # binary
    | expr op = (SHIFT_L | SHIFT_R) expr    # binary
    | expr op = (LESS|LARGE|LEQ|GEQ) expr   # LogBinary
    | expr op = (EQ | NEQ) expr             # LogBinary
    | expr op = BIT_AND expr                # binary
    | expr op = BIT_XOR expr                # binary
    | expr op = BIT_OR expr                 # binary
    | expr op = LOG_AND expr                # LogBinary
    | expr op = LOG_OR expr                 # LogBinary
    | <assoc=right>expr '=' expr            # Assign
    ;

creationExpr:
    NEW atomType dimExpr+    # ArrayCreate
    | NEW atomType           # AtomCreate
    ;

dimExpr :
    '[' expr ']'
    ;

exprList: expr (',' expr)* ;

classDecl: 'class' ID classBlock;

classBlock: '{' memberDecl* '}';

memberDecl: type ID ';';


// Lexer for constants
CONSTANT : NULL
    | INT
    | STRING
    | BOOL
    ;

INT : '-'? DIGIT+;
STRING : '"' (~["\\]| ESC)* '"';
fragment ESC : '\\' ["\\n];
BOOL : 'true' | 'false';
NULL : 'null';

IF : 'if';
ELSE : 'else';
ELSEIF : 'else if';

WHILE : 'while';
FOR : 'for';

NEW : 'new';

RETURN : 'return';
BREAK : 'break';
CONTINUE : 'continue';

PPLUS : '++';
MMINUS : '--';
MULT : '*';
DIV : '/';
MOD : '%';
PLUS : '+';
MINUS : '-';
SHIFT_L : '<<';
SHIFT_R : '>>';
LESS : '<';
LARGE : '>';
LEQ : '<=';
GEQ : '>=';
EQ : '==';
NEQ : '!=';

BIT_AND : '&';
BIT_XOR : '^';
BIT_OR : '|';
BIT_NOT : '~';

LOG_NOT : '!';
LOG_AND : '&&';
LOG_OR : '||';

DIM : '[]';
//ASSIGN : '=';

ID : ID_LETTER (ID_LETTER | DIGIT)*;

fragment ID_LETTER : [a-zA-Z_];
fragment DIGIT : [0-9];

LINE_COMMENT : '//' .*? '\r'? '\n' -> skip ; // Match "//" stuff '\n'
WS : [ \n\r\t]+ -> skip; // toss out whitespace