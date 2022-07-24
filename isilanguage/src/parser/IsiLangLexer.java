// Generated from IsiLang.g4 by ANTLR 4.10.1
package isilanguage.src.parser;
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
		T__0=1, T__1=2, T__2=3, T__3=4, OPENPARENTHESIS=5, CLOSEPARENTHESIS=6, 
		SEMICOLON=7, OPERATOR=8, ATTRIBUTION=9, IDENTIFIER=10, NUMBER=11, WHITESPACE=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "OPENPARENTHESIS", "CLOSEPARENTHESIS", 
			"SEMICOLON", "OPERATOR", "ATTRIBUTION", "IDENTIFIER", "NUMBER", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog;'", "'leia'", "'escreva'", "'('", "')'", 
			"';'", null, "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "OPENPARENTHESIS", "CLOSEPARENTHESIS", 
			"SEMICOLON", "OPERATOR", "ATTRIBUTION", "IDENTIFIER", "NUMBER", "WHITESPACE"
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
		"\u0004\u0000\fZ\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0005\tE\b\t\n\t\f\tH\t\t\u0001\n\u0004\nK\b\n\u000b\n\f\n"+
		"L\u0001\n\u0001\n\u0004\nQ\b\n\u000b\n\f\nR\u0003\nU\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0001\u0000\u0005\u0003\u0000*+--//\u0001\u0000a"+
		"z\u0003\u000009AZaz\u0001\u000009\u0003\u0000\t\n\r\r  ]\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001\u0019\u0001\u0000\u0000"+
		"\u0000\u0003\"\u0001\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000"+
		"\u00070\u0001\u0000\u0000\u0000\t8\u0001\u0000\u0000\u0000\u000b:\u0001"+
		"\u0000\u0000\u0000\r<\u0001\u0000\u0000\u0000\u000f>\u0001\u0000\u0000"+
		"\u0000\u0011@\u0001\u0000\u0000\u0000\u0013B\u0001\u0000\u0000\u0000\u0015"+
		"J\u0001\u0000\u0000\u0000\u0017V\u0001\u0000\u0000\u0000\u0019\u001a\u0005"+
		"p\u0000\u0000\u001a\u001b\u0005r\u0000\u0000\u001b\u001c\u0005o\u0000"+
		"\u0000\u001c\u001d\u0005g\u0000\u0000\u001d\u001e\u0005r\u0000\u0000\u001e"+
		"\u001f\u0005a\u0000\u0000\u001f \u0005m\u0000\u0000 !\u0005a\u0000\u0000"+
		"!\u0002\u0001\u0000\u0000\u0000\"#\u0005f\u0000\u0000#$\u0005i\u0000\u0000"+
		"$%\u0005m\u0000\u0000%&\u0005p\u0000\u0000&\'\u0005r\u0000\u0000\'(\u0005"+
		"o\u0000\u0000()\u0005g\u0000\u0000)*\u0005;\u0000\u0000*\u0004\u0001\u0000"+
		"\u0000\u0000+,\u0005l\u0000\u0000,-\u0005e\u0000\u0000-.\u0005i\u0000"+
		"\u0000./\u0005a\u0000\u0000/\u0006\u0001\u0000\u0000\u000001\u0005e\u0000"+
		"\u000012\u0005s\u0000\u000023\u0005c\u0000\u000034\u0005r\u0000\u0000"+
		"45\u0005e\u0000\u000056\u0005v\u0000\u000067\u0005a\u0000\u00007\b\u0001"+
		"\u0000\u0000\u000089\u0005(\u0000\u00009\n\u0001\u0000\u0000\u0000:;\u0005"+
		")\u0000\u0000;\f\u0001\u0000\u0000\u0000<=\u0005;\u0000\u0000=\u000e\u0001"+
		"\u0000\u0000\u0000>?\u0007\u0000\u0000\u0000?\u0010\u0001\u0000\u0000"+
		"\u0000@A\u0005=\u0000\u0000A\u0012\u0001\u0000\u0000\u0000BF\u0007\u0001"+
		"\u0000\u0000CE\u0007\u0002\u0000\u0000DC\u0001\u0000\u0000\u0000EH\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"G\u0014\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000IK\u0007\u0003"+
		"\u0000\u0000JI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LJ\u0001"+
		"\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MT\u0001\u0000\u0000\u0000"+
		"NP\u0005.\u0000\u0000OQ\u0007\u0003\u0000\u0000PO\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000"+
		"\u0000SU\u0001\u0000\u0000\u0000TN\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000U\u0016\u0001\u0000\u0000\u0000VW\u0007\u0004\u0000\u0000"+
		"WX\u0001\u0000\u0000\u0000XY\u0006\u000b\u0000\u0000Y\u0018\u0001\u0000"+
		"\u0000\u0000\u0006\u0000DFLRT\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}