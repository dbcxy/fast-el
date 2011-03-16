package com.greenpineyu.fel.parser;

// $ANTLR 3.3 Nov 30, 2010 12:45:30 Fel.g 2011-03-16 09:26:30

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
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int Logical=4;
    public static final int Equals=5;
    public static final int Relational=6;
    public static final int Additive=7;
    public static final int Multiplicative=8;
    public static final int Identifier=9;
    public static final int Dot=10;
    public static final int FloatingPointLiteral=11;
    public static final int CharacterLiteral=12;
    public static final int StringLiteral=13;
    public static final int BooleanLiteral=14;
    public static final int HexLiteral=15;
    public static final int OctalLiteral=16;
    public static final int DecimalLiteral=17;
    public static final int HexDigit=18;
    public static final int IntegerTypeSuffix=19;
    public static final int Exponent=20;
    public static final int FloatTypeSuffix=21;
    public static final int EscapeSequence=22;
    public static final int UnicodeEscape=23;
    public static final int OctalEscape=24;
    public static final int Letter=25;
    public static final int JavaIDDigit=26;
    public static final int WS=27;
    public static final int COMMENT=28;
    public static final int LINE_COMMENT=29;

    // delegates
    // delegators

    public FelLexer() {;} 
    public FelLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public FelLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }

	public String getGrammarFileName() {
		return "Fel.g";
	}

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// Fel.g:7:7: ( '(' )
			// Fel.g:7:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// Fel.g:8:7: ( ')' )
			// Fel.g:8:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// Fel.g:9:7: ( ',' )
			// Fel.g:9:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "Dot"
    public final void mDot() throws RecognitionException {
        try {
            int _type = Dot;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// Fel.g:96:5: ( '.' )
			// Fel.g:96:7: '.'
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

    // $ANTLR start "Logical"
    public final void mLogical() throws RecognitionException {
        try {
            int _type = Logical;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// Fel.g:98:9: ( '&&' | '||' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='&') ) {
                alt1=1;
            }
            else if ( (LA1_0=='|') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
					// Fel.g:98:10: '&&'
                    {
                    match("&&"); 


                    }
                    break;
                case 2 :
					// Fel.g:98:15: '||'
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
			// Fel.g:100:12: ( '>' | '<' | '<=' | '>=' )
            int alt2=4;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='>') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='=') ) {
                    alt2=4;
                }
                else {
                    alt2=1;}
            }
            else if ( (LA2_0=='<') ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2=='=') ) {
                    alt2=3;
                }
                else {
                    alt2=2;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
					// Fel.g:100:14: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
					// Fel.g:100:18: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
					// Fel.g:100:22: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 4 :
					// Fel.g:100:27: '>='
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
			// Fel.g:102:8: ( '==' | '!=' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='=') ) {
                alt3=1;
            }
            else if ( (LA3_0=='!') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
					// Fel.g:102:10: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 2 :
					// Fel.g:102:15: '!='
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
			// Fel.g:104:16: ( '*' | '/' | '%' )
			// Fel.g:
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
			// Fel.g:106:10: ( ( '+' | '-' ) )
			// Fel.g:106:12: ( '+' | '-' )
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
			// Fel.g:108:12: ( '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )? )
			// Fel.g:108:14: '0' ( 'x' | 'X' ) ( HexDigit )+ ( IntegerTypeSuffix )?
            {
            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

				// Fel.g:108:28: ( HexDigit )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='F')||(LA4_0>='a' && LA4_0<='f')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
							// Fel.g:108:28: HexDigit
            	    {
            	    mHexDigit(); 

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

				// Fel.g:108:38: ( IntegerTypeSuffix )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='L'||LA5_0=='l') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
						// Fel.g:108:38: IntegerTypeSuffix
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
			// Fel.g:110:16: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )? )
			// Fel.g:110:18: ( '0' | '1' .. '9' ( '0' .. '9' )* ) ( IntegerTypeSuffix )?
            {
				// Fel.g:110:18: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='0') ) {
                alt7=1;
            }
            else if ( ((LA7_0>='1' && LA7_0<='9')) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
						// Fel.g:110:19: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
						// Fel.g:110:25: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
						// Fel.g:110:34: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
									// Fel.g:110:34: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

				// Fel.g:110:45: ( IntegerTypeSuffix )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='L'||LA8_0=='l') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
						// Fel.g:110:45: IntegerTypeSuffix
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
			// Fel.g:112:14: ( '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )? )
			// Fel.g:112:16: '0' ( '0' .. '7' )+ ( IntegerTypeSuffix )?
            {
            match('0'); 
				// Fel.g:112:20: ( '0' .. '7' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='7')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
							// Fel.g:112:21: '0' .. '7'
            	    {
            	    matchRange('0','7'); 

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

				// Fel.g:112:32: ( IntegerTypeSuffix )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='L'||LA10_0=='l') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
						// Fel.g:112:32: IntegerTypeSuffix
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
			// Fel.g:115:5: ( 'true' | 'false' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='t') ) {
                alt11=1;
            }
            else if ( (LA11_0=='f') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
					// Fel.g:115:9: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
					// Fel.g:116:9: 'false'
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
			// Fel.g:120:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// Fel.g:120:12: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
			// Fel.g:123:19: ( ( 'l' | 'L' ) )
			// Fel.g:123:21: ( 'l' | 'L' )
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
			// Fel.g:126:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ FloatTypeSuffix )
            int alt22=4;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
					// Fel.g:126:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )?
                    {
					// Fel.g:126:9: ( '0' .. '9' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
								// Fel.g:126:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    match('.'); 
					// Fel.g:126:25: ( '0' .. '9' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
								// Fel.g:126:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

					// Fel.g:126:37: ( Exponent )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='E'||LA14_0=='e') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
							// Fel.g:126:37: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }

					// Fel.g:126:47: ( FloatTypeSuffix )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='D'||LA15_0=='F'||LA15_0=='d'||LA15_0=='f') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
							// Fel.g:126:47: FloatTypeSuffix
                            {
                            mFloatTypeSuffix(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
					// Fel.g:127:9: '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )?
                    {
                    match('.'); 
					// Fel.g:127:13: ( '0' .. '9' )+
                    int cnt16=0;
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
								// Fel.g:127:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt16 >= 1 ) break loop16;
                                EarlyExitException eee =
                                    new EarlyExitException(16, input);
                                throw eee;
                        }
                        cnt16++;
                    } while (true);

					// Fel.g:127:25: ( Exponent )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='E'||LA17_0=='e') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
							// Fel.g:127:25: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }

					// Fel.g:127:35: ( FloatTypeSuffix )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='D'||LA18_0=='F'||LA18_0=='d'||LA18_0=='f') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
							// Fel.g:127:35: FloatTypeSuffix
                            {
                            mFloatTypeSuffix(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
					// Fel.g:128:9: ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )?
                    {
					// Fel.g:128:9: ( '0' .. '9' )+
                    int cnt19=0;
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
								// Fel.g:128:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt19 >= 1 ) break loop19;
                                EarlyExitException eee =
                                    new EarlyExitException(19, input);
                                throw eee;
                        }
                        cnt19++;
                    } while (true);

                    mExponent(); 
					// Fel.g:128:30: ( FloatTypeSuffix )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='D'||LA20_0=='F'||LA20_0=='d'||LA20_0=='f') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
							// Fel.g:128:30: FloatTypeSuffix
                            {
                            mFloatTypeSuffix(); 

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
					// Fel.g:129:9: ( '0' .. '9' )+ FloatTypeSuffix
                    {
					// Fel.g:129:9: ( '0' .. '9' )+
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
								// Fel.g:129:10: '0' .. '9'
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
			// Fel.g:133:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// Fel.g:133:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

				// Fel.g:133:22: ( '+' | '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='+'||LA23_0=='-') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
						// Fel.g:
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

				// Fel.g:133:33: ( '0' .. '9' )+
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
							// Fel.g:133:34: '0' .. '9'
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


            }

        }
        finally {
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "FloatTypeSuffix"
    public final void mFloatTypeSuffix() throws RecognitionException {
        try {
			// Fel.g:136:17: ( ( 'f' | 'F' | 'd' | 'D' ) )
			// Fel.g:136:19: ( 'f' | 'F' | 'd' | 'D' )
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
			// Fel.g:139:5: ( '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\'' )
			// Fel.g:139:9: '\\'' ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )* '\\''
            {
            match('\''); 
				// Fel.g:139:14: ( EscapeSequence | ~ ( '\\'' | '\\\\' ) )*
            loop25:
            do {
                int alt25=3;
                int LA25_0 = input.LA(1);

                if ( (LA25_0=='\\') ) {
                    alt25=1;
                }
                else if ( ((LA25_0>='\u0000' && LA25_0<='&')||(LA25_0>='(' && LA25_0<='[')||(LA25_0>=']' && LA25_0<='\uFFFF')) ) {
                    alt25=2;
                }


                switch (alt25) {
            	case 1 :
							// Fel.g:139:16: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
							// Fel.g:139:33: ~ ( '\\'' | '\\\\' )
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
            	    break loop25;
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
			// Fel.g:143:5: ( '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"' )
			// Fel.g:143:8: '\"' ( EscapeSequence | ~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
				// Fel.g:143:12: ( EscapeSequence | ~ ( '\\\\' | '\"' ) )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( (LA26_0=='\\') ) {
                    alt26=1;
                }
                else if ( ((LA26_0>='\u0000' && LA26_0<='!')||(LA26_0>='#' && LA26_0<='[')||(LA26_0>=']' && LA26_0<='\uFFFF')) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
							// Fel.g:143:14: EscapeSequence
            	    {
            	    mEscapeSequence(); 

            	    }
            	    break;
            	case 2 :
							// Fel.g:143:31: ~ ( '\\\\' | '\"' )
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
            	    break loop26;
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
			// Fel.g:149:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UnicodeEscape | OctalEscape )
            int alt27=3;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='\\') ) {
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
                    alt27=1;
                    }
                    break;
                case 'u':
                    {
                    alt27=2;
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
                    alt27=3;
                    }
                    break;
                default:
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
					// Fel.g:149:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
					// Fel.g:150:9: UnicodeEscape
                    {
                    mUnicodeEscape(); 

                    }
                    break;
                case 3 :
					// Fel.g:151:9: OctalEscape
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
			// Fel.g:156:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='\\') ) {
                int LA28_1 = input.LA(2);

                if ( ((LA28_1>='0' && LA28_1<='3')) ) {
                    int LA28_2 = input.LA(3);

                    if ( ((LA28_2>='0' && LA28_2<='7')) ) {
                        int LA28_4 = input.LA(4);

                        if ( ((LA28_4>='0' && LA28_4<='7')) ) {
                            alt28=1;
                        }
                        else {
                            alt28=2;}
                    }
                    else {
                        alt28=3;}
                }
                else if ( ((LA28_1>='4' && LA28_1<='7')) ) {
                    int LA28_3 = input.LA(3);

                    if ( ((LA28_3>='0' && LA28_3<='7')) ) {
                        alt28=2;
                    }
                    else {
                        alt28=3;}
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
					// Fel.g:156:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
					// Fel.g:156:14: ( '0' .. '3' )
					// Fel.g:156:15: '0' .. '3'
                    {
                    matchRange('0','3'); 

                    }

					// Fel.g:156:25: ( '0' .. '7' )
					// Fel.g:156:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

					// Fel.g:156:36: ( '0' .. '7' )
					// Fel.g:156:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 2 :
					// Fel.g:157:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 
					// Fel.g:157:14: ( '0' .. '7' )
					// Fel.g:157:15: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }

					// Fel.g:157:25: ( '0' .. '7' )
					// Fel.g:157:26: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }


                    }
                    break;
                case 3 :
					// Fel.g:158:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 
					// Fel.g:158:14: ( '0' .. '7' )
					// Fel.g:158:15: '0' .. '7'
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
			// Fel.g:163:5: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
			// Fel.g:163:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
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
			// Fel.g:168:5: ( Letter ( Letter | JavaIDDigit )* )
			// Fel.g:168:9: Letter ( Letter | JavaIDDigit )*
            {
            mLetter(); 
				// Fel.g:168:16: ( Letter | JavaIDDigit )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0=='$'||(LA29_0>='0' && LA29_0<='9')||(LA29_0>='A' && LA29_0<='Z')||LA29_0=='_'||(LA29_0>='a' && LA29_0<='z')||(LA29_0>='\u00C0' && LA29_0<='\u00D6')||(LA29_0>='\u00D8' && LA29_0<='\u00F6')||(LA29_0>='\u00F8' && LA29_0<='\u1FFF')||(LA29_0>='\u3040' && LA29_0<='\u318F')||(LA29_0>='\u3300' && LA29_0<='\u337F')||(LA29_0>='\u3400' && LA29_0<='\u3D2D')||(LA29_0>='\u4E00' && LA29_0<='\u9FFF')||(LA29_0>='\uF900' && LA29_0<='\uFAFF')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
							// Fel.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u3040' && input.LA(1)<='\u318F')||(input.LA(1)>='\u3300' && input.LA(1)<='\u337F')||(input.LA(1)>='\u3400' && input.LA(1)<='\u3D2D')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FFF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFAFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop29;
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
			// Fel.g:174:5: ( '\\u0024' | '\\u0041' .. '\\u005a' | '\\u005f' | '\\u0061' .. '\\u007a' | '\\u00c0' .. '\\u00d6' | '\\u00d8' .. '\\u00f6' | '\\u00f8' .. '\\u00ff' | '\\u0100' .. '\\u1fff' | '\\u3040' .. '\\u318f' | '\\u3300' .. '\\u337f' | '\\u3400' .. '\\u3d2d' | '\\u4e00' .. '\\u9fff' | '\\uf900' .. '\\ufaff' )
			// Fel.g:
            {
            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u3040' && input.LA(1)<='\u318F')||(input.LA(1)>='\u3300' && input.LA(1)<='\u337F')||(input.LA(1)>='\u3400' && input.LA(1)<='\u3D2D')||(input.LA(1)>='\u4E00' && input.LA(1)<='\u9FFF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFAFF') ) {
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
			// Fel.g:191:5: ( '\\u0030' .. '\\u0039' | '\\u0660' .. '\\u0669' | '\\u06f0' .. '\\u06f9' | '\\u0966' .. '\\u096f' | '\\u09e6' .. '\\u09ef' | '\\u0a66' .. '\\u0a6f' | '\\u0ae6' .. '\\u0aef' | '\\u0b66' .. '\\u0b6f' | '\\u0be7' .. '\\u0bef' | '\\u0c66' .. '\\u0c6f' | '\\u0ce6' .. '\\u0cef' | '\\u0d66' .. '\\u0d6f' | '\\u0e50' .. '\\u0e59' | '\\u0ed0' .. '\\u0ed9' | '\\u1040' .. '\\u1049' )
			// Fel.g:
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
			// Fel.g:208:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
			// Fel.g:208:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
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
			// Fel.g:212:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// Fel.g:212:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

				// Fel.g:212:14: ( options {greedy=false; } : . )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0=='*') ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1=='/') ) {
                        alt30=2;
                    }
                    else if ( ((LA30_1>='\u0000' && LA30_1<='.')||(LA30_1>='0' && LA30_1<='\uFFFF')) ) {
                        alt30=1;
                    }


                }
                else if ( ((LA30_0>='\u0000' && LA30_0<=')')||(LA30_0>='+' && LA30_0<='\uFFFF')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
							// Fel.g:212:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop30;
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
			// Fel.g:216:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// Fel.g:216:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

				// Fel.g:216:12: (~ ( '\\n' | '\\r' ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>='\u0000' && LA31_0<='\t')||(LA31_0>='\u000B' && LA31_0<='\f')||(LA31_0>='\u000E' && LA31_0<='\uFFFF')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
							// Fel.g:216:12: ~ ( '\\n' | '\\r' )
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
            	    break loop31;
                }
            } while (true);

				// Fel.g:216:26: ( '\\r' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='\r') ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
						// Fel.g:216:26: '\\r'
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
		// Fel.g:1:8: ( T__30 | T__31 | T__32 | Dot | Logical | Relational | Equals | Multiplicative | Additive | HexLiteral | DecimalLiteral | OctalLiteral | BooleanLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | Identifier | WS | COMMENT | LINE_COMMENT )
        int alt33=20;
        alt33 = dfa33.predict(input);
        switch (alt33) {
            case 1 :
				// Fel.g:1:10: T__30
                {
                mT__30(); 

                }
                break;
            case 2 :
				// Fel.g:1:16: T__31
                {
                mT__31(); 

                }
                break;
            case 3 :
				// Fel.g:1:22: T__32
                {
                mT__32(); 

                }
                break;
            case 4 :
				// Fel.g:1:28: Dot
                {
                mDot(); 

                }
                break;
            case 5 :
				// Fel.g:1:32: Logical
                {
                mLogical(); 

                }
                break;
            case 6 :
				// Fel.g:1:40: Relational
                {
                mRelational(); 

                }
                break;
            case 7 :
				// Fel.g:1:51: Equals
                {
                mEquals(); 

                }
                break;
            case 8 :
				// Fel.g:1:58: Multiplicative
                {
                mMultiplicative(); 

                }
                break;
            case 9 :
				// Fel.g:1:73: Additive
                {
                mAdditive(); 

                }
                break;
            case 10 :
				// Fel.g:1:82: HexLiteral
                {
                mHexLiteral(); 

                }
                break;
            case 11 :
				// Fel.g:1:93: DecimalLiteral
                {
                mDecimalLiteral(); 

                }
                break;
            case 12 :
				// Fel.g:1:108: OctalLiteral
                {
                mOctalLiteral(); 

                }
                break;
            case 13 :
				// Fel.g:1:121: BooleanLiteral
                {
                mBooleanLiteral(); 

                }
                break;
            case 14 :
				// Fel.g:1:136: FloatingPointLiteral
                {
                mFloatingPointLiteral(); 

                }
                break;
            case 15 :
				// Fel.g:1:157: CharacterLiteral
                {
                mCharacterLiteral(); 

                }
                break;
            case 16 :
				// Fel.g:1:174: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 17 :
				// Fel.g:1:188: Identifier
                {
                mIdentifier(); 

                }
                break;
            case 18 :
				// Fel.g:1:199: WS
                {
                mWS(); 

                }
                break;
            case 19 :
				// Fel.g:1:202: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 20 :
				// Fel.g:1:210: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    protected DFA33 dfa33 = new DFA33(this);
    static final String DFA22_eotS =
        "\6\uffff";
    static final String DFA22_eofS =
        "\6\uffff";
    static final String DFA22_minS =
        "\2\56\4\uffff";
    static final String DFA22_maxS =
        "\1\71\1\146\4\uffff";
    static final String DFA22_acceptS =
        "\2\uffff\1\2\1\1\1\3\1\4";
    static final String DFA22_specialS =
        "\6\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\12\uffff\1\5\1\4\1\5\35\uffff\1\5\1\4\1"+
            "\5",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "125:1: FloatingPointLiteral : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? ( FloatTypeSuffix )? | '.' ( '0' .. '9' )+ ( Exponent )? ( FloatTypeSuffix )? | ( '0' .. '9' )+ Exponent ( FloatTypeSuffix )? | ( '0' .. '9' )+ FloatTypeSuffix );";
        }
    }
    static final String DFA33_eotS =
        "\4\uffff\1\23\3\uffff\1\22\1\uffff\2\30\2\20\13\uffff\1\35\1\30"+
        "\2\20\1\uffff\2\20\1\42\1\20\1\uffff\1\42";
    static final String DFA33_eofS =
        "\44\uffff";
    static final String DFA33_minS =
        "\1\11\3\uffff\1\60\3\uffff\1\52\1\uffff\2\56\1\162\1\141\13\uffff"+
        "\2\56\1\165\1\154\1\uffff\1\145\1\163\1\44\1\145\1\uffff\1\44";
    static final String DFA33_maxS =
        "\1\ufaff\3\uffff\1\71\3\uffff\1\57\1\uffff\1\170\1\146\1\162\1"+
        "\141\13\uffff\2\146\1\165\1\154\1\uffff\1\145\1\163\1\ufaff\1\145"+
        "\1\uffff\1\ufaff";
    static final String DFA33_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\5\1\6\1\7\1\uffff\1\11\4\uffff\1"+
        "\17\1\20\1\21\1\22\1\10\1\4\1\16\1\23\1\24\1\12\1\13\4\uffff\1\14"+
        "\4\uffff\1\15\1\uffff";
    static final String DFA33_specialS =
        "\44\uffff}>";
    static final String[] DFA33_transitionS = {
            "\2\21\1\uffff\2\21\22\uffff\1\21\1\7\1\17\1\uffff\1\20\1\22"+
            "\1\5\1\16\1\1\1\2\1\22\1\11\1\3\1\11\1\4\1\10\1\12\11\13\2\uffff"+
            "\1\6\1\7\1\6\2\uffff\32\20\4\uffff\1\20\1\uffff\5\20\1\15\15"+
            "\20\1\14\6\20\1\uffff\1\5\103\uffff\27\20\1\uffff\37\20\1\uffff"+
            "\u1f08\20\u1040\uffff\u0150\20\u0170\uffff\u0080\20\u0080\uffff"+
            "\u092e\20\u10d2\uffff\u5200\20\u5900\uffff\u0200\20",
            "",
            "",
            "",
            "\12\24",
            "",
            "",
            "",
            "\1\25\4\uffff\1\26",
            "",
            "\1\24\1\uffff\10\31\2\24\12\uffff\3\24\21\uffff\1\27\13\uffff"+
            "\3\24\21\uffff\1\27",
            "\1\24\1\uffff\12\32\12\uffff\3\24\35\uffff\3\24",
            "\1\33",
            "\1\34",
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
            "\1\24\1\uffff\10\31\2\24\12\uffff\3\24\35\uffff\3\24",
            "\1\24\1\uffff\12\32\12\uffff\3\24\35\uffff\3\24",
            "\1\36",
            "\1\37",
            "",
            "\1\40",
            "\1\41",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20\105\uffff\27\20\1\uffff\37\20\1\uffff\u1f08\20\u1040\uffff"+
            "\u0150\20\u0170\uffff\u0080\20\u0080\uffff\u092e\20\u10d2\uffff"+
            "\u5200\20\u5900\uffff\u0200\20",
            "\1\43",
            "",
            "\1\20\13\uffff\12\20\7\uffff\32\20\4\uffff\1\20\1\uffff\32"+
            "\20\105\uffff\27\20\1\uffff\37\20\1\uffff\u1f08\20\u1040\uffff"+
            "\u0150\20\u0170\uffff\u0080\20\u0080\uffff\u092e\20\u10d2\uffff"+
            "\u5200\20\u5900\uffff\u0200\20"
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__30 | T__31 | T__32 | Dot | Logical | Relational | Equals | Multiplicative | Additive | HexLiteral | DecimalLiteral | OctalLiteral | BooleanLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | Identifier | WS | COMMENT | LINE_COMMENT );";
        }
    }
 

}