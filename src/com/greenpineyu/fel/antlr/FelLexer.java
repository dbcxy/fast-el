package com.greenpineyu.fel.antlr;

// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g 2011-01-11 15:56:27

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;

public class FelLexer extends Lexer {
    public static final int HexLiteral=18;
    public static final int Cell=12;
    public static final int Multiplicative=9;
    public static final int LINE_COMMENT=32;
    public static final int FloatTypeSuffix=24;
    public static final int IntegerTypeSuffix=22;
    public static final int OctalLiteral=19;
    public static final int CharacterLiteral=15;
    public static final int Exponent=23;
    public static final int Colon=13;
    public static final int EOF=-1;
    public static final int DecimalLiteral=20;
    public static final int HexDigit=21;
    public static final int Identifier=10;
    public static final int StringLiteral=16;
    public static final int Additive=8;
    public static final int T__33=33;
    public static final int Logical=4;
    public static final int WS=30;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int LikeIn=7;
    public static final int UnicodeEscape=26;
    public static final int FloatingPointLiteral=14;
    public static final int Dot=11;
    public static final int JavaIDDigit=29;
    public static final int Relational=6;
    public static final int COMMENT=31;
    public static final int Equals=5;
    public static final int EscapeSequence=25;
    public static final int OctalEscape=27;
    public static final int Letter=28;
    public static final int BooleanLiteral=17;

    // delegates
    // delegators

