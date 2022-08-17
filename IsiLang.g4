grammar IsiLang;
@header{
    import isilanguage.src.datastructures.IsiSymbol;
    import isilanguage.src.datastructures.IsiVariable;
    import isilanguage.src.datastructures.IsiSymbolTable;
    import isilanguage.src.exceptions.IsiSemanticException;
    import java.util.ArrayList;
    import java.util.List;
}

@members{
     private int _type;
     private String _varName;
     private String _varValue;
     private List<String> _unusedVariables = new ArrayList<String>();
     private IsiSymbol symbol;
     private IsiSymbolTable symbolTable = new IsiSymbolTable();

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

block : (command)+;

command: commandread
       | commandwrite
       | commandattrib
       | commandif
       | commandwhile;

commandread : 'leia' OPENPARENTHESIS
               IDENTIFIER { verifyID(_input.LT(-1).getText()); }
               CLOSEPARENTHESIS
               SEMICOLON;

commandwrite: 'escreva' OPENPARENTHESIS
                        IDENTIFIER { verifyID(_input.LT(-1).getText()); }
                        CLOSEPARENTHESIS
                        SEMICOLON;

commandattrib: IDENTIFIER{
                            _varName = _input.LT(-1).getText();
                            verifyID(_varName );
                           _unusedVariables.remove(_varName );
                         }
               ATTRIBUTION
               expression
               SEMICOLON {
               verifyType(_varName, _type);
               };

commandif: 'se' OPENPARENTHESIS
                IDENTIFIER
                RELATIONALOPERATOR
                (IDENTIFIER | NUMBER | TEXT | BOOLEAN)
                CLOSEPARENTHESIS
                OPENBRACKETS
                (command)+
                CLOSEBRACKETS
                ( 'senao'
                  OPENBRACKETS
                  (command)+
                  CLOSEBRACKETS
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


expression: term (OPERATOR term)*;

term: IDENTIFIER { verifyID(_input.LT(-1).getText());
                  _type = ((IsiVariable) symbolTable.get(_input.LT(-1).getText())).getType();
                }
    | NUMBER {_type = IsiVariable.NUMBER;}
    | TEXT {_type = IsiVariable.TEXT;}
    | BOOLEAN {_type = IsiVariable.BOOLEAN;}
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

IDENTIFIER	: [a-z] ([a-z] | [A-Z] | [0-9])*
	;

NUMBER	: [0-9]+ ('.' [0-9]+)?
		;

TEXT: DOUBLEQUOTE (  [a-z] | [A-Z] | [0-9] | ' ' )+ DOUBLEQUOTE
    ;

BOOLEAN: 'Verdadeiro' | 'Falso'
    ;

COMMA: ','
    ;

 DOUBLEQUOTE: '"'
    ;

WHITESPACE	: (' ' | '\t' | '\n' | '\r') -> skip;