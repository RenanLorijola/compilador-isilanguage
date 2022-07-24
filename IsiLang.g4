grammar IsiLang;

program  : 'programa' block 'fimprog;' ;

block : (command)+;

command: commandread {System.out.println("commandread"); }
| commandwrite {System.out.println("commandwrite");}
| commandattrib {System.out.println("commandattrib");};

commandread : 'leia' OPENPARENTHESIS IDENTIFIER CLOSEPARENTHESIS SEMICOLON;

commandwrite: 'escreva' OPENPARENTHESIS
                        IDENTIFIER {System.out.println("ID=" + _input.LT(-1).getText());}
                        CLOSEPARENTHESIS
                        SEMICOLON;

commandattrib: IDENTIFIER ATTRIBUTION expression SEMICOLON;

expression: term (OPERATOR term)*;

term: IDENTIFIER | NUMBER;

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

WHITESPACE	: (' ' | '\t' | '\n' | '\r') -> skip;