    public FelLexer() {;} 
    public FelLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FelLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g"; }

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:7:7: ( '(' )
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:7:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:8:7: ( ')' )
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:8:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:9:7: ( ',' )
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:9:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "Cell"
    public final void mCell() throws RecognitionException {
        try {
            int _type = Cell;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:118:5: ( ( '$' )? ( 'A' .. 'Z' )+ ( '$' )? ( '0' .. '9' )+ )
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:118:7: ( '$' )? ( 'A' .. 'Z' )+ ( '$' )? ( '0' .. '9' )+
            {
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:118:7: ( '$' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='$') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:118:7: '$'
                    {
                    match('$'); 

                    }
                    break;

            }

            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:118:11: ( 'A' .. 'Z' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='A' && LA2_0<='Z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:118:12: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:118:22: ( '$' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='$') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:118:22: '$'
                    {
                    match('$'); 

                    }
                    break;

            }

            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:118:26: ( '0' .. '9' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:118:27: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Cell"

    // $ANTLR start "Dot"
    public final void mDot() throws RecognitionException {
        try {
            int _type = Dot;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:120:5: ( '.' )
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:120:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Dot"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:122:7: ( ':' )
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:122:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "LikeIn"
    public final void mLikeIn() throws RecognitionException {
        try {
            int _type = LikeIn;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:124:9: ( ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'K' | 'k' ) ( 'E' | 'e' ) ) | ( ( 'I' | 'i' ) ( 'N' | 'n' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='L'||LA5_0=='l') ) {
                alt5=1;
            }
            else if ( (LA5_0=='I'||LA5_0=='i') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:124:10: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'K' | 'k' ) ( 'E' | 'e' ) )
                    {
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:124:10: ( ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'K' | 'k' ) ( 'E' | 'e' ) )
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:124:11: ( 'L' | 'l' ) ( 'I' | 'i' ) ( 'K' | 'k' ) ( 'E' | 'e' )
                    {
                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }


                    }
                    break;
                case 2 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:124:49: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
                    {
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:124:49: ( ( 'I' | 'i' ) ( 'N' | 'n' ) )
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:124:50: ( 'I' | 'i' ) ( 'N' | 'n' )
                    {
                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LikeIn"

    // $ANTLR start "Logical"
    public final void mLogical() throws RecognitionException {
        try {
            int _type = Logical;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:126:9: ( ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ) | '&&' | ( ( 'O' | 'o' ) ( 'R' | 'r' ) ) | '||' )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 'A':
            case 'a':
                {
                alt6=1;
                }
                break;
            case '&':
                {
                alt6=2;
                }
                break;
            case 'O':
            case 'o':
                {
                alt6=3;
                }
                break;
            case '|':
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:126:10: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
                    {
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:126:10: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:126:11: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
                    {
                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }


                    }
                    break;
                case 2 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:126:40: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 3 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:126:45: ( ( 'O' | 'o' ) ( 'R' | 'r' ) )
                    {
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:126:45: ( ( 'O' | 'o' ) ( 'R' | 'r' ) )
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:126:46: ( 'O' | 'o' ) ( 'R' | 'r' )
                    {
                    if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }


                    }
                    break;
                case 4 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:126:66: '||'
                    {
                    match("||"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Logical"

    // $ANTLR start "Relational"
    public final void mRelational() throws RecognitionException {
        try {
            int _type = Relational;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:128:12: ( '>' | '<' | '<=' | '>=' )
            int alt7=4;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='>') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='=') ) {
                    alt7=4;
                }
                else {
                    alt7=1;}
            }
            else if ( (LA7_0=='<') ) {
                int LA7_2 = input.LA(2);

                if ( (LA7_2=='=') ) {
                    alt7=3;
                }
                else {
                    alt7=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:128:14: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:128:18: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:128:22: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 4 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:128:27: '>='
                    {
                    match(">="); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Relational"

    // $ANTLR start "Equals"
    public final void mEquals() throws RecognitionException {
        try {
            int _type = Equals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:130:8: ( '==' | '!=' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='=') ) {
                alt8=1;
            }
            else if ( (LA8_0=='!') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:130:10: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:130:15: '!='
                    {
                    match("!="); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Equals"

    // $ANTLR start "Multiplicative"
    public final void mMultiplicative() throws RecognitionException {
        try {
            int _type = Multiplicative;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:132:16: ( '*' | '/' | '%' )
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:
            {
            if ( input.LA(1)=='%'||input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Multiplicative"

    // $ANTLR start "Additive"
    public final void mAdditive() throws RecognitionException {
        try {
            int _type = Additive;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:134:10: ( ( '+' | '-' ) )
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:134:12: ( '+' | '-' )
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Additive"

    // $ANTLR start "HexLiteral"
    public final void mHexLiteral() throws RecognitionException {
        try {
            int _type = HexLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:136:12: ( '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )? )
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:136:14: '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )?
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:136:28: ( HexDigit )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='F')||(LA9_0>='a' && LA9_0<='f')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:136:28: HexDigit
            	    {
            	    mHexDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:136:38: ( IntegerTypeSuffix )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='L'||LA10_0=='l') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:136:38: IntegerTypeSuffix
                    {
                    mIntegerTypeSuffix(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HexLiteral"

    // $ANTLR start "DecimalLiteral"
    public final void mDecimalLiteral() throws RecognitionException {
        try {
            int _type = DecimalLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:138:16: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )? )
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:138:18: ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )?
            {
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:138:18: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='0') ) {
                alt12=1;
            }
            else if ( ((LA12_0>='1' && LA12_0<='9')) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:138:19: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:138:25: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:138:34: ( '0' .. '9' )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:138:34: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:138:45: ( IntegerTypeSuffix )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='L'||LA13_0=='l') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:138:45: IntegerTypeSuffix
                    {
                    mIntegerTypeSuffix(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DecimalLiteral"

    // $ANTLR start "OctalLiteral"
    public final void mOctalLiteral() throws RecognitionException {
        try {
            int _type = OctalLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:140:14: ( '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )? )
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:140:16: '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )?
            {
            match('0'); 
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:140:20: ( '0' .. '7' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='7')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:140:21: '0' .. '7'
            	    {
            	    matchRange('0','7'); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:140:32: ( IntegerTypeSuffix )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='L'||LA15_0=='l') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:140:32: IntegerTypeSuffix
                    {
                    mIntegerTypeSuffix(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OctalLiteral"

    // $ANTLR start "BooleanLiteral"
    public final void mBooleanLiteral() throws RecognitionException {
        try {
            int _type = BooleanLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:143:5: ( 'true' | 'false' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='t') ) {
                alt16=1;
            }
            else if ( (LA16_0=='f') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:143:9: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:144:9: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BooleanLiteral"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:148:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:148:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "IntegerTypeSuffix"
    public final void mIntegerTypeSuffix() throws RecognitionException {
        try {
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:151:19: ( ( 'l' | 'L' ) )
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:151:21: ( 'l' | 'L' )
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "IntegerTypeSuffix"

    // $ANTLR start "FloatingPointLiteral"
    public final void mFloatingPointLiteral() throws RecognitionException {
        try {
            int _type = FloatingPointLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:154:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ FloatTypeSuffix )
            int alt27=4;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:154:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )?
                    {
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:154:9: ( '0' .. '9' )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:154:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    match('.'); 
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:154:25: ( '0' .. '9' )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:154:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:154:37: ( Exponent )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='E'||LA19_0=='e') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:154:37: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }

                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:154:47: ( FloatTypeSuffix )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='D'||LA20_0=='F'||LA20_0=='d'||LA20_0=='f') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:154:47: FloatTypeSuffix
                            {
                            mFloatTypeSuffix(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:155:9: '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )?
                    {
                    match('.'); 
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:155:13: ( '0' .. '9' )+
                    int cnt21=0;
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>='0' && LA21_0<='9')) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:155:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt21 >= 1 ) break loop21;
                                EarlyExitException eee =
                                    new EarlyExitException(21, input);
                                throw eee;
                        }
                        cnt21++;
                    } while (true);

                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:155:25: ( Exponent )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='E'||LA22_0=='e') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:155:25: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }

                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:155:35: ( FloatTypeSuffix )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='D'||LA23_0=='F'||LA23_0=='d'||LA23_0=='f') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:155:35: FloatTypeSuffix
                            {
                            mFloatTypeSuffix(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:156:9: ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )?
                    {
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:156:9: ( '0' .. '9' )+
                    int cnt24=0;
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( ((LA24_0>='0' && LA24_0<='9')) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:156:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt24 >= 1 ) break loop24;
                                EarlyExitException eee =
                                    new EarlyExitException(24, input);
                                throw eee;
                        }
                        cnt24++;
                    } while (true);

                    mExponent(); 
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:156:30: ( FloatTypeSuffix )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0=='D'||LA25_0=='F'||LA25_0=='d'||LA25_0=='f') ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:156:30: FloatTypeSuffix
                            {
                            mFloatTypeSuffix(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:157:9: ( '0' .. '9' )+ FloatTypeSuffix
                    {
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:157:9: ( '0' .. '9' )+
                    int cnt26=0;
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>='0' && LA26_0<='9')) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:157:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt26 >= 1 ) break loop26;
                                EarlyExitException eee =
                                    new EarlyExitException(26, input);
                                throw eee;
                        }
                        cnt26++;
                    } while (true);

                    mFloatTypeSuffix(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FloatingPointLiteral"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:161:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:161:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:161:22: ( '+' | '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='+'||LA28_0=='-') ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:161:33: ( '0' .. '9' )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>='0' && LA29_0<='9')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:161:34: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "FloatTypeSuffix"
    public final void mFloatTypeSuffix() throws RecognitionException {
        try {
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:164:17: ( ( 'f' | 'F' | 'd' | 'D' ) )
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:164:19: ( 'f' | 'F' | 'd' | 'D' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "FloatTypeSuffix"

    // $ANTLR start "CharacterLiteral"
    public final void mCharacterLiteral() throws RecognitionException {
        try {
            int _type = CharacterLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:167:5: ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\'' )
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:167:9: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\''
            {
            match('\''); 
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:167:14: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )*
            loop30:
            do {
                int alt30=3;
                int LA30_0 = input.LA(1);

                if ( (LA30_0=='\\') ) {
                    alt30=1;
                }
                else if ( ((LA30_0>='\u0000' && LA30_0<='&')||(LA30_0>='(' && LA30_0<='[')||(LA30_0>=']' && LA30_0<='\uFFFF')) ) {
                    alt30=2;
                }


                switch (alt30) {
            	case 1 :
            	    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:167:16: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:167:33: ~ ( '\\'' | '\\\\' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CharacterLiteral"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:171:5: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' )
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:171:8: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:171:12: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
            loop31:
            do {
                int alt31=3;
                int LA31_0 = input.LA(1);

                if ( (LA31_0=='\\') ) {
                    alt31=1;
                }
                else if ( ((LA31_0>='\u0000' && LA31_0<='!')||(LA31_0>='#' && LA31_0<='[')||(LA31_0>=']' && LA31_0<='\uFFFF')) ) {
                    alt31=2;
                }


                switch (alt31) {
            	case 1 :
            	    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:171:14: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
            	    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:171:31: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "StringLiteral"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:177:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='\\') ) {
                switch ( input.LA(2) ) {
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt32=1;
                    }
                    break;
                case 'u':
                    {
                    alt32=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt32=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:177:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 
                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:178:9: UnicodeEscape
                    {
                    mUnicodeEscape(); 

                    }
                    break;
                case 3 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:179:9: OctalEscape
                    {
                    mOctalEscape(); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "OctalEscape"
    public final void mOctalEscape() throws RecognitionException {
        try {
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:184:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='\\') ) {
                int LA33_1 = input.LA(2);

                if ( ((LA33_1>='0' && LA33_1<='3')) ) {
                    int LA33_2 = input.LA(3);

                    if ( ((LA33_2>='0' && LA33_2<='7')) ) {
                        int LA33_4 = input.LA(4);

                        if ( ((LA33_4>='0' && LA33_4<='7')) ) {
                            alt33=1;
                        }
                        else {
                            alt33=2;}
                    }
                    else {
                        alt33=3;}
                }
                else if ( ((LA33_1>='4' && LA33_1<='7')) ) {
                    int LA33_3 = input.LA(3);

                    if ( ((LA33_3>='0' && LA33_3<='7')) ) {
                        alt33=2;
                    }
                    else {
                        alt33=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:184:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:184:14: ( '0' .. '3' )
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:184:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:184:25: ( '0' .. '7' )
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:184:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:184:36: ( '0' .. '7' )
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:184:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:185:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:185:14: ( '0' .. '7' )
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:185:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:185:25: ( '0' .. '7' )
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:185:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:186:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:186:14: ( '0' .. '7' )
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:186:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "OctalEscape"

    // $ANTLR start "UnicodeEscape"
    public final void mUnicodeEscape() throws RecognitionException {
        try {
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:191:5: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:191:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
            {
            match('\\'); 
            match('u'); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 
            mHexDigit(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UnicodeEscape"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:196:5: ( Letter ( Letter | JavaIDDigit )* )
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:196:9: Letter ( Letter | JavaIDDigit )*
            {
            mLetter(); 
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:196:16: ( Letter | JavaIDDigit )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>='#' && LA34_0<='$')||(LA34_0>='0' && LA34_0<='9')||(LA34_0>='@' && LA34_0<='Z')||(LA34_0>='^' && LA34_0<='_')||(LA34_0>='a' && LA34_0<='z')||LA34_0=='|'||(LA34_0>='\u00C0' && LA34_0<='\u00D6')||(LA34_0>='\u00D8' && LA34_0<='\u00F6')||(LA34_0>='\u00F8' && LA34_0<='\u1FFF')||(LA34_0>='\u3040' && LA34_0<='\u318F')||(LA34_0>='\u3300' && LA34_0<='\u337F')||(LA34_0>='\u3400' && LA34_0<='\u3D2D')||(LA34_0>='\u4E00' && LA34_0<='\u9FFF')||(LA34_0>='\uF900' && LA34_0<='\uFAFF')) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:
            	    {
            	    if ( (input.LA(1)>='#' && input.LA(1)<='$')||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='@' && input.LA(1)<='Z')||(input.LA(1)>='^' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u3040' && input.LA(1)<='\u318F')||(input.LA(1)>='\u3300' && input.LA(1)<='\u337F')||(input.LA(1)>='\u3400' && input.LA(1)<='\u3D2D')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FFF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFAFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Identifier"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:204:5: ( '\\u0024' | '\\u0041' .. '\\u005a' | '\\u005f' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' | '^' | '#' | '@' | '|' )
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:
            {
            if ( (input.LA(1)>='#' && input.LA(1)<='$')||(input.LA(1)>='@' && input.LA(1)<='Z')||(input.LA(1)>='^' && input.LA(1)<='_')||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u3040' && input.LA(1)<='\u318F')||(input.LA(1)>='\u3300' && input.LA(1)<='\u337F')||(input.LA(1)>='\u3400' && input.LA(1)<='\u3D2D')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FFF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFAFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "JavaIDDigit"
    public final void mJavaIDDigit() throws RecognitionException {
        try {
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:225:5: ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06f0' .. '\\u06f9' | '\\u0966' .. '\\u096f' | '\\u09e6' .. '\\u09ef' | '\\u0a66' .. '\\u0a6f' | '\\u0ae6' .. '\\u0aef' | '\\u0b66' .. '\\u0b6f' | '\\u0be7' .. '\\u0bef' | '\\u0c66' .. '\\u0c6f' | '\\u0ce6' .. '\\u0cef' | '\\u0d66' .. '\\u0d6f' | '\\u0e50' .. '\\u0e59' | '\\u0ed0' .. '\\u0ed9' | '\\u1040' .. '\\u1049' )
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='\u0660' && input.LA(1)<='\u0669')||(input.LA(1)>='\u06F0' && input.LA(1)<='\u06F9')||(input.LA(1)>='\u0966' && input.LA(1)<='\u096F')||(input.LA(1)>='\u09E6' && input.LA(1)<='\u09EF')||(input.LA(1)>='\u0A66' && input.LA(1)<='\u0A6F')||(input.LA(1)>='\u0AE6' && input.LA(1)<='\u0AEF')||(input.LA(1)>='\u0B66' && input.LA(1)<='\u0B6F')||(input.LA(1)>='\u0BE7' && input.LA(1)<='\u0BEF')||(input.LA(1)>='\u0C66' && input.LA(1)<='\u0C6F')||(input.LA(1)>='\u0CE6' && input.LA(1)<='\u0CEF')||(input.LA(1)>='\u0D66' && input.LA(1)<='\u0D6F')||(input.LA(1)>='\u0E50' && input.LA(1)<='\u0E59')||(input.LA(1)>='\u0ED0' && input.LA(1)<='\u0ED9')||(input.LA(1)>='\u1040' && input.LA(1)<='\u1049') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "JavaIDDigit"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:242:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:242:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:246:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:246:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:246:14: ( options {greedy=false; } : . )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0=='*') ) {
                    int LA35_1 = input.LA(2);

                    if ( (LA35_1=='/') ) {
                        alt35=2;
                    }
                    else if ( ((LA35_1>='\u0000' && LA35_1<='.')||(LA35_1>='0' && LA35_1<='\uFFFF')) ) {
                        alt35=1;
                    }


                }
                else if ( ((LA35_0>='\u0000' && LA35_0<=')')||(LA35_0>='+' && LA35_0<='\uFFFF')) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:246:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:250:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:250:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:250:12: (~ ( '\\n' | '\\r' ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>='\u0000' && LA36_0<='\t')||(LA36_0>='\u000B' && LA36_0<='\f')||(LA36_0>='\u000E' && LA36_0<='\uFFFF')) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:250:12: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:250:26: ( '\\r' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0=='\r') ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:250:26: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:1:8: ( T__33 | T__34 | T__35 | Cell | Dot | Colon | LikeIn | Logical | Relational | Equals | Multiplicative | Additive | HexLiteral | DecimalLiteral | OctalLiteral | BooleanLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | Identifier | WS | COMMENT | LINE_COMMENT )
        int alt38=23;
        alt38 = dfa38.predict(input);
        switch (alt38) {
            case 1 :
                // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:1:10: T__33
                {
                mT__33(); 

                }
                break;
            case 2 :
                // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:1:16: T__34
                {
                mT__34(); 

                }
                break;
            case 3 :
                // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:1:22: T__35
                {
                mT__35(); 

                }
                break;
            case 4 :
                // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:1:28: Cell
                {
                mCell(); 

                }
                break;
            case 5 :
                // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:1:33: Dot
                {
                mDot(); 

                }
                break;
            case 6 :
                // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:1:37: Colon
                {
                mColon(); 

                }
                break;
            case 7 :
                // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:1:43: LikeIn
                {
                mLikeIn(); 

                }
                break;
            case 8 :
                // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:1:50: Logical
                {
                mLogical(); 

                }
                break;
            case 9 :
                // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:1:58: Relational
                {
                mRelational(); 

                }
                break;
            case 10 :
                // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:1:69: Equals
                {
                mEquals(); 

                }
                break;
            case 11 :
                // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:1:76: Multiplicative
                {
                mMultiplicative(); 

                }
                break;
            case 12 :
                // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:1:91: Additive
                {
                mAdditive(); 

                }
                break;
            case 13 :
                // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:1:100: HexLiteral
                {
                mHexLiteral(); 

                }
                break;
            case 14 :
                // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:1:111: DecimalLiteral
                {
                mDecimalLiteral(); 

                }
                break;
            case 15 :
                // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:1:126: OctalLiteral
                {
                mOctalLiteral(); 

                }
                break;
            case 16 :
                // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:1:139: BooleanLiteral
                {
                mBooleanLiteral(); 

                }
                break;
            case 17 :
                // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:1:154: FloatingPointLiteral
                {
                mFloatingPointLiteral(); 

                }
                break;
            case 18 :
                // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:1:175: CharacterLiteral
                {
                mCharacterLiteral(); 

                }
                break;
            case 19 :
                // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:1:192: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 20 :
                // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:1:206: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 21 :
                // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:1:217: WS
                {
                mWS(); 

                }
                break;
            case 22 :
                // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:1:220: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 23 :
                // D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:1:228: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;

        }

    }


    protected DFA27 dfa27 = new DFA27(this);
    protected DFA38 dfa38 = new DFA38(this);
    static final String DFA27_eotS =
        "\6\uffff";
    static final String DFA27_eofS =
        "\6\uffff";
    static final String DFA27_minS =
        "\2\56\4\uffff";
    static final String DFA27_maxS =
        "\1\71\1\146\4\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\1\4\1\3\1\1";
    static final String DFA27_specialS =
        "\6\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\5\1\uffff\12\1\12\uffff\1\3\1\4\1\3\35\uffff\1\3\1\4\1"+
            "\3",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "153:1: FloatingPointLiteral : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ FloatTypeSuffix );";
        }
    }
    static final String DFA38_eotS =
        "\4\uffff\2\34\1\45\1\uffff\6\34\1\uffff\3\34\2\uffff\1\36\1\uffff"+
        "\2\61\2\34\5\uffff\3\34\1\67\1\34\2\uffff\2\70\2\34\3\16\3\uffff"+
        "\1\73\1\uffff\1\61\4\34\2\uffff\2\16\1\uffff\2\34\2\70\1\102\1\34"+
        "\1\uffff\1\102";
    static final String DFA38_eofS =
        "\104\uffff";
    static final String DFA38_minS =
        "\1\11\3\uffff\1\101\1\44\1\60\1\uffff\1\44\1\111\1\44\1\116\1\44"+
        "\1\116\1\uffff\1\44\1\122\1\174\2\uffff\1\52\1\uffff\2\56\1\162"+
        "\1\141\5\uffff\2\44\1\60\1\43\1\113\2\uffff\2\43\1\44\1\104\3\43"+
        "\3\uffff\1\56\1\uffff\1\56\1\165\1\154\1\44\1\105\2\uffff\2\43\1"+
        "\uffff\1\145\1\163\3\43\1\145\1\uffff\1\43";
    static final String DFA38_maxS =
        "\1\ufaff\3\uffff\1\132\1\151\1\71\1\uffff\1\156\1\151\2\156\1\162"+
        "\1\156\1\uffff\1\132\1\162\1\174\2\uffff\1\57\1\uffff\1\170\1\146"+
        "\1\162\1\141\5\uffff\1\132\1\153\1\71\1\ufaff\1\153\2\uffff\2\ufaff"+
        "\2\144\3\ufaff\3\uffff\1\146\1\uffff\1\146\1\165\1\154\2\145\2\uffff"+
        "\2\ufaff\1\uffff\1\145\1\163\3\ufaff\1\145\1\uffff\1\ufaff";
    static final String DFA38_acceptS =
        "\1\uffff\1\1\1\2\1\3\3\uffff\1\6\6\uffff\1\10\3\uffff\1\11\1\12"+
        "\1\uffff\1\14\4\uffff\1\22\1\23\1\24\1\25\1\13\5\uffff\1\21\1\5"+
        "\7\uffff\1\26\1\27\1\15\1\uffff\1\16\5\uffff\1\4\1\7\2\uffff\1\17"+
        "\6\uffff\1\20\1\uffff";
    static final String DFA38_specialS =
        "\104\uffff}>";
    static final String[] DFA38_transitionS = {
            "\2\35\1\uffff\2\35\22\uffff\1\35\1\23\1\33\1\34\1\4\1\36\1"+
            "\16\1\32\1\1\1\2\1\36\1\25\1\3\1\25\1\6\1\24\1\26\11\27\1\7"+
            "\1\uffff\1\22\1\23\1\22\1\uffff\1\34\1\12\7\17\1\10\2\17\1\5"+
            "\2\17\1\14\13\17\3\uffff\2\34\1\uffff\1\15\4\34\1\31\2\34\1"+
            "\13\2\34\1\11\2\34\1\20\4\34\1\30\6\34\1\uffff\1\21\103\uffff"+
            "\27\34\1\uffff\37\34\1\uffff\u1f08\34\u1040\uffff\u0150\34\u0170"+
            "\uffff\u0080\34\u0080\uffff\u092e\34\u10d2\uffff\u5200\34\u5900"+
            "\uffff\u0200\34",
            "",
            "",
            "",
            "\32\37",
            "\1\41\13\uffff\12\42\7\uffff\10\37\1\40\21\37\16\uffff\1\43",
            "\12\44",
            "",
            "\1\41\13\uffff\12\42\7\uffff\15\37\1\46\14\37\23\uffff\1\47",
            "\1\43\37\uffff\1\43",
            "\1\41\13\uffff\12\42\7\uffff\15\37\1\50\14\37\23\uffff\1\51",
            "\1\47\37\uffff\1\47",
            "\1\41\13\uffff\12\42\7\uffff\21\37\1\52\10\37\27\uffff\1\53",
            "\1\51\37\uffff\1\51",
            "",
            "\1\41\13\uffff\12\42\7\uffff\32\37",
            "\1\53\37\uffff\1\53",
            "\1\54",
            "",
            "",
            "\1\55\4\uffff\1\56",
            "",
            "\1\44\1\uffff\10\60\2\44\12\uffff\3\44\21\uffff\1\57\13\uffff"+
            "\3\44\21\uffff\1\57",
            "\1\44\1\uffff\12\62\12\uffff\3\44\35\uffff\3\44",
            "\1\63",
            "\1\64",
            "",
            "",
            "",
            "",
            "",
            "\1\41\13\uffff\12\42\7\uffff\32\37",
            "\1\41\13\uffff\12\42\7\uffff\12\37\1\65\17\37\20\uffff\1\66",
            "\12\42",
            "\2\34\13\uffff\12\42\6\uffff\33\34\3\uffff\2\34\1\uffff\32"+
            "\34\1\uffff\1\34\103\uffff\27\34\1\uffff\37\34\1\uffff\u1f08"+
            "\34\u1040\uffff\u0150\34\u0170\uffff\u0080\34\u0080\uffff\u092e"+
            "\34\u10d2\uffff\u5200\34\u5900\uffff\u0200\34",
            "\1\66\37\uffff\1\66",
            "",
            "",
            "\1\34\1\41\13\uffff\12\42\6\uffff\1\34\32\37\3\uffff\2\34"+
            "\1\uffff\32\34\1\uffff\1\34\103\uffff\27\34\1\uffff\37\34\1"+
            "\uffff\u1f08\34\u1040\uffff\u0150\34\u0170\uffff\u0080\34\u0080"+
            "\uffff\u092e\34\u10d2\uffff\u5200\34\u5900\uffff\u0200\34",
            "\2\34\13\uffff\12\34\6\uffff\33\34\3\uffff\2\34\1\uffff\32"+
            "\34\1\uffff\1\34\103\uffff\27\34\1\uffff\37\34\1\uffff\u1f08"+
            "\34\u1040\uffff\u0150\34\u0170\uffff\u0080\34\u0080\uffff\u092e"+
            "\34\u10d2\uffff\u5200\34\u5900\uffff\u0200\34",
            "\1\41\13\uffff\12\42\7\uffff\3\37\1\71\26\37\11\uffff\1\72",
            "\1\72\37\uffff\1\72",
            "\1\34\1\41\13\uffff\12\42\6\uffff\1\34\32\37\3\uffff\2\34"+
            "\1\uffff\32\34\1\uffff\1\34\103\uffff\27\34\1\uffff\37\34\1"+
            "\uffff\u1f08\34\u1040\uffff\u0150\34\u0170\uffff\u0080\34\u0080"+
            "\uffff\u092e\34\u10d2\uffff\u5200\34\u5900\uffff\u0200\34",
            "\2\34\13\uffff\12\34\6\uffff\33\34\3\uffff\2\34\1\uffff\32"+
            "\34\1\uffff\1\34\103\uffff\27\34\1\uffff\37\34\1\uffff\u1f08"+
            "\34\u1040\uffff\u0150\34\u0170\uffff\u0080\34\u0080\uffff\u092e"+
            "\34\u10d2\uffff\u5200\34\u5900\uffff\u0200\34",
            "\2\34\13\uffff\12\34\6\uffff\33\34\3\uffff\2\34\1\uffff\32"+
            "\34\1\uffff\1\34\103\uffff\27\34\1\uffff\37\34\1\uffff\u1f08"+
            "\34\u1040\uffff\u0150\34\u0170\uffff\u0080\34\u0080\uffff\u092e"+
            "\34\u10d2\uffff\u5200\34\u5900\uffff\u0200\34",
            "",
            "",
            "",
            "\1\44\1\uffff\10\60\2\44\12\uffff\3\44\35\uffff\3\44",
            "",
            "\1\44\1\uffff\12\62\12\uffff\3\44\35\uffff\3\44",
            "\1\74",
            "\1\75",
            "\1\41\13\uffff\12\42\7\uffff\4\37\1\76\25\37\12\uffff\1\77",
            "\1\77\37\uffff\1\77",
            "",
            "",
            "\1\34\1\41\13\uffff\12\42\6\uffff\1\34\32\37\3\uffff\2\34"+
            "\1\uffff\32\34\1\uffff\1\34\103\uffff\27\34\1\uffff\37\34\1"+
            "\uffff\u1f08\34\u1040\uffff\u0150\34\u0170\uffff\u0080\34\u0080"+
            "\uffff\u092e\34\u10d2\uffff\u5200\34\u5900\uffff\u0200\34",
            "\2\34\13\uffff\12\34\6\uffff\33\34\3\uffff\2\34\1\uffff\32"+
            "\34\1\uffff\1\34\103\uffff\27\34\1\uffff\37\34\1\uffff\u1f08"+
            "\34\u1040\uffff\u0150\34\u0170\uffff\u0080\34\u0080\uffff\u092e"+
            "\34\u10d2\uffff\u5200\34\u5900\uffff\u0200\34",
            "",
            "\1\100",
            "\1\101",
            "\1\34\1\41\13\uffff\12\42\6\uffff\1\34\32\37\3\uffff\2\34"+
            "\1\uffff\32\34\1\uffff\1\34\103\uffff\27\34\1\uffff\37\34\1"+
            "\uffff\u1f08\34\u1040\uffff\u0150\34\u0170\uffff\u0080\34\u0080"+
            "\uffff\u092e\34\u10d2\uffff\u5200\34\u5900\uffff\u0200\34",
            "\2\34\13\uffff\12\34\6\uffff\33\34\3\uffff\2\34\1\uffff\32"+
            "\34\1\uffff\1\34\103\uffff\27\34\1\uffff\37\34\1\uffff\u1f08"+
            "\34\u1040\uffff\u0150\34\u0170\uffff\u0080\34\u0080\uffff\u092e"+
            "\34\u10d2\uffff\u5200\34\u5900\uffff\u0200\34",
            "\2\34\13\uffff\12\34\6\uffff\33\34\3\uffff\2\34\1\uffff\32"+
            "\34\1\uffff\1\34\103\uffff\27\34\1\uffff\37\34\1\uffff\u1f08"+
            "\34\u1040\uffff\u0150\34\u0170\uffff\u0080\34\u0080\uffff\u092e"+
            "\34\u10d2\uffff\u5200\34\u5900\uffff\u0200\34",
            "\1\103",
            "",
            "\2\34\13\uffff\12\34\6\uffff\33\34\3\uffff\2\34\1\uffff\32"+
            "\34\1\uffff\1\34\103\uffff\27\34\1\uffff\37\34\1\uffff\u1f08"+
            "\34\u1040\uffff\u0150\34\u0170\uffff\u0080\34\u0080\uffff\u092e"+
            "\34\u10d2\uffff\u5200\34\u5900\uffff\u0200\34"
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__33 | T__34 | T__35 | Cell | Dot | Colon | LikeIn | Logical | Relational | Equals | Multiplicative | Additive | HexLiteral | DecimalLiteral | OctalLiteral | BooleanLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | Identifier | WS | COMMENT | LINE_COMMENT );";
        }
    }
 

}