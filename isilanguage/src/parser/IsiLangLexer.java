// Generated from IsiLang.g4 by ANTLR 4.10.1
package isilanguage.src.parser;

    import isilanguage.src.datastructures.IsiSymbol;
    import isilanguage.src.datastructures.IsiVariable;
    import isilanguage.src.datastructures.IsiSymbolTable;
    import isilanguage.src.exceptions.IsiSemanticException;
    import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		OPENPARENTHESIS=10, CLOSEPARENTHESIS=11, OPENBRACKETS=12, CLOSEBRACKETS=13, 
		SEMICOLON=14, OPERATOR=15, ATTRIBUTION=16, RELATIONALOPERATOR=17, IDENTIFIER=18, 
		NUMBER=19, TEXT=20, COMMA=21, DOUBLEQUOTE=22, WHITESPACE=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"OPENPARENTHESIS", "CLOSEPARENTHESIS", "OPENBRACKETS", "CLOSEBRACKETS", 
			"SEMICOLON", "OPERATOR", "ATTRIBUTION", "RELATIONALOPERATOR", "IDENTIFIER", 
			"NUMBER", "TEXT", "COMMA", "DOUBLEQUOTE", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog;'", "'declara'", "'leia'", "'escreva'", 
			"'se'", "'senao'", "'texto'", "'numero'", "'('", "')'", "'{'", "'}'", 
			"';'", null, "'='", null, null, null, null, "','", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "OPENPARENTHESIS", 
			"CLOSEPARENTHESIS", "OPENBRACKETS", "CLOSEBRACKETS", "SEMICOLON", "OPERATOR", 
			"ATTRIBUTION", "RELATIONALOPERATOR", "IDENTIFIER", "NUMBER", "TEXT", 
			"COMMA", "DOUBLEQUOTE", "WHITESPACE"
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


	public IsiLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IsiLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0017\u00a9\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0084\b\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u0088\b\u0011\n\u0011"+
		"\f\u0011\u008b\t\u0011\u0001\u0012\u0004\u0012\u008e\b\u0012\u000b\u0012"+
		"\f\u0012\u008f\u0001\u0012\u0001\u0012\u0004\u0012\u0094\b\u0012\u000b"+
		"\u0012\f\u0012\u0095\u0003\u0012\u0098\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0004\u0013\u009c\b\u0013\u000b\u0013\f\u0013\u009d\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017\u0001\u0000\u0007\u0003\u0000"+
		"*+--//\u0002\u0000<<>>\u0001\u0000az\u0003\u000009AZaz\u0001\u000009\u0002"+
		"\u0000AZaz\u0003\u0000\t\n\r\r  \u00b1\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"-\u0001\u0000\u0000\u0000\u0001/\u0001\u0000\u0000\u0000\u00038\u0001"+
		"\u0000\u0000\u0000\u0005A\u0001\u0000\u0000\u0000\u0007I\u0001\u0000\u0000"+
		"\u0000\tN\u0001\u0000\u0000\u0000\u000bV\u0001\u0000\u0000\u0000\rY\u0001"+
		"\u0000\u0000\u0000\u000f_\u0001\u0000\u0000\u0000\u0011e\u0001\u0000\u0000"+
		"\u0000\u0013l\u0001\u0000\u0000\u0000\u0015n\u0001\u0000\u0000\u0000\u0017"+
		"p\u0001\u0000\u0000\u0000\u0019r\u0001\u0000\u0000\u0000\u001bt\u0001"+
		"\u0000\u0000\u0000\u001dv\u0001\u0000\u0000\u0000\u001fx\u0001\u0000\u0000"+
		"\u0000!\u0083\u0001\u0000\u0000\u0000#\u0085\u0001\u0000\u0000\u0000%"+
		"\u008d\u0001\u0000\u0000\u0000\'\u0099\u0001\u0000\u0000\u0000)\u00a1"+
		"\u0001\u0000\u0000\u0000+\u00a3\u0001\u0000\u0000\u0000-\u00a5\u0001\u0000"+
		"\u0000\u0000/0\u0005p\u0000\u000001\u0005r\u0000\u000012\u0005o\u0000"+
		"\u000023\u0005g\u0000\u000034\u0005r\u0000\u000045\u0005a\u0000\u0000"+
		"56\u0005m\u0000\u000067\u0005a\u0000\u00007\u0002\u0001\u0000\u0000\u0000"+
		"89\u0005f\u0000\u00009:\u0005i\u0000\u0000:;\u0005m\u0000\u0000;<\u0005"+
		"p\u0000\u0000<=\u0005r\u0000\u0000=>\u0005o\u0000\u0000>?\u0005g\u0000"+
		"\u0000?@\u0005;\u0000\u0000@\u0004\u0001\u0000\u0000\u0000AB\u0005d\u0000"+
		"\u0000BC\u0005e\u0000\u0000CD\u0005c\u0000\u0000DE\u0005l\u0000\u0000"+
		"EF\u0005a\u0000\u0000FG\u0005r\u0000\u0000GH\u0005a\u0000\u0000H\u0006"+
		"\u0001\u0000\u0000\u0000IJ\u0005l\u0000\u0000JK\u0005e\u0000\u0000KL\u0005"+
		"i\u0000\u0000LM\u0005a\u0000\u0000M\b\u0001\u0000\u0000\u0000NO\u0005"+
		"e\u0000\u0000OP\u0005s\u0000\u0000PQ\u0005c\u0000\u0000QR\u0005r\u0000"+
		"\u0000RS\u0005e\u0000\u0000ST\u0005v\u0000\u0000TU\u0005a\u0000\u0000"+
		"U\n\u0001\u0000\u0000\u0000VW\u0005s\u0000\u0000WX\u0005e\u0000\u0000"+
		"X\f\u0001\u0000\u0000\u0000YZ\u0005s\u0000\u0000Z[\u0005e\u0000\u0000"+
		"[\\\u0005n\u0000\u0000\\]\u0005a\u0000\u0000]^\u0005o\u0000\u0000^\u000e"+
		"\u0001\u0000\u0000\u0000_`\u0005t\u0000\u0000`a\u0005e\u0000\u0000ab\u0005"+
		"x\u0000\u0000bc\u0005t\u0000\u0000cd\u0005o\u0000\u0000d\u0010\u0001\u0000"+
		"\u0000\u0000ef\u0005n\u0000\u0000fg\u0005u\u0000\u0000gh\u0005m\u0000"+
		"\u0000hi\u0005e\u0000\u0000ij\u0005r\u0000\u0000jk\u0005o\u0000\u0000"+
		"k\u0012\u0001\u0000\u0000\u0000lm\u0005(\u0000\u0000m\u0014\u0001\u0000"+
		"\u0000\u0000no\u0005)\u0000\u0000o\u0016\u0001\u0000\u0000\u0000pq\u0005"+
		"{\u0000\u0000q\u0018\u0001\u0000\u0000\u0000rs\u0005}\u0000\u0000s\u001a"+
		"\u0001\u0000\u0000\u0000tu\u0005;\u0000\u0000u\u001c\u0001\u0000\u0000"+
		"\u0000vw\u0007\u0000\u0000\u0000w\u001e\u0001\u0000\u0000\u0000xy\u0005"+
		"=\u0000\u0000y \u0001\u0000\u0000\u0000z\u0084\u0007\u0001\u0000\u0000"+
		"{|\u0005>\u0000\u0000|\u0084\u0005=\u0000\u0000}~\u0005<\u0000\u0000~"+
		"\u0084\u0005=\u0000\u0000\u007f\u0080\u0005=\u0000\u0000\u0080\u0084\u0005"+
		"=\u0000\u0000\u0081\u0082\u0005!\u0000\u0000\u0082\u0084\u0005=\u0000"+
		"\u0000\u0083z\u0001\u0000\u0000\u0000\u0083{\u0001\u0000\u0000\u0000\u0083"+
		"}\u0001\u0000\u0000\u0000\u0083\u007f\u0001\u0000\u0000\u0000\u0083\u0081"+
		"\u0001\u0000\u0000\u0000\u0084\"\u0001\u0000\u0000\u0000\u0085\u0089\u0007"+
		"\u0002\u0000\u0000\u0086\u0088\u0007\u0003\u0000\u0000\u0087\u0086\u0001"+
		"\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089\u0087\u0001"+
		"\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a$\u0001\u0000"+
		"\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c\u008e\u0007\u0004"+
		"\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u0097\u0001\u0000\u0000\u0000\u0091\u0093\u0005.\u0000"+
		"\u0000\u0092\u0094\u0007\u0004\u0000\u0000\u0093\u0092\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000"+
		"\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000"+
		"\u0000\u0097\u0091\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000"+
		"\u0000\u0098&\u0001\u0000\u0000\u0000\u0099\u009b\u0003+\u0015\u0000\u009a"+
		"\u009c\u0007\u0005\u0000\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0003+\u0015\u0000\u00a0(\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005"+
		",\u0000\u0000\u00a2*\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005\"\u0000"+
		"\u0000\u00a4,\u0001\u0000\u0000\u0000\u00a5\u00a6\u0007\u0006\u0000\u0000"+
		"\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8\u0006\u0016\u0000\u0000"+
		"\u00a8.\u0001\u0000\u0000\u0000\b\u0000\u0083\u0087\u0089\u008f\u0095"+
		"\u0097\u009d\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}