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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, OPENPARENTHESIS=8, 
		CLOSEPARENTHESIS=9, SEMICOLON=10, OPERATOR=11, ATTRIBUTION=12, IDENTIFIER=13, 
		NUMBER=14, COMMA=15, WHITESPACE=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "OPENPARENTHESIS", 
			"CLOSEPARENTHESIS", "SEMICOLON", "OPERATOR", "ATTRIBUTION", "IDENTIFIER", 
			"NUMBER", "COMMA", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog;'", "'declara'", "'leia'", "'escreva'", 
			"'texto'", "'numero'", "'('", "')'", "';'", null, "'='", null, null, 
			"','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "OPENPARENTHESIS", "CLOSEPARENTHESIS", 
			"SEMICOLON", "OPERATOR", "ATTRIBUTION", "IDENTIFIER", "NUMBER", "COMMA", 
			"WHITESPACE"
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
		"\u0004\u0000\u0010y\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0005\fb\b\f\n\f\f\fe\t\f\u0001\r\u0004"+
		"\rh\b\r\u000b\r\f\ri\u0001\r\u0001\r\u0004\rn\b\r\u000b\r\f\ro\u0003\r"+
		"r\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0000\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010\u0001\u0000\u0005\u0003"+
		"\u0000*+--//\u0001\u0000az\u0003\u000009AZaz\u0001\u000009\u0003\u0000"+
		"\t\n\r\r  |\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0001!\u0001\u0000\u0000\u0000\u0003*\u0001\u0000\u0000\u0000\u00053"+
		"\u0001\u0000\u0000\u0000\u0007;\u0001\u0000\u0000\u0000\t@\u0001\u0000"+
		"\u0000\u0000\u000bH\u0001\u0000\u0000\u0000\rN\u0001\u0000\u0000\u0000"+
		"\u000fU\u0001\u0000\u0000\u0000\u0011W\u0001\u0000\u0000\u0000\u0013Y"+
		"\u0001\u0000\u0000\u0000\u0015[\u0001\u0000\u0000\u0000\u0017]\u0001\u0000"+
		"\u0000\u0000\u0019_\u0001\u0000\u0000\u0000\u001bg\u0001\u0000\u0000\u0000"+
		"\u001ds\u0001\u0000\u0000\u0000\u001fu\u0001\u0000\u0000\u0000!\"\u0005"+
		"p\u0000\u0000\"#\u0005r\u0000\u0000#$\u0005o\u0000\u0000$%\u0005g\u0000"+
		"\u0000%&\u0005r\u0000\u0000&\'\u0005a\u0000\u0000\'(\u0005m\u0000\u0000"+
		"()\u0005a\u0000\u0000)\u0002\u0001\u0000\u0000\u0000*+\u0005f\u0000\u0000"+
		"+,\u0005i\u0000\u0000,-\u0005m\u0000\u0000-.\u0005p\u0000\u0000./\u0005"+
		"r\u0000\u0000/0\u0005o\u0000\u000001\u0005g\u0000\u000012\u0005;\u0000"+
		"\u00002\u0004\u0001\u0000\u0000\u000034\u0005d\u0000\u000045\u0005e\u0000"+
		"\u000056\u0005c\u0000\u000067\u0005l\u0000\u000078\u0005a\u0000\u0000"+
		"89\u0005r\u0000\u00009:\u0005a\u0000\u0000:\u0006\u0001\u0000\u0000\u0000"+
		";<\u0005l\u0000\u0000<=\u0005e\u0000\u0000=>\u0005i\u0000\u0000>?\u0005"+
		"a\u0000\u0000?\b\u0001\u0000\u0000\u0000@A\u0005e\u0000\u0000AB\u0005"+
		"s\u0000\u0000BC\u0005c\u0000\u0000CD\u0005r\u0000\u0000DE\u0005e\u0000"+
		"\u0000EF\u0005v\u0000\u0000FG\u0005a\u0000\u0000G\n\u0001\u0000\u0000"+
		"\u0000HI\u0005t\u0000\u0000IJ\u0005e\u0000\u0000JK\u0005x\u0000\u0000"+
		"KL\u0005t\u0000\u0000LM\u0005o\u0000\u0000M\f\u0001\u0000\u0000\u0000"+
		"NO\u0005n\u0000\u0000OP\u0005u\u0000\u0000PQ\u0005m\u0000\u0000QR\u0005"+
		"e\u0000\u0000RS\u0005r\u0000\u0000ST\u0005o\u0000\u0000T\u000e\u0001\u0000"+
		"\u0000\u0000UV\u0005(\u0000\u0000V\u0010\u0001\u0000\u0000\u0000WX\u0005"+
		")\u0000\u0000X\u0012\u0001\u0000\u0000\u0000YZ\u0005;\u0000\u0000Z\u0014"+
		"\u0001\u0000\u0000\u0000[\\\u0007\u0000\u0000\u0000\\\u0016\u0001\u0000"+
		"\u0000\u0000]^\u0005=\u0000\u0000^\u0018\u0001\u0000\u0000\u0000_c\u0007"+
		"\u0001\u0000\u0000`b\u0007\u0002\u0000\u0000a`\u0001\u0000\u0000\u0000"+
		"be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000d\u001a\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fh\u0007"+
		"\u0003\u0000\u0000gf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jq\u0001\u0000\u0000"+
		"\u0000km\u0005.\u0000\u0000ln\u0007\u0003\u0000\u0000ml\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000pr\u0001\u0000\u0000\u0000qk\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000r\u001c\u0001\u0000\u0000\u0000st\u0005,\u0000\u0000"+
		"t\u001e\u0001\u0000\u0000\u0000uv\u0007\u0004\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000wx\u0006\u000f\u0000\u0000x \u0001\u0000\u0000\u0000\u0006"+
		"\u0000acioq\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}