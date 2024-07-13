grammar fungramma;

prog:   stat+ ;

stat:   ID '=' expr NEWLINE          # assign
    |   'def' ID '(' paramList? ')' stat+  # funcDef
    |   ID '(' exprList? ')' NEWLINE       # funcCall
    |   'return' expr NEWLINE        # returnStat
    |   NEWLINE                      # blank
    ;

paramList: ID (',' ID)* ;
exprList: expr (',' expr)* ;

expr:   expr op=('*'|'/') expr       # MulDiv
    |   expr op=('+'|'-') expr       # AddSub
    |   INT                          # int
    |   ID                           # id
    |   '(' expr ')'                 # parens
    ;

MUL :   '*' ;
DIV :   '/' ;
ADD :   '+' ;
SUB :   '-' ;
ID  :   [a-zA-Z]+ ;
INT :   [0-9]+ ;
NEWLINE:'\r'? '\n' ;
WS  :   [ \t]+ -> skip ;
COMMENT :   '//' ~[\r\n]* -> skip ;
