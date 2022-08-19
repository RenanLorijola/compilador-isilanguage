// Generated from IsiLang.g4 by ANTLR 4.10.1
package isilanguage.src.parser;

    import isilanguage.src.datastructures.*;
    import isilanguage.src.ast.*;
    import isilanguage.src.exceptions.IsiSemanticException;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Stack;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, OPENPARENTHESIS=12, CLOSEPARENTHESIS=13, OPENBRACKETS=14, 
		CLOSEBRACKETS=15, SEMICOLON=16, OPERATOR=17, ATTRIBUTION=18, RELATIONALOPERATOR=19, 
		BOOLEAN=20, IDENTIFIER=21, NUMBER=22, TEXT=23, COMMA=24, DOUBLEQUOTE=25, 
		WHITESPACE=26;
	public static final int
		RULE_program = 0, RULE_declaration = 1, RULE_declarationStatement = 2, 
		RULE_block = 3, RULE_command = 4, RULE_commandread = 5, RULE_commandwrite = 6, 
		RULE_commandattrib = 7, RULE_commandif = 8, RULE_commandwhile = 9, RULE_expression = 10, 
		RULE_term = 11, RULE_type = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaration", "declarationStatement", "block", "command", 
			"commandread", "commandwrite", "commandattrib", "commandif", "commandwhile", 
			"expression", "term", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog'", "'declara'", "'leia'", "'escreva'", 
			"'se'", "'senao'", "'enquanto'", "'texto'", "'numero'", "'booleano'", 
			"'('", "')'", "'{'", "'}'", "';'", null, "'='", null, null, null, null, 
			null, "','", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"OPENPARENTHESIS", "CLOSEPARENTHESIS", "OPENBRACKETS", "CLOSEBRACKETS", 
			"SEMICOLON", "OPERATOR", "ATTRIBUTION", "RELATIONALOPERATOR", "BOOLEAN", 
			"IDENTIFIER", "NUMBER", "TEXT", "COMMA", "DOUBLEQUOTE", "WHITESPACE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "IsiLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public IsiLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(27);
			declaration();
			setState(28);
			block();
			setState(29);
			match(T__1);

			    program.setVartable(symbolTable);
			    program.setCommands(allCommands.pop());
			    if(_unusedVariables.size() > 0){
			        System.err.println("Unused variables: "+_unusedVariables);
			    }

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public List<DeclarationStatementContext> declarationStatement() {
			return getRuleContexts(DeclarationStatementContext.class);
		}
		public DeclarationStatementContext declarationStatement(int i) {
			return getRuleContext(DeclarationStatementContext.class,i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				declarationStatement();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(IsiLangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(IsiLangParser.IDENTIFIER, i);
		}
		public TerminalNode SEMICOLON() { return getToken(IsiLangParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IsiLangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IsiLangParser.COMMA, i);
		}
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitDeclarationStatement(this);
		}
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__2);
			setState(38);
			type();
			setState(39);
			match(IDENTIFIER);

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
			                    
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(41);
				match(COMMA);
				setState(42);
				match(IDENTIFIER);

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
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			    currentThread = new ArrayList<AbstractCommand>();
			    allCommands.push(currentThread);

			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				command();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << IDENTIFIER))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public CommandreadContext commandread() {
			return getRuleContext(CommandreadContext.class,0);
		}
		public CommandwriteContext commandwrite() {
			return getRuleContext(CommandwriteContext.class,0);
		}
		public CommandattribContext commandattrib() {
			return getRuleContext(CommandattribContext.class,0);
		}
		public CommandifContext commandif() {
			return getRuleContext(CommandifContext.class,0);
		}
		public CommandwhileContext commandwhile() {
			return getRuleContext(CommandwhileContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_command);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				commandread();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				commandwrite();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				commandattrib();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				commandif();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				commandwhile();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandreadContext extends ParserRuleContext {
		public TerminalNode OPENPARENTHESIS() { return getToken(IsiLangParser.OPENPARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(IsiLangParser.IDENTIFIER, 0); }
		public TerminalNode CLOSEPARENTHESIS() { return getToken(IsiLangParser.CLOSEPARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(IsiLangParser.SEMICOLON, 0); }
		public CommandreadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandread; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCommandread(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCommandread(this);
		}
	}

	public final CommandreadContext commandread() throws RecognitionException {
		CommandreadContext _localctx = new CommandreadContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_commandread);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__3);
			setState(65);
			match(OPENPARENTHESIS);
			setState(66);
			match(IDENTIFIER);

			                   verifyID(_input.LT(-1).getText());
			                   _commandId = _input.LT(-1).getText();
			               
			setState(68);
			match(CLOSEPARENTHESIS);
			setState(69);
			match(SEMICOLON);

			                    IsiVariable var = (IsiVariable) symbolTable.get(_commandId);
			                    CommandRead command = new CommandRead(_commandId, var);
			                    allCommands.peek().add(command);
			               
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandwriteContext extends ParserRuleContext {
		public TerminalNode OPENPARENTHESIS() { return getToken(IsiLangParser.OPENPARENTHESIS, 0); }
		public TerminalNode IDENTIFIER() { return getToken(IsiLangParser.IDENTIFIER, 0); }
		public TerminalNode CLOSEPARENTHESIS() { return getToken(IsiLangParser.CLOSEPARENTHESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(IsiLangParser.SEMICOLON, 0); }
		public CommandwriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandwrite; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCommandwrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCommandwrite(this);
		}
	}

	public final CommandwriteContext commandwrite() throws RecognitionException {
		CommandwriteContext _localctx = new CommandwriteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_commandwrite);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__4);
			setState(73);
			match(OPENPARENTHESIS);
			setState(74);
			match(IDENTIFIER);

			                            verifyID(_input.LT(-1).getText());
			                            _commandId = _input.LT(-1).getText();
			                        
			setState(76);
			match(CLOSEPARENTHESIS);
			setState(77);
			match(SEMICOLON);

			                            CommandWrite command = new CommandWrite(_commandId);
			                            allCommands.peek().add(command);
			                        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandattribContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(IsiLangParser.IDENTIFIER, 0); }
		public TerminalNode ATTRIBUTION() { return getToken(IsiLangParser.ATTRIBUTION, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(IsiLangParser.SEMICOLON, 0); }
		public CommandattribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandattrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCommandattrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCommandattrib(this);
		}
	}

	public final CommandattribContext commandattrib() throws RecognitionException {
		CommandattribContext _localctx = new CommandattribContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_commandattrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(IDENTIFIER);

			                   _varName = _input.LT(-1).getText();
			                   verifyID(_varName);
			                   _unusedVariables.remove(_varName);
			                   _expressionId = _varName;
			               
			setState(82);
			match(ATTRIBUTION);
			 _expressionContent = ""; 
			setState(84);
			expression();
			setState(85);
			match(SEMICOLON);

			                   verifyType(_varName, _type);
			                   CommandAttrib command = new CommandAttrib(_expressionId, _expressionContent);
			                   allCommands.peek().add(command);
			               
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandifContext extends ParserRuleContext {
		public TerminalNode OPENPARENTHESIS() { return getToken(IsiLangParser.OPENPARENTHESIS, 0); }
		public TerminalNode CLOSEPARENTHESIS() { return getToken(IsiLangParser.CLOSEPARENTHESIS, 0); }
		public List<TerminalNode> OPENBRACKETS() { return getTokens(IsiLangParser.OPENBRACKETS); }
		public TerminalNode OPENBRACKETS(int i) {
			return getToken(IsiLangParser.OPENBRACKETS, i);
		}
		public List<TerminalNode> CLOSEBRACKETS() { return getTokens(IsiLangParser.CLOSEBRACKETS); }
		public TerminalNode CLOSEBRACKETS(int i) {
			return getToken(IsiLangParser.CLOSEBRACKETS, i);
		}
		public List<TerminalNode> BOOLEAN() { return getTokens(IsiLangParser.BOOLEAN); }
		public TerminalNode BOOLEAN(int i) {
			return getToken(IsiLangParser.BOOLEAN, i);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public TerminalNode RELATIONALOPERATOR() { return getToken(IsiLangParser.RELATIONALOPERATOR, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(IsiLangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(IsiLangParser.IDENTIFIER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(IsiLangParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(IsiLangParser.NUMBER, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(IsiLangParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(IsiLangParser.TEXT, i);
		}
		public CommandifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCommandif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCommandif(this);
		}
	}

	public final CommandifContext commandif() throws RecognitionException {
		CommandifContext _localctx = new CommandifContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_commandif);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__5);
			setState(89);
			match(OPENPARENTHESIS);
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				{
				setState(90);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << TEXT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 _expressionCondition = _input.LT(-1).getText(); 
				setState(92);
				match(RELATIONALOPERATOR);
				 _expressionCondition += _input.LT(-1).getText(); 
				setState(94);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << TEXT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 _expressionCondition += _input.LT(-1).getText(); 
				}
				}
				break;
			case 2:
				{
				setState(96);
				match(BOOLEAN);
				 _expressionCondition = _input.LT(-1).getText(); 
				}
				break;
			}
			setState(100);
			match(CLOSEPARENTHESIS);
			setState(101);
			match(OPENBRACKETS);

			                    currentThread = new ArrayList<AbstractCommand>();
			                    allCommands.push(currentThread);
			                
			setState(104); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103);
				command();
				}
				}
				setState(106); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << IDENTIFIER))) != 0) );
			setState(108);
			match(CLOSEBRACKETS);

			                    ifList = allCommands.pop();
			                
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(110);
				match(T__6);
				setState(111);
				match(OPENBRACKETS);

				                      currentThread = new ArrayList<AbstractCommand>();
				                      allCommands.push(currentThread);
				                  
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(113);
					command();
					}
					}
					setState(116); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << IDENTIFIER))) != 0) );
				setState(118);
				match(CLOSEBRACKETS);

				                      elseList = allCommands.pop();
				                      CommandIf command = new CommandIf(_expressionCondition, ifList, elseList);
				                      allCommands.peek().add(command);
				                  
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandwhileContext extends ParserRuleContext {
		public TerminalNode OPENPARENTHESIS() { return getToken(IsiLangParser.OPENPARENTHESIS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(IsiLangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(IsiLangParser.IDENTIFIER, i);
		}
		public TerminalNode RELATIONALOPERATOR() { return getToken(IsiLangParser.RELATIONALOPERATOR, 0); }
		public TerminalNode CLOSEPARENTHESIS() { return getToken(IsiLangParser.CLOSEPARENTHESIS, 0); }
		public TerminalNode OPENBRACKETS() { return getToken(IsiLangParser.OPENBRACKETS, 0); }
		public TerminalNode CLOSEBRACKETS() { return getToken(IsiLangParser.CLOSEBRACKETS, 0); }
		public TerminalNode NUMBER() { return getToken(IsiLangParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(IsiLangParser.TEXT, 0); }
		public TerminalNode BOOLEAN() { return getToken(IsiLangParser.BOOLEAN, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public CommandwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCommandwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCommandwhile(this);
		}
	}

	public final CommandwhileContext commandwhile() throws RecognitionException {
		CommandwhileContext _localctx = new CommandwhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_commandwhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__7);
			setState(124);
			match(OPENPARENTHESIS);
			setState(125);
			match(IDENTIFIER);
			setState(126);
			match(RELATIONALOPERATOR);
			setState(127);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << IDENTIFIER) | (1L << NUMBER) | (1L << TEXT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(128);
			match(CLOSEPARENTHESIS);
			setState(129);
			match(OPENBRACKETS);
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				command();
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << IDENTIFIER))) != 0) );
			setState(135);
			match(CLOSEBRACKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> OPERATOR() { return getTokens(IsiLangParser.OPERATOR); }
		public TerminalNode OPERATOR(int i) {
			return getToken(IsiLangParser.OPERATOR, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			term();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATOR) {
				{
				{
				setState(138);
				match(OPERATOR);

				                      _expressionContent += _input.LT(-1).getText();
				                 
				setState(140);
				term();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(IsiLangParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(IsiLangParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(IsiLangParser.TEXT, 0); }
		public TerminalNode BOOLEAN() { return getToken(IsiLangParser.BOOLEAN, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(IDENTIFIER);
				 verifyID(_input.LT(-1).getText());
				                  _type = ((IsiVariable) symbolTable.get(_input.LT(-1).getText())).getType();
				                  _expressionContent += _input.LT(-1).getText();
				                
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(NUMBER);

				        _type = IsiVariable.NUMBER;
				        _expressionContent += _input.LT(-1).getText();
				    
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(150);
				match(TEXT);

				        _type = IsiVariable.TEXT;
				        _expressionContent += _input.LT(-1).getText();
				    
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(152);
				match(BOOLEAN);

				        _type = IsiVariable.BOOLEAN;
				        _expressionContent += _input.LT(-1).getText();
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(T__8);
				_type = IsiVariable.TEXT;
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(T__9);
				_type = IsiVariable.NUMBER;
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(T__10);
				_type = IsiVariable.BOOLEAN;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001a\u00a5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0004\u0001\"\b\u0001\u000b\u0001\f\u0001"+
		"#\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002-\b\u0002\n\u0002\f\u00020\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0004\u00036\b\u0003\u000b\u0003"+
		"\f\u00037\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004?\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bc\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0004\bi\b\b\u000b\b\f\bj\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0004\bs\b\b\u000b\b\f\bt\u0001\b\u0001\b\u0001\b\u0003\bz"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004"+
		"\t\u0084\b\t\u000b\t\f\t\u0085\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0005\n\u008e\b\n\n\n\f\n\u0091\t\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u009b\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00a3\b\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u0000\u0001\u0001\u0000\u0014\u0017\u00a9"+
		"\u0000\u001a\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000\u0000\u0004"+
		"%\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000\u0000\b>\u0001\u0000"+
		"\u0000\u0000\n@\u0001\u0000\u0000\u0000\fH\u0001\u0000\u0000\u0000\u000e"+
		"P\u0001\u0000\u0000\u0000\u0010X\u0001\u0000\u0000\u0000\u0012{\u0001"+
		"\u0000\u0000\u0000\u0014\u0089\u0001\u0000\u0000\u0000\u0016\u009a\u0001"+
		"\u0000\u0000\u0000\u0018\u00a2\u0001\u0000\u0000\u0000\u001a\u001b\u0005"+
		"\u0001\u0000\u0000\u001b\u001c\u0003\u0002\u0001\u0000\u001c\u001d\u0003"+
		"\u0006\u0003\u0000\u001d\u001e\u0005\u0002\u0000\u0000\u001e\u001f\u0006"+
		"\u0000\uffff\uffff\u0000\u001f\u0001\u0001\u0000\u0000\u0000 \"\u0003"+
		"\u0004\u0002\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000"+
		"#!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\u0003\u0001\u0000"+
		"\u0000\u0000%&\u0005\u0003\u0000\u0000&\'\u0003\u0018\f\u0000\'(\u0005"+
		"\u0015\u0000\u0000(.\u0006\u0002\uffff\uffff\u0000)*\u0005\u0018\u0000"+
		"\u0000*+\u0005\u0015\u0000\u0000+-\u0006\u0002\uffff\uffff\u0000,)\u0001"+
		"\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000"+
		"./\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000\u00000.\u0001\u0000\u0000"+
		"\u000012\u0005\u0010\u0000\u00002\u0005\u0001\u0000\u0000\u000035\u0006"+
		"\u0003\uffff\uffff\u000046\u0003\b\u0004\u000054\u0001\u0000\u0000\u0000"+
		"67\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000"+
		"\u00008\u0007\u0001\u0000\u0000\u00009?\u0003\n\u0005\u0000:?\u0003\f"+
		"\u0006\u0000;?\u0003\u000e\u0007\u0000<?\u0003\u0010\b\u0000=?\u0003\u0012"+
		"\t\u0000>9\u0001\u0000\u0000\u0000>:\u0001\u0000\u0000\u0000>;\u0001\u0000"+
		"\u0000\u0000><\u0001\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000?\t\u0001"+
		"\u0000\u0000\u0000@A\u0005\u0004\u0000\u0000AB\u0005\f\u0000\u0000BC\u0005"+
		"\u0015\u0000\u0000CD\u0006\u0005\uffff\uffff\u0000DE\u0005\r\u0000\u0000"+
		"EF\u0005\u0010\u0000\u0000FG\u0006\u0005\uffff\uffff\u0000G\u000b\u0001"+
		"\u0000\u0000\u0000HI\u0005\u0005\u0000\u0000IJ\u0005\f\u0000\u0000JK\u0005"+
		"\u0015\u0000\u0000KL\u0006\u0006\uffff\uffff\u0000LM\u0005\r\u0000\u0000"+
		"MN\u0005\u0010\u0000\u0000NO\u0006\u0006\uffff\uffff\u0000O\r\u0001\u0000"+
		"\u0000\u0000PQ\u0005\u0015\u0000\u0000QR\u0006\u0007\uffff\uffff\u0000"+
		"RS\u0005\u0012\u0000\u0000ST\u0006\u0007\uffff\uffff\u0000TU\u0003\u0014"+
		"\n\u0000UV\u0005\u0010\u0000\u0000VW\u0006\u0007\uffff\uffff\u0000W\u000f"+
		"\u0001\u0000\u0000\u0000XY\u0005\u0006\u0000\u0000Yb\u0005\f\u0000\u0000"+
		"Z[\u0007\u0000\u0000\u0000[\\\u0006\b\uffff\uffff\u0000\\]\u0005\u0013"+
		"\u0000\u0000]^\u0006\b\uffff\uffff\u0000^_\u0007\u0000\u0000\u0000_c\u0006"+
		"\b\uffff\uffff\u0000`a\u0005\u0014\u0000\u0000ac\u0006\b\uffff\uffff\u0000"+
		"bZ\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000de\u0005\r\u0000\u0000ef\u0005\u000e\u0000\u0000fh\u0006\b\uffff"+
		"\uffff\u0000gi\u0003\b\u0004\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000lm\u0005\u000f\u0000\u0000my\u0006\b\uffff\uffff\u0000"+
		"no\u0005\u0007\u0000\u0000op\u0005\u000e\u0000\u0000pr\u0006\b\uffff\uffff"+
		"\u0000qs\u0003\b\u0004\u0000rq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000vw\u0005\u000f\u0000\u0000wx\u0006\b\uffff\uffff\u0000xz\u0001"+
		"\u0000\u0000\u0000yn\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z\u0011\u0001\u0000\u0000\u0000{|\u0005\b\u0000\u0000|}\u0005\f\u0000"+
		"\u0000}~\u0005\u0015\u0000\u0000~\u007f\u0005\u0013\u0000\u0000\u007f"+
		"\u0080\u0007\u0000\u0000\u0000\u0080\u0081\u0005\r\u0000\u0000\u0081\u0083"+
		"\u0005\u000e\u0000\u0000\u0082\u0084\u0003\b\u0004\u0000\u0083\u0082\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0087\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0005\u000f\u0000\u0000\u0088\u0013\u0001"+
		"\u0000\u0000\u0000\u0089\u008f\u0003\u0016\u000b\u0000\u008a\u008b\u0005"+
		"\u0011\u0000\u0000\u008b\u008c\u0006\n\uffff\uffff\u0000\u008c\u008e\u0003"+
		"\u0016\u000b\u0000\u008d\u008a\u0001\u0000\u0000\u0000\u008e\u0091\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u0015\u0001\u0000\u0000\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0005\u0015\u0000\u0000\u0093\u009b\u0006"+
		"\u000b\uffff\uffff\u0000\u0094\u0095\u0005\u0016\u0000\u0000\u0095\u009b"+
		"\u0006\u000b\uffff\uffff\u0000\u0096\u0097\u0005\u0017\u0000\u0000\u0097"+
		"\u009b\u0006\u000b\uffff\uffff\u0000\u0098\u0099\u0005\u0014\u0000\u0000"+
		"\u0099\u009b\u0006\u000b\uffff\uffff\u0000\u009a\u0092\u0001\u0000\u0000"+
		"\u0000\u009a\u0094\u0001\u0000\u0000\u0000\u009a\u0096\u0001\u0000\u0000"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u0017\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005\t\u0000\u0000\u009d\u00a3\u0006\f\uffff\uffff"+
		"\u0000\u009e\u009f\u0005\n\u0000\u0000\u009f\u00a3\u0006\f\uffff\uffff"+
		"\u0000\u00a0\u00a1\u0005\u000b\u0000\u0000\u00a1\u00a3\u0006\f\uffff\uffff"+
		"\u0000\u00a2\u009c\u0001\u0000\u0000\u0000\u00a2\u009e\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a3\u0019\u0001\u0000\u0000"+
		"\u0000\f#.7>bjty\u0085\u008f\u009a\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}