grammar IsiLang;
@header{
    import isilanguage.src.datastructures.IsiSymbol;
    import isilanguage.src.datastructures.IsiVariable;
    import isilanguage.src.datastructures.IsiSymbolTable;
    import isilanguage.src.exceptions.IsiSemanticException;
    import java.util.ArrayList;
}

@members{
     private int _type;
     private String _varName;
     private String _varValue;
     private IsiSymbol symbol;
     private IsiSymbolTable symbolTable = new IsiSymbolTable();

     public void verifyID(String id){
        if (!symbolTable.exists(id)){
     	    throw new IsiSemanticException("Symbol "+id+" not declared");
     	}
     }
}

program  : 'programa' declaration block 'fimprog;' ;

declaration: (declarationStatement)+;

declarationStatement : 'declara' type IDENTIFIER  {
	                  _varName = _input.LT(-1).getText();
	                  _varValue = null;
	                  symbol = new IsiVariable(_varName, _type, _varValue);
	                  if (!symbolTable.exists(_varName)){
	                     symbolTable.add(symbol);
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
	                  }
	                  else{
	                  	 throw new IsiSemanticException("Symbol "+_varName+" already declared");
	                  }
                    }
              )*
               SEMICOLON
           ;

block : (command)+;

command: commandread
       | commandwrite
       | commandattrib ;

commandread : 'leia' OPENPARENTHESIS
               IDENTIFIER { verifyID(_input.LT(-1).getText()); }
               CLOSEPARENTHESIS
               SEMICOLON;

commandwrite: 'escreva' OPENPARENTHESIS
                        IDENTIFIER { verifyID(_input.LT(-1).getText()); }
                        CLOSEPARENTHESIS
                        SEMICOLON;

commandattrib: IDENTIFIER{ verifyID(_input.LT(-1).getText()); }
               ATTRIBUTION
               expression
               SEMICOLON;

expression: term (OPERATOR term)*;

term: IDENTIFIER { verifyID(_input.LT(-1).getText()); }
    | NUMBER;

type: 'texto'{_type = IsiVariable.TEXT;}
    | 'numero'{_type = IsiVariable.NUMBER;};

OPENPARENTHESIS	: '('
	;

CLOSEPARENTHESIS	: ')'
	;

SEMICOLON	: ';'
	;

OPERATOR	: '+' | '-' | '*' | '/'
	;

ATTRIBUTION : '='
	 ;

IDENTIFIER	: [a-z] ([a-z] | [A-Z] | [0-9])*
	;

NUMBER	: [0-9]+ ('.' [0-9]+)?
		;

COMMA: ','
    ;

WHITESPACE	: (' ' | '\t' | '\n' | '\r') -> skip;