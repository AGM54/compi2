grammar compara;

prog:   stat+ ;

stat:   ID '=' expr NEWLINE         # assign
    |   NEWLINE                     # blank
    ;

expr:   expr op=('*'|'/') expr      # MulDiv
    |   expr op=('+'|'-') expr      # AddSub
    |   expr op=('=='|'!='|'<'|'>'|'<='|'>=') expr  # Compare
    |   INT                         # int
    |   ID                          # id
    |   '(' expr ')'                # parens
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
EQ  :   '==' ;
NEQ :   '!=' ;
LT  :   '<' ;
GT  :   '>' ;
LEQ :   '<=' ;
GEQ :   '>=' ;
