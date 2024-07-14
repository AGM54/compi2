// Generated from C:/Users/marce/IdeaProjects/parentesis/src/compara.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class comparaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MUL=4, DIV=5, ADD=6, SUB=7, ID=8, INT=9, NEWLINE=10, 
		WS=11, COMMENT=12, EQ=13, NEQ=14, LT=15, GT=16, LEQ=17, GEQ=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "MUL", "DIV", "ADD", "SUB", "ID", "INT", "NEWLINE", 
			"WS", "COMMENT", "EQ", "NEQ", "LT", "GT", "LEQ", "GEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'*'", "'/'", "'+'", "'-'", null, null, null, 
			null, null, "'=='", "'!='", "'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "MUL", "DIV", "ADD", "SUB", "ID", "INT", "NEWLINE", 
			"WS", "COMMENT", "EQ", "NEQ", "LT", "GT", "LEQ", "GEQ"
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


	public comparaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compara.g4"; }

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
		"\u0004\u0000\u0012d\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0004\u00075\b\u0007\u000b\u0007\f\u0007"+
		"6\u0001\b\u0004\b:\b\b\u000b\b\f\b;\u0001\t\u0003\t?\b\t\u0001\t\u0001"+
		"\t\u0001\n\u0004\nD\b\n\u000b\n\f\nE\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000bN\b\u000b\n\u000b\f\u000bQ\t"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0000\u0000\u0012"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000\u0004\u0002\u0000A"+
		"Zaz\u0001\u000009\u0002\u0000\t\t  \u0002\u0000\n\n\r\rh\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003\'"+
		"\u0001\u0000\u0000\u0000\u0005)\u0001\u0000\u0000\u0000\u0007+\u0001\u0000"+
		"\u0000\u0000\t-\u0001\u0000\u0000\u0000\u000b/\u0001\u0000\u0000\u0000"+
		"\r1\u0001\u0000\u0000\u0000\u000f4\u0001\u0000\u0000\u0000\u00119\u0001"+
		"\u0000\u0000\u0000\u0013>\u0001\u0000\u0000\u0000\u0015C\u0001\u0000\u0000"+
		"\u0000\u0017I\u0001\u0000\u0000\u0000\u0019T\u0001\u0000\u0000\u0000\u001b"+
		"W\u0001\u0000\u0000\u0000\u001dZ\u0001\u0000\u0000\u0000\u001f\\\u0001"+
		"\u0000\u0000\u0000!^\u0001\u0000\u0000\u0000#a\u0001\u0000\u0000\u0000"+
		"%&\u0005=\u0000\u0000&\u0002\u0001\u0000\u0000\u0000\'(\u0005(\u0000\u0000"+
		"(\u0004\u0001\u0000\u0000\u0000)*\u0005)\u0000\u0000*\u0006\u0001\u0000"+
		"\u0000\u0000+,\u0005*\u0000\u0000,\b\u0001\u0000\u0000\u0000-.\u0005/"+
		"\u0000\u0000.\n\u0001\u0000\u0000\u0000/0\u0005+\u0000\u00000\f\u0001"+
		"\u0000\u0000\u000012\u0005-\u0000\u00002\u000e\u0001\u0000\u0000\u0000"+
		"35\u0007\u0000\u0000\u000043\u0001\u0000\u0000\u000056\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007\u0010\u0001"+
		"\u0000\u0000\u00008:\u0007\u0001\u0000\u000098\u0001\u0000\u0000\u0000"+
		":;\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<\u0012\u0001\u0000\u0000\u0000=?\u0005\r\u0000\u0000>=\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0005"+
		"\n\u0000\u0000A\u0014\u0001\u0000\u0000\u0000BD\u0007\u0002\u0000\u0000"+
		"CB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0006\n\u0000"+
		"\u0000H\u0016\u0001\u0000\u0000\u0000IJ\u0005/\u0000\u0000JK\u0005/\u0000"+
		"\u0000KO\u0001\u0000\u0000\u0000LN\b\u0003\u0000\u0000ML\u0001\u0000\u0000"+
		"\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001\u0000"+
		"\u0000\u0000PR\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000RS\u0006"+
		"\u000b\u0000\u0000S\u0018\u0001\u0000\u0000\u0000TU\u0005=\u0000\u0000"+
		"UV\u0005=\u0000\u0000V\u001a\u0001\u0000\u0000\u0000WX\u0005!\u0000\u0000"+
		"XY\u0005=\u0000\u0000Y\u001c\u0001\u0000\u0000\u0000Z[\u0005<\u0000\u0000"+
		"[\u001e\u0001\u0000\u0000\u0000\\]\u0005>\u0000\u0000] \u0001\u0000\u0000"+
		"\u0000^_\u0005<\u0000\u0000_`\u0005=\u0000\u0000`\"\u0001\u0000\u0000"+
		"\u0000ab\u0005>\u0000\u0000bc\u0005=\u0000\u0000c$\u0001\u0000\u0000\u0000"+
		"\u0006\u00006;>EO\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}