// $ANTLR 3.4 E:\\workspace\\Fel\\Fel.g 2012-03-20 19:16:23

package com.greenpineyu.fel.parser;
import java.util.HashMap;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;
import org.antlr.runtime.tree.TreeAdaptor;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class FelParser extends org.antlr.runtime.Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Additive", "And", "BooleanLiteral", "COMMENT", "CharacterLiteral", "Colon", "DecimalLiteral", "Dot", "Equals", "EscapeSequence", "Exponent", "FloatTypeSuffix", "FloatingPointLiteral", "HexDigit", "HexLiteral", "Identifier", "IntegerTypeSuffix", "JavaIDDigit", "LINE_COMMENT", "Letter", "Multiplicative", "Not", "OctalEscape", "OctalLiteral", "Or", "Ques", "Relational", "StringLiteral", "UnicodeEscape", "WS", "'('", "')'", "','"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public FelParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public FelParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
		this.state.ruleMemo = new HashMap[46 + 1];
         

    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return FelParser.tokenNames; }
    public String getGrammarFileName() { return "E:\\workspace\\Fel\\Fel.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
	// E:\\workspace\\Fel\\Fel.g:18:1: program : conditionalExpression ;
    public final FelParser.program_return program() throws RecognitionException {
        FelParser.program_return retval = new FelParser.program_return();
        retval.start = input.LT(1);

        int program_StartIndex = input.index();

        CommonTree root_0 = null;

        FelParser.conditionalExpression_return conditionalExpression1 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:18:9: ( conditionalExpression )
			// E:\\workspace\\Fel\\Fel.g:18:11: conditionalExpression
            {
            root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_conditionalExpression_in_program67);
            conditionalExpression1=conditionalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression1.getTree());

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 1, program_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "program"


    public static class parExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parExpression"
	// E:\\workspace\\Fel\\Fel.g:20:1: parExpression : '(' ! expressionList ')'
	// !;
    public final FelParser.parExpression_return parExpression() throws RecognitionException {
        FelParser.parExpression_return retval = new FelParser.parExpression_return();
        retval.start = input.LT(1);

        int parExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal2=null;
        Token char_literal4=null;
        FelParser.expressionList_return expressionList3 =null;


        CommonTree char_literal2_tree=null;
        CommonTree char_literal4_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:21:5: ( '(' ! expressionList ')' !)
			// E:\\workspace\\Fel\\Fel.g:21:9: '(' ! expressionList ')' !
            {
            root_0 = (CommonTree)adaptor.nil();


				char_literal2 = (Token) match(input, 34, FOLLOW_34_in_parExpression82);
				if (state.failed)
					return retval;

            pushFollow(FOLLOW_expressionList_in_parExpression85);
            expressionList3=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList3.getTree());

				char_literal4 = (Token) match(input, 35, FOLLOW_35_in_parExpression87);
				if (state.failed)
					return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 2, parExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "parExpression"


    public static class expressionList_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressionList"
	// E:\\workspace\\Fel\\Fel.g:24:1: expressionList : ( conditionalExpression
	// )? ( ',' ! ( conditionalExpression )? )* ;
    public final FelParser.expressionList_return expressionList() throws RecognitionException {
        FelParser.expressionList_return retval = new FelParser.expressionList_return();
        retval.start = input.LT(1);

        int expressionList_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal6=null;
        FelParser.conditionalExpression_return conditionalExpression5 =null;

        FelParser.conditionalExpression_return conditionalExpression7 =null;


        CommonTree char_literal6_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:25:5: ( ( conditionalExpression )? (
			// ',' ! ( conditionalExpression )? )* )
			// E:\\workspace\\Fel\\Fel.g:25:9: ( conditionalExpression )? ( ','
			// ! ( conditionalExpression )? )*
            {
            root_0 = (CommonTree)adaptor.nil();


				// E:\\workspace\\Fel\\Fel.g:25:9: ( conditionalExpression )?
            int alt1=2;
				int LA1_0 = input.LA(1);

            if ((LA1_0 == Additive || LA1_0 == BooleanLiteral || LA1_0 == CharacterLiteral
						|| LA1_0 == DecimalLiteral || LA1_0 == FloatingPointLiteral
						|| (LA1_0 >= HexLiteral && LA1_0 <= Identifier) || LA1_0 == Not || LA1_0 == OctalLiteral
						|| LA1_0 == StringLiteral || LA1_0 == 34)) {
					alt1 = 1;
            }
            switch (alt1) {
                case 1 :
					// E:\\workspace\\Fel\\Fel.g:25:9: conditionalExpression
                    {
					pushFollow(FOLLOW_conditionalExpression_in_expressionList107);
                    conditionalExpression5=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression5.getTree());

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                	if(conditionalExpression5 == null){
						root_0.addChild(com.greenpineyu.fel.parser.AbstFelNode.NULL_NODE);
                	}
                }

				// E:\\workspace\\Fel\\Fel.g:31:4: ( ',' ! (
				// conditionalExpression )? )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==36) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
						// E:\\workspace\\Fel\\Fel.g:31:5: ',' ! (
						// conditionalExpression )?
            	    {
						char_literal6 = (Token) match(input, 36, FOLLOW_36_in_expressionList121);
						if (state.failed)
							return retval;

            	    // E:\\workspace\\Fel\\Fel.g:31:10: (
						// conditionalExpression )?
            	    int alt2=2;
						int LA2_0 = input.LA(1);

            	    if ((LA2_0 == Additive || LA2_0 == BooleanLiteral || LA2_0 == CharacterLiteral
								|| LA2_0 == DecimalLiteral || LA2_0 == FloatingPointLiteral
								|| (LA2_0 >= HexLiteral && LA2_0 <= Identifier) || LA2_0 == Not
								|| LA2_0 == OctalLiteral || LA2_0 == StringLiteral || LA2_0 == 34)) {
							alt2 = 1;
            	    }
            	    switch (alt2) {
            	        case 1 :
							// E:\\workspace\\Fel\\Fel.g:31:10:
							// conditionalExpression
            	            {
							pushFollow(FOLLOW_conditionalExpression_in_expressionList124);
            	            conditionalExpression7=conditionalExpression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression7.getTree());

            	            }
            	            break;

            	    }


            	    if ( state.backtracking==0 ) {
            	          	if(conditionalExpression7 == null){
								root_0.addChild(com.greenpineyu.fel.parser.AbstFelNode.NULL_NODE);
            	        	}else{
            	        	   conditionalExpression7= null;
            	        	}
            	        }

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 3, expressionList_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "expressionList"


    public static class conditionalExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalExpression"
	// E:\\workspace\\Fel\\Fel.g:42:1: conditionalExpression :
	// conditionalOrExpression ( Ques ^ conditionalExpression Colon !
	// conditionalExpression )? ;
    public final FelParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        FelParser.conditionalExpression_return retval = new FelParser.conditionalExpression_return();
        retval.start = input.LT(1);

        int conditionalExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Ques9=null;
        Token Colon11=null;
        FelParser.conditionalOrExpression_return conditionalOrExpression8 =null;

        FelParser.conditionalExpression_return conditionalExpression10 =null;

        FelParser.conditionalExpression_return conditionalExpression12 =null;


        CommonTree Ques9_tree=null;
        CommonTree Colon11_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:43:5: ( conditionalOrExpression ( Ques
			// ^ conditionalExpression Colon ! conditionalExpression )? )
			// E:\\workspace\\Fel\\Fel.g:43:9: conditionalOrExpression ( Ques ^
			// conditionalExpression Colon ! conditionalExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression166);
            conditionalOrExpression8=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpression8.getTree());

				// E:\\workspace\\Fel\\Fel.g:43:33: ( Ques ^
				// conditionalExpression Colon ! conditionalExpression )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Ques) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
					// E:\\workspace\\Fel\\Fel.g:43:35: Ques ^
					// conditionalExpression Colon ! conditionalExpression
                    {
					Ques9 = (Token) match(input, Ques, FOLLOW_Ques_in_conditionalExpression170);
					if (state.failed)
						return retval;
                    if ( state.backtracking==0 ) {
                    Ques9_tree = 
                    (CommonTree)adaptor.create(Ques9)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Ques9_tree, root_0);
                    }

					pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression173);
                    conditionalExpression10=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression10.getTree());

					Colon11 = (Token) match(input, Colon, FOLLOW_Colon_in_conditionalExpression175);
					if (state.failed)
						return retval;

                    pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression178);
                    conditionalExpression12=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression12.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 4, conditionalExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "conditionalExpression"


    public static class conditionalOrExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalOrExpression"
	// E:\\workspace\\Fel\\Fel.g:45:1: conditionalOrExpression :
	// conditionalAndExpression ( Or ^ conditionalAndExpression )* ;
    public final FelParser.conditionalOrExpression_return conditionalOrExpression() throws RecognitionException {
        FelParser.conditionalOrExpression_return retval = new FelParser.conditionalOrExpression_return();
        retval.start = input.LT(1);

        int conditionalOrExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Or14=null;
        FelParser.conditionalAndExpression_return conditionalAndExpression13 =null;

        FelParser.conditionalAndExpression_return conditionalAndExpression15 =null;


        CommonTree Or14_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:46:2: ( conditionalAndExpression ( Or ^
			// conditionalAndExpression )* )
			// E:\\workspace\\Fel\\Fel.g:46:4: conditionalAndExpression ( Or ^
			// conditionalAndExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression194);
            conditionalAndExpression13=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression13.getTree());

				// E:\\workspace\\Fel\\Fel.g:46:29: ( Or ^
				// conditionalAndExpression )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Or) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
						// E:\\workspace\\Fel\\Fel.g:46:30: Or ^
						// conditionalAndExpression
            	    {
						Or14 = (Token) match(input, Or, FOLLOW_Or_in_conditionalOrExpression197);
						if (state.failed)
							return retval;
            	    if ( state.backtracking==0 ) {
            	    Or14_tree = 
            	    (CommonTree)adaptor.create(Or14)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Or14_tree, root_0);
            	    }

						pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression200);
            	    conditionalAndExpression15=conditionalAndExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression15.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 5, conditionalOrExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "conditionalOrExpression"


    public static class conditionalAndExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "conditionalAndExpression"
	// E:\\workspace\\Fel\\Fel.g:49:1: conditionalAndExpression :
	// equalityExpression ( And ^ equalityExpression )* ;
    public final FelParser.conditionalAndExpression_return conditionalAndExpression() throws RecognitionException {
        FelParser.conditionalAndExpression_return retval = new FelParser.conditionalAndExpression_return();
        retval.start = input.LT(1);

        int conditionalAndExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token And17=null;
        FelParser.equalityExpression_return equalityExpression16 =null;

        FelParser.equalityExpression_return equalityExpression18 =null;


        CommonTree And17_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:50:2: ( equalityExpression ( And ^
			// equalityExpression )* )
			// E:\\workspace\\Fel\\Fel.g:50:4: equalityExpression ( And ^
			// equalityExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression214);
            equalityExpression16=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression16.getTree());

				// E:\\workspace\\Fel\\Fel.g:50:23: ( And ^ equalityExpression
				// )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==And) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
						// E:\\workspace\\Fel\\Fel.g:50:24: And ^
						// equalityExpression
            	    {
						And17 = (Token) match(input, And, FOLLOW_And_in_conditionalAndExpression217);
						if (state.failed)
							return retval;
            	    if ( state.backtracking==0 ) {
            	    And17_tree = 
            	    (CommonTree)adaptor.create(And17)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(And17_tree, root_0);
            	    }

						pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression220);
            	    equalityExpression18=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression18.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 6, conditionalAndExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "conditionalAndExpression"


    public static class equalityExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "equalityExpression"
	// E:\\workspace\\Fel\\Fel.g:53:1: equalityExpression : relationalExpression
	// ( Equals ^ relationalExpression )* ;
    public final FelParser.equalityExpression_return equalityExpression() throws RecognitionException {
        FelParser.equalityExpression_return retval = new FelParser.equalityExpression_return();
        retval.start = input.LT(1);

        int equalityExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Equals20=null;
        FelParser.relationalExpression_return relationalExpression19 =null;

        FelParser.relationalExpression_return relationalExpression21 =null;


        CommonTree Equals20_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:54:5: ( relationalExpression ( Equals ^
			// relationalExpression )* )
			// E:\\workspace\\Fel\\Fel.g:54:9: relationalExpression ( Equals ^
			// relationalExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_relationalExpression_in_equalityExpression238);
            relationalExpression19=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression19.getTree());

				// E:\\workspace\\Fel\\Fel.g:54:30: ( Equals ^
				// relationalExpression )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Equals) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
						// E:\\workspace\\Fel\\Fel.g:54:32: Equals ^
						// relationalExpression
            	    {
						Equals20 = (Token) match(input, Equals, FOLLOW_Equals_in_equalityExpression242);
						if (state.failed)
							return retval;
            	    if ( state.backtracking==0 ) {
            	    Equals20_tree = 
            	    (CommonTree)adaptor.create(Equals20)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Equals20_tree, root_0);
            	    }

						pushFollow(FOLLOW_relationalExpression_in_equalityExpression245);
            	    relationalExpression21=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression21.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 7, equalityExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "equalityExpression"


    public static class relationalExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relationalExpression"
	// E:\\workspace\\Fel\\Fel.g:57:1: relationalExpression : additiveExpression
	// ( Relational ^ additiveExpression )* ;
    public final FelParser.relationalExpression_return relationalExpression() throws RecognitionException {
        FelParser.relationalExpression_return retval = new FelParser.relationalExpression_return();
        retval.start = input.LT(1);

        int relationalExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Relational23=null;
        FelParser.additiveExpression_return additiveExpression22 =null;

        FelParser.additiveExpression_return additiveExpression24 =null;


        CommonTree Relational23_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:58:5: ( additiveExpression ( Relational
			// ^ additiveExpression )* )
			// E:\\workspace\\Fel\\Fel.g:58:9: additiveExpression ( Relational ^
			// additiveExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_additiveExpression_in_relationalExpression267);
            additiveExpression22=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression22.getTree());

				// E:\\workspace\\Fel\\Fel.g:58:28: ( Relational ^
				// additiveExpression )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Relational) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
						// E:\\workspace\\Fel\\Fel.g:58:30: Relational ^
						// additiveExpression
            	    {
						Relational23 = (Token) match(input, Relational, FOLLOW_Relational_in_relationalExpression271);
						if (state.failed)
							return retval;
            	    if ( state.backtracking==0 ) {
            	    Relational23_tree = 
            	    (CommonTree)adaptor.create(Relational23)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Relational23_tree, root_0);
            	    }

						pushFollow(FOLLOW_additiveExpression_in_relationalExpression274);
            	    additiveExpression24=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression24.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 8, relationalExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "relationalExpression"


    public static class additiveExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "additiveExpression"
	// E:\\workspace\\Fel\\Fel.g:61:1: additiveExpression :
	// multiplicativeExpression ( Additive ^ multiplicativeExpression )* ;
    public final FelParser.additiveExpression_return additiveExpression() throws RecognitionException {
        FelParser.additiveExpression_return retval = new FelParser.additiveExpression_return();
        retval.start = input.LT(1);

        int additiveExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Additive26=null;
        FelParser.multiplicativeExpression_return multiplicativeExpression25 =null;

        FelParser.multiplicativeExpression_return multiplicativeExpression27 =null;


        CommonTree Additive26_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:62:5: ( multiplicativeExpression (
			// Additive ^ multiplicativeExpression )* )
			// E:\\workspace\\Fel\\Fel.g:62:9: multiplicativeExpression (
			// Additive ^ multiplicativeExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression296);
            multiplicativeExpression25=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression25.getTree());

				// E:\\workspace\\Fel\\Fel.g:62:34: ( Additive ^
				// multiplicativeExpression )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Additive) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
						// E:\\workspace\\Fel\\Fel.g:62:35: Additive ^
						// multiplicativeExpression
            	    {
						Additive26 = (Token) match(input, Additive, FOLLOW_Additive_in_additiveExpression299);
						if (state.failed)
							return retval;
            	    if ( state.backtracking==0 ) {
            	    Additive26_tree = 
            	    (CommonTree)adaptor.create(Additive26)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Additive26_tree, root_0);
            	    }

						pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression302);
            	    multiplicativeExpression27=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression27.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 9, additiveExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "additiveExpression"


    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplicativeExpression"
	// E:\\workspace\\Fel\\Fel.g:65:1: multiplicativeExpression :
	// unaryExpression ( Multiplicative ^ unaryExpression )* ;
    public final FelParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        FelParser.multiplicativeExpression_return retval = new FelParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        int multiplicativeExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Multiplicative29=null;
		FelParser.unaryExpression_return unaryExpression28 = null;

        FelParser.unaryExpression_return unaryExpression30 = null;


        CommonTree Multiplicative29_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:66:5: ( unaryExpression (
			// Multiplicative ^ unaryExpression )* )
			// E:\\workspace\\Fel\\Fel.g:66:9: unaryExpression ( Multiplicative
			// ^ unaryExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression324);
				unaryExpression28 = unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, unaryExpression28.getTree());

            // E:\\workspace\\Fel\\Fel.g:66:25: ( Multiplicative ^
				// unaryExpression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Multiplicative) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
						// E:\\workspace\\Fel\\Fel.g:66:27: Multiplicative ^
						// unaryExpression
            	    {
						Multiplicative29 = (Token) match(input, Multiplicative,
								FOLLOW_Multiplicative_in_multiplicativeExpression328);
						if (state.failed)
							return retval;
            	    if ( state.backtracking==0 ) {
            	    Multiplicative29_tree = 
            	    (CommonTree)adaptor.create(Multiplicative29)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Multiplicative29_tree, root_0);
            	    }

						pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression331);
						unaryExpression30 = unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, unaryExpression30.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 10, multiplicativeExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"


	public static class unaryExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


	// $ANTLR start "unaryExpression"
	// E:\\workspace\\Fel\\Fel.g:69:1: unaryExpression : ( Additive ^
	// unaryExpression | unaryExpressionNotPlusMinus );
	public final FelParser.unaryExpression_return unaryExpression() throws RecognitionException {
		FelParser.unaryExpression_return retval = new FelParser.unaryExpression_return();
        retval.start = input.LT(1);

		int unaryExpression_StartIndex = input.index();

        CommonTree root_0 = null;

		Token Additive31 = null;
		FelParser.unaryExpression_return unaryExpression32 = null;

        FelParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus33 = null;


        CommonTree Additive31_tree = null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// E:\\workspace\\Fel\\Fel.g:70:7: ( Additive ^ unaryExpression |
			// unaryExpressionNotPlusMinus )
			int alt11 = 2;
			int LA11_0 = input.LA(1);

            if ((LA11_0 == Additive)) {
				int LA11_1 = input.LA(2);

                if ( (synpred11_Fel()) ) {
                    alt11=1;
                }
 else if ((true)) {
					alt11 = 2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
 new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }
			} else if ((LA11_0 == BooleanLiteral || LA11_0 == CharacterLiteral || LA11_0 == DecimalLiteral
					|| LA11_0 == FloatingPointLiteral || (LA11_0 >= HexLiteral && LA11_0 <= Identifier)
					|| LA11_0 == Not || LA11_0 == OctalLiteral || LA11_0 == StringLiteral || LA11_0 == 34)) {
				alt11 = 2;
			} else {
				if (state.backtracking > 0) {
					state.failed = true;
					return retval;
				}
				NoViableAltException nvae = new NoViableAltException("", 11, 0, input);

				throw nvae;

			}
			switch (alt11) {
			case 1:
				// E:\\workspace\\Fel\\Fel.g:70:9: Additive ^ unaryExpression
			{
				root_0 = (CommonTree) adaptor.nil();

				Additive31 = (Token) match(input, Additive, FOLLOW_Additive_in_unaryExpression353);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					Additive31_tree = (CommonTree) adaptor.create(Additive31);
					root_0 = (CommonTree) adaptor.becomeRoot(Additive31_tree, root_0);
				}

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression356);
				unaryExpression32 = unaryExpression();

                    state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, unaryExpression32.getTree());

                    }
				break;
			case 2:
				// E:\\workspace\\Fel\\Fel.g:71:3: unaryExpressionNotPlusMinus
			{
				root_0 = (CommonTree) adaptor.nil();


                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression360);
				unaryExpressionNotPlusMinus33 = unaryExpressionNotPlusMinus();

                    state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, unaryExpressionNotPlusMinus33.getTree());

                    }
				break;

            }
			retval.stop = input.LT(-1);


            if (state.backtracking == 0) {

            retval.tree = (CommonTree) adaptor.rulePostProcessing(root_0);
				adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		} catch (RecognitionException re) {
			reportError(re);
			recover(input, re);
			retval.tree = (CommonTree) adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
			// do for sure before leaving
			if (state.backtracking > 0) {
				memoize(input, 11, unaryExpression_StartIndex);
			}

        }
		return retval;
	}

	// $ANTLR end "unaryExpression"


    public static class unaryExpressionNotPlusMinus_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};


    // $ANTLR start "unaryExpressionNotPlusMinus"
	// E:\\workspace\\Fel\\Fel.g:74:1: unaryExpressionNotPlusMinus : ( Not ^
	// unaryExpressionNotPlusMinus | dotExpression | primary | parExpression );
	public final FelParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
		FelParser.unaryExpressionNotPlusMinus_return retval = new FelParser.unaryExpressionNotPlusMinus_return();
		retval.start = input.LT(1);

        int unaryExpressionNotPlusMinus_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Not34 = null;
		FelParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus35 = null;

        FelParser.dotExpression_return dotExpression36 = null;

        FelParser.primary_return primary37 = null;

        FelParser.parExpression_return parExpression38 = null;


        CommonTree Not34_tree = null;

        try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 12)) {
				return retval;
			}

            // E:\\workspace\\Fel\\Fel.g:75:5: ( Not ^
			// unaryExpressionNotPlusMinus | dotExpression | primary |
			// parExpression )
			int alt12 = 4;
			switch (input.LA(1)) {
            case Not:
                {
				alt12 = 1;
                }
                break;
			case Additive:
            case BooleanLiteral:
            case CharacterLiteral:
            case DecimalLiteral:
            case FloatingPointLiteral:
            case HexLiteral:
            case OctalLiteral:
            case StringLiteral:
                {
				alt12 = 2;
                }
                break;
            case Identifier:
                {
				int LA12_8 = input.LA(2);

                if ( (synpred13_Fel()) ) {
					alt12 = 2;
                }
                else if ( (synpred14_Fel()) ) {
					alt12 = 3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
 new NoViableAltException("", 12, 8, input);

                    throw nvae;

                }
                }
                break;
            case 34:
                {
				alt12 = 4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
 new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

			switch (alt12) {
                case 1 :
				// E:\\workspace\\Fel\\Fel.g:75:8: Not ^
				// unaryExpressionNotPlusMinus
                    {
                    root_0 = (CommonTree)adaptor.nil();


				Not34 = (Token) match(input, Not, FOLLOW_Not_in_unaryExpressionNotPlusMinus375);
				if (state.failed)
					return retval;
                    if ( state.backtracking==0 ) {
					Not34_tree = (CommonTree) adaptor.create(Not34)
                    ;
					root_0 = (CommonTree) adaptor.becomeRoot(Not34_tree, root_0);
                    }

				pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpressionNotPlusMinus378);
				unaryExpressionNotPlusMinus35 = unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, unaryExpressionNotPlusMinus35.getTree());

                    }
                    break;
			case 2:
				// E:\\workspace\\Fel\\Fel.g:76:9: dotExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_dotExpression_in_unaryExpressionNotPlusMinus388);
				dotExpression36 = dotExpression();

                    state._fsp--;
                    if (state.failed) return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, dotExpression36.getTree());

                    }
                    break;
			case 3:
				// E:\\workspace\\Fel\\Fel.g:77:9: primary
                    {
                    root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus398);
				primary37 = primary();

                    state._fsp--;
                    if (state.failed) return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, primary37.getTree());

                    }
                    break;
			case 4:
				// E:\\workspace\\Fel\\Fel.g:78:9: parExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_parExpression_in_unaryExpressionNotPlusMinus409);
				parExpression38 = parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, parExpression38.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
			if (state.backtracking > 0) {
				memoize(input, 12, unaryExpressionNotPlusMinus_StartIndex);
			}

        }
        return retval;
    }
    // $ANTLR end "unaryExpressionNotPlusMinus"


    public static class dotExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dotExpression"
	// E:\\workspace\\Fel\\Fel.g:80:1: dotExpression : ( literal ( Dot ^
	// selector )* | primary ( Dot ^ primary )+ );
    public final FelParser.dotExpression_return dotExpression() throws RecognitionException {
        FelParser.dotExpression_return retval = new FelParser.dotExpression_return();
        retval.start = input.LT(1);

        int dotExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Dot40=null;
		Token Dot43 = null;
		FelParser.literal_return literal39 = null;

        FelParser.selector_return selector41 = null;

        FelParser.primary_return primary42 = null;

        FelParser.primary_return primary44 = null;


        CommonTree Dot40_tree=null;
		CommonTree Dot43_tree = null;

        try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 13)) {
				return retval;
			}

            // E:\\workspace\\Fel\\Fel.g:81:2: ( literal ( Dot ^ selector )* |
			// primary ( Dot ^ primary )+ )
			int alt15 = 2;
			int LA15_0 = input.LA(1);

            if ((LA15_0 == Additive || LA15_0 == BooleanLiteral || LA15_0 == CharacterLiteral
					|| LA15_0 == DecimalLiteral || LA15_0 == FloatingPointLiteral || LA15_0 == HexLiteral
					|| LA15_0 == OctalLiteral || LA15_0 == StringLiteral)) {
				alt15 = 1;
            }
 else if ((LA15_0 == Identifier)) {
				alt15 = 2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
 new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
			switch (alt15) {
                case 1 :
				// E:\\workspace\\Fel\\Fel.g:82:5: literal ( Dot ^ selector )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_literal_in_dotExpression426);
				literal39 = literal();

                    state._fsp--;
                    if (state.failed) return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, literal39.getTree());

                    // E:\\workspace\\Fel\\Fel.g:82:14: ( Dot ^ selector )*
				loop13:
                    do {
					int alt13 = 2;
					int LA13_0 = input.LA(1);

                        if ((LA13_0 == Dot)) {
						alt13 = 1;
                        }


					switch (alt13) {
                    	case 1 :
						// E:\\workspace\\Fel\\Fel.g:82:15: Dot ^ selector
                    	    {
						Dot40 = (Token) match(input, Dot, FOLLOW_Dot_in_dotExpression430);
						if (state.failed)
							return retval;
                    	    if ( state.backtracking==0 ) {
							Dot40_tree = (CommonTree) adaptor.create(Dot40)
                    	    ;
							root_0 = (CommonTree) adaptor.becomeRoot(Dot40_tree, root_0);
                    	    }

						pushFollow(FOLLOW_selector_in_dotExpression433);
						selector41 = selector();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, selector41.getTree());

                    	    }
                    	    break;

                    	default :
						break loop13;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
				// E:\\workspace\\Fel\\Fel.g:83:5: primary ( Dot ^ primary )+
                    {
                    root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_primary_in_dotExpression441);
				primary42 = primary();

                    state._fsp--;
                    if (state.failed) return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, primary42.getTree());

                    // E:\\workspace\\Fel\\Fel.g:83:14: ( Dot ^ primary )+
				int cnt14 = 0;
				loop14:
                    do {
					int alt14 = 2;
					int LA14_0 = input.LA(1);

                        if ((LA14_0 == Dot)) {
						alt14 = 1;
                        }


					switch (alt14) {
                    	case 1 :
						// E:\\workspace\\Fel\\Fel.g:83:15: Dot ^ primary
                    	    {
						Dot43 = (Token) match(input, Dot, FOLLOW_Dot_in_dotExpression445);
						if (state.failed)
							return retval;
                    	    if ( state.backtracking==0 ) {
							Dot43_tree = (CommonTree) adaptor.create(Dot43)
                    	    ;
							root_0 = (CommonTree) adaptor.becomeRoot(Dot43_tree, root_0);
                    	    }

						pushFollow(FOLLOW_primary_in_dotExpression448);
						primary44 = primary();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, primary44.getTree());

                    	    }
                    	    break;

                    	default :
						if (cnt14 >= 1)
							break loop14;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
 new EarlyExitException(14, input);
                                throw eee;
                        }
					cnt14++;
                    } while (true);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
			if (state.backtracking > 0) {
				memoize(input, 13, dotExpression_StartIndex);
			}

        }
        return retval;
    }
    // $ANTLR end "dotExpression"


    public static class funExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funExpression"
	// E:\\workspace\\Fel\\Fel.g:87:1: funExpression : Identifier ^ arguments ;
    public final FelParser.funExpression_return funExpression() throws RecognitionException {
        FelParser.funExpression_return retval = new FelParser.funExpression_return();
        retval.start = input.LT(1);

        int funExpression_StartIndex = input.index();

        CommonTree root_0 = null;

		Token Identifier45 = null;
		FelParser.arguments_return arguments46 = null;


        CommonTree Identifier45_tree = null;

        try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 14)) {
				return retval;
			}

            // E:\\workspace\\Fel\\Fel.g:88:5: ( Identifier ^ arguments )
			// E:\\workspace\\Fel\\Fel.g:88:6: Identifier ^ arguments
            {
            root_0 = (CommonTree)adaptor.nil();


				Identifier45 = (Token) match(input, Identifier, FOLLOW_Identifier_in_funExpression469);
				if (state.failed)
					return retval;
            if ( state.backtracking==0 ) {
					Identifier45_tree = (CommonTree) adaptor.create(Identifier45)
            ;
					root_0 = (CommonTree) adaptor.becomeRoot(Identifier45_tree, root_0);
            }

				pushFollow(FOLLOW_arguments_in_funExpression472);
				arguments46 = arguments();

            state._fsp--;
            if (state.failed) return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, arguments46.getTree());

            if ( state.backtracking==0 ) {
					if ((arguments46 != null ? input.toString(arguments46.start, arguments46.stop) : null) != null) {
						// root_0 = new
						// com.greenpineyu.fel.parser.FunNode(root_0);
                  	}
                 }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
			if (state.backtracking > 0) {
				memoize(input, 14, funExpression_StartIndex);
			}

        }
        return retval;
    }
    // $ANTLR end "funExpression"


    public static class primary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary"
	// E:\\workspace\\Fel\\Fel.g:95:1: primary : ( Identifier | funExpression );
    public final FelParser.primary_return primary() throws RecognitionException {
        FelParser.primary_return retval = new FelParser.primary_return();
        retval.start = input.LT(1);

        int primary_StartIndex = input.index();

        CommonTree root_0 = null;

		Token Identifier47 = null;
		FelParser.funExpression_return funExpression48 = null;


        CommonTree Identifier47_tree = null;

        try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 15)) {
				return retval;
			}

            // E:\\workspace\\Fel\\Fel.g:96:6: ( Identifier | funExpression )
			int alt16 = 2;
			int LA16_0 = input.LA(1);

            if ((LA16_0 == Identifier)) {
				int LA16_1 = input.LA(2);

                if ((LA16_1 == EOF || (LA16_1 >= Additive && LA16_1 <= And) || LA16_1 == Colon
						|| (LA16_1 >= Dot && LA16_1 <= Equals) || LA16_1 == Multiplicative
						|| (LA16_1 >= Or && LA16_1 <= Relational) || (LA16_1 >= 35 && LA16_1 <= 36))) {
					alt16 = 1;
                }
 else if ((LA16_1 == 34)) {
					alt16 = 2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
 new NoViableAltException("", 16, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
 new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
			switch (alt16) {
                case 1 :
				// E:\\workspace\\Fel\\Fel.g:97:5: Identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


				Identifier47 = (Token) match(input, Identifier, FOLLOW_Identifier_in_primary505);
				if (state.failed)
					return retval;
                    if ( state.backtracking==0 ) {
					Identifier47_tree = (CommonTree) adaptor.create(Identifier47)
                    ;
					adaptor.addChild(root_0, Identifier47_tree);
                    }

                    }
                    break;
                case 2 :
				// E:\\workspace\\Fel\\Fel.g:98:7: funExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


				pushFollow(FOLLOW_funExpression_in_primary513);
				funExpression48 = funExpression();

                    state._fsp--;
                    if (state.failed) return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, funExpression48.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
			if (state.backtracking > 0) {
				memoize(input, 15, primary_StartIndex);
			}

        }
        return retval;
    }
    // $ANTLR end "primary"


    public static class selector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selector"
	// E:\\workspace\\Fel\\Fel.g:101:1: selector : Identifier ^ ( arguments )? ;
    public final FelParser.selector_return selector() throws RecognitionException {
        FelParser.selector_return retval = new FelParser.selector_return();
        retval.start = input.LT(1);

        int selector_StartIndex = input.index();

        CommonTree root_0 = null;

		Token Identifier49 = null;
		FelParser.arguments_return arguments50 = null;


        CommonTree Identifier49_tree = null;

        try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 16)) {
				return retval;
			}

            // E:\\workspace\\Fel\\Fel.g:102:5: ( Identifier ^ ( arguments )? )
			// E:\\workspace\\Fel\\Fel.g:102:6: Identifier ^ ( arguments )?
            {
            root_0 = (CommonTree)adaptor.nil();


				Identifier49 = (Token) match(input, Identifier, FOLLOW_Identifier_in_selector530);
				if (state.failed)
					return retval;
            if ( state.backtracking==0 ) {
					Identifier49_tree = (CommonTree) adaptor.create(Identifier49)
            ;
					root_0 = (CommonTree) adaptor.becomeRoot(Identifier49_tree, root_0);
            }

				// E:\\workspace\\Fel\\Fel.g:102:18: ( arguments )?
				int alt17 = 2;
				int LA17_0 = input.LA(1);

            if ((LA17_0 == 34)) {
					alt17 = 1;
            }
				switch (alt17) {
                case 1 :
					// E:\\workspace\\Fel\\Fel.g:102:18: arguments
                    {
					pushFollow(FOLLOW_arguments_in_selector533);
					arguments50 = arguments();

                    state._fsp--;
                    if (state.failed) return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, arguments50.getTree());

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
					if ((arguments50 != null ? input.toString(arguments50.start, arguments50.stop) : null) != null) {
            	    //root_0 = new com.greenpineyu.fel.parser.FunNode(root_0);
                  	}
                 }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
			if (state.backtracking > 0) {
				memoize(input, 16, selector_StartIndex);
			}

        }
        return retval;
    }
    // $ANTLR end "selector"


    public static class arguments_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arguments"
	// E:\\workspace\\Fel\\Fel.g:110:1: arguments : '(' ! ( expressionList )?
	// ')' !;
    public final FelParser.arguments_return arguments() throws RecognitionException {
        FelParser.arguments_return retval = new FelParser.arguments_return();
        retval.start = input.LT(1);

        int arguments_StartIndex = input.index();

        CommonTree root_0 = null;

		Token char_literal51 = null;
		Token char_literal53 = null;
		FelParser.expressionList_return expressionList52 = null;


        CommonTree char_literal51_tree = null;
		CommonTree char_literal53_tree = null;

        try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 17)) {
				return retval;
			}

            // E:\\workspace\\Fel\\Fel.g:111:5: ( '(' ! ( expressionList )? ')'
			// !)
			// E:\\workspace\\Fel\\Fel.g:111:9: '(' ! ( expressionList )? ')' !
            {
            root_0 = (CommonTree)adaptor.nil();


				char_literal51 = (Token) match(input, 34, FOLLOW_34_in_arguments560);
				if (state.failed)
					return retval;

            // E:\\workspace\\Fel\\Fel.g:111:14: ( expressionList )?
				int alt18 = 2;
				int LA18_0 = input.LA(1);

            if ((LA18_0 == Additive || LA18_0 == BooleanLiteral || LA18_0 == CharacterLiteral
						|| LA18_0 == DecimalLiteral || LA18_0 == FloatingPointLiteral
						|| (LA18_0 >= HexLiteral && LA18_0 <= Identifier) || LA18_0 == Not || LA18_0 == OctalLiteral
						|| LA18_0 == StringLiteral || LA18_0 == 34 || LA18_0 == 36)) {
					alt18 = 1;
            }
 else if ((LA18_0 == 35)) {
					int LA18_2 = input.LA(2);

                if ( (synpred20_Fel()) ) {
						alt18 = 1;
                }
            }
				switch (alt18) {
                case 1 :
					// E:\\workspace\\Fel\\Fel.g:111:14: expressionList
                    {
					pushFollow(FOLLOW_expressionList_in_arguments563);
					expressionList52 = expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, expressionList52.getTree());

                    }
                    break;

            }


				char_literal53 = (Token) match(input, 35, FOLLOW_35_in_arguments566);
				if (state.failed)
					return retval;

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
			if (state.backtracking > 0) {
				memoize(input, 17, arguments_StartIndex);
			}

        }
        return retval;
    }
    // $ANTLR end "arguments"


    public static class literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literal"
	// E:\\workspace\\Fel\\Fel.g:114:1: literal : ( ( Additive ^)? (
	// integerLiteral | FloatingPointLiteral ) | CharacterLiteral |
	// StringLiteral | BooleanLiteral );
    public final FelParser.literal_return literal() throws RecognitionException {
        FelParser.literal_return retval = new FelParser.literal_return();
        retval.start = input.LT(1);

        int literal_StartIndex = input.index();

        CommonTree root_0 = null;

		Token Additive54 = null;
		Token FloatingPointLiteral56 = null;
		Token CharacterLiteral57 = null;
		Token StringLiteral58 = null;
		Token BooleanLiteral59 = null;
		FelParser.integerLiteral_return integerLiteral55 = null;


        CommonTree Additive54_tree = null;
		CommonTree FloatingPointLiteral56_tree = null;
		CommonTree CharacterLiteral57_tree = null;
		CommonTree StringLiteral58_tree = null;
		CommonTree BooleanLiteral59_tree = null;

        try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 18)) {
				return retval;
			}

            // E:\\workspace\\Fel\\Fel.g:115:5: ( ( Additive ^)? (
			// integerLiteral | FloatingPointLiteral ) | CharacterLiteral |
			// StringLiteral | BooleanLiteral )
			int alt21 = 4;
            switch ( input.LA(1) ) {
            case Additive:
            case DecimalLiteral:
            case FloatingPointLiteral:
            case HexLiteral:
            case OctalLiteral:
                {
				alt21 = 1;
                }
                break;
            case CharacterLiteral:
                {
				alt21 = 2;
                }
                break;
            case StringLiteral:
                {
				alt21 = 3;
                }
                break;
            case BooleanLiteral:
                {
				alt21 = 4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
 new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

			switch (alt21) {
                case 1 :
				// E:\\workspace\\Fel\\Fel.g:115:9: ( Additive ^)? (
				// integerLiteral | FloatingPointLiteral )
                    {
                    root_0 = (CommonTree)adaptor.nil();


				// E:\\workspace\\Fel\\Fel.g:115:17: ( Additive ^)?
				int alt19 = 2;
				int LA19_0 = input.LA(1);

                    if ((LA19_0 == Additive)) {
					alt19 = 1;
                    }
				switch (alt19) {
                        case 1 :
					// E:\\workspace\\Fel\\Fel.g:115:17: Additive ^
                            {
					Additive54 = (Token) match(input, Additive, FOLLOW_Additive_in_literal587);
					if (state.failed)
						return retval;
                            if ( state.backtracking==0 ) {
						Additive54_tree = (CommonTree) adaptor.create(Additive54)
                            ;
						root_0 = (CommonTree) adaptor.becomeRoot(Additive54_tree, root_0);
                            }

                            }
                            break;

                    }


				// E:\\workspace\\Fel\\Fel.g:115:19: ( integerLiteral |
				// FloatingPointLiteral )
				int alt20 = 2;
				int LA20_0 = input.LA(1);

                    if ((LA20_0 == DecimalLiteral || LA20_0 == HexLiteral || LA20_0 == OctalLiteral)) {
					alt20 = 1;
                    }
 else if ((LA20_0 == FloatingPointLiteral)) {
					alt20 = 2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
 new NoViableAltException("", 20, 0, input);

                        throw nvae;

                    }
				switch (alt20) {
                        case 1 :
					// E:\\workspace\\Fel\\Fel.g:115:20: integerLiteral
                            {
					pushFollow(FOLLOW_integerLiteral_in_literal591);
					integerLiteral55 = integerLiteral();

                            state._fsp--;
                            if (state.failed) return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, integerLiteral55.getTree());

                            }
                            break;
                        case 2 :
					// E:\\workspace\\Fel\\Fel.g:116:9: FloatingPointLiteral
                            {
					FloatingPointLiteral56 = (Token) match(input, FloatingPointLiteral,
							FOLLOW_FloatingPointLiteral_in_literal601);
					if (state.failed)
						return retval;
                            if ( state.backtracking==0 ) {
						FloatingPointLiteral56_tree = (CommonTree) adaptor.create(FloatingPointLiteral56)
                            ;
						adaptor.addChild(root_0, FloatingPointLiteral56_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
				// E:\\workspace\\Fel\\Fel.g:117:9: CharacterLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


				CharacterLiteral57 = (Token) match(input, CharacterLiteral, FOLLOW_CharacterLiteral_in_literal612);
				if (state.failed)
					return retval;
                    if ( state.backtracking==0 ) {
					CharacterLiteral57_tree = (CommonTree) adaptor.create(CharacterLiteral57)
                    ;
					adaptor.addChild(root_0, CharacterLiteral57_tree);
                    }

                    }
                    break;
                case 3 :
				// E:\\workspace\\Fel\\Fel.g:118:9: StringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


				StringLiteral58 = (Token) match(input, StringLiteral, FOLLOW_StringLiteral_in_literal622);
				if (state.failed)
					return retval;
                    if ( state.backtracking==0 ) {
					StringLiteral58_tree = (CommonTree) adaptor.create(StringLiteral58)
                    ;
					adaptor.addChild(root_0, StringLiteral58_tree);
                    }

                    }
                    break;
                case 4 :
				// E:\\workspace\\Fel\\Fel.g:119:9: BooleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


				BooleanLiteral59 = (Token) match(input, BooleanLiteral, FOLLOW_BooleanLiteral_in_literal632);
				if (state.failed)
					return retval;
                    if ( state.backtracking==0 ) {
					BooleanLiteral59_tree = (CommonTree) adaptor.create(BooleanLiteral59)
                    ;
					adaptor.addChild(root_0, BooleanLiteral59_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
			if (state.backtracking > 0) {
				memoize(input, 18, literal_StartIndex);
			}

        }
        return retval;
    }
    // $ANTLR end "literal"


    public static class integerLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "integerLiteral"
	// E:\\workspace\\Fel\\Fel.g:121:1: integerLiteral : ( HexLiteral |
	// OctalLiteral | DecimalLiteral );
    public final FelParser.integerLiteral_return integerLiteral() throws RecognitionException {
        FelParser.integerLiteral_return retval = new FelParser.integerLiteral_return();
        retval.start = input.LT(1);

        int integerLiteral_StartIndex = input.index();

        CommonTree root_0 = null;

		Token set60 = null;

        CommonTree set60_tree = null;

        try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 19)) {
				return retval;
			}

            // E:\\workspace\\Fel\\Fel.g:122:5: ( HexLiteral | OctalLiteral |
			// DecimalLiteral )
            // E:\\workspace\\Fel\\Fel.g:
            {
            root_0 = (CommonTree)adaptor.nil();


				set60 = (Token) input.LT(1);

            if ( input.LA(1)==DecimalLiteral||input.LA(1)==HexLiteral||input.LA(1)==OctalLiteral ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
 (CommonTree) adaptor.create(set60)
                );
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
			if (state.backtracking > 0) {
				memoize(input, 19, integerLiteral_StartIndex);
			}

        }
        return retval;
    }
    // $ANTLR end "integerLiteral"

	// $ANTLR start synpred11_Fel
	public final void synpred11_Fel_fragment() throws RecognitionException {
		// E:\\workspace\\Fel\\Fel.g:70:9: ( Additive unaryExpression )
		// E:\\workspace\\Fel\\Fel.g:70:9: Additive unaryExpression
        {
			match(input, Additive, FOLLOW_Additive_in_synpred11_Fel353);
			if (state.failed)
				return;

        pushFollow(FOLLOW_unaryExpression_in_synpred11_Fel356);
			unaryExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred11_Fel

    // $ANTLR start synpred13_Fel
    public final void synpred13_Fel_fragment() throws RecognitionException {
		// E:\\workspace\\Fel\\Fel.g:76:9: ( dotExpression )
		// E:\\workspace\\Fel\\Fel.g:76:9: dotExpression
        {
			pushFollow(FOLLOW_dotExpression_in_synpred13_Fel388);
        dotExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred13_Fel

    // $ANTLR start synpred14_Fel
    public final void synpred14_Fel_fragment() throws RecognitionException {
		// E:\\workspace\\Fel\\Fel.g:77:9: ( primary )
		// E:\\workspace\\Fel\\Fel.g:77:9: primary
        {
			pushFollow(FOLLOW_primary_in_synpred14_Fel398);
        primary();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred14_Fel

    // $ANTLR start synpred20_Fel
    public final void synpred20_Fel_fragment() throws RecognitionException {
		// E:\\workspace\\Fel\\Fel.g:111:14: ( expressionList )
		// E:\\workspace\\Fel\\Fel.g:111:14: expressionList
        {
			pushFollow(FOLLOW_expressionList_in_synpred20_Fel563);
        expressionList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred20_Fel

    // Delegated rules

    public final boolean synpred14_Fel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_Fel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred20_Fel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_Fel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_Fel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_Fel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_Fel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_Fel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

	public static final BitSet FOLLOW_conditionalExpression_in_program67 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_34_in_parExpression82 = new BitSet(new long[] { 0x0000001C8A0D0550L });
	public static final BitSet FOLLOW_expressionList_in_parExpression85 = new BitSet(new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_35_in_parExpression87 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_conditionalExpression_in_expressionList107 = new BitSet(
			new long[] { 0x0000001000000002L });
	public static final BitSet FOLLOW_36_in_expressionList121 = new BitSet(new long[] { 0x000000148A0D0552L });
	public static final BitSet FOLLOW_conditionalExpression_in_expressionList124 = new BitSet(
			new long[] { 0x0000001000000002L });
	public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression166 = new BitSet(
			new long[] { 0x0000000020000002L });
	public static final BitSet FOLLOW_Ques_in_conditionalExpression170 = new BitSet(new long[] { 0x000000048A0D0550L });
	public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression173 = new BitSet(
			new long[] { 0x0000000000000200L });
	public static final BitSet FOLLOW_Colon_in_conditionalExpression175 = new BitSet(new long[] { 0x000000048A0D0550L });
	public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression178 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression194 = new BitSet(
			new long[] { 0x0000000010000002L });
	public static final BitSet FOLLOW_Or_in_conditionalOrExpression197 = new BitSet(new long[] { 0x000000048A0D0550L });
	public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression200 = new BitSet(
			new long[] { 0x0000000010000002L });
	public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression214 = new BitSet(
			new long[] { 0x0000000000000022L });
	public static final BitSet FOLLOW_And_in_conditionalAndExpression217 = new BitSet(
			new long[] { 0x000000048A0D0550L });
	public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression220 = new BitSet(
			new long[] { 0x0000000000000022L });
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression238 = new BitSet(
			new long[] { 0x0000000000001002L });
	public static final BitSet FOLLOW_Equals_in_equalityExpression242 = new BitSet(new long[] { 0x000000048A0D0550L });
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression245 = new BitSet(
			new long[] { 0x0000000000001002L });
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression267 = new BitSet(
			new long[] { 0x0000000040000002L });
	public static final BitSet FOLLOW_Relational_in_relationalExpression271 = new BitSet(
			new long[] { 0x000000048A0D0550L });
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression274 = new BitSet(
			new long[] { 0x0000000040000002L });
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression296 = new BitSet(
			new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_Additive_in_additiveExpression299 = new BitSet(new long[] { 0x000000048A0D0550L });
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression302 = new BitSet(
			new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression324 = new BitSet(
			new long[] { 0x0000000001000002L });
	public static final BitSet FOLLOW_Multiplicative_in_multiplicativeExpression328 = new BitSet(
			new long[] { 0x000000048A0D0550L });
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression331 = new BitSet(
			new long[] { 0x0000000001000002L });
	public static final BitSet FOLLOW_Additive_in_unaryExpression353 = new BitSet(new long[] { 0x000000048A0D0550L });
	public static final BitSet FOLLOW_unaryExpression_in_unaryExpression356 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression360 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_Not_in_unaryExpressionNotPlusMinus375 = new BitSet(
			new long[] { 0x000000048A0D0550L });
	public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpressionNotPlusMinus378 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_dotExpression_in_unaryExpressionNotPlusMinus388 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus398 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_parExpression_in_unaryExpressionNotPlusMinus409 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_literal_in_dotExpression426 = new BitSet(new long[] { 0x0000000000000802L });
	public static final BitSet FOLLOW_Dot_in_dotExpression430 = new BitSet(new long[] { 0x0000000000080000L });
	public static final BitSet FOLLOW_selector_in_dotExpression433 = new BitSet(new long[] { 0x0000000000000802L });
	public static final BitSet FOLLOW_primary_in_dotExpression441 = new BitSet(new long[] { 0x0000000000000800L });
	public static final BitSet FOLLOW_Dot_in_dotExpression445 = new BitSet(new long[] { 0x0000000000080000L });
	public static final BitSet FOLLOW_primary_in_dotExpression448 = new BitSet(new long[] { 0x0000000000000802L });
	public static final BitSet FOLLOW_Identifier_in_funExpression469 = new BitSet(new long[] { 0x0000000400000000L });
	public static final BitSet FOLLOW_arguments_in_funExpression472 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_Identifier_in_primary505 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_funExpression_in_primary513 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_Identifier_in_selector530 = new BitSet(new long[] { 0x0000000400000002L });
	public static final BitSet FOLLOW_arguments_in_selector533 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_34_in_arguments560 = new BitSet(new long[] { 0x0000001C8A0D0550L });
	public static final BitSet FOLLOW_expressionList_in_arguments563 = new BitSet(new long[] { 0x0000000800000000L });
	public static final BitSet FOLLOW_35_in_arguments566 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_Additive_in_literal587 = new BitSet(new long[] { 0x0000000008050400L });
	public static final BitSet FOLLOW_integerLiteral_in_literal591 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FloatingPointLiteral_in_literal601 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CharacterLiteral_in_literal612 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_StringLiteral_in_literal622 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_BooleanLiteral_in_literal632 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_Additive_in_synpred11_Fel353 = new BitSet(new long[] { 0x000000048A0D0550L });
	public static final BitSet FOLLOW_unaryExpression_in_synpred11_Fel356 = new BitSet(
			new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_dotExpression_in_synpred13_Fel388 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_primary_in_synpred14_Fel398 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_expressionList_in_synpred20_Fel563 = new BitSet(
			new long[] { 0x0000000000000002L });

}