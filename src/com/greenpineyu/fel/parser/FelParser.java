package com.greenpineyu.fel.parser;

// $ANTLR 3.4 E:\\workspace\\Fel\\Fel.g 2011-09-17 07:15:11

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
        this.state.ruleMemo = new HashMap[45+1];
         

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
    // E:\\workspace\\Fel\\Fel.g:12:1: program : conditionalExpression ;
    public final FelParser.program_return program() throws RecognitionException {
        FelParser.program_return retval = new FelParser.program_return();
        retval.start = input.LT(1);

        int program_StartIndex = input.index();

        CommonTree root_0 = null;

        FelParser.conditionalExpression_return conditionalExpression1 =null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:12:9: ( conditionalExpression )
            // E:\\workspace\\Fel\\Fel.g:12:11: conditionalExpression
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
    // E:\\workspace\\Fel\\Fel.g:14:1: parExpression : '(' ! expressionList ')' !;
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

            // E:\\workspace\\Fel\\Fel.g:15:5: ( '(' ! expressionList ')' !)
            // E:\\workspace\\Fel\\Fel.g:15:9: '(' ! expressionList ')' !
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
    // E:\\workspace\\Fel\\Fel.g:18:1: expressionList : ( conditionalExpression )? ( ',' ! ( conditionalExpression )? )* ;
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

            // E:\\workspace\\Fel\\Fel.g:19:5: ( ( conditionalExpression )? ( ',' ! ( conditionalExpression )? )* )
            // E:\\workspace\\Fel\\Fel.g:19:9: ( conditionalExpression )? ( ',' ! ( conditionalExpression )? )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // E:\\workspace\\Fel\\Fel.g:19:9: ( conditionalExpression )?
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
                    // E:\\workspace\\Fel\\Fel.g:19:9: conditionalExpression
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
						root_0.addChild(com.greenpineyu.fel.parser.AbstFelNode.NULL_NODE);
                	}
                }

            // E:\\workspace\\Fel\\Fel.g:25:4: ( ',' ! ( conditionalExpression )? )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==36) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // E:\\workspace\\Fel\\Fel.g:25:5: ',' ! ( conditionalExpression )?
            	    {
            	    char_literal6=(Token)match(input,36,FOLLOW_36_in_expressionList105); if (state.failed) return retval;

            	    // E:\\workspace\\Fel\\Fel.g:25:10: ( conditionalExpression )?
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
            	            // E:\\workspace\\Fel\\Fel.g:25:10: conditionalExpression
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
    // E:\\workspace\\Fel\\Fel.g:36:1: conditionalExpression : conditionalOrExpression ( Ques ^ conditionalExpression Colon ! conditionalExpression )? ;
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

            // E:\\workspace\\Fel\\Fel.g:37:5: ( conditionalOrExpression ( Ques ^ conditionalExpression Colon ! conditionalExpression )? )
            // E:\\workspace\\Fel\\Fel.g:37:9: conditionalOrExpression ( Ques ^ conditionalExpression Colon ! conditionalExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression150);
            conditionalOrExpression8=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpression8.getTree());

            // E:\\workspace\\Fel\\Fel.g:37:33: ( Ques ^ conditionalExpression Colon ! conditionalExpression )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Ques) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // E:\\workspace\\Fel\\Fel.g:37:35: Ques ^ conditionalExpression Colon ! conditionalExpression
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
    // E:\\workspace\\Fel\\Fel.g:39:1: conditionalOrExpression : conditionalAndExpression ( Or ^ conditionalAndExpression )* ;
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

            // E:\\workspace\\Fel\\Fel.g:40:2: ( conditionalAndExpression ( Or ^ conditionalAndExpression )* )
            // E:\\workspace\\Fel\\Fel.g:40:4: conditionalAndExpression ( Or ^ conditionalAndExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression178);
            conditionalAndExpression13=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression13.getTree());

            // E:\\workspace\\Fel\\Fel.g:40:29: ( Or ^ conditionalAndExpression )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Or) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // E:\\workspace\\Fel\\Fel.g:40:30: Or ^ conditionalAndExpression
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
    // E:\\workspace\\Fel\\Fel.g:43:1: conditionalAndExpression : equalityExpression ( And ^ equalityExpression )* ;
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

            // E:\\workspace\\Fel\\Fel.g:44:2: ( equalityExpression ( And ^ equalityExpression )* )
            // E:\\workspace\\Fel\\Fel.g:44:4: equalityExpression ( And ^ equalityExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression198);
            equalityExpression16=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression16.getTree());

            // E:\\workspace\\Fel\\Fel.g:44:23: ( And ^ equalityExpression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==And) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // E:\\workspace\\Fel\\Fel.g:44:24: And ^ equalityExpression
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
    // E:\\workspace\\Fel\\Fel.g:47:1: equalityExpression : relationalExpression ( Equals ^ relationalExpression )* ;
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

            // E:\\workspace\\Fel\\Fel.g:48:5: ( relationalExpression ( Equals ^ relationalExpression )* )
            // E:\\workspace\\Fel\\Fel.g:48:9: relationalExpression ( Equals ^ relationalExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_relationalExpression_in_equalityExpression222);
            relationalExpression19=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression19.getTree());

            // E:\\workspace\\Fel\\Fel.g:48:30: ( Equals ^ relationalExpression )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Equals) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // E:\\workspace\\Fel\\Fel.g:48:32: Equals ^ relationalExpression
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
    // E:\\workspace\\Fel\\Fel.g:51:1: relationalExpression : additiveExpression ( Relational ^ additiveExpression )* ;
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

            // E:\\workspace\\Fel\\Fel.g:52:5: ( additiveExpression ( Relational ^ additiveExpression )* )
            // E:\\workspace\\Fel\\Fel.g:52:9: additiveExpression ( Relational ^ additiveExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_additiveExpression_in_relationalExpression251);
            additiveExpression22=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression22.getTree());

            // E:\\workspace\\Fel\\Fel.g:52:28: ( Relational ^ additiveExpression )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Relational) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // E:\\workspace\\Fel\\Fel.g:52:30: Relational ^ additiveExpression
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
    // E:\\workspace\\Fel\\Fel.g:55:1: additiveExpression : multiplicativeExpression ( Additive ^ multiplicativeExpression )* ;
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

            // E:\\workspace\\Fel\\Fel.g:56:5: ( multiplicativeExpression ( Additive ^ multiplicativeExpression )* )
            // E:\\workspace\\Fel\\Fel.g:56:9: multiplicativeExpression ( Additive ^ multiplicativeExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression280);
            multiplicativeExpression25=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression25.getTree());

            // E:\\workspace\\Fel\\Fel.g:56:34: ( Additive ^ multiplicativeExpression )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Additive) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // E:\\workspace\\Fel\\Fel.g:56:36: Additive ^ multiplicativeExpression
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
    // E:\\workspace\\Fel\\Fel.g:59:1: multiplicativeExpression : unaryExpressionNotPlusMinus ( Multiplicative ^ unaryExpressionNotPlusMinus )* ;
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

            // E:\\workspace\\Fel\\Fel.g:60:5: ( unaryExpressionNotPlusMinus ( Multiplicative ^ unaryExpressionNotPlusMinus )* )
            // E:\\workspace\\Fel\\Fel.g:60:9: unaryExpressionNotPlusMinus ( Multiplicative ^ unaryExpressionNotPlusMinus )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_multiplicativeExpression309);
            unaryExpressionNotPlusMinus28=unaryExpressionNotPlusMinus();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus28.getTree());

            // E:\\workspace\\Fel\\Fel.g:60:37: ( Multiplicative ^ unaryExpressionNotPlusMinus )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Multiplicative) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // E:\\workspace\\Fel\\Fel.g:60:39: Multiplicative ^ unaryExpressionNotPlusMinus
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
    // E:\\workspace\\Fel\\Fel.g:65:1: unaryExpressionNotPlusMinus : (| Not ^ unaryExpressionNotPlusMinus | dotExpression | primary | parExpression );
    public final FelParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
        FelParser.unaryExpressionNotPlusMinus_return retval = new FelParser.unaryExpressionNotPlusMinus_return();
        retval.start = input.LT(1);

        int unaryExpressionNotPlusMinus_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Not31=null;
        FelParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus32 =null;

        FelParser.dotExpression_return dotExpression33 =null;

        FelParser.primary_return primary34 =null;

        FelParser.parExpression_return parExpression35 =null;


        CommonTree Not31_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:66:5: (| Not ^ unaryExpressionNotPlusMinus | dotExpression | primary | parExpression )
            int alt11=5;
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
                else if ( (synpred13_Fel()) ) {
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
            case OctalLiteral:
            case StringLiteral:
                {
                alt11=3;
                }
                break;
            case Identifier:
                {
                int LA11_18 = input.LA(2);

                if ( (synpred13_Fel()) ) {
                    alt11=3;
                }
                else if ( (synpred14_Fel()) ) {
                    alt11=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 18, input);

                    throw nvae;

                }
                }
                break;
            case 34:
                {
                alt11=5;
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
                    // E:\\workspace\\Fel\\Fel.g:67:5: 
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    }
                    break;
                case 2 :
                    // E:\\workspace\\Fel\\Fel.g:67:9: Not ^ unaryExpressionNotPlusMinus
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
                    // E:\\workspace\\Fel\\Fel.g:68:9: dotExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_dotExpression_in_unaryExpressionNotPlusMinus359);
                    dotExpression33=dotExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, dotExpression33.getTree());

                    }
                    break;
                case 4 :
                    // E:\\workspace\\Fel\\Fel.g:69:9: primary
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_primary_in_unaryExpressionNotPlusMinus369);
                    primary34=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary34.getTree());

                    }
                    break;
                case 5 :
                    // E:\\workspace\\Fel\\Fel.g:70:9: parExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_parExpression_in_unaryExpressionNotPlusMinus380);
                    parExpression35=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression35.getTree());

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


    public static class dotExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dotExpression"
    // E:\\workspace\\Fel\\Fel.g:72:1: dotExpression : ( literal ( Dot ^ selector )* | primary ( Dot ^ primary )+ );
    public final FelParser.dotExpression_return dotExpression() throws RecognitionException {
        FelParser.dotExpression_return retval = new FelParser.dotExpression_return();
        retval.start = input.LT(1);

        int dotExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Dot37=null;
        Token Dot40=null;
        FelParser.literal_return literal36 =null;

        FelParser.selector_return selector38 =null;

        FelParser.primary_return primary39 =null;

        FelParser.primary_return primary41 =null;


        CommonTree Dot37_tree=null;
        CommonTree Dot40_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:73:2: ( literal ( Dot ^ selector )* | primary ( Dot ^ primary )+ )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Additive||LA14_0==BooleanLiteral||LA14_0==CharacterLiteral||LA14_0==DecimalLiteral||LA14_0==FloatingPointLiteral||LA14_0==HexLiteral||LA14_0==OctalLiteral||LA14_0==StringLiteral) ) {
                alt14=1;
            }
            else if ( (LA14_0==Identifier) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // E:\\workspace\\Fel\\Fel.g:74:5: literal ( Dot ^ selector )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_literal_in_dotExpression397);
                    literal36=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal36.getTree());

                    // E:\\workspace\\Fel\\Fel.g:74:14: ( Dot ^ selector )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==Dot) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // E:\\workspace\\Fel\\Fel.g:74:15: Dot ^ selector
                    	    {
                    	    Dot37=(Token)match(input,Dot,FOLLOW_Dot_in_dotExpression401); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    Dot37_tree = 
                    	    (CommonTree)adaptor.create(Dot37)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(Dot37_tree, root_0);
                    	    }

                    	    pushFollow(FOLLOW_selector_in_dotExpression404);
                    	    selector38=selector();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, selector38.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // E:\\workspace\\Fel\\Fel.g:75:5: primary ( Dot ^ primary )+
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_primary_in_dotExpression412);
                    primary39=primary();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary39.getTree());

                    // E:\\workspace\\Fel\\Fel.g:75:14: ( Dot ^ primary )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==Dot) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // E:\\workspace\\Fel\\Fel.g:75:15: Dot ^ primary
                    	    {
                    	    Dot40=(Token)match(input,Dot,FOLLOW_Dot_in_dotExpression416); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    Dot40_tree = 
                    	    (CommonTree)adaptor.create(Dot40)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(Dot40_tree, root_0);
                    	    }

                    	    pushFollow(FOLLOW_primary_in_dotExpression419);
                    	    primary41=primary();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary41.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
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
            if ( state.backtracking>0 ) { memoize(input, 12, dotExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "dotExpression"


    public static class funExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funExpression"
    // E:\\workspace\\Fel\\Fel.g:79:1: funExpression : Identifier ^ arguments ;
    public final FelParser.funExpression_return funExpression() throws RecognitionException {
        FelParser.funExpression_return retval = new FelParser.funExpression_return();
        retval.start = input.LT(1);

        int funExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Identifier42=null;
        FelParser.arguments_return arguments43 =null;


        CommonTree Identifier42_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:80:5: ( Identifier ^ arguments )
            // E:\\workspace\\Fel\\Fel.g:80:6: Identifier ^ arguments
            {
            root_0 = (CommonTree)adaptor.nil();


            Identifier42=(Token)match(input,Identifier,FOLLOW_Identifier_in_funExpression440); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier42_tree = 
            (CommonTree)adaptor.create(Identifier42)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(Identifier42_tree, root_0);
            }

            pushFollow(FOLLOW_arguments_in_funExpression443);
            arguments43=arguments();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments43.getTree());

            if ( state.backtracking==0 ) {
                 	if((arguments43!=null?input.toString(arguments43.start,arguments43.stop):null)!=null){
						root_0 = new com.greenpineyu.fel.parser.FunNode(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 13, funExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "funExpression"


    public static class primary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary"
    // E:\\workspace\\Fel\\Fel.g:87:1: primary : ( Identifier | funExpression );
    public final FelParser.primary_return primary() throws RecognitionException {
        FelParser.primary_return retval = new FelParser.primary_return();
        retval.start = input.LT(1);

        int primary_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Identifier44=null;
        FelParser.funExpression_return funExpression45 =null;


        CommonTree Identifier44_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:88:6: ( Identifier | funExpression )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Identifier) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==EOF||(LA15_1 >= Additive && LA15_1 <= And)||LA15_1==Colon||(LA15_1 >= Dot && LA15_1 <= Equals)||LA15_1==Multiplicative||(LA15_1 >= Or && LA15_1 <= Relational)||(LA15_1 >= 35 && LA15_1 <= 36)) ) {
                    alt15=1;
                }
                else if ( (LA15_1==34) ) {
                    alt15=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // E:\\workspace\\Fel\\Fel.g:89:5: Identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Identifier44=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary476); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier44_tree = 
                    (CommonTree)adaptor.create(Identifier44)
                    ;
                    adaptor.addChild(root_0, Identifier44_tree);
                    }

                    }
                    break;
                case 2 :
                    // E:\\workspace\\Fel\\Fel.g:90:7: funExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_funExpression_in_primary484);
                    funExpression45=funExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, funExpression45.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 14, primary_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "primary"


    public static class selector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selector"
    // E:\\workspace\\Fel\\Fel.g:93:1: selector : Identifier ^ ( arguments )? ;
    public final FelParser.selector_return selector() throws RecognitionException {
        FelParser.selector_return retval = new FelParser.selector_return();
        retval.start = input.LT(1);

        int selector_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Identifier46=null;
        FelParser.arguments_return arguments47 =null;


        CommonTree Identifier46_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:94:5: ( Identifier ^ ( arguments )? )
            // E:\\workspace\\Fel\\Fel.g:94:6: Identifier ^ ( arguments )?
            {
            root_0 = (CommonTree)adaptor.nil();


            Identifier46=(Token)match(input,Identifier,FOLLOW_Identifier_in_selector501); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier46_tree = 
            (CommonTree)adaptor.create(Identifier46)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(Identifier46_tree, root_0);
            }

            // E:\\workspace\\Fel\\Fel.g:94:18: ( arguments )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==34) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // E:\\workspace\\Fel\\Fel.g:94:18: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_selector504);
                    arguments47=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments47.getTree());

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                 	if((arguments47!=null?input.toString(arguments47.start,arguments47.stop):null)!=null){
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
            if ( state.backtracking>0 ) { memoize(input, 15, selector_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "selector"


    public static class arguments_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arguments"
    // E:\\workspace\\Fel\\Fel.g:102:1: arguments : '(' ! ( expressionList )? ')' !;
    public final FelParser.arguments_return arguments() throws RecognitionException {
        FelParser.arguments_return retval = new FelParser.arguments_return();
        retval.start = input.LT(1);

        int arguments_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal48=null;
        Token char_literal50=null;
        FelParser.expressionList_return expressionList49 =null;


        CommonTree char_literal48_tree=null;
        CommonTree char_literal50_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:103:5: ( '(' ! ( expressionList )? ')' !)
            // E:\\workspace\\Fel\\Fel.g:103:9: '(' ! ( expressionList )? ')' !
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal48=(Token)match(input,34,FOLLOW_34_in_arguments531); if (state.failed) return retval;

            // E:\\workspace\\Fel\\Fel.g:103:14: ( expressionList )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0 >= Additive && LA17_0 <= BooleanLiteral)||LA17_0==CharacterLiteral||LA17_0==DecimalLiteral||LA17_0==Equals||LA17_0==FloatingPointLiteral||(LA17_0 >= HexLiteral && LA17_0 <= Identifier)||(LA17_0 >= Multiplicative && LA17_0 <= Not)||(LA17_0 >= OctalLiteral && LA17_0 <= StringLiteral)||LA17_0==34||LA17_0==36) ) {
                alt17=1;
            }
            else if ( (LA17_0==35) ) {
                int LA17_2 = input.LA(2);

                if ( (synpred20_Fel()) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // E:\\workspace\\Fel\\Fel.g:103:14: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_arguments534);
                    expressionList49=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList49.getTree());

                    }
                    break;

            }


            char_literal50=(Token)match(input,35,FOLLOW_35_in_arguments537); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 16, arguments_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arguments"


    public static class literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literal"
    // E:\\workspace\\Fel\\Fel.g:106:1: literal : ( ( Additive ^)? ( integerLiteral | FloatingPointLiteral ) | CharacterLiteral | StringLiteral | BooleanLiteral );
    public final FelParser.literal_return literal() throws RecognitionException {
        FelParser.literal_return retval = new FelParser.literal_return();
        retval.start = input.LT(1);

        int literal_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Additive51=null;
        Token FloatingPointLiteral53=null;
        Token CharacterLiteral54=null;
        Token StringLiteral55=null;
        Token BooleanLiteral56=null;
        FelParser.integerLiteral_return integerLiteral52 =null;


        CommonTree Additive51_tree=null;
        CommonTree FloatingPointLiteral53_tree=null;
        CommonTree CharacterLiteral54_tree=null;
        CommonTree StringLiteral55_tree=null;
        CommonTree BooleanLiteral56_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:107:5: ( ( Additive ^)? ( integerLiteral | FloatingPointLiteral ) | CharacterLiteral | StringLiteral | BooleanLiteral )
            int alt20=4;
            switch ( input.LA(1) ) {
            case Additive:
            case DecimalLiteral:
            case FloatingPointLiteral:
            case HexLiteral:
            case OctalLiteral:
                {
                alt20=1;
                }
                break;
            case CharacterLiteral:
                {
                alt20=2;
                }
                break;
            case StringLiteral:
                {
                alt20=3;
                }
                break;
            case BooleanLiteral:
                {
                alt20=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }

            switch (alt20) {
                case 1 :
                    // E:\\workspace\\Fel\\Fel.g:107:9: ( Additive ^)? ( integerLiteral | FloatingPointLiteral )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // E:\\workspace\\Fel\\Fel.g:107:17: ( Additive ^)?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==Additive) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // E:\\workspace\\Fel\\Fel.g:107:17: Additive ^
                            {
                            Additive51=(Token)match(input,Additive,FOLLOW_Additive_in_literal558); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            Additive51_tree = 
                            (CommonTree)adaptor.create(Additive51)
                            ;
                            root_0 = (CommonTree)adaptor.becomeRoot(Additive51_tree, root_0);
                            }

                            }
                            break;

                    }


                    // E:\\workspace\\Fel\\Fel.g:107:19: ( integerLiteral | FloatingPointLiteral )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==DecimalLiteral||LA19_0==HexLiteral||LA19_0==OctalLiteral) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==FloatingPointLiteral) ) {
                        alt19=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;

                    }
                    switch (alt19) {
                        case 1 :
                            // E:\\workspace\\Fel\\Fel.g:107:20: integerLiteral
                            {
                            pushFollow(FOLLOW_integerLiteral_in_literal562);
                            integerLiteral52=integerLiteral();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, integerLiteral52.getTree());

                            }
                            break;
                        case 2 :
                            // E:\\workspace\\Fel\\Fel.g:108:9: FloatingPointLiteral
                            {
                            FloatingPointLiteral53=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_literal572); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            FloatingPointLiteral53_tree = 
                            (CommonTree)adaptor.create(FloatingPointLiteral53)
                            ;
                            adaptor.addChild(root_0, FloatingPointLiteral53_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\workspace\\Fel\\Fel.g:109:9: CharacterLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    CharacterLiteral54=(Token)match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_literal583); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CharacterLiteral54_tree = 
                    (CommonTree)adaptor.create(CharacterLiteral54)
                    ;
                    adaptor.addChild(root_0, CharacterLiteral54_tree);
                    }

                    }
                    break;
                case 3 :
                    // E:\\workspace\\Fel\\Fel.g:110:9: StringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    StringLiteral55=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal593); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral55_tree = 
                    (CommonTree)adaptor.create(StringLiteral55)
                    ;
                    adaptor.addChild(root_0, StringLiteral55_tree);
                    }

                    }
                    break;
                case 4 :
                    // E:\\workspace\\Fel\\Fel.g:111:9: BooleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    BooleanLiteral56=(Token)match(input,BooleanLiteral,FOLLOW_BooleanLiteral_in_literal603); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BooleanLiteral56_tree = 
                    (CommonTree)adaptor.create(BooleanLiteral56)
                    ;
                    adaptor.addChild(root_0, BooleanLiteral56_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 17, literal_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "literal"


    public static class integerLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "integerLiteral"
    // E:\\workspace\\Fel\\Fel.g:113:1: integerLiteral : ( HexLiteral | OctalLiteral | DecimalLiteral );
    public final FelParser.integerLiteral_return integerLiteral() throws RecognitionException {
        FelParser.integerLiteral_return retval = new FelParser.integerLiteral_return();
        retval.start = input.LT(1);

        int integerLiteral_StartIndex = input.index();

        CommonTree root_0 = null;

        Token set57=null;

        CommonTree set57_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:114:5: ( HexLiteral | OctalLiteral | DecimalLiteral )
            // E:\\workspace\\Fel\\Fel.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set57=(Token)input.LT(1);

            if ( input.LA(1)==DecimalLiteral||input.LA(1)==HexLiteral||input.LA(1)==OctalLiteral ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set57)
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
            if ( state.backtracking>0 ) { memoize(input, 18, integerLiteral_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "integerLiteral"

    // $ANTLR start synpred1_Fel
    public final void synpred1_Fel_fragment() throws RecognitionException {
        // E:\\workspace\\Fel\\Fel.g:19:9: ( conditionalExpression )
        // E:\\workspace\\Fel\\Fel.g:19:9: conditionalExpression
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
        // E:\\workspace\\Fel\\Fel.g:25:10: ( conditionalExpression )
        // E:\\workspace\\Fel\\Fel.g:25:10: conditionalExpression
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
        // E:\\workspace\\Fel\\Fel.g:67:5: ()
        // E:\\workspace\\Fel\\Fel.g:67:5: 
        {
        }

    }
    // $ANTLR end synpred11_Fel

    // $ANTLR start synpred13_Fel
    public final void synpred13_Fel_fragment() throws RecognitionException {
        // E:\\workspace\\Fel\\Fel.g:68:9: ( dotExpression )
        // E:\\workspace\\Fel\\Fel.g:68:9: dotExpression
        {
        pushFollow(FOLLOW_dotExpression_in_synpred13_Fel359);
        dotExpression();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred13_Fel

    // $ANTLR start synpred14_Fel
    public final void synpred14_Fel_fragment() throws RecognitionException {
        // E:\\workspace\\Fel\\Fel.g:69:9: ( primary )
        // E:\\workspace\\Fel\\Fel.g:69:9: primary
        {
        pushFollow(FOLLOW_primary_in_synpred14_Fel369);
        primary();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred14_Fel

    // $ANTLR start synpred20_Fel
    public final void synpred20_Fel_fragment() throws RecognitionException {
        // E:\\workspace\\Fel\\Fel.g:103:14: ( expressionList )
        // E:\\workspace\\Fel\\Fel.g:103:14: expressionList
        {
        pushFollow(FOLLOW_expressionList_in_synpred20_Fel534);
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
    public static final BitSet FOLLOW_dotExpression_in_unaryExpressionNotPlusMinus359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_unaryExpressionNotPlusMinus369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parExpression_in_unaryExpressionNotPlusMinus380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_dotExpression397 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_Dot_in_dotExpression401 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_selector_in_dotExpression404 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_primary_in_dotExpression412 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_Dot_in_dotExpression416 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_primary_in_dotExpression419 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_Identifier_in_funExpression440 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_arguments_in_funExpression443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_primary476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funExpression_in_primary484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_selector501 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_arguments_in_selector504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_arguments531 = new BitSet(new long[]{0x0000001C8B0D0550L});
    public static final BitSet FOLLOW_expressionList_in_arguments534 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_arguments537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Additive_in_literal558 = new BitSet(new long[]{0x0000000008050400L});
    public static final BitSet FOLLOW_integerLiteral_in_literal562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_literal572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharacterLiteral_in_literal583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BooleanLiteral_in_literal603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_synpred1_Fel91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_synpred2_Fel108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dotExpression_in_synpred13_Fel359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_primary_in_synpred14_Fel369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_synpred20_Fel534 = new BitSet(new long[]{0x0000000000000002L});

}