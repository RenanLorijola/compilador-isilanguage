grammar IsiLang;
@header{
    import isilanguage.src.datastructures.*;
    import isilanguage.src.ast.*;
    import isilanguage.src.exceptions.IsiSemanticException;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Stack;
}

@members{
    private int _type;
    private String _varName;
    private String _varValue;
    private List<String> _unusedVariables = new ArrayList<String>();
    private IsiSymbol symbol;
    private IsiSymbolTable symbolTable = new IsiSymbolTable();

    //Generate code variables start

    private IsiProgram program = new IsiProgram();
    private ArrayList<AbstractCommand> currentThread;

    private Stack<ArrayList<AbstractCommand>> allCommands = new Stack<ArrayList<AbstractCommand>>();

    private String _commandId;
    private String _expressionId;
    private String _expressionContent;
    private String _expressionCondition;
    private ArrayList<AbstractCommand> ifList;
    private ArrayList<AbstractCommand> elseList;

    //Generate code variables end


    public void exibeComandos(){
        for (AbstractCommand c : program.getCommands()){
             System.out.println(c);
        }
    }
    public void generateCode(){
        program.generateTarget();
    }

    public void verifyID(String id){
       if (!symbolTable.exists(id)){
           throw new IsiSemanticException("Symbol "+id+" not declared");
       }
    }
    public void verifyType(String id, int type){
       if (((IsiVariable) symbolTable.get(id)).getType() != type){
           throw new IsiSemanticException("Symbol "+id+" has wrong type");
       }
    }
}

program  : 'programa' declaration block 'fimprog' {
    program.setVartable(symbolTable);
    program.setCommands(allCommands.pop());
    if(_unusedVariables.size() > 0){
        System.err.println("Unused variables: "+_unusedVariables);
    }
};

declaration: (declarationStatement)+;

declarationStatement : 'declara' type IDENTIFIER  {
	                  _varName = _input.LT(-1).getText();
	                  _varValue = null;
	                  symbol = new IsiVariable(_varName, _type, _varValue);
	                  if (!symbolTable.exists(_varName)){
	                     symbolTable.add(symbol);
	                     _unusedVariables.add(_varName);
	                  }
	                  else{
	                  	 throw new IsiSemanticException("Symbol "+_varName+" already declared");
	                  }
                    }
              (  COMMA
              	 IDENTIFIER {
	                  _varName = _input.LT(-1).getText();
	                  _varValue = null;
	                  symbol = new IsiVariable(_varName, _type, _varValue);
	                  if (!symbolTable.exists(_varName)){
	                    symbolTable.add(symbol);
	                    _unusedVariables.add(_varName);
	                  }
	                  else{
	                  	 throw new IsiSemanticException("Symbol "+_varName+" already declared");
	                  }
                    }
              )*
               SEMICOLON
           ;

block : {
    currentThread = new ArrayList<AbstractCommand>();
    allCommands.push(currentThread);
}
        (command)+;

command: commandread
       | commandwrite
       | commandattrib
       | commandif
       | commandwhile;

commandread : 'leia' OPENPARENTHESIS
               IDENTIFIER {
                   verifyID(_input.LT(-1).getText());
                   _commandId = _input.LT(-1).getText();
               }
               CLOSEPARENTHESIS
               SEMICOLON {
                    IsiVariable var = (IsiVariable) symbolTable.get(_commandId);
                    CommandRead command = new CommandRead(_commandId, var);
                    allCommands.peek().add(command);
               }
               ;

commandwrite: 'escreva' OPENPARENTHESIS
                        IDENTIFIER {
                            verifyID(_input.LT(-1).getText());
                            _commandId = _input.LT(-1).getText();
                        }

                        CLOSEPARENTHESIS
                        SEMICOLON {
                            CommandWrite command = new CommandWrite(_commandId);
                            allCommands.peek().add(command);
                        }
                        ;


