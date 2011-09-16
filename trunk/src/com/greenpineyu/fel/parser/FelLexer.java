// $ANTLR 3.4 D:\\129\\ws\\fel\\Fel.g 2011-09-16 14:34:01
package com.greenpineyu.fel.parser;
import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class FelLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int Additive=4;
    public static final int And=5;
    public static final int BooleanLiteral=6;
    public static final int COMMENT=7;
    public static final int CharacterLiteral=8;
    public static final int Colon=9;
    public static final int DecimalLiteral=10;
    public static final int Dot=11;
    public static final int Equals=12;
    public static final int EscapeSequence=13;
    public static final int Exponent=14;
    public static final int FloatTypeSuffix=15;
    public static final int FloatingPointLiteral=16;
    public static final int HexDigit=17;
    public static final int HexLiteral=18;
    public static final int Identifier=19;
    public static final int IntegerTypeSuffix=20;
    public static final int JavaIDDigit=21;
    public static final int LINE_COMMENT=22;
    public static final int Letter=23;
    public static final int Multiplicative=24;
    public static final int Not=25;
    public static final int OctalEscape=26;
    public static final int OctalLiteral=27;
    public static final int Or=28;
    public static final int Ques=29;
    public static final int Relational=30;
    public static final int StringLiteral=31;
    public static final int UnicodeEscape=32;
    public static final int WS=33;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public FelLexer() {} 
    public FelLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FelLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\129\\ws\\fel\\Fel.g"; }

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\129\\ws\\fel\\Fel.g:7:7: ( '(' )
            // D:\\129\\ws\\fel\\Fel.g:7:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\129\\ws\\fel\\Fel.g:8:7: ( ')' )
            // D:\\129\\ws\\fel\\Fel.g:8:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\129\\ws\\fel\\Fel.g:9:7: ( ',' )
            // D:\\129\\ws\\fel\\Fel.g:9:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "Dot"
    public final void mDot() throws RecognitionException {
        try {
            int _type = Dot;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\129\\ws\\fel\\Fel.g:110:5: ( '.' )
            // D:\\129\\ws\\fel\\Fel.g:110:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Dot"

    // $ANTLR start "Or"
    public final void mOr() throws RecognitionException {
        try {
            int _type = Or;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\129\\ws\\fel\\Fel.g:112:4: ( '||' )
            // D:\\129\\ws\\fel\\Fel.g:112:6: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Or"

    // $ANTLR start "And"
    public final void mAnd() throws RecognitionException {
        try {
            int _type = And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\129\\ws\\fel\\Fel.g:114:5: ( '&&' )
            // D:\\129\\ws\\fel\\Fel.g:114:7: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "And"

    // $ANTLR start "Not"
    public final void mNot() throws RecognitionException {
        try {
            int _type = Not;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\129\\ws\\fel\\Fel.g:116:5: ( '!' )
            // D:\\129\\ws\\fel\\Fel.g:116:7: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Not"

    // $ANTLR start "Ques"
    public final void mQues() throws RecognitionException {
        try {
            int _type = Ques;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\129\\ws\\fel\\Fel.g:118:6: ( '?' )
            // D:\\129\\ws\\fel\\Fel.g:118:8: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Ques"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\129\\ws\\fel\\Fel.g:120:7: ( ':' )
            // D:\\129\\ws\\fel\\Fel.g:120:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Relational"
    public final void mRelational() throws RecognitionException {
        try {
            int _type = Relational;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\129\\ws\\fel\\Fel.g:122:12: ( '>' | '<' | '<=' | '>=' )
            int alt1=4;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='>') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='=') ) {
                    alt1=4;
                }
                else {
                    alt1=1;
                }
            }
            else if ( (LA1_0=='<') ) {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='=') ) {
                    alt1=3;
                }
                else {
                    alt1=2;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // D:\\129\\ws\\fel\\Fel.g:122:14: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // D:\\129\\ws\\fel\\Fel.g:122:18: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // D:\\129\\ws\\fel\\Fel.g:122:22: '<='
                    {
                    match("<="); 



                    }
                    break;
                case 4 :
                    // D:\\129\\ws\\fel\\Fel.g:122:27: '>='
                    {
                    match(">="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Relational"

    // $ANTLR start "Equals"
    public final void mEquals() throws RecognitionException {
        try {
            int _type = Equals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\129\\ws\\fel\\Fel.g:124:8: ( '==' | '!=' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='=') ) {
                alt2=1;
            }
            else if ( (LA2_0=='!') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // D:\\129\\ws\\fel\\Fel.g:124:10: '=='
                    {
                    match("=="); 



                    }
                    break;
                case 2 :
                    // D:\\129\\ws\\fel\\Fel.g:124:15: '!='
                    {
                    match("!="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Equals"

    // $ANTLR start "Multiplicative"
    public final void mMultiplicative() throws RecognitionException {
        try {
            int _type = Multiplicative;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\129\\ws\\fel\\Fel.g:126:16: ( '*' | '/' | '%' )
            // D:\\129\\ws\\fel\\Fel.g:
            {
            if ( input.LA(1)=='%'||input.LA(1)=='*'||input.LA(1)=='/' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Multiplicative"

    // $ANTLR start "Additive"
    public final void mAdditive() throws RecognitionException {
        try {
            int _type = Additive;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\129\\ws\\fel\\Fel.g:128:10: ( ( '+' | '-' ) )
            // D:\\129\\ws\\fel\\Fel.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Additive"

    // $ANTLR start "HexLiteral"
    public final void mHexLiteral() throws RecognitionException {
        try {
            int _type = HexLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\129\\ws\\fel\\Fel.g:130:12: ( '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )? )
            // D:\\129\\ws\\fel\\Fel.g:130:14: '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )?
            {
            match('0'); 

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\129\\ws\\fel\\Fel.g:130:28: ( HexDigit )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'F')||(LA3_0 >= 'a' && LA3_0 <= 'f')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\129\\ws\\fel\\Fel.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            // D:\\129\\ws\\fel\\Fel.g:130:38: ( IntegerTypeSuffix )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='L'||LA4_0=='l') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\129\\ws\\fel\\Fel.g:
                    {
                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HexLiteral"

    // $ANTLR start "DecimalLiteral"
    public final void mDecimalLiteral() throws RecognitionException {
        try {
            int _type = DecimalLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\129\\ws\\fel\\Fel.g:132:16: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )? )
            // D:\\129\\ws\\fel\\Fel.g:132:18: ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )?
            {
            // D:\\129\\ws\\fel\\Fel.g:132:18: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='0') ) {
                alt6=1;
            }
            else if ( ((LA6_0 >= '1' && LA6_0 <= '9')) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // D:\\129\\ws\\fel\\Fel.g:132:19: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // D:\\129\\ws\\fel\\Fel.g:132:25: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 

                    // D:\\129\\ws\\fel\\Fel.g:132:34: ( '0' .. '9' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\129\\ws\\fel\\Fel.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }


            // D:\\129\\ws\\fel\\Fel.g:132:45: ( IntegerTypeSuffix )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='L'||LA7_0=='l') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // D:\\129\\ws\\fel\\Fel.g:
                    {
                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DecimalLiteral"

    // $ANTLR start "OctalLiteral"
    public final void mOctalLiteral() throws RecognitionException {
        try {
            int _type = OctalLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\129\\ws\\fel\\Fel.g:134:14: ( '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )? )
            // D:\\129\\ws\\fel\\Fel.g:134:16: '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )?
            {
            match('0'); 

            // D:\\129\\ws\\fel\\Fel.g:134:20: ( '0' .. '7' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '0' && LA8_0 <= '7')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\129\\ws\\fel\\Fel.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            // D:\\129\\ws\\fel\\Fel.g:134:32: ( IntegerTypeSuffix )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='L'||LA9_0=='l') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // D:\\129\\ws\\fel\\Fel.g:
                    {
                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OctalLiteral"

    // $ANTLR start "BooleanLiteral"
    public final void mBooleanLiteral() throws RecognitionException {
        try {
            int _type = BooleanLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\129\\ws\\fel\\Fel.g:137:5: ( 'true' | 'false' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='t') ) {
                alt10=1;
            }
            else if ( (LA10_0=='f') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // D:\\129\\ws\\fel\\Fel.g:137:9: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // D:\\129\\ws\\fel\\Fel.g:138:9: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BooleanLiteral"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // D:\\129\\ws\\fel\\Fel.g:143:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // D:\\129\\ws\\fel\\Fel.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "IntegerTypeSuffix"
    public final void mIntegerTypeSuffix() throws RecognitionException {
        try {
            // D:\\129\\ws\\fel\\Fel.g:146:19: ( ( 'l' | 'L' ) )
            // D:\\129\\ws\\fel\\Fel.g:
            {
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IntegerTypeSuffix"

    // $ANTLR start "FloatingPointLiteral"
    public final void mFloatingPointLiteral() throws RecognitionException {
        try {
            int _type = FloatingPointLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\129\\ws\\fel\\Fel.g:148:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ FloatTypeSuffix )
            int alt21=4;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // D:\\129\\ws\\fel\\Fel.g:148:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )?
                    {
                    // D:\\129\\ws\\fel\\Fel.g:148:9: ( '0' .. '9' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // D:\\129\\ws\\fel\\Fel.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    match('.'); 

                    // D:\\129\\ws\\fel\\Fel.g:148:25: ( '0' .. '9' )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // D:\\129\\ws\\fel\\Fel.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    // D:\\129\\ws\\fel\\Fel.g:148:37: ( Exponent )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='E'||LA13_0=='e') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // D:\\129\\ws\\fel\\Fel.g:148:37: Exponent
                            {
                            mExponent(); 


                            }
                            break;

                    }


                    // D:\\129\\ws\\fel\\Fel.g:148:47: ( FloatTypeSuffix )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='D'||LA14_0=='F'||LA14_0=='d'||LA14_0=='f') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // D:\\129\\ws\\fel\\Fel.g:
                            {
                            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\129\\ws\\fel\\Fel.g:149:9: '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )?
                    {
                    match('.'); 

                    // D:\\129\\ws\\fel\\Fel.g:149:13: ( '0' .. '9' )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // D:\\129\\ws\\fel\\Fel.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    // D:\\129\\ws\\fel\\Fel.g:149:25: ( Exponent )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='E'||LA16_0=='e') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // D:\\129\\ws\\fel\\Fel.g:149:25: Exponent
                            {
                            mExponent(); 


                            }
                            break;

                    }


                    // D:\\129\\ws\\fel\\Fel.g:149:35: ( FloatTypeSuffix )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='D'||LA17_0=='F'||LA17_0=='d'||LA17_0=='f') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // D:\\129\\ws\\fel\\Fel.g:
                            {
                            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // D:\\129\\ws\\fel\\Fel.g:150:9: ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )?
                    {
                    // D:\\129\\ws\\fel\\Fel.g:150:9: ( '0' .. '9' )+
                    int cnt18=0;
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0 >= '0' && LA18_0 <= '9')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // D:\\129\\ws\\fel\\Fel.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt18 >= 1 ) break loop18;
                                EarlyExitException eee =
                                    new EarlyExitException(18, input);
                                throw eee;
                        }
                        cnt18++;
                    } while (true);


                    mExponent(); 


                    // D:\\129\\ws\\fel\\Fel.g:150:30: ( FloatTypeSuffix )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='D'||LA19_0=='F'||LA19_0=='d'||LA19_0=='f') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // D:\\129\\ws\\fel\\Fel.g:
                            {
                            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // D:\\129\\ws\\fel\\Fel.g:151:9: ( '0' .. '9' )+ FloatTypeSuffix
                    {
                    // D:\\129\\ws\\fel\\Fel.g:151:9: ( '0' .. '9' )+
                    int cnt20=0;
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0 >= '0' && LA20_0 <= '9')) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // D:\\129\\ws\\fel\\Fel.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt20 >= 1 ) break loop20;
                                EarlyExitException eee =
                                    new EarlyExitException(20, input);
                                throw eee;
                        }
                        cnt20++;
                    } while (true);


                    mFloatTypeSuffix(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FloatingPointLiteral"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // D:\\129\\ws\\fel\\Fel.g:156:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // D:\\129\\ws\\fel\\Fel.g:156:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\129\\ws\\fel\\Fel.g:156:22: ( '+' | '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='+'||LA22_0=='-') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // D:\\129\\ws\\fel\\Fel.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // D:\\129\\ws\\fel\\Fel.g:156:33: ( '0' .. '9' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0 >= '0' && LA23_0 <= '9')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // D:\\129\\ws\\fel\\Fel.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "FloatTypeSuffix"
    public final void mFloatTypeSuffix() throws RecognitionException {
        try {
            // D:\\129\\ws\\fel\\Fel.g:159:17: ( ( 'f' | 'F' | 'd' | 'D' ) )
            // D:\\129\\ws\\fel\\Fel.g:
            {
            if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='d'||input.LA(1)=='f' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FloatTypeSuffix"

    // $ANTLR start "CharacterLiteral"
    public final void mCharacterLiteral() throws RecognitionException {
        try {
            int _type = CharacterLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\129\\ws\\fel\\Fel.g:161:5: ( '\\'' ( EscapeSequence |~ ( '\\'' | '\\\\' ) )* '\\'' )
            // D:\\129\\ws\\fel\\Fel.g:161:9: '\\'' ( EscapeSequence |~ ( '\\'' | '\\\\' ) )* '\\''
            {
            match('\''); 

            // D:\\129\\ws\\fel\\Fel.g:161:14: ( EscapeSequence |~ ( '\\'' | '\\\\' ) )*
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( (LA24_0=='\\') ) {
                    alt24=1;
                }
                else if ( ((LA24_0 >= '\u0000' && LA24_0 <= '&')||(LA24_0 >= '(' && LA24_0 <= '[')||(LA24_0 >= ']' && LA24_0 <= '\uFFFF')) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // D:\\129\\ws\\fel\\Fel.g:161:16: EscapeSequence
            	    {
            	    mEscapeSequence(); 


            	    }
            	    break;
            	case 2 :
            	    // D:\\129\\ws\\fel\\Fel.g:161:33: ~ ( '\\'' | '\\\\' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CharacterLiteral"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\129\\ws\\fel\\Fel.g:165:5: ( '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"' )
            // D:\\129\\ws\\fel\\Fel.g:165:8: '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // D:\\129\\ws\\fel\\Fel.g:165:12: ( EscapeSequence |~ ( '\\\\' | '\"' ) )*
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='\\') ) {
                    alt25=1;
                }
                else if ( ((LA25_0 >= '\u0000' && LA25_0 <= '!')||(LA25_0 >= '#' && LA25_0 <= '[')||(LA25_0 >= ']' && LA25_0 <= '\uFFFF')) ) {
                    alt25=2;
                }


                switch (alt25) {
            	case 1 :
            	    // D:\\129\\ws\\fel\\Fel.g:165:14: EscapeSequence
            	    {
            	    mEscapeSequence(); 


            	    }
            	    break;
            	case 2 :
            	    // D:\\129\\ws\\fel\\Fel.g:165:31: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "StringLiteral"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // D:\\129\\ws\\fel\\Fel.g:172:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
            int alt26=3;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='\\') ) {
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
                    alt26=1;
                    }
                    break;
                case 'u':
                    {
                    alt26=2;
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
                    alt26=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // D:\\129\\ws\\fel\\Fel.g:172:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // D:\\129\\ws\\fel\\Fel.g:173:9: UnicodeEscape
                    {
                    mUnicodeEscape(); 


                    }
                    break;
                case 3 :
                    // D:\\129\\ws\\fel\\Fel.g:174:9: OctalEscape
                    {
                    mOctalEscape(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "OctalEscape"
    public final void mOctalEscape() throws RecognitionException {
        try {
            // D:\\129\\ws\\fel\\Fel.g:179:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\\') ) {
                int LA27_1 = input.LA(2);

                if ( ((LA27_1 >= '0' && LA27_1 <= '3')) ) {
                    int LA27_2 = input.LA(3);

                    if ( ((LA27_2 >= '0' && LA27_2 <= '7')) ) {
                        int LA27_4 = input.LA(4);

                        if ( ((LA27_4 >= '0' && LA27_4 <= '7')) ) {
                            alt27=1;
                        }
                        else {
                            alt27=2;
                        }
                    }
                    else {
                        alt27=3;
                    }
                }
                else if ( ((LA27_1 >= '4' && LA27_1 <= '7')) ) {
                    int LA27_3 = input.LA(3);

                    if ( ((LA27_3 >= '0' && LA27_3 <= '7')) ) {
                        alt27=2;
                    }
                    else {
                        alt27=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // D:\\129\\ws\\fel\\Fel.g:179:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // D:\\129\\ws\\fel\\Fel.g:180:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // D:\\129\\ws\\fel\\Fel.g:181:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OctalEscape"

    // $ANTLR start "UnicodeEscape"
    public final void mUnicodeEscape() throws RecognitionException {
        try {
            // D:\\129\\ws\\fel\\Fel.g:186:5: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // D:\\129\\ws\\fel\\Fel.g:186:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UnicodeEscape"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\129\\ws\\fel\\Fel.g:190:5: ( Letter ( Letter | JavaIDDigit )* )
            // D:\\129\\ws\\fel\\Fel.g:190:9: Letter ( Letter | JavaIDDigit )*
            {
            mLetter(); 


            // D:\\129\\ws\\fel\\Fel.g:190:16: ( Letter | JavaIDDigit )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0=='$'||(LA28_0 >= '0' && LA28_0 <= '9')||(LA28_0 >= 'A' && LA28_0 <= 'Z')||LA28_0=='_'||(LA28_0 >= 'a' && LA28_0 <= 'z')||(LA28_0 >= '\u00C0' && LA28_0 <= '\u00D6')||(LA28_0 >= '\u00D8' && LA28_0 <= '\u00F6')||(LA28_0 >= '\u00F8' && LA28_0 <= '\u1FFF')||(LA28_0 >= '\u3040' && LA28_0 <= '\u318F')||(LA28_0 >= '\u3300' && LA28_0 <= '\u337F')||(LA28_0 >= '\u3400' && LA28_0 <= '\u3D2D')||(LA28_0 >= '\u4E00' && LA28_0 <= '\u9FFF')||(LA28_0 >= '\uF900' && LA28_0 <= '\uFAFF')) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // D:\\129\\ws\\fel\\Fel.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u3040' && input.LA(1) <= '\u318F')||(input.LA(1) >= '\u3300' && input.LA(1) <= '\u337F')||(input.LA(1) >= '\u3400' && input.LA(1) <= '\u3D2D')||(input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FFF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFAFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Identifier"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // D:\\129\\ws\\fel\\Fel.g:197:5: ( '\\u0024' | '\\u0041' .. '\\u005a' | '\\u005f' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' )
            // D:\\129\\ws\\fel\\Fel.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z')||(input.LA(1) >= '\u00C0' && input.LA(1) <= '\u00D6')||(input.LA(1) >= '\u00D8' && input.LA(1) <= '\u00F6')||(input.LA(1) >= '\u00F8' && input.LA(1) <= '\u1FFF')||(input.LA(1) >= '\u3040' && input.LA(1) <= '\u318F')||(input.LA(1) >= '\u3300' && input.LA(1) <= '\u337F')||(input.LA(1) >= '\u3400' && input.LA(1) <= '\u3D2D')||(input.LA(1) >= '\u4E00' && input.LA(1) <= '\u9FFF')||(input.LA(1) >= '\uF900' && input.LA(1) <= '\uFAFF') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "JavaIDDigit"
    public final void mJavaIDDigit() throws RecognitionException {
        try {
            // D:\\129\\ws\\fel\\Fel.g:214:5: ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06f0' .. '\\u06f9' | '\\u0966' .. '\\u096f' | '\\u09e6' .. '\\u09ef' | '\\u0a66' .. '\\u0a6f' | '\\u0ae6' .. '\\u0aef' | '\\u0b66' .. '\\u0b6f' | '\\u0be7' .. '\\u0bef' | '\\u0c66' .. '\\u0c6f' | '\\u0ce6' .. '\\u0cef' | '\\u0d66' .. '\\u0d6f' | '\\u0e50' .. '\\u0e59' | '\\u0ed0' .. '\\u0ed9' | '\\u1040' .. '\\u1049' )
            // D:\\129\\ws\\fel\\Fel.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= '\u0660' && input.LA(1) <= '\u0669')||(input.LA(1) >= '\u06F0' && input.LA(1) <= '\u06F9')||(input.LA(1) >= '\u0966' && input.LA(1) <= '\u096F')||(input.LA(1) >= '\u09E6' && input.LA(1) <= '\u09EF')||(input.LA(1) >= '\u0A66' && input.LA(1) <= '\u0A6F')||(input.LA(1) >= '\u0AE6' && input.LA(1) <= '\u0AEF')||(input.LA(1) >= '\u0B66' && input.LA(1) <= '\u0B6F')||(input.LA(1) >= '\u0BE7' && input.LA(1) <= '\u0BEF')||(input.LA(1) >= '\u0C66' && input.LA(1) <= '\u0C6F')||(input.LA(1) >= '\u0CE6' && input.LA(1) <= '\u0CEF')||(input.LA(1) >= '\u0D66' && input.LA(1) <= '\u0D6F')||(input.LA(1) >= '\u0E50' && input.LA(1) <= '\u0E59')||(input.LA(1) >= '\u0ED0' && input.LA(1) <= '\u0ED9')||(input.LA(1) >= '\u1040' && input.LA(1) <= '\u1049') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "JavaIDDigit"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\129\\ws\\fel\\Fel.g:230:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // D:\\129\\ws\\fel\\Fel.g:230:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\129\\ws\\fel\\Fel.g:234:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // D:\\129\\ws\\fel\\Fel.g:234:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // D:\\129\\ws\\fel\\Fel.g:234:14: ( options {greedy=false; } : . )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0=='*') ) {
                    int LA29_1 = input.LA(2);

                    if ( (LA29_1=='/') ) {
                        alt29=2;
                    }
                    else if ( ((LA29_1 >= '\u0000' && LA29_1 <= '.')||(LA29_1 >= '0' && LA29_1 <= '\uFFFF')) ) {
                        alt29=1;
                    }


                }
                else if ( ((LA29_0 >= '\u0000' && LA29_0 <= ')')||(LA29_0 >= '+' && LA29_0 <= '\uFFFF')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // D:\\129\\ws\\fel\\Fel.g:234:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            match("*/"); 



            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\129\\ws\\fel\\Fel.g:238:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // D:\\129\\ws\\fel\\Fel.g:238:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 



            // D:\\129\\ws\\fel\\Fel.g:238:12: (~ ( '\\n' | '\\r' ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0 >= '\u0000' && LA30_0 <= '\t')||(LA30_0 >= '\u000B' && LA30_0 <= '\f')||(LA30_0 >= '\u000E' && LA30_0 <= '\uFFFF')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // D:\\129\\ws\\fel\\Fel.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            // D:\\129\\ws\\fel\\Fel.g:238:26: ( '\\r' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0=='\r') ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // D:\\129\\ws\\fel\\Fel.g:238:26: '\\r'
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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // D:\\129\\ws\\fel\\Fel.g:1:8: ( T__34 | T__35 | T__36 | Dot | Or | And | Not | Ques | Colon | Relational | Equals | Multiplicative | Additive | HexLiteral | DecimalLiteral | OctalLiteral | BooleanLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | Identifier | WS | COMMENT | LINE_COMMENT )
        int alt32=24;
        alt32 = dfa32.predict(input);
        switch (alt32) {
            case 1 :
                // D:\\129\\ws\\fel\\Fel.g:1:10: T__34
                {
                mT__34(); 


                }
                break;
            case 2 :
                // D:\\129\\ws\\fel\\Fel.g:1:16: T__35
                {
                mT__35(); 


                }
                break;
            case 3 :
                // D:\\129\\ws\\fel\\Fel.g:1:22: T__36
                {
                mT__36(); 


                }
                break;
            case 4 :
                // D:\\129\\ws\\fel\\Fel.g:1:28: Dot
                {
                mDot(); 


                }
                break;
            case 5 :
                // D:\\129\\ws\\fel\\Fel.g:1:32: Or
                {
                mOr(); 


                }
                break;
            case 6 :
                // D:\\129\\ws\\fel\\Fel.g:1:35: And
                {
                mAnd(); 


                }
                break;
            case 7 :
                // D:\\129\\ws\\fel\\Fel.g:1:39: Not
                {
                mNot(); 


                }
                break;
            case 8 :
                // D:\\129\\ws\\fel\\Fel.g:1:43: Ques
                {
                mQues(); 


                }
                break;
            case 9 :
                // D:\\129\\ws\\fel\\Fel.g:1:48: Colon
                {
                mColon(); 


                }
                break;
            case 10 :
                // D:\\129\\ws\\fel\\Fel.g:1:54: Relational
                {
                mRelational(); 


                }
                break;
            case 11 :
                // D:\\129\\ws\\fel\\Fel.g:1:65: Equals
                {
                mEquals(); 


                }
                break;
            case 12 :
                // D:\\129\\ws\\fel\\Fel.g:1:72: Multiplicative
                {
                mMultiplicative(); 


                }
                break;
            case 13 :
                // D:\\129\\ws\\fel\\Fel.g:1:87: Additive
                {
                mAdditive(); 


                }
                break;
            case 14 :
                // D:\\129\\ws\\fel\\Fel.g:1:96: HexLiteral
                {
                mHexLiteral(); 


                }
                break;
            case 15 :
                // D:\\129\\ws\\fel\\Fel.g:1:107: DecimalLiteral
                {
                mDecimalLiteral(); 


                }
                break;
            case 16 :
                // D:\\129\\ws\\fel\\Fel.g:1:122: OctalLiteral
                {
                mOctalLiteral(); 


                }
                break;
            case 17 :
                // D:\\129\\ws\\fel\\Fel.g:1:135: BooleanLiteral
                {
                mBooleanLiteral(); 


                }
                break;
            case 18 :
                // D:\\129\\ws\\fel\\Fel.g:1:150: FloatingPointLiteral
                {
                mFloatingPointLiteral(); 


                }
                break;
            case 19 :
                // D:\\129\\ws\\fel\\Fel.g:1:171: CharacterLiteral
                {
                mCharacterLiteral(); 


                }
                break;
            case 20 :
                // D:\\129\\ws\\fel\\Fel.g:1:188: StringLiteral
                {
                mStringLiteral(); 


                }
                break;
            case 21 :
                // D:\\129\\ws\\fel\\Fel.g:1:202: Identifier
                {
                mIdentifier(); 


                }
                break;
            case 22 :
                // D:\\129\\ws\\fel\\Fel.g:1:213: WS
                {
                mWS(); 


                }
                break;
            case 23 :
                // D:\\129\\ws\\fel\\Fel.g:1:216: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 24 :
                // D:\\129\\ws\\fel\\Fel.g:1:224: LINE_COMMENT
                {
                mLINE_COMMENT(); 


                }
                break;

        }

    }


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA21_eotS =
        "\6\uffff";
    static final String DFA21_eofS =
        "\6\uffff";
    static final String DFA21_minS =
        "\2\56\4\uffff";
    static final String DFA21_maxS =
        "\1\71\1\146\4\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\2\1\1\1\3\1\4";
    static final String DFA21_specialS =
        "\6\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\12\uffff\1\5\1\4\1\5\35\uffff\1\5\1\4\1\5",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "147:1: FloatingPointLiteral : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ FloatTypeSuffix );";
        }
    }
    static final String DFA32_eotS =
        "\4\uffff\1\27\2\uffff\1\31\4\uffff\1\26\1\uffff\2\35\2\24\14\uffff"+
        "\1\42\1\35\2\24\1\uffff\2\24\1\47\1\24\1\uffff\1\47";
    static final String DFA32_eofS =
        "\51\uffff";
    static final String DFA32_minS =
        "\1\11\3\uffff\1\60\2\uffff\1\75\4\uffff\1\52\1\uffff\2\56\1\162"+
        "\1\141\14\uffff\2\56\1\165\1\154\1\uffff\1\145\1\163\1\44\1\145"+
        "\1\uffff\1\44";
    static final String DFA32_maxS =
        "\1\ufaff\3\uffff\1\71\2\uffff\1\75\4\uffff\1\57\1\uffff\1\170\1"+
        "\146\1\162\1\141\14\uffff\2\146\1\165\1\154\1\uffff\1\145\1\163"+
        "\1\ufaff\1\145\1\uffff\1\ufaff";
    static final String DFA32_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\6\1\uffff\1\10\1\11\1\12\1\13"+
        "\1\uffff\1\15\4\uffff\1\23\1\24\1\25\1\26\1\14\1\4\1\22\1\7\1\27"+
        "\1\30\1\16\1\17\4\uffff\1\20\4\uffff\1\21\1\uffff";
    static final String DFA32_specialS =
        "\51\uffff}>";
    static final String[] DFA32_transitionS = {
            "\2\25\1\uffff\2\25\22\uffff\1\25\1\7\1\23\1\uffff\1\24\1\26"+
            "\1\6\1\22\1\1\1\2\1\26\1\15\1\3\1\15\1\4\1\14\1\16\11\17\1\11"+
            "\1\uffff\1\12\1\13\1\12\1\10\1\uffff\32\24\4\uffff\1\24\1\uffff"+
            "\5\24\1\21\15\24\1\20\6\24\1\uffff\1\5\103\uffff\27\24\1\uffff"+
            "\37\24\1\uffff\u1f08\24\u1040\uffff\u0150\24\u0170\uffff\u0080"+
            "\24\u0080\uffff\u092e\24\u10d2\uffff\u5200\24\u5900\uffff\u0200"+
            "\24",
            "",
            "",
            "",
            "\12\30",
            "",
            "",
            "\1\13",
            "",
            "",
            "",
            "",
            "\1\32\4\uffff\1\33",
            "",
            "\1\30\1\uffff\10\36\2\30\12\uffff\3\30\21\uffff\1\34\13\uffff"+
            "\3\30\21\uffff\1\34",
            "\1\30\1\uffff\12\37\12\uffff\3\30\35\uffff\3\30",
            "\1\40",
            "\1\41",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\30\1\uffff\10\36\2\30\12\uffff\3\30\35\uffff\3\30",
            "\1\30\1\uffff\12\37\12\uffff\3\30\35\uffff\3\30",
            "\1\43",
            "\1\44",
            "",
            "\1\45",
            "\1\46",
            "\1\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u1f08\24\u1040\uffff"+
            "\u0150\24\u0170\uffff\u0080\24\u0080\uffff\u092e\24\u10d2\uffff"+
            "\u5200\24\u5900\uffff\u0200\24",
            "\1\50",
            "",
            "\1\24\13\uffff\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32"+
            "\24\105\uffff\27\24\1\uffff\37\24\1\uffff\u1f08\24\u1040\uffff"+
            "\u0150\24\u0170\uffff\u0080\24\u0080\uffff\u092e\24\u10d2\uffff"+
            "\u5200\24\u5900\uffff\u0200\24"
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__34 | T__35 | T__36 | Dot | Or | And | Not | Ques | Colon | Relational | Equals | Multiplicative | Additive | HexLiteral | DecimalLiteral | OctalLiteral | BooleanLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | Identifier | WS | COMMENT | LINE_COMMENT );";
        }
    }
 

}