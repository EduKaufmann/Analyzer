
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Jun 28 02:53:20 BRT 2021
//----------------------------------------------------

package code;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Jun 28 02:53:20 BRT 2021
  */
public class Syntax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Syntax() {super();}

  /** Constructor which sets the default scanner. */
  public Syntax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Syntax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\047\000\002\002\004\000\002\002\003\000\002\002" +
    "\003\000\002\002\003\000\002\002\003\000\002\003\005" +
    "\000\002\003\005\000\002\003\006\000\002\003\005\000" +
    "\002\004\004\000\002\004\003\000\002\010\005\000\002" +
    "\007\005\000\002\007\004\000\002\007\003\000\002\011" +
    "\011\000\002\011\015\000\002\005\005\000\002\005\005" +
    "\000\002\005\005\000\002\005\005\000\002\006\010\000" +
    "\002\006\010\000\002\006\010\000\002\006\010\000\002" +
    "\006\005\000\002\012\011\000\002\012\011\000\002\012" +
    "\011\000\002\012\011\000\002\012\006\000\002\012\003" +
    "\000\002\013\011\000\002\014\011\000\002\014\012\000" +
    "\002\015\012\000\002\016\006\000\002\016\003\000\002" +
    "\017\007" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\163\000\016\005\012\006\005\007\011\010\007\014" +
    "\010\034\004\001\002\000\004\021\134\001\002\000\004" +
    "\031\132\001\002\000\004\002\ufffd\001\002\000\004\021" +
    "\120\001\002\000\004\021\041\001\002\000\004\031\025" +
    "\001\002\000\004\031\020\001\002\000\004\002\uffff\001" +
    "\002\000\004\002\ufffe\001\002\000\004\002\000\001\002" +
    "\000\004\002\017\001\002\000\004\002\001\001\002\000" +
    "\006\030\022\031\023\001\002\000\004\002\ufffc\001\002" +
    "\000\004\002\ufff7\001\002\000\006\030\022\031\023\001" +
    "\002\000\004\002\ufff8\001\002\000\010\026\026\030\027" +
    "\031\032\001\002\000\004\033\037\001\002\000\004\002" +
    "\ufff3\001\002\000\004\002\ufff9\001\002\000\006\030\027" +
    "\031\032\001\002\000\010\026\026\030\027\031\032\001" +
    "\002\000\006\030\027\031\032\001\002\000\004\002\ufff4" +
    "\001\002\000\004\002\ufff5\001\002\000\004\002\ufffa\001" +
    "\002\000\004\027\040\001\002\000\006\030\ufff6\031\ufff6" +
    "\001\002\000\006\031\044\033\042\001\002\000\004\017" +
    "\115\001\002\000\004\022\050\001\002\000\004\017\045" +
    "\001\002\000\006\031\047\033\046\001\002\000\004\022" +
    "\ufff0\001\002\000\004\022\uffef\001\002\000\004\024\051" +
    "\001\002\000\004\031\053\001\002\000\004\025\114\001" +
    "\002\000\006\012\054\020\055\001\002\000\006\031\101" +
    "\033\100\001\002\000\004\030\056\001\002\000\010\025" +
    "\uffe2\031\060\035\uffe2\001\002\000\006\025\uffe8\035\uffe8" +
    "\001\002\000\006\012\061\020\062\001\002\000\006\031" +
    "\065\033\064\001\002\000\004\030\056\001\002\000\006" +
    "\025\uffe3\035\uffe3\001\002\000\004\013\073\001\002\000" +
    "\004\013\066\001\002\000\006\031\070\033\067\001\002" +
    "\000\004\030\056\001\002\000\004\030\056\001\002\000" +
    "\006\025\uffe7\035\uffe7\001\002\000\006\025\uffe6\035\uffe6" +
    "\001\002\000\006\031\075\033\074\001\002\000\004\030" +
    "\056\001\002\000\004\030\056\001\002\000\006\025\uffe4" +
    "\035\uffe4\001\002\000\006\025\uffe5\035\uffe5\001\002\000" +
    "\004\013\107\001\002\000\004\013\102\001\002\000\006" +
    "\031\104\033\103\001\002\000\004\030\056\001\002\000" +
    "\004\030\056\001\002\000\006\025\uffec\035\uffec\001\002" +
    "\000\006\025\uffeb\035\uffeb\001\002\000\006\031\111\033" +
    "\110\001\002\000\004\030\056\001\002\000\004\030\056" +
    "\001\002\000\006\025\uffe9\035\uffe9\001\002\000\006\025" +
    "\uffea\035\uffea\001\002\000\004\002\uffe1\001\002\000\006" +
    "\031\117\033\116\001\002\000\004\022\uffee\001\002\000" +
    "\004\022\uffed\001\002\000\006\031\044\033\042\001\002" +
    "\000\004\022\122\001\002\000\004\024\123\001\002\000" +
    "\004\031\053\001\002\000\004\025\125\001\002\000\006" +
    "\002\ufff2\011\126\001\002\000\004\024\127\001\002\000" +
    "\004\031\053\001\002\000\004\025\131\001\002\000\004" +
    "\002\ufff1\001\002\000\006\030\022\031\023\001\002\000" +
    "\004\002\ufffb\001\002\000\004\031\135\001\002\000\004" +
    "\022\136\001\002\000\004\024\137\001\002\000\004\015" +
    "\140\001\002\000\004\033\152\001\002\000\006\025\144" +
    "\032\143\001\002\000\004\025\151\001\002\000\004\023" +
    "\145\001\002\000\004\002\uffe0\001\002\000\004\024\146" +
    "\001\002\000\004\031\053\001\002\000\004\025\150\001" +
    "\002\000\004\025\uffdb\001\002\000\004\002\uffdf\001\002" +
    "\000\004\023\153\001\002\000\006\015\154\024\155\001" +
    "\002\000\004\033\163\001\002\000\004\031\uffdc\001\002" +
    "\000\004\031\053\001\002\000\004\035\160\001\002\000" +
    "\004\030\161\001\002\000\004\025\162\001\002\000\006" +
    "\025\uffde\032\uffde\001\002\000\004\023\164\001\002\000" +
    "\006\015\154\024\155\001\002\000\004\031\uffdd\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\163\000\014\002\015\003\014\011\012\013\005\014" +
    "\013\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\004\020\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\004\023\001\001\000\002\001\001\000\006\007" +
    "\027\010\030\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\007\035\001\001\000\006\007" +
    "\033\010\032\001\001\000\004\007\034\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\005\042\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\006\051\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\012\056\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\012\062\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\012" +
    "\071\001\001\000\004\012\070\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\012\076\001" +
    "\001\000\004\012\075\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\012\105\001\001\000\004\012\104\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\012\112\001\001\000\004\012\111\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\005\120" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\006" +
    "\123\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\006\127\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\004\132\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\015\140\001\001\000\002\001\001\000\004\017\141" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\006\146\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\016\155\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\006\156\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\016\164\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Syntax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Syntax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Syntax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
        this.s = s;
    }

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Syntax$actions {
  private final Syntax parser;

  /** Constructor */
  CUP$Syntax$actions(Syntax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Syntax$do_action(
    int                        CUP$Syntax$act_num,
    java_cup.runtime.lr_parser CUP$Syntax$parser,
    java.util.Stack            CUP$Syntax$stack,
    int                        CUP$Syntax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Syntax$result;

      /* select the action based on the action number */
      switch (CUP$Syntax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // DEFAULT ::= Default Colon Braces_o COMMANDS Braces_c 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("DEFAULT",13, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-4)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // CASE2 ::= Braces_o 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("CASE2",12, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // CASE2 ::= Case Number Colon CASE2 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("CASE2",12, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-3)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // CASE ::= Case Number Colon CASE2 COMMANDS Break Semicolon Braces_c 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("CASE",11, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-7)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // SWITCH ::= Switch Parentheses_o Identifier Parentheses_c Braces_o CASE DEFAULT Braces_c 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("SWITCH",10, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-7)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // SWITCH ::= Switch Parentheses_o Identifier Parentheses_c Braces_o CASE Braces_c 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("SWITCH",10, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-6)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // WHILE ::= While Parentheses_o CONDITION Parentheses_c Braces_o COMMANDS Braces_c 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("WHILE",9, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-6)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // COMMANDS2 ::= Semicolon 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("COMMANDS2",8, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // COMMANDS2 ::= Semicolon Identifier Op_increase COMMANDS2 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("COMMANDS2",8, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-3)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // COMMANDS2 ::= Semicolon Identifier Equal Number Op_mathematic Identifier COMMANDS2 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("COMMANDS2",8, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-6)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // COMMANDS2 ::= Semicolon Identifier Equal Number Op_mathematic Number COMMANDS2 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("COMMANDS2",8, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-6)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // COMMANDS2 ::= Semicolon Identifier Equal Identifier Op_mathematic Number COMMANDS2 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("COMMANDS2",8, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-6)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // COMMANDS2 ::= Semicolon Identifier Equal Identifier Op_mathematic Identifier COMMANDS2 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("COMMANDS2",8, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-6)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // COMMANDS ::= Identifier Op_increase COMMANDS2 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("COMMANDS",4, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // COMMANDS ::= Identifier Equal Number Op_mathematic Identifier COMMANDS2 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("COMMANDS",4, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-5)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // COMMANDS ::= Identifier Equal Number Op_mathematic Number COMMANDS2 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("COMMANDS",4, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-5)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // COMMANDS ::= Identifier Equal Identifier Op_mathematic Number COMMANDS2 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("COMMANDS",4, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-5)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // COMMANDS ::= Identifier Equal Identifier Op_mathematic Identifier COMMANDS2 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("COMMANDS",4, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-5)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // CONDITION ::= Number Op_relational Identifier 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("CONDITION",3, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // CONDITION ::= Number Op_relational Number 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("CONDITION",3, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // CONDITION ::= Identifier Op_relational Identifier 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("CONDITION",3, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // CONDITION ::= Identifier Op_relational Number 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("CONDITION",3, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // IF ::= If Parentheses_o CONDITION Parentheses_c Braces_o COMMANDS Braces_c Else Braces_o COMMANDS Braces_c 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("IF",7, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-10)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // IF ::= If Parentheses_o CONDITION Parentheses_c Braces_o COMMANDS Braces_c 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("IF",7, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-6)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // RECURSIVE_ARRAY_DECLARATION ::= Semicolon 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("RECURSIVE_ARRAY_DECLARATION",5, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // RECURSIVE_ARRAY_DECLARATION ::= Identifier RECURSIVE_ARRAY_DECLARATION 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("RECURSIVE_ARRAY_DECLARATION",5, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // RECURSIVE_ARRAY_DECLARATION ::= Identifier ARRAY_DECLARATION RECURSIVE_ARRAY_DECLARATION 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("RECURSIVE_ARRAY_DECLARATION",5, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // ARRAY_DECLARATION ::= Brackets_o Number Brackets_c 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("ARRAY_DECLARATION",6, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // RECURSIVE_DECLARATION ::= Semicolon 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("RECURSIVE_DECLARATION",2, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // RECURSIVE_DECLARATION ::= Identifier RECURSIVE_DECLARATION 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("RECURSIVE_DECLARATION",2, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // DECLARATION ::= Char Identifier RECURSIVE_ARRAY_DECLARATION 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("DECLARATION",1, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // DECLARATION ::= Char Identifier ARRAY_DECLARATION RECURSIVE_ARRAY_DECLARATION 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("DECLARATION",1, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-3)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // DECLARATION ::= Float Identifier RECURSIVE_DECLARATION 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("DECLARATION",1, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // DECLARATION ::= Int Identifier RECURSIVE_DECLARATION 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("DECLARATION",1, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-2)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // BEGIN ::= WHILE 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("BEGIN",0, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // BEGIN ::= SWITCH 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("BEGIN",0, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // BEGIN ::= IF 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("BEGIN",0, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // BEGIN ::= DECLARATION 
            {
              Object RESULT =null;

              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("BEGIN",0, ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          return CUP$Syntax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= BEGIN EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)).value;
		RESULT = start_val;
              CUP$Syntax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Syntax$stack.elementAt(CUP$Syntax$top-1)), ((java_cup.runtime.Symbol)CUP$Syntax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Syntax$parser.done_parsing();
          return CUP$Syntax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

