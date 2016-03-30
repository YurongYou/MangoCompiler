grammar Mango;

//import MangoLexer;
/*
	Built by YurongYou.
	Based on Mx* Language Reference Manual 2016/3/21
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

creationExpr:
    NEW type dimExpr?
    | NEW type
    | CONSTANT
    ;

dimExpr :
    ('[' expr ']')+
    ;

type:
    'bool'
    | 'int'
	| 'string'
	| ID
	| type ('[]')+
	;

returnType :
    type
    | 'void'
    ;

funcDecl: returnType ID '(' formalParameterList? ')' block;

formalParameterList: formalParameter (',' formalParameter)*;

formalParameter: type ID;

block: '{' stmt* '}';

stmt:
    expr? ';'
    | block
    | selectionStmt
    | iterationStmt
    | jumpStmt
    | varDecl
    ;

jumpStmt:
    RETURN expr ';'     #ReturnStmt
    | BREAK ';'         #BreakStmt
    | CONTINUE ';'      #ContinueStmt
    ;

selectionStmt: IF '(' expr ')' stmt (ELSEIF '(' expr ')' stmt)* (ELSE stmt)*;

iterationStmt:
    WHILE '(' expr? ')' stmt                        # WhileLoop
    | FOR '(' expr? ';' expr? ';' expr? ')' stmt    # ForLoop
    ;

expr:
    '(' expr ')'                            # Bracket
    | CONSTANT                              # Constant
    | ID                                    # Id
    | expr op = (PPLUS|MMINUS)              # SelfOpPost
    | ID '(' exprList? ')'                  # Call
    | expr '[' expr ']'                     # Index
    | expr '.' expr                         # FieldAndMethod
    | op = (PPLUS|MMINUS) expr              # SelfOpPre
    | op = (PLUS | MINUS) expr              # Sign
    | LOG_NOT expr                          # LogNot
    | BIT_NOT expr                          # BitNot
    | creationExpr                          # Creation
    | expr op = (MULT | DIV | MOD) expr     # MulDicMod
    | expr op = (PLUS | MINUS) expr         # PlusMinus
    | expr op = (SHIFT_L | SHIFR_R) expr    # Shift
    | expr op = (LESS|LARGE|LEQ|GEQ) expr   # Relation
    | expr op = (EQ | NEQ) expr             # Equal
    | expr BIT_AND expr                     # BitAnd
    | expr BIT_XOR expr                     # BitXor
    | expr BIT_OR expr                      # BitOr
    | expr LOG_AND expr                     # LogAnd
    | expr LOG_OR expr                      # LogOr
    | <assoc=right>expr '=' expr            # Assign
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
SHIFR_R : '>>';
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

//ASSIGN : '=';

ID : ID_LETTER (ID_LETTER | DIGIT)*;

fragment ID_LETTER : [a-zA-Z_];
fragment DIGIT : [0-9];

LINE_COMMENT : '//' .*? '\r'? '\n' -> skip ; // Match "//" stuff '\n'
WS : [ \n\r\t]+ -> skip; // toss out whitespace