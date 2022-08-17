// Generated from IsiLang.g4 by ANTLR 4.10.1
package isilanguage.src.parser;

    import isilanguage.src.datastructures.IsiSymbol;
    import isilanguage.src.datastructures.IsiVariable;
    import isilanguage.src.datastructures.IsiSymbolTable;
    import isilanguage.src.exceptions.IsiSemanticException;
    import java.util.ArrayList;
    import java.util.List;

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
		IDENTIFIER=20, NUMBER=21, TEXT=22, BOOLEAN=23, COMMA=24, DOUBLEQUOTE=25, 
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
			"SEMICOLON", "OPERATOR", "ATTRIBUTION", "RELATIONALOPERATOR", "IDENTIFIER", 
			"NUMBER", "TEXT", "BOOLEAN", "COMMA", "DOUBLEQUOTE", "WHITESPACE"
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
			setState(52); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(51);
				command();
				}
				}
				setState(54); 
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
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				commandread();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				commandwrite();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				commandattrib();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				commandif();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
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
			setState(63);
			match(T__3);
			setState(64);
			match(OPENPARENTHESIS);
			setState(65);
			match(IDENTIFIER);
			 verifyID(_input.LT(-1).getText()); 
			setState(67);
			match(CLOSEPARENTHESIS);
			setState(68);
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
			setState(70);
			match(T__4);
			setState(71);
			match(OPENPARENTHESIS);
			setState(72);
			match(IDENTIFIER);
			 verifyID(_input.LT(-1).getText()); 
			setState(74);
			match(CLOSEPARENTHESIS);
			setState(75);
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
			setState(77);
			match(IDENTIFIER);

			                            _varName = _input.LT(-1).getText();
			                            verifyID(_varName );
			                           _unusedVariables.remove(_varName );
			                         
			setState(79);
			match(ATTRIBUTION);
			setState(80);
			expression();
			setState(81);
			match(SEMICOLON);

			               verifyType(_varName, _type);
			               
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(IsiLangParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(IsiLangParser.IDENTIFIER, i);
		}
		public TerminalNode RELATIONALOPERATOR() { return getToken(IsiLangParser.RELATIONALOPERATOR, 0); }
		public TerminalNode CLOSEPARENTHESIS() { return getToken(IsiLangParser.CLOSEPARENTHESIS, 0); }
		public List<TerminalNode> OPENBRACKETS() { return getTokens(IsiLangParser.OPENBRACKETS); }
		public TerminalNode OPENBRACKETS(int i) {
			return getToken(IsiLangParser.OPENBRACKETS, i);
		}
		public List<TerminalNode> CLOSEBRACKETS() { return getTokens(IsiLangParser.CLOSEBRACKETS); }
		public TerminalNode CLOSEBRACKETS(int i) {
			return getToken(IsiLangParser.CLOSEBRACKETS, i);
		}
		public TerminalNode NUMBER() { return getToken(IsiLangParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(IsiLangParser.TEXT, 0); }
		public TerminalNode BOOLEAN() { return getToken(IsiLangParser.BOOLEAN, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
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
			setState(84);
			match(T__5);
			setState(85);
			match(OPENPARENTHESIS);
			setState(86);
			match(IDENTIFIER);
			setState(87);
			match(RELATIONALOPERATOR);
			setState(88);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << NUMBER) | (1L << TEXT) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(89);
			match(CLOSEPARENTHESIS);
			setState(90);
			match(OPENBRACKETS);
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				command();
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << IDENTIFIER))) != 0) );
			setState(96);
			match(CLOSEBRACKETS);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(97);
				match(T__6);
				setState(98);
				match(OPENBRACKETS);
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(99);
					command();
					}
					}
					setState(102); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << IDENTIFIER))) != 0) );
				setState(104);
				match(CLOSEBRACKETS);
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
			setState(108);
			match(T__7);
			setState(109);
			match(OPENPARENTHESIS);
			setState(110);
			match(IDENTIFIER);
			setState(111);
			match(RELATIONALOPERATOR);
			setState(112);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENTIFIER) | (1L << NUMBER) | (1L << TEXT) | (1L << BOOLEAN))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(113);
			match(CLOSEPARENTHESIS);
			setState(114);
			match(OPENBRACKETS);
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				command();
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__7) | (1L << IDENTIFIER))) != 0) );
			setState(120);
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
			setState(122);
			term();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPERATOR) {
				{
				{
				setState(123);
				match(OPERATOR);
				setState(124);
				term();
				}
				}
				setState(129);
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
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(IDENTIFIER);
				 verifyID(_input.LT(-1).getText());
				                  _type = ((IsiVariable) symbolTable.get(_input.LT(-1).getText())).getType();
				                
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(NUMBER);
				_type = IsiVariable.NUMBER;
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(TEXT);
				_type = IsiVariable.TEXT;
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				match(BOOLEAN);
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
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(T__8);
				_type = IsiVariable.TEXT;
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(T__9);
				_type = IsiVariable.NUMBER;
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
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
		"\u0004\u0001\u001a\u0095\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0004\u0001\"\b\u0001\u000b\u0001\f\u0001"+
		"#\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002-\b\u0002\n\u0002\f\u00020\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0004\u00035\b\u0003\u000b\u0003\f\u00036\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004>\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b]\b\b\u000b\b\f\b^\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0004\be\b\b\u000b\b\f\bf\u0001\b\u0001\b\u0003\bk"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004"+
		"\tu\b\t\u000b\t\f\tv\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0005\n~"+
		"\b\n\n\n\f\n\u0081\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u008b\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0093\b\f\u0001"+
		"\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u0000\u0001\u0001\u0000\u0014\u0017\u0098\u0000\u001a\u0001"+
		"\u0000\u0000\u0000\u0002!\u0001\u0000\u0000\u0000\u0004%\u0001\u0000\u0000"+
		"\u0000\u00064\u0001\u0000\u0000\u0000\b=\u0001\u0000\u0000\u0000\n?\u0001"+
		"\u0000\u0000\u0000\fF\u0001\u0000\u0000\u0000\u000eM\u0001\u0000\u0000"+
		"\u0000\u0010T\u0001\u0000\u0000\u0000\u0012l\u0001\u0000\u0000\u0000\u0014"+
		"z\u0001\u0000\u0000\u0000\u0016\u008a\u0001\u0000\u0000\u0000\u0018\u0092"+
		"\u0001\u0000\u0000\u0000\u001a\u001b\u0005\u0001\u0000\u0000\u001b\u001c"+
		"\u0003\u0002\u0001\u0000\u001c\u001d\u0003\u0006\u0003\u0000\u001d\u001e"+
		"\u0005\u0002\u0000\u0000\u001e\u001f\u0006\u0000\uffff\uffff\u0000\u001f"+
		"\u0001\u0001\u0000\u0000\u0000 \"\u0003\u0004\u0002\u0000! \u0001\u0000"+
		"\u0000\u0000\"#\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000\u0000#$\u0001"+
		"\u0000\u0000\u0000$\u0003\u0001\u0000\u0000\u0000%&\u0005\u0003\u0000"+
		"\u0000&\'\u0003\u0018\f\u0000\'(\u0005\u0014\u0000\u0000(.\u0006\u0002"+
		"\uffff\uffff\u0000)*\u0005\u0018\u0000\u0000*+\u0005\u0014\u0000\u0000"+
		"+-\u0006\u0002\uffff\uffff\u0000,)\u0001\u0000\u0000\u0000-0\u0001\u0000"+
		"\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0001"+
		"\u0000\u0000\u00000.\u0001\u0000\u0000\u000012\u0005\u0010\u0000\u0000"+
		"2\u0005\u0001\u0000\u0000\u000035\u0003\b\u0004\u000043\u0001\u0000\u0000"+
		"\u000056\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000"+
		"\u0000\u00007\u0007\u0001\u0000\u0000\u00008>\u0003\n\u0005\u00009>\u0003"+
		"\f\u0006\u0000:>\u0003\u000e\u0007\u0000;>\u0003\u0010\b\u0000<>\u0003"+
		"\u0012\t\u0000=8\u0001\u0000\u0000\u0000=9\u0001\u0000\u0000\u0000=:\u0001"+
		"\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=<\u0001\u0000\u0000\u0000"+
		">\t\u0001\u0000\u0000\u0000?@\u0005\u0004\u0000\u0000@A\u0005\f\u0000"+
		"\u0000AB\u0005\u0014\u0000\u0000BC\u0006\u0005\uffff\uffff\u0000CD\u0005"+
		"\r\u0000\u0000DE\u0005\u0010\u0000\u0000E\u000b\u0001\u0000\u0000\u0000"+
		"FG\u0005\u0005\u0000\u0000GH\u0005\f\u0000\u0000HI\u0005\u0014\u0000\u0000"+
		"IJ\u0006\u0006\uffff\uffff\u0000JK\u0005\r\u0000\u0000KL\u0005\u0010\u0000"+
		"\u0000L\r\u0001\u0000\u0000\u0000MN\u0005\u0014\u0000\u0000NO\u0006\u0007"+
		"\uffff\uffff\u0000OP\u0005\u0012\u0000\u0000PQ\u0003\u0014\n\u0000QR\u0005"+
		"\u0010\u0000\u0000RS\u0006\u0007\uffff\uffff\u0000S\u000f\u0001\u0000"+
		"\u0000\u0000TU\u0005\u0006\u0000\u0000UV\u0005\f\u0000\u0000VW\u0005\u0014"+
		"\u0000\u0000WX\u0005\u0013\u0000\u0000XY\u0007\u0000\u0000\u0000YZ\u0005"+
		"\r\u0000\u0000Z\\\u0005\u000e\u0000\u0000[]\u0003\b\u0004\u0000\\[\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`j\u0005\u000f\u0000"+
		"\u0000ab\u0005\u0007\u0000\u0000bd\u0005\u000e\u0000\u0000ce\u0003\b\u0004"+
		"\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0005"+
		"\u000f\u0000\u0000ik\u0001\u0000\u0000\u0000ja\u0001\u0000\u0000\u0000"+
		"jk\u0001\u0000\u0000\u0000k\u0011\u0001\u0000\u0000\u0000lm\u0005\b\u0000"+
		"\u0000mn\u0005\f\u0000\u0000no\u0005\u0014\u0000\u0000op\u0005\u0013\u0000"+
		"\u0000pq\u0007\u0000\u0000\u0000qr\u0005\r\u0000\u0000rt\u0005\u000e\u0000"+
		"\u0000su\u0003\b\u0004\u0000ts\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xy\u0005\u000f\u0000\u0000y\u0013\u0001\u0000\u0000\u0000"+
		"z\u007f\u0003\u0016\u000b\u0000{|\u0005\u0011\u0000\u0000|~\u0003\u0016"+
		"\u000b\u0000}{\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000"+
		"\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080"+
		"\u0015\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0005\u0014\u0000\u0000\u0083\u008b\u0006\u000b\uffff\uffff\u0000"+
		"\u0084\u0085\u0005\u0015\u0000\u0000\u0085\u008b\u0006\u000b\uffff\uffff"+
		"\u0000\u0086\u0087\u0005\u0016\u0000\u0000\u0087\u008b\u0006\u000b\uffff"+
		"\uffff\u0000\u0088\u0089\u0005\u0017\u0000\u0000\u0089\u008b\u0006\u000b"+
		"\uffff\uffff\u0000\u008a\u0082\u0001\u0000\u0000\u0000\u008a\u0084\u0001"+
		"\u0000\u0000\u0000\u008a\u0086\u0001\u0000\u0000\u0000\u008a\u0088\u0001"+
		"\u0000\u0000\u0000\u008b\u0017\u0001\u0000\u0000\u0000\u008c\u008d\u0005"+
		"\t\u0000\u0000\u008d\u0093\u0006\f\uffff\uffff\u0000\u008e\u008f\u0005"+
		"\n\u0000\u0000\u008f\u0093\u0006\f\uffff\uffff\u0000\u0090\u0091\u0005"+
		"\u000b\u0000\u0000\u0091\u0093\u0006\f\uffff\uffff\u0000\u0092\u008c\u0001"+
		"\u0000\u0000\u0000\u0092\u008e\u0001\u0000\u0000\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0093\u0019\u0001\u0000\u0000\u0000\u000b#.6=^fjv\u007f"+
		"\u008a\u0092";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}