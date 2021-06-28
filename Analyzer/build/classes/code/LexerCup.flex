package code;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
Letters=[a-zA-Z_]+
Digits=[0-9]+
space=[ ,\t,\r,\n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

{space} {/*Ignore*/}

( "//"(.)* ) {/*Ignore*/}

( "int" ) {return new Symbol(sym.Int, yychar, yyline, yytext());}

( "float" ) {return new Symbol(sym.Float, yychar, yyline, yytext());}

( "char" ) {return new Symbol(sym.Char, yychar, yyline, yytext());}

( if ) {return new Symbol(sym.If, yychar, yyline, yytext());}

( else ) {return new Symbol(sym.Else, yychar, yyline, yytext());}

( while ) {return new Symbol(sym.While, yychar, yyline, yytext());}

( for ) {return new Symbol(sym.For, yychar, yyline, yytext());}

( switch ) {return new Symbol(sym.Switch, yychar, yyline, yytext());}

( case ) {return new Symbol(sym.Case, yychar, yyline, yytext());}

( default ) {return new Symbol(sym.Default, yychar, yyline, yytext());}

( break ) {return new Symbol(sym.Break, yychar, yyline, yytext());}

( "=" ) {return new Symbol(sym.Equal, yychar, yyline, yytext());}

( "+" | "-" | "*" | "/" ) {return new Symbol(sym.Op_mathematic, yychar, yyline, yytext());}

( "&&" | "||" | "!" | "&" | "|" ) {return new Symbol(sym.Op_logical, yychar, yyline, yytext());}

( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {return new Symbol(sym.Op_relational, yychar, yyline, yytext());}

( "++" | "--" ) {return new Symbol(sym.Op_increase, yychar, yyline, yytext());}

( "(" ) {return new Symbol(sym.Parentheses_o, yychar, yyline, yytext());}

( ")" ) {return new Symbol(sym.Parentheses_c, yychar, yyline, yytext());}

( "{" ) {return new Symbol(sym.Braces_o, yychar, yyline, yytext());}

( "}" ) {return new Symbol(sym.Braces_c, yychar, yyline, yytext());}

( "[" ) {return new Symbol(sym.Brackets_o, yychar, yyline, yytext());}

( "]" ) {return new Symbol(sym.Brackets_c, yychar, yyline, yytext());}

( ";" ) {return new Symbol(sym.Semicolon, yychar, yyline, yytext());}

( ":" ) {return new Symbol(sym.Colon, yychar, yyline, yytext());}

( _({Letters}|{Digits}|_)+ | {Letters}+{Digits}*((,) _({Letters}|{Digits}|_)+ | {Letters}+{Digits}*)* ) {return new Symbol(sym.Identifier, yychar, yyline, yytext());}

("(-"{Digits}+")")|{Digits}+ {return new Symbol(sym.Number, yychar, yyline, yytext());}

( "'"[a-zA-Z_]"'" ) {return new Symbol(sym.Literal, yychar, yyline, yytext());}

 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