commandattrib: IDENTIFIER {
                   _varName = _input.LT(-1).getText();
                   verifyID(_varName);
                   _unusedVariables.remove(_varName);
                   _expressionId = _varName;
               }
               ATTRIBUTION { _expressionContent = ""; }
               expression
               SEMICOLON {
                   verifyType(_varName, _type);
                   CommandAttrib command = new CommandAttrib(_expressionId, _expressionContent);
                   allCommands.peek().add(command);
               };

commandif: 'se' OPENPARENTHESIS
                (
                (
                (IDENTIFIER | NUMBER | TEXT | BOOLEAN) { _expressionCondition = _input.LT(-1).getText(); }
                RELATIONALOPERATOR { _expressionCondition += _input.LT(-1).getText(); }
                (IDENTIFIER | NUMBER | TEXT | BOOLEAN) { _expressionCondition += _input.LT(-1).getText(); }
                )
                |
                BOOLEAN { _expressionCondition = _input.LT(-1).getText(); }
                )
                CLOSEPARENTHESIS
                OPENBRACKETS {
                    currentThread = new ArrayList<AbstractCommand>();
                    allCommands.push(currentThread);
                }
                (command)+
                CLOSEBRACKETS {
                    ifList = allCommands.pop();
                }
                ( 'senao'
                  OPENBRACKETS {
                      currentThread = new ArrayList<AbstractCommand>();
                      allCommands.push(currentThread);
                  }
                  (command)+
                  CLOSEBRACKETS {
                      elseList = allCommands.pop();
                      CommandIf command = new CommandIf(_expressionCondition, ifList, elseList);
                      allCommands.peek().add(command);
                  }
                )?
;

commandwhile: 'enquanto' OPENPARENTHESIS
                IDENTIFIER
                RELATIONALOPERATOR
                (IDENTIFIER | NUMBER | TEXT | BOOLEAN)
                CLOSEPARENTHESIS
                OPENBRACKETS
                (command)+
                CLOSEBRACKETS;


expression: term (
                 OPERATOR {
                      _expressionContent += _input.LT(-1).getText();
                 }
                 term
                 )*;

term: IDENTIFIER { verifyID(_input.LT(-1).getText());
                  _type = ((IsiVariable) symbolTable.get(_input.LT(-1).getText())).getType();
                  _expressionContent += _input.LT(-1).getText();
                }
    | NUMBER {
        _type = IsiVariable.NUMBER;
        _expressionContent += _input.LT(-1).getText();
    }
    | TEXT {
        _type = IsiVariable.TEXT;
        _expressionContent += _input.LT(-1).getText();
    }
    | BOOLEAN {
        _type = IsiVariable.BOOLEAN;
        _expressionContent += _input.LT(-1).getText();
    }
    ;

type: 'texto'{_type = IsiVariable.TEXT;}
    | 'numero'{_type = IsiVariable.NUMBER;}
    | 'booleano'{_type = IsiVariable.BOOLEAN;}
    ;

OPENPARENTHESIS	: '('
	;

CLOSEPARENTHESIS	: ')'
	;

OPENBRACKETS  : '{'
     ;

CLOSEBRACKETS  : '}'
     ;

SEMICOLON	: ';'
	;

OPERATOR	: '+' | '-' | '*' | '/'
	;

ATTRIBUTION : '='
	 ;

RELATIONALOPERATOR    : '>' | '<' | '>=' | '<=' | '==' | '!='
                        ;

BOOLEAN: 'true' | 'false'
       ;

IDENTIFIER	: [a-z] ([a-z] | [A-Z] | [0-9])*
	        ;

NUMBER	: [0-9]+ ('.' [0-9]+)?
		;

TEXT: DOUBLEQUOTE (  [a-z] | [A-Z] | [0-9] | ' ' )+ DOUBLEQUOTE
    ;

COMMA: ','
    ;

DOUBLEQUOTE: '"'
            ;

WHITESPACE	: (' ' | '\t' | '\n' | '\r') -> skip;