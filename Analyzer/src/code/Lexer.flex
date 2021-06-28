package code;
import static code.Tokens.*;
%%
%class Lexer
%type Tokens
Letters=[a-zA-Z_]+
Digits=[0-9]+
space=[ ,\t,\r]+
%{
    public String lexeme;
%}
%%

{space} {/*Ignore*/}

( "//"(.)* ) {/*Ignore*/}

( "\n" ) {return Line;}

( "int" ) {lexeme=yytext(); return Int;}

( "char" ) {lexeme=yytext(); return Char;}

( "float" ) {lexeme=yytext(); return Float;}

( if ) {lexeme=yytext(); return If;}

( else ) {lexeme=yytext(); return Else;}

( while ) {lexeme=yytext(); return While;}

( for ) {lexeme=yytext(); return For;}

( switch ) {lexeme=yytext(); return Switch;}

( case ) {lexeme=yytext(); return Case;}

( default ) {lexeme=yytext(); return Default;}

( break ) {lexeme=yytext(); return Break;}

( "=" ) {lexeme=yytext(); return Equal;}

( "+" | "-" | "*" | "/" ) {lexeme = yytext(); return Op_mathematic;}

( "&&" | "||" | "!" | "&" | "|" ) {lexeme=yytext(); return Op_logical;}

( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexeme = yytext(); return Op_relational;}

( "++" | "--" ) {lexeme = yytext(); return Op_increase;}

( "(" ) {lexeme=yytext(); return Parentheses_o;}

( ")" ) {lexeme=yytext(); return Parentheses_c;}

( "{" ) {lexeme=yytext(); return Braces_o;}

( "}" ) {lexeme=yytext(); return Braces_c;}

( "[" ) {lexeme = yytext(); return Brackets_o;}

( "]" ) {lexeme = yytext(); return Brackets_c;}

( ";" ) {lexeme=yytext(); return Semicolon;}

( ":" ) {lexeme=yytext(); return Colon;}

( "'" ) {lexeme=yytext(); return Literal;}

( _({Letters}|{Digits}|_)+ | {Letters}+{Digits}*((,) _({Letters}|{Digits}|_)+ | {Letters}+{Digits}*)* ) {lexeme=yytext(); return Identifier;}

("(-"{Digits}+")")|{Digits}+ {lexeme=yytext(); return Number;}

 . {return ERROR;}
