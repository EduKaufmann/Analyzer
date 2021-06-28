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

( "\"" ) {lexeme=yytext(); return Quotes;}

( "int" ) {lexeme=yytext(); return Int;}

( "char" ) {lexeme=yytext(); return Char;}

( "float" ) {lexeme=yytext(); return Float;}

( if ) {lexeme=yytext(); return If;}

( else ) {lexeme=yytext(); return Else;}

( do ) {lexeme=yytext(); return Do;}

( while ) {lexeme=yytext(); return While;}

( for ) {lexeme=yytext(); return For;}

( "=" ) {lexeme=yytext(); return Equal;}

( "+" ) {lexeme=yytext(); return Sum;}

( "-" ) {lexeme=yytext(); return Subtraction;}

( "*" ) {lexeme=yytext(); return Multiplication;}

( "/" ) {lexeme=yytext(); return Division;}

( "&&" | "||" | "!" | "&" | "|" ) {lexeme=yytext(); return Op_logical;}

( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexeme = yytext(); return Op_relational;}

( "++" | "--" ) {lexeme = yytext(); return Op_increase;}

(true | false)      {lexeme = yytext(); return Op_boolean;}

( "(" ) {lexeme=yytext(); return Parenthesis_o;}

( ")" ) {lexeme=yytext(); return Parenthesis_c;}

( "{" ) {lexeme=yytext(); return Braces_o;}

( "}" ) {lexeme=yytext(); return Braces_c;}

( "[" ) {lexeme = yytext(); return Brackets_o;}

( "]" ) {lexeme = yytext(); return Brackets_c;}

( ";" ) {lexeme=yytext(); return Semicolon;}

( _({Letters}|{Digits}|_)+ | {Letters}+{Digits}*((,) _({Letters}|{Digits}|_)+ | {Letters}+{Digits}*)* ) {lexeme=yytext(); return Identifier;}

("(-"{Digits}+")")|{Digits}+ {lexeme=yytext(); return Number;}

 . {return ERROR;}
