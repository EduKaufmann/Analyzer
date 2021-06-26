package code;
import static code.Tokens.*;
%%
%class Lexer
%type Tokens
letters=[a-zA-Z_]+
digits=[0-9]+
space=[ ,\t,\r,\n]+
%{
    public String lexeme;
%}
%%
int |
if |
else |
while {lexeme=yytext(); return Reserved;}
{space} {/*Ignore*/}
"//".* {/*Ignore*/}
"=" {return Equal;}
"+" {return Sum;}
"-" {return Subtraction;}
"*" {return Multiplication;}
"/" {return Division;}
{letters}({letters}|{digits})* {lexeme=yytext(); return Identifier;}
("(-"{digits}+")")|{digits}+ {lexeme=yytext(); return Number;}
 . {return ERROR;}