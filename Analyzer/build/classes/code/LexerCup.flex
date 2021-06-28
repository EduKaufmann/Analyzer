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

( "\"" ) {return new Symbol(sym.Quotes, yychar, yyline, yytext());}

( byte | char | long | float | double ) {return new Symbol(sym.Type_data, yychar, yyline, yytext());}

( "int" ) {return new Symbol(sym.Int, yychar, yyline, yytext());}

( String ) {return new Symbol(sym.Array, yychar, yyline, yytext());}

( if ) {return new Symbol(sym.If, yychar, yyline, yytext());}

( else ) {return new Symbol(sym.Else, yychar, yyline, yytext());}

( do ) {return new Symbol(sym.Do, yychar, yyline, yytext());}

( while ) {return new Symbol(sym.While, yychar, yyline, yytext());}

( for ) {return new Symbol(sym.For, yychar, yyline, yytext());}

( "=" ) {return new Symbol(sym.Equal, yychar, yyline, yytext());}

( "+" ) {return new Symbol(sym.Sum, yychar, yyline, yytext());}

( "-" ) {return new Symbol(sym.Subtraction, yychar, yyline, yytext());}

( "*" ) {return new Symbol(sym.Multiplication, yychar, yyline, yytext());}

( "/" ) {return new Symbol(sym.Division, yychar, yyline, yytext());}

( "&&" | "||" | "!" | "&" | "|" ) {return new Symbol(sym.Op_logical, yychar, yyline, yytext());}

( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {return new Symbol(sym.Op_relational, yychar, yyline, yytext());}

( "+=" | "-="  | "*=" | "/=" | "%=" | "=" ) {return new Symbol(sym.Op_attribution, yychar, yyline, yytext());}

( "++" | "--" ) {return new Symbol(sym.Op_increase, yychar, yyline, yytext());}

( true | false ) {return new Symbol(sym.Op_boolean, yychar, yyline, yytext());}

( "(" ) {return new Symbol(sym.Parenthesis_o, yychar, yyline, yytext());}

( ")" ) {return new Symbol(sym.Parenthesis_c, yychar, yyline, yytext());}

( "{" ) {return new Symbol(sym.Braces_o, yychar, yyline, yytext());}

( "}" ) {return new Symbol(sym.Braces_c, yychar, yyline, yytext());}

( "[" ) {return new Symbol(sym.Brackets_o, yychar, yyline, yytext());}

( "]" ) {return new Symbol(sym.Brackets_c, yychar, yyline, yytext());}

( "main" ) {return new Symbol(sym.Main, yychar, yyline, yytext());}

( ";" ) {return new Symbol(sym.Semicolon, yychar, yyline, yytext());}

{Letters}({Letters}|{Digits})* {return new Symbol(sym.Identifier, yychar, yyline, yytext());}

("(-"{Digits}+")")|{Digits}+ {return new Symbol(sym.Number, yychar, yyline, yytext());}

 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
