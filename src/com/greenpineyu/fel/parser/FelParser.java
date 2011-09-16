package com.greenpineyu.fel.parser;

// $ANTLR 3.4 D:\\129\\ws\\fel\\Fel.g 2011-09-16 14:34:00

import java.util.HashMap;

import org.antlr.runtime.BitSet;
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
        this.state.ruleMemo = new HashMap[42+1];
         

    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return FelParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\129\\ws\\fel\\Fel.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // D:\\129\\ws\\fel\\Fel.g:12:1: program : conditionalExpression ;
    public final FelParser.program_return program() throws RecognitionException {
        FelParser.program_return retval = new FelParser.program_return();
        retval.start = input.LT(1);

        int program_StartIndex = input.index();

        CommonTree root_0 = null;

        FelParser.conditionalExpression_return conditionalExpression1 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

            // D:\\129\\ws\\fel\\Fel.g:12:9: ( conditionalExpression )
            // D:\\129\\ws\\fel\\Fel.g:12:11: conditionalExpression
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_conditionalExpression_in_program51);
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
    // D:\\129\\ws\\fel\\Fel.g:14:1: parExpression : '(' ! expressionList ')' !;
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

            // D:\\129\\ws\\fel\\Fel.g:15:5: ( '(' ! expressionList ')' !)
            // D:\\129\\ws\\fel\\Fel.g:15:9: '(' ! expressionList ')' !
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal2=(Token)match(input,34,FOLLOW_34_in_parExpression66); if (state.failed) return retval;

            pushFollow(FOLLOW_expressionList_in_parExpression69);
            expressionList3=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList3.getTree());

            char_literal4=(Token)match(input,35,FOLLOW_35_in_parExpression71); if (state.failed) return retval;

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
    // D:\\129\\ws\\fel\\Fel.g:18:1: expressionList : ( conditionalExpression )? ( ',' ! ( conditionalExpression )? )* ;
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

            // D:\\129\\ws\\fel\\Fel.g:19:5: ( ( conditionalExpression )? ( ',' ! ( conditionalExpression )? )* )
            // D:\\129\\ws\\fel\\Fel.g:19:9: ( conditionalExpression )? ( ',' ! ( conditionalExpression )? )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // D:\\129\\ws\\fel\\Fel.g:19:9: ( conditionalExpression )?
            int alt1=2;
            switch ( input.LA(1) ) {
                case Additive:
                case And:
                case BooleanLiteral:
                case CharacterLiteral:
                case DecimalLiteral:
                case Equals:
                case FloatingPointLiteral:
                case HexLiteral:
                case Identifier:
                case Multiplicative:
                case Not:
                case OctalLiteral:
                case Or:
                case Ques:
                case Relational:
                case StringLiteral:
                case 34:
                    {
                    alt1=1;
                    }
                    break;
                case 36:
                    {
                    int LA1_2 = input.LA(2);

                    if ( (synpred1_Fel()) ) {
                        alt1=1;
                    }
                    }
                    break;
                case 35:
                    {
                    int LA1_3 = input.LA(2);

                    if ( (synpred1_Fel()) ) {
                        alt1=1;
                    }
                    }
                    break;
                case EOF:
                    {
                    int LA1_4 = input.LA(2);

                    if ( (synpred1_Fel()) ) {
                        alt1=1;
                    }
                    }
                    break;
            }

            switch (alt1) {
                case 1 :
                    // D:\\129\\ws\\fel\\Fel.g:19:9: conditionalExpression
                    {
                    pushFollow(FOLLOW_conditionalExpression_in_expressionList91);
                    conditionalExpression5=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression5.getTree());

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                	if(conditionalExpression5 == null){
                 	 //   root_0.addChild(com.greenpineyu.fel.parser.AbstFelNode.NULL_NODE);
                	}
                }

            // D:\\129\\ws\\fel\\Fel.g:25:4: ( ',' ! ( conditionalExpression )? )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==36) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\129\\ws\\fel\\Fel.g:25:5: ',' ! ( conditionalExpression )?
            	    {
            	    char_literal6=(Token)match(input,36,FOLLOW_36_in_expressionList105); if (state.failed) return retval;

            	    // D:\\129\\ws\\fel\\Fel.g:25:10: ( conditionalExpression )?
            	    int alt2=2;
            	    switch ( input.LA(1) ) {
            	        case Additive:
            	        case And:
            	        case BooleanLiteral:
            	        case CharacterLiteral:
            	        case DecimalLiteral:
            	        case Equals:
            	        case FloatingPointLiteral:
            	        case HexLiteral:
            	        case Identifier:
            	        case Multiplicative:
            	        case Not:
            	        case OctalLiteral:
            	        case Or:
            	        case Ques:
            	        case Relational:
            	        case StringLiteral:
            	        case 34:
            	            {
            	            alt2=1;
            	            }
            	            break;
            	        case 35:
            	            {
            	            int LA2_2 = input.LA(2);

            	            if ( (synpred2_Fel()) ) {
            	                alt2=1;
            	            }
            	            }
            	            break;
            	        case EOF:
            	            {
            	            int LA2_3 = input.LA(2);

            	            if ( (synpred2_Fel()) ) {
            	                alt2=1;
            	            }
            	            }
            	            break;
            	        case 36:
            	            {
            	            int LA2_4 = input.LA(2);

            	            if ( (synpred2_Fel()) ) {
            	                alt2=1;
            	            }
            	            }
            	            break;
            	    }

            	    switch (alt2) {
            	        case 1 :
            	            // D:\\129\\ws\\fel\\Fel.g:25:10: conditionalExpression
            	            {
            	            pushFollow(FOLLOW_conditionalExpression_in_expressionList108);
            	            conditionalExpression7=conditionalExpression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression7.getTree());

            	            }
            	            break;

            	    }


            	    if ( state.backtracking==0 ) {
            	          	if(conditionalExpression7 == null){
            	         		//root_0.addChild(com.greenpineyu.fel.parser.AbstFelNode.NULL_NODE);
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
    // D:\\129\\ws\\fel\\Fel.g:36:1: conditionalExpression : conditionalOrExpression ( Ques ^ conditionalExpression Colon ! conditionalExpression )? ;
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

            // D:\\129\\ws\\fel\\Fel.g:37:5: ( conditionalOrExpression ( Ques ^ conditionalExpression Colon ! conditionalExpression )? )
            // D:\\129\\ws\\fel\\Fel.g:37:9: conditionalOrExpression ( Ques ^ conditionalExpression Colon ! conditionalExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression150);
            conditionalOrExpression8=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpression8.getTree());

            // D:\\129\\ws\\fel\\Fel.g:37:33: ( Ques ^ conditionalExpression Colon ! conditionalExpression )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Ques) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // D:\\129\\ws\\fel\\Fel.g:37:35: Ques ^ conditionalExpression Colon ! conditionalExpression
                    {
                    Ques9=(Token)match(input,Ques,FOLLOW_Ques_in_conditionalExpression154); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Ques9_tree = 
                    (CommonTree)adaptor.create(Ques9)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Ques9_tree, root_0);
                    }

                    pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression157);
                    conditionalExpression10=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression10.getTree());

                    Colon11=(Token)match(input,Colon,FOLLOW_Colon_in_conditionalExpression159); if (state.failed) return retval;

                    pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression162);
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
    // D:\\129\\ws\\fel\\Fel.g:39:1: conditionalOrExpression : conditionalAndExpression ( Or ^ conditionalAndExpression )* ;
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

            // D:\\129\\ws\\fel\\Fel.g:40:2: ( conditionalAndExpression ( Or ^ conditionalAndExpression )* )
            // D:\\129\\ws\\fel\\Fel.g:40:4: conditionalAndExpression ( Or ^ conditionalAndExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression178);
            conditionalAndExpression13=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression13.getTree());

            // D:\\129\\ws\\fel\\Fel.g:40:29: ( Or ^ conditionalAndExpression )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Or) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\129\\ws\\fel\\Fel.g:40:30: Or ^ conditionalAndExpression
            	    {
            	    Or14=(Token)match(input,Or,FOLLOW_Or_in_conditionalOrExpression181); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Or14_tree = 
            	    (CommonTree)adaptor.create(Or14)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Or14_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression184);
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
    // D:\\129\\ws\\fel\\Fel.g:43:1: conditionalAndExpression : equalityExpression ( And ^ equalityExpression )* ;
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

            // D:\\129\\ws\\fel\\Fel.g:44:2: ( equalityExpression ( And ^ equalityExpression )* )
            // D:\\129\\ws\\fel\\Fel.g:44:4: equalityExpression ( And ^ equalityExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression198);
            equalityExpression16=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression16.getTree());

            // D:\\129\\ws\\fel\\Fel.g:44:23: ( And ^ equalityExpression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==And) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\129\\ws\\fel\\Fel.g:44:24: And ^ equalityExpression
            	    {
            	    And17=(Token)match(input,And,FOLLOW_And_in_conditionalAndExpression201); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    And17_tree = 
            	    (CommonTree)adaptor.create(And17)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(And17_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression204);
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
    // D:\\129\\ws\\fel\\Fel.g:47:1: equalityExpression : relationalExpression ( Equals ^ relationalExpression )* ;
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

            // D:\\129\\ws\\fel\\Fel.g:48:5: ( relationalExpression ( Equals ^ relationalExpression )* )
            // D:\\129\\ws\\fel\\Fel.g:48:9: relationalExpression ( Equals ^ relationalExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_relationalExpression_in_equalityExpression222);
            relationalExpression19=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression19.getTree());

            // D:\\129\\ws\\fel\\Fel.g:48:30: ( Equals ^ relationalExpression )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Equals) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\129\\ws\\fel\\Fel.g:48:32: Equals ^ relationalExpression
            	    {
            	    Equals20=(Token)match(input,Equals,FOLLOW_Equals_in_equalityExpression226); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Equals20_tree = 
            	    (CommonTree)adaptor.create(Equals20)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Equals20_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression229);
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
    // D:\\129\\ws\\fel\\Fel.g:51:1: relationalExpression : additiveExpression ( Relational ^ additiveExpression )* ;
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

            // D:\\129\\ws\\fel\\Fel.g:52:5: ( additiveExpression ( Relational ^ additiveExpression )* )
            // D:\\129\\ws\\fel\\Fel.g:52:9: additiveExpression ( Relational ^ additiveExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_additiveExpression_in_relationalExpression251);
            additiveExpression22=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression22.getTree());

            // D:\\129\\ws\\fel\\Fel.g:52:28: ( Relational ^ additiveExpression )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Relational) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\129\\ws\\fel\\Fel.g:52:30: Relational ^ additiveExpression
            	    {
            	    Relational23=(Token)match(input,Relational,FOLLOW_Relational_in_relationalExpression255); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Relational23_tree = 
            	    (CommonTree)adaptor.create(Relational23)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Relational23_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression258);
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
    // D:\\129\\ws\\fel\\Fel.g:55:1: additiveExpression : multiplicativeExpression ( Additive ^ multiplicativeExpression )* ;
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

            // D:\\129\\ws\\fel\\Fel.g:56:5: ( multiplicativeExpression ( Additive ^ multiplicativeExpression )* )
            // D:\\129\\ws\\fel\\Fel.g:56:9: multiplicativeExpression ( Additive ^ multiplicativeExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression280);
            multiplicativeExpression25=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression25.getTree());

            // D:\\129\\ws\\fel\\Fel.g:56:34: ( Additive ^ multiplicativeExpression )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Additive) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\129\\ws\\fel\\Fel.g:56:36: Additive ^ multiplicativeExpression
            	    {
            	    Additive26=(Token)match(input,Additive,FOLLOW_Additive_in_additiveExpression284); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Additive26_tree = 
            	    (CommonTree)adaptor.create(Additive26)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Additive26_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression287);
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
    // D:\\129\\ws\\fel\\Fel.g:59:1: multiplicativeExpression : unaryExpressionNotPlusMinus ( Multiplicative ^ unaryExpressionNotPlusMinus )* ;
    public final FelParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        FelParser.multiplicativeExpression_return retval = new FelParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        int multiplicativeExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Multiplicative29=null;
        FelParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus28 =null;

        FelParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus30 =null;


        CommonTree Multiplicative29_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // D:\\129\\ws\\fel\\Fel.g:60:5: ( unaryExpressionNotPlusMinus ( Multiplicative ^ unaryExpressionNotPlusMinus )* )
            // D:\\129\\ws\\fel\\Fel.g:60:9: unaryExpressionNotPlusMinus ( Multiplicative ^ unaryExpressionNotPlusMinus )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_multiplicativeExpression309);
            unaryExpressionNotPlusMinus28=unaryExpressionNotPlusMinus();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus28.getTree());

            // D:\\129\\ws\\fel\\Fel.g:60:37: ( Multiplicative ^ unaryExpressionNotPlusMinus )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Multiplicative) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\129\\ws\\fel\\Fel.g:60:39: Multiplicative ^ unaryExpressionNotPlusMinus
            	    {
            	    Multiplicative29=(Token)match(input,Multiplicative,FOLLOW_Multiplicative_in_multiplicativeExpression313); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Multiplicative29_tree = 
            	    (CommonTree)adaptor.create(Multiplicative29)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Multiplicative29_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_multiplicativeExpression316);
            	    unaryExpressionNotPlusMinus30=unaryExpressionNotPlusMinus();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus30.getTree());

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


    public static class unaryExpressionNotPlusMinus_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unaryExpressionNotPlusMinus"
    // D:\\129\\ws\\fel\\Fel.g:65:1: unaryExpressionNotPlusMinus : (| Not ^ unaryExpressionNotPlusMinus | primary );
    public final FelParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
        FelParser.unaryExpressionNotPlusMinus_return retval = new FelParser.unaryExpressionNotPlusMinus_return();
        retval.start = input.LT(1);

        int unaryExpressionNotPlusMinus_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Not31=null;
        FelParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus32 =null;

        FelParser.primary_return primary33 =null;


        CommonTree Not31_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // D:\\129\\ws\\fel\\Fel.g:66:5: (| Not ^ unaryExpressionNotPlusMinus | primary )
            int alt11=3;
            switch ( input.LA(1) ) {
            case EOF:
            case And:
            case Colon:
            case Equals:
            case Multiplicative:
            case Or:
            case Ques:
            case Relational:
            case 35:
            case 36:
                {
                alt11=1;
                }
                break;
            case Additive:
                {
                int LA11_2 = input.LA(2);

                if ( (synpred11_Fel()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;

                }
                }
                break;
            case Not:
                {
                alt11=2;
                }
                break;
            case BooleanLiteral:
            case CharacterLiteral:
            case DecimalLiteral:
            case FloatingPointLiteral:
            case HexLiteral:
            case Identifier:
            case OctalLiteral:
            case StringLiteral:
            case 34:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }

            switch (alt11) {
                case 1 :
                    // D:\\129\\ws\\fel\\Fel.g:67:5: 
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    }
                    break;
                case 2 :
                    // D:\\129\\ws\\fel\\Fel.g:67:9: Not ^ unaryExpressionNotPlusMinus
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Not31=(Token)match(input,Not,FOLLOW_Not_in_unaryExpressionNotPlusMinus346); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Not31_tree = 
                    (CommonTree)adaptor.create(Not31)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Not31_tree, root_0);
                    }

                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpressionNotPlusMinus349);
                    unaryExpressionNotPlusMinus32=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus32.getTree());

                    }
                    break;
                case 3 :
                    // D:\\129\\ws\\fel\\Fel.g:68:9: primary
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus359);
                    primary33=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary33.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 11, unaryExpressionNotPlusMinus_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "unaryExpressionNotPlusMinus"


    public static class primary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary"
    // D:\\129\\ws\\fel\\Fel.g:71:1: primary : ( parExpression | literal ( Dot ^ selector )* | Identifier ( Dot ^ selector )* | Identifier ^ arguments );
    public final FelParser.primary_return primary() throws RecognitionException {
        FelParser.primary_return retval = new FelParser.primary_return();
        retval.start = input.LT(1);

        int primary_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Dot36=null;
        Token Identifier38=null;
        Token Dot39=null;
        Token Identifier41=null;
        FelParser.parExpression_return parExpression34 =null;

        FelParser.literal_return literal35 =null;

        FelParser.selector_return selector37 =null;

        FelParser.selector_return selector40 =null;

        FelParser.arguments_return arguments42 =null;


        CommonTree Dot36_tree=null;
        CommonTree Identifier38_tree=null;
        CommonTree Dot39_tree=null;
        CommonTree Identifier41_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // D:\\129\\ws\\fel\\Fel.g:72:5: ( parExpression | literal ( Dot ^ selector )* | Identifier ( Dot ^ selector )* | Identifier ^ arguments )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt14=1;
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
                alt14=2;
                }
                break;
            case Identifier:
                {
                int LA14_3 = input.LA(2);

                if ( (LA14_3==EOF||(LA14_3 >= Additive && LA14_3 <= And)||LA14_3==Colon||(LA14_3 >= Dot && LA14_3 <= Equals)||LA14_3==Multiplicative||(LA14_3 >= Or && LA14_3 <= Relational)||(LA14_3 >= 35 && LA14_3 <= 36)) ) {
                    alt14=3;
                }
                else if ( (LA14_3==34) ) {
                    alt14=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }

            switch (alt14) {
                case 1 :
                    // D:\\129\\ws\\fel\\Fel.g:72:7: parExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_parExpression_in_primary381);
                    parExpression34=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression34.getTree());

                    }
                    break;
                case 2 :
                    // D:\\129\\ws\\fel\\Fel.g:73:7: literal ( Dot ^ selector )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_literal_in_primary389);
                    literal35=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal35.getTree());

                    // D:\\129\\ws\\fel\\Fel.g:73:15: ( Dot ^ selector )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==Dot) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // D:\\129\\ws\\fel\\Fel.g:73:16: Dot ^ selector
                    	    {
                    	    Dot36=(Token)match(input,Dot,FOLLOW_Dot_in_primary392); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    Dot36_tree = 
                    	    (CommonTree)adaptor.create(Dot36)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(Dot36_tree, root_0);
                    	    }

                    	    pushFollow(FOLLOW_selector_in_primary395);
                    	    selector37=selector();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, selector37.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // D:\\129\\ws\\fel\\Fel.g:74:7: Identifier ( Dot ^ selector )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Identifier38=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary405); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier38_tree = 
                    (CommonTree)adaptor.create(Identifier38)
                    ;
                    adaptor.addChild(root_0, Identifier38_tree);
                    }

                    // D:\\129\\ws\\fel\\Fel.g:74:18: ( Dot ^ selector )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==Dot) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // D:\\129\\ws\\fel\\Fel.g:74:19: Dot ^ selector
                    	    {
                    	    Dot39=(Token)match(input,Dot,FOLLOW_Dot_in_primary408); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    Dot39_tree = 
                    	    (CommonTree)adaptor.create(Dot39)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(Dot39_tree, root_0);
                    	    }

                    	    pushFollow(FOLLOW_selector_in_primary411);
                    	    selector40=selector();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, selector40.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;
                case 4 :
                    // D:\\129\\ws\\fel\\Fel.g:75:7: Identifier ^ arguments
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Identifier41=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary421); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier41_tree = 
                    (CommonTree)adaptor.create(Identifier41)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Identifier41_tree, root_0);
                    }

                    pushFollow(FOLLOW_arguments_in_primary424);
                    arguments42=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments42.getTree());

                    if ( state.backtracking==0 ) {
                          	if((arguments42!=null?input.toString(arguments42.start,arguments42.stop):null)!=null){
                     	  //root_0 = new com.greenpineyu.fel.parser.FunNode(root_0);
                         	}
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
            if ( state.backtracking>0 ) { memoize(input, 12, primary_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "primary"


    public static class selector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selector"
    // D:\\129\\ws\\fel\\Fel.g:82:1: selector : Identifier ^ ( arguments )? ;
    public final FelParser.selector_return selector() throws RecognitionException {
        FelParser.selector_return retval = new FelParser.selector_return();
        retval.start = input.LT(1);

        int selector_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Identifier43=null;
        FelParser.arguments_return arguments44 =null;


        CommonTree Identifier43_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // D:\\129\\ws\\fel\\Fel.g:83:5: ( Identifier ^ ( arguments )? )
            // D:\\129\\ws\\fel\\Fel.g:83:6: Identifier ^ ( arguments )?
            {
            root_0 = (CommonTree)adaptor.nil();


            Identifier43=(Token)match(input,Identifier,FOLLOW_Identifier_in_selector447); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier43_tree = 
            (CommonTree)adaptor.create(Identifier43)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(Identifier43_tree, root_0);
            }

            // D:\\129\\ws\\fel\\Fel.g:83:18: ( arguments )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // D:\\129\\ws\\fel\\Fel.g:83:18: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_selector450);
                    arguments44=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments44.getTree());

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                 	if((arguments44!=null?input.toString(arguments44.start,arguments44.stop):null)!=null){
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
            if ( state.backtracking>0 ) { memoize(input, 13, selector_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "selector"


    public static class arguments_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arguments"
    // D:\\129\\ws\\fel\\Fel.g:91:1: arguments : '(' ! ( expressionList )? ')' !;
    public final FelParser.arguments_return arguments() throws RecognitionException {
        FelParser.arguments_return retval = new FelParser.arguments_return();
        retval.start = input.LT(1);

        int arguments_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal45=null;
        Token char_literal47=null;
        FelParser.expressionList_return expressionList46 =null;


        CommonTree char_literal45_tree=null;
        CommonTree char_literal47_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // D:\\129\\ws\\fel\\Fel.g:92:5: ( '(' ! ( expressionList )? ')' !)
            // D:\\129\\ws\\fel\\Fel.g:92:9: '(' ! ( expressionList )? ')' !
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal45=(Token)match(input,34,FOLLOW_34_in_arguments477); if (state.failed) return retval;

            // D:\\129\\ws\\fel\\Fel.g:92:14: ( expressionList )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0 >= Additive && LA16_0 <= BooleanLiteral)||LA16_0==CharacterLiteral||LA16_0==DecimalLiteral||LA16_0==Equals||LA16_0==FloatingPointLiteral||(LA16_0 >= HexLiteral && LA16_0 <= Identifier)||(LA16_0 >= Multiplicative && LA16_0 <= Not)||(LA16_0 >= OctalLiteral && LA16_0 <= StringLiteral)||LA16_0==34||LA16_0==36) ) {
                alt16=1;
            }
            else if ( (LA16_0==35) ) {
                int LA16_2 = input.LA(2);

                if ( (synpred19_Fel()) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // D:\\129\\ws\\fel\\Fel.g:92:14: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_arguments480);
                    expressionList46=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList46.getTree());

                    }
                    break;

            }


            char_literal47=(Token)match(input,35,FOLLOW_35_in_arguments483); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 14, arguments_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arguments"


    public static class literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literal"
    // D:\\129\\ws\\fel\\Fel.g:95:1: literal : ( ( Additive ^)? ( integerLiteral | FloatingPointLiteral ) | CharacterLiteral | StringLiteral | BooleanLiteral );
    public final FelParser.literal_return literal() throws RecognitionException {
        FelParser.literal_return retval = new FelParser.literal_return();
        retval.start = input.LT(1);

        int literal_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Additive48=null;
        Token FloatingPointLiteral50=null;
        Token CharacterLiteral51=null;
        Token StringLiteral52=null;
        Token BooleanLiteral53=null;
        FelParser.integerLiteral_return integerLiteral49 =null;


        CommonTree Additive48_tree=null;
        CommonTree FloatingPointLiteral50_tree=null;
        CommonTree CharacterLiteral51_tree=null;
        CommonTree StringLiteral52_tree=null;
        CommonTree BooleanLiteral53_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // D:\\129\\ws\\fel\\Fel.g:96:5: ( ( Additive ^)? ( integerLiteral | FloatingPointLiteral ) | CharacterLiteral | StringLiteral | BooleanLiteral )
            int alt19=4;
            switch ( input.LA(1) ) {
            case Additive:
            case DecimalLiteral:
            case FloatingPointLiteral:
            case HexLiteral:
            case OctalLiteral:
                {
                alt19=1;
                }
                break;
            case CharacterLiteral:
                {
                alt19=2;
                }
                break;
            case StringLiteral:
                {
                alt19=3;
                }
                break;
            case BooleanLiteral:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // D:\\129\\ws\\fel\\Fel.g:96:9: ( Additive ^)? ( integerLiteral | FloatingPointLiteral )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // D:\\129\\ws\\fel\\Fel.g:96:17: ( Additive ^)?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==Additive) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // D:\\129\\ws\\fel\\Fel.g:96:17: Additive ^
                            {
                            Additive48=(Token)match(input,Additive,FOLLOW_Additive_in_literal504); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            Additive48_tree = 
                            (CommonTree)adaptor.create(Additive48)
                            ;
                            root_0 = (CommonTree)adaptor.becomeRoot(Additive48_tree, root_0);
                            }

                            }
                            break;

                    }


                    // D:\\129\\ws\\fel\\Fel.g:96:19: ( integerLiteral | FloatingPointLiteral )
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==DecimalLiteral||LA18_0==HexLiteral||LA18_0==OctalLiteral) ) {
                        alt18=1;
                    }
                    else if ( (LA18_0==FloatingPointLiteral) ) {
                        alt18=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;

                    }
                    switch (alt18) {
                        case 1 :
                            // D:\\129\\ws\\fel\\Fel.g:96:20: integerLiteral
                            {
                            pushFollow(FOLLOW_integerLiteral_in_literal508);
                            integerLiteral49=integerLiteral();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, integerLiteral49.getTree());

                            }
                            break;
                        case 2 :
                            // D:\\129\\ws\\fel\\Fel.g:97:9: FloatingPointLiteral
                            {
                            FloatingPointLiteral50=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_literal518); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            FloatingPointLiteral50_tree = 
                            (CommonTree)adaptor.create(FloatingPointLiteral50)
                            ;
                            adaptor.addChild(root_0, FloatingPointLiteral50_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // D:\\129\\ws\\fel\\Fel.g:98:9: CharacterLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    CharacterLiteral51=(Token)match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_literal529); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CharacterLiteral51_tree = 
                    (CommonTree)adaptor.create(CharacterLiteral51)
                    ;
                    adaptor.addChild(root_0, CharacterLiteral51_tree);
                    }

                    }
                    break;
                case 3 :
                    // D:\\129\\ws\\fel\\Fel.g:99:9: StringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    StringLiteral52=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal539); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral52_tree = 
                    (CommonTree)adaptor.create(StringLiteral52)
                    ;
                    adaptor.addChild(root_0, StringLiteral52_tree);
                    }

                    }
                    break;
                case 4 :
                    // D:\\129\\ws\\fel\\Fel.g:100:9: BooleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    BooleanLiteral53=(Token)match(input,BooleanLiteral,FOLLOW_BooleanLiteral_in_literal549); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BooleanLiteral53_tree = 
                    (CommonTree)adaptor.create(BooleanLiteral53)
                    ;
                    adaptor.addChild(root_0, BooleanLiteral53_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 15, literal_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "literal"


    public static class integerLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "integerLiteral"
    // D:\\129\\ws\\fel\\Fel.g:102:1: integerLiteral : ( HexLiteral | OctalLiteral | DecimalLiteral );
    public final FelParser.integerLiteral_return integerLiteral() throws RecognitionException {
        FelParser.integerLiteral_return retval = new FelParser.integerLiteral_return();
        retval.start = input.LT(1);

        int integerLiteral_StartIndex = input.index();

        CommonTree root_0 = null;

        Token set54=null;

        CommonTree set54_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // D:\\129\\ws\\fel\\Fel.g:103:5: ( HexLiteral | OctalLiteral | DecimalLiteral )
            // D:\\129\\ws\\fel\\Fel.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set54=(Token)input.LT(1);

            if ( input.LA(1)==DecimalLiteral||input.LA(1)==HexLiteral||input.LA(1)==OctalLiteral ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set54)
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
            if ( state.backtracking>0 ) { memoize(input, 16, integerLiteral_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "integerLiteral"

    // $ANTLR start synpred1_Fel
    public final void synpred1_Fel_fragment() throws RecognitionException {
        // D:\\129\\ws\\fel\\Fel.g:19:9: ( conditionalExpression )
        // D:\\129\\ws\\fel\\Fel.g:19:9: conditionalExpression
        {
        pushFollow(FOLLOW_conditionalExpression_in_synpred1_Fel91);
        conditionalExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Fel

    // $ANTLR start synpred2_Fel
    public final void synpred2_Fel_fragment() throws RecognitionException {
        // D:\\129\\ws\\fel\\Fel.g:25:10: ( conditionalExpression )
        // D:\\129\\ws\\fel\\Fel.g:25:10: conditionalExpression
        {
        pushFollow(FOLLOW_conditionalExpression_in_synpred2_Fel108);
        conditionalExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Fel

    // $ANTLR start synpred11_Fel
    public final void synpred11_Fel_fragment() throws RecognitionException {
        // D:\\129\\ws\\fel\\Fel.g:67:5: ()
        // D:\\129\\ws\\fel\\Fel.g:67:5: 
        {
        }

    }
    // $ANTLR end synpred11_Fel

    // $ANTLR start synpred19_Fel
    public final void synpred19_Fel_fragment() throws RecognitionException {
        // D:\\129\\ws\\fel\\Fel.g:92:14: ( expressionList )
        // D:\\129\\ws\\fel\\Fel.g:92:14: expressionList
        {
        pushFollow(FOLLOW_expressionList_in_synpred19_Fel480);
        expressionList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred19_Fel

    // Delegated rules

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
    public final boolean synpred1_Fel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Fel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_Fel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_Fel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Fel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Fel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_conditionalExpression_in_program51 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_parExpression66 = new BitSet(new long[]{0x0000001C8B0D0550L});
    public static final BitSet FOLLOW_expressionList_in_parExpression69 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_parExpression71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_expressionList91 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_36_in_expressionList105 = new BitSet(new long[]{0x000000148B0D0552L});
    public static final BitSet FOLLOW_conditionalExpression_in_expressionList108 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression150 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_Ques_in_conditionalExpression154 = new BitSet(new long[]{0x000000048B0D0550L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression157 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Colon_in_conditionalExpression159 = new BitSet(new long[]{0x000000048B0D0550L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression178 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_Or_in_conditionalOrExpression181 = new BitSet(new long[]{0x000000048B0D0550L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression184 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression198 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_And_in_conditionalAndExpression201 = new BitSet(new long[]{0x000000048B0D0550L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression204 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression222 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_Equals_in_equalityExpression226 = new BitSet(new long[]{0x000000048B0D0550L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression229 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression251 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_Relational_in_relationalExpression255 = new BitSet(new long[]{0x000000048B0D0550L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression258 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression280 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_Additive_in_additiveExpression284 = new BitSet(new long[]{0x000000048B0D0550L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression287 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_multiplicativeExpression309 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_Multiplicative_in_multiplicativeExpression313 = new BitSet(new long[]{0x000000048B0D0550L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_multiplicativeExpression316 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_Not_in_unaryExpressionNotPlusMinus346 = new BitSet(new long[]{0x000000048A0D0550L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpressionNotPlusMinus349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_primary381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary389 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_Dot_in_primary392 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_selector_in_primary395 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_Identifier_in_primary405 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_Dot_in_primary408 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_selector_in_primary411 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_Identifier_in_primary421 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_arguments_in_primary424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_selector447 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_arguments_in_selector450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_arguments477 = new BitSet(new long[]{0x0000001C8B0D0550L});
    public static final BitSet FOLLOW_expressionList_in_arguments480 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_arguments483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Additive_in_literal504 = new BitSet(new long[]{0x0000000008050400L});
    public static final BitSet FOLLOW_integerLiteral_in_literal508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_literal518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharacterLiteral_in_literal529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BooleanLiteral_in_literal549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_synpred1_Fel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_synpred2_Fel108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_synpred19_Fel480 = new BitSet(new long[]{0x0000000000000002L});

}