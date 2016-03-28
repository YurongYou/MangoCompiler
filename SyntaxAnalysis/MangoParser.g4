grammar MangoParser;

//import MangoLexer;
/*
	Built by YurongYou.
	Based on Mx* Language Reference Manual 2016/3/21
 */

file:
    ( varDecl | funcDecl | classDecl )*
    ;

varDecl:
    type ID ';'
    | type ID '=' creationExpr ';'
	;

creationExpr:
    NEW type dimExpr?
    | NEW type //no constructor function
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
	| type '[]'
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
    RETURN expr ';'
    | BREAK ';'
    | CONTINUE ';'
    ;

selectionStmt: IF '(' expr ')' stmt (ELSEIF '(' expr ')' stmt)* (ELSE stmt)*;

iterationStmt:
    WHILE '(' expr? ')' stmt
    | FOR '(' varDecl expr? ';' expr? ')' stmt
    | FOR '(' expr? ';' expr? ';' expr? ')' stmt
    ;

expr:
    '(' expr ')'
    | CONSTANT
    | ID
    | expr ('++'|'--') //postfix iterationStmtincrement and decrement
    | ID '(' exprList? ')' //function call
    | expr '[' expr ']'
    | expr '.' expr //Subscript
    | ('++'|'--') expr //prefix increment and decrement
    | PLUS_MINUS expr //unary plus and minus
    | LOG_NOT expr
    | BIT_NOT expr
    | creationExpr
    | expr MUL_DIV_MOD expr
    | expr PLUS_MINUS expr
    | expr SHIFT expr
    | expr RELATION expr
    | expr EQ_NEQ expr
    | expr BIT_AND expr
    | expr BIT_XOR expr
    | expr BIT_OR expr
    | expr LOG_AND expr
    | expr LOG_OR expr
    | <assoc=right>expr ASSIGN expr
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

MUL_DIV_MOD : [*/%];
PLUS_MINUS : [+-];
SHIFT : '<<' | '>>';
RELATION : ('<' | '>' | '<=' | '>=');
EQ_NEQ : ('==' | '!=');

BIT_AND : '&';
BIT_XOR : '^';
BIT_OR : '|';
BIT_NOT : '~';

LOG_NOT : '!';
LOG_AND : '&&';
LOG_OR : '||';

ASSIGN : '=';

ID : ID_LETTER (ID_LETTER | DIGIT)*;

fragment ID_LETTER : [a-zA-Z_];
fragment DIGIT : [0-9];

LINE_COMMENT : '//' .*? '\r'? '\n' -> skip ; // Match "//" stuff '\n'
WS : [ \n\r\t]+ -> skip; // toss out whitespace