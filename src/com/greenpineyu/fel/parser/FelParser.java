// $ANTLR 3.4 E:\\workspace\\Fel\\Fel.g 2011-09-15 22:15:08
package com.greenpineyu.fel.parser;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Additive", "And", "BooleanLiteral", "COMMENT", "CharacterLiteral", "Colon", "DecimalLiteral", "Dot", "Equals", "EscapeSequence", "Exponent", "FloatTypeSuffix", "FloatingPointLiteral", "HexDigit", "HexLiteral", "Identifier", "IntegerTypeSuffix", "JavaIDDigit", "LINE_COMMENT", "Letter", "Multiplicative", "OctalEscape", "OctalLiteral", "Or", "Ques", "Relational", "StringLiteral", "UnicodeEscape", "WS", "'('", "')'", "','"
    };

    public static final int EOF=-1;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
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
    public static final int OctalEscape=25;
    public static final int OctalLiteral=26;
    public static final int Or=27;
    public static final int Ques=28;
    public static final int Relational=29;
    public static final int StringLiteral=30;
    public static final int UnicodeEscape=31;
    public static final int WS=32;

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
        this.state.ruleMemo = new HashMap[39+1];
         

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


            char_literal2=(Token)match(input,33,FOLLOW_33_in_parExpression66); if (state.failed) return retval;

            pushFollow(FOLLOW_expressionList_in_parExpression69);
            expressionList3=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList3.getTree());

            char_literal4=(Token)match(input,34,FOLLOW_34_in_parExpression71); if (state.failed) return retval;

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
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Additive||LA1_0==BooleanLiteral||LA1_0==CharacterLiteral||LA1_0==DecimalLiteral||LA1_0==FloatingPointLiteral||(LA1_0 >= HexLiteral && LA1_0 <= Identifier)||LA1_0==OctalLiteral||LA1_0==StringLiteral||LA1_0==33) ) {
                alt1=1;
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

                if ( (LA3_0==35) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // E:\\workspace\\Fel\\Fel.g:25:5: ',' ! ( conditionalExpression )?
            	    {
            	    char_literal6=(Token)match(input,35,FOLLOW_35_in_expressionList105); if (state.failed) return retval;

            	    // E:\\workspace\\Fel\\Fel.g:25:10: ( conditionalExpression )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==Additive||LA2_0==BooleanLiteral||LA2_0==CharacterLiteral||LA2_0==DecimalLiteral||LA2_0==FloatingPointLiteral||(LA2_0 >= HexLiteral && LA2_0 <= Identifier)||LA2_0==OctalLiteral||LA2_0==StringLiteral||LA2_0==33) ) {
            	        alt2=1;
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
    // E:\\workspace\\Fel\\Fel.g:36:1: conditionalExpression : conditionalOrExpression ( Ques ^ conditionalExpression Colon conditionalExpression )? ;
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

            // E:\\workspace\\Fel\\Fel.g:37:5: ( conditionalOrExpression ( Ques ^ conditionalExpression Colon conditionalExpression )? )
            // E:\\workspace\\Fel\\Fel.g:37:9: conditionalOrExpression ( Ques ^ conditionalExpression Colon conditionalExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression150);
            conditionalOrExpression8=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpression8.getTree());

            // E:\\workspace\\Fel\\Fel.g:37:33: ( Ques ^ conditionalExpression Colon conditionalExpression )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Ques) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // E:\\workspace\\Fel\\Fel.g:37:35: Ques ^ conditionalExpression Colon conditionalExpression
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
                    if ( state.backtracking==0 ) {
                    Colon11_tree = 
                    (CommonTree)adaptor.create(Colon11)
                    ;
                    adaptor.addChild(root_0, Colon11_tree);
                    }

                    pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression161);
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


            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression177);
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
            	    Or14=(Token)match(input,Or,FOLLOW_Or_in_conditionalOrExpression180); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Or14_tree = 
            	    (CommonTree)adaptor.create(Or14)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Or14_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression183);
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


            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression197);
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
            	    And17=(Token)match(input,And,FOLLOW_And_in_conditionalAndExpression200); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    And17_tree = 
            	    (CommonTree)adaptor.create(And17)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(And17_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression203);
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


            pushFollow(FOLLOW_relationalExpression_in_equalityExpression221);
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
            	    Equals20=(Token)match(input,Equals,FOLLOW_Equals_in_equalityExpression225); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Equals20_tree = 
            	    (CommonTree)adaptor.create(Equals20)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Equals20_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression228);
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


            pushFollow(FOLLOW_additiveExpression_in_relationalExpression250);
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
            	    Relational23=(Token)match(input,Relational,FOLLOW_Relational_in_relationalExpression254); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Relational23_tree = 
            	    (CommonTree)adaptor.create(Relational23)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Relational23_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression257);
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


            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression279);
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
            	    Additive26=(Token)match(input,Additive,FOLLOW_Additive_in_additiveExpression283); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Additive26_tree = 
            	    (CommonTree)adaptor.create(Additive26)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Additive26_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression286);
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
    // E:\\workspace\\Fel\\Fel.g:59:1: multiplicativeExpression : primary ( Multiplicative ^ primary )* ;
    public final FelParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        FelParser.multiplicativeExpression_return retval = new FelParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        int multiplicativeExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Multiplicative29=null;
        FelParser.primary_return primary28 =null;

        FelParser.primary_return primary30 =null;


        CommonTree Multiplicative29_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:60:5: ( primary ( Multiplicative ^ primary )* )
            // E:\\workspace\\Fel\\Fel.g:60:9: primary ( Multiplicative ^ primary )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_primary_in_multiplicativeExpression308);
            primary28=primary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primary28.getTree());

            // E:\\workspace\\Fel\\Fel.g:60:17: ( Multiplicative ^ primary )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Multiplicative) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // E:\\workspace\\Fel\\Fel.g:60:19: Multiplicative ^ primary
            	    {
            	    Multiplicative29=(Token)match(input,Multiplicative,FOLLOW_Multiplicative_in_multiplicativeExpression312); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Multiplicative29_tree = 
            	    (CommonTree)adaptor.create(Multiplicative29)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Multiplicative29_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_primary_in_multiplicativeExpression315);
            	    primary30=primary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary30.getTree());

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


    public static class primary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary"
    // E:\\workspace\\Fel\\Fel.g:63:1: primary : ( parExpression | literal ( Dot ^ selector )* | Identifier ( Dot ^ selector )* | Identifier ^ arguments );
    public final FelParser.primary_return primary() throws RecognitionException {
        FelParser.primary_return retval = new FelParser.primary_return();
        retval.start = input.LT(1);

        int primary_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Dot33=null;
        Token Identifier35=null;
        Token Dot36=null;
        Token Identifier38=null;
        FelParser.parExpression_return parExpression31 =null;

        FelParser.literal_return literal32 =null;

        FelParser.selector_return selector34 =null;

        FelParser.selector_return selector37 =null;

        FelParser.arguments_return arguments39 =null;


        CommonTree Dot33_tree=null;
        CommonTree Identifier35_tree=null;
        CommonTree Dot36_tree=null;
        CommonTree Identifier38_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:64:5: ( parExpression | literal ( Dot ^ selector )* | Identifier ( Dot ^ selector )* | Identifier ^ arguments )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt13=1;
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
                alt13=2;
                }
                break;
            case Identifier:
                {
                int LA13_3 = input.LA(2);

                if ( (LA13_3==EOF||(LA13_3 >= Additive && LA13_3 <= And)||LA13_3==Colon||(LA13_3 >= Dot && LA13_3 <= Equals)||LA13_3==Multiplicative||(LA13_3 >= Or && LA13_3 <= Relational)||(LA13_3 >= 34 && LA13_3 <= 35)) ) {
                    alt13=3;
                }
                else if ( (LA13_3==33) ) {
                    alt13=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // E:\\workspace\\Fel\\Fel.g:64:7: parExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_parExpression_in_primary339);
                    parExpression31=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression31.getTree());

                    }
                    break;
                case 2 :
                    // E:\\workspace\\Fel\\Fel.g:65:7: literal ( Dot ^ selector )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_literal_in_primary347);
                    literal32=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal32.getTree());

                    // E:\\workspace\\Fel\\Fel.g:65:15: ( Dot ^ selector )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==Dot) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // E:\\workspace\\Fel\\Fel.g:65:16: Dot ^ selector
                    	    {
                    	    Dot33=(Token)match(input,Dot,FOLLOW_Dot_in_primary350); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    Dot33_tree = 
                    	    (CommonTree)adaptor.create(Dot33)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(Dot33_tree, root_0);
                    	    }

                    	    pushFollow(FOLLOW_selector_in_primary353);
                    	    selector34=selector();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, selector34.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // E:\\workspace\\Fel\\Fel.g:66:7: Identifier ( Dot ^ selector )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Identifier35=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary363); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier35_tree = 
                    (CommonTree)adaptor.create(Identifier35)
                    ;
                    adaptor.addChild(root_0, Identifier35_tree);
                    }

                    // E:\\workspace\\Fel\\Fel.g:66:18: ( Dot ^ selector )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==Dot) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // E:\\workspace\\Fel\\Fel.g:66:19: Dot ^ selector
                    	    {
                    	    Dot36=(Token)match(input,Dot,FOLLOW_Dot_in_primary366); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    Dot36_tree = 
                    	    (CommonTree)adaptor.create(Dot36)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(Dot36_tree, root_0);
                    	    }

                    	    pushFollow(FOLLOW_selector_in_primary369);
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
                case 4 :
                    // E:\\workspace\\Fel\\Fel.g:67:7: Identifier ^ arguments
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Identifier38=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary379); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier38_tree = 
                    (CommonTree)adaptor.create(Identifier38)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Identifier38_tree, root_0);
                    }

                    pushFollow(FOLLOW_arguments_in_primary382);
                    arguments39=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments39.getTree());

                    if ( state.backtracking==0 ) {
                          	if((arguments39!=null?input.toString(arguments39.start,arguments39.stop):null)!=null){
						root_0 = new com.greenpineyu.fel.parser.FunNode(root_0);
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
            if ( state.backtracking>0 ) { memoize(input, 11, primary_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "primary"


    public static class selector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "selector"
    // E:\\workspace\\Fel\\Fel.g:74:1: selector : Identifier ^ ( arguments )? ;
    public final FelParser.selector_return selector() throws RecognitionException {
        FelParser.selector_return retval = new FelParser.selector_return();
        retval.start = input.LT(1);

        int selector_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Identifier40=null;
        FelParser.arguments_return arguments41 =null;


        CommonTree Identifier40_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:75:5: ( Identifier ^ ( arguments )? )
            // E:\\workspace\\Fel\\Fel.g:75:6: Identifier ^ ( arguments )?
            {
            root_0 = (CommonTree)adaptor.nil();


            Identifier40=(Token)match(input,Identifier,FOLLOW_Identifier_in_selector405); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier40_tree = 
            (CommonTree)adaptor.create(Identifier40)
            ;
            root_0 = (CommonTree)adaptor.becomeRoot(Identifier40_tree, root_0);
            }

            // E:\\workspace\\Fel\\Fel.g:75:18: ( arguments )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // E:\\workspace\\Fel\\Fel.g:75:18: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_selector408);
                    arguments41=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments41.getTree());

                    }
                    break;

            }


            if ( state.backtracking==0 ) {
                 	if((arguments41!=null?input.toString(arguments41.start,arguments41.stop):null)!=null){
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
            if ( state.backtracking>0 ) { memoize(input, 12, selector_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "selector"


    public static class arguments_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arguments"
    // E:\\workspace\\Fel\\Fel.g:83:1: arguments : '(' ! ( expressionList )? ')' !;
    public final FelParser.arguments_return arguments() throws RecognitionException {
        FelParser.arguments_return retval = new FelParser.arguments_return();
        retval.start = input.LT(1);

        int arguments_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal42=null;
        Token char_literal44=null;
        FelParser.expressionList_return expressionList43 =null;


        CommonTree char_literal42_tree=null;
        CommonTree char_literal44_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:84:5: ( '(' ! ( expressionList )? ')' !)
            // E:\\workspace\\Fel\\Fel.g:84:9: '(' ! ( expressionList )? ')' !
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal42=(Token)match(input,33,FOLLOW_33_in_arguments435); if (state.failed) return retval;

            // E:\\workspace\\Fel\\Fel.g:84:14: ( expressionList )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==Additive||LA15_0==BooleanLiteral||LA15_0==CharacterLiteral||LA15_0==DecimalLiteral||LA15_0==FloatingPointLiteral||(LA15_0 >= HexLiteral && LA15_0 <= Identifier)||LA15_0==OctalLiteral||LA15_0==StringLiteral||LA15_0==33||LA15_0==35) ) {
                alt15=1;
            }
            else if ( (LA15_0==34) ) {
                int LA15_2 = input.LA(2);

                if ( (synpred17_Fel()) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // E:\\workspace\\Fel\\Fel.g:84:14: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_arguments438);
                    expressionList43=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList43.getTree());

                    }
                    break;

            }


            char_literal44=(Token)match(input,34,FOLLOW_34_in_arguments441); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 13, arguments_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arguments"


    public static class literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literal"
    // E:\\workspace\\Fel\\Fel.g:87:1: literal : ( ( Additive ^)? ( integerLiteral | FloatingPointLiteral ) | CharacterLiteral | StringLiteral | BooleanLiteral );
    public final FelParser.literal_return literal() throws RecognitionException {
        FelParser.literal_return retval = new FelParser.literal_return();
        retval.start = input.LT(1);

        int literal_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Additive45=null;
        Token FloatingPointLiteral47=null;
        Token CharacterLiteral48=null;
        Token StringLiteral49=null;
        Token BooleanLiteral50=null;
        FelParser.integerLiteral_return integerLiteral46 =null;


        CommonTree Additive45_tree=null;
        CommonTree FloatingPointLiteral47_tree=null;
        CommonTree CharacterLiteral48_tree=null;
        CommonTree StringLiteral49_tree=null;
        CommonTree BooleanLiteral50_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:88:5: ( ( Additive ^)? ( integerLiteral | FloatingPointLiteral ) | CharacterLiteral | StringLiteral | BooleanLiteral )
            int alt18=4;
            switch ( input.LA(1) ) {
            case Additive:
            case DecimalLiteral:
            case FloatingPointLiteral:
            case HexLiteral:
            case OctalLiteral:
                {
                alt18=1;
                }
                break;
            case CharacterLiteral:
                {
                alt18=2;
                }
                break;
            case StringLiteral:
                {
                alt18=3;
                }
                break;
            case BooleanLiteral:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // E:\\workspace\\Fel\\Fel.g:88:9: ( Additive ^)? ( integerLiteral | FloatingPointLiteral )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    // E:\\workspace\\Fel\\Fel.g:88:17: ( Additive ^)?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==Additive) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // E:\\workspace\\Fel\\Fel.g:88:17: Additive ^
                            {
                            Additive45=(Token)match(input,Additive,FOLLOW_Additive_in_literal462); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            Additive45_tree = 
                            (CommonTree)adaptor.create(Additive45)
                            ;
                            root_0 = (CommonTree)adaptor.becomeRoot(Additive45_tree, root_0);
                            }

                            }
                            break;

                    }


                    // E:\\workspace\\Fel\\Fel.g:88:19: ( integerLiteral | FloatingPointLiteral )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==DecimalLiteral||LA17_0==HexLiteral||LA17_0==OctalLiteral) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==FloatingPointLiteral) ) {
                        alt17=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;

                    }
                    switch (alt17) {
                        case 1 :
                            // E:\\workspace\\Fel\\Fel.g:88:20: integerLiteral
                            {
                            pushFollow(FOLLOW_integerLiteral_in_literal466);
                            integerLiteral46=integerLiteral();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, integerLiteral46.getTree());

                            }
                            break;
                        case 2 :
                            // E:\\workspace\\Fel\\Fel.g:89:9: FloatingPointLiteral
                            {
                            FloatingPointLiteral47=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_literal476); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            FloatingPointLiteral47_tree = 
                            (CommonTree)adaptor.create(FloatingPointLiteral47)
                            ;
                            adaptor.addChild(root_0, FloatingPointLiteral47_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // E:\\workspace\\Fel\\Fel.g:90:9: CharacterLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    CharacterLiteral48=(Token)match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_literal487); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CharacterLiteral48_tree = 
                    (CommonTree)adaptor.create(CharacterLiteral48)
                    ;
                    adaptor.addChild(root_0, CharacterLiteral48_tree);
                    }

                    }
                    break;
                case 3 :
                    // E:\\workspace\\Fel\\Fel.g:91:9: StringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    StringLiteral49=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal497); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral49_tree = 
                    (CommonTree)adaptor.create(StringLiteral49)
                    ;
                    adaptor.addChild(root_0, StringLiteral49_tree);
                    }

                    }
                    break;
                case 4 :
                    // E:\\workspace\\Fel\\Fel.g:92:9: BooleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    BooleanLiteral50=(Token)match(input,BooleanLiteral,FOLLOW_BooleanLiteral_in_literal507); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BooleanLiteral50_tree = 
                    (CommonTree)adaptor.create(BooleanLiteral50)
                    ;
                    adaptor.addChild(root_0, BooleanLiteral50_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 14, literal_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "literal"


    public static class integerLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "integerLiteral"
    // E:\\workspace\\Fel\\Fel.g:94:1: integerLiteral : ( HexLiteral | OctalLiteral | DecimalLiteral );
    public final FelParser.integerLiteral_return integerLiteral() throws RecognitionException {
        FelParser.integerLiteral_return retval = new FelParser.integerLiteral_return();
        retval.start = input.LT(1);

        int integerLiteral_StartIndex = input.index();

        CommonTree root_0 = null;

        Token set51=null;

        CommonTree set51_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:95:5: ( HexLiteral | OctalLiteral | DecimalLiteral )
            // E:\\workspace\\Fel\\Fel.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set51=(Token)input.LT(1);

            if ( input.LA(1)==DecimalLiteral||input.LA(1)==HexLiteral||input.LA(1)==OctalLiteral ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set51)
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
            if ( state.backtracking>0 ) { memoize(input, 15, integerLiteral_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "integerLiteral"

    // $ANTLR start synpred17_Fel
    public final void synpred17_Fel_fragment() throws RecognitionException {
        // E:\\workspace\\Fel\\Fel.g:84:14: ( expressionList )
        // E:\\workspace\\Fel\\Fel.g:84:14: expressionList
        {
        pushFollow(FOLLOW_expressionList_in_synpred17_Fel438);
        expressionList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred17_Fel

    // Delegated rules

    public final boolean synpred17_Fel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_Fel_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_33_in_parExpression66 = new BitSet(new long[]{0x0000000E440D0550L});
    public static final BitSet FOLLOW_expressionList_in_parExpression69 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_parExpression71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_expressionList91 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35_in_expressionList105 = new BitSet(new long[]{0x0000000A440D0552L});
    public static final BitSet FOLLOW_conditionalExpression_in_expressionList108 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression150 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_Ques_in_conditionalExpression154 = new BitSet(new long[]{0x00000002440D0550L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression157 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Colon_in_conditionalExpression159 = new BitSet(new long[]{0x00000002440D0550L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression177 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_Or_in_conditionalOrExpression180 = new BitSet(new long[]{0x00000002440D0550L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression183 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression197 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_And_in_conditionalAndExpression200 = new BitSet(new long[]{0x00000002440D0550L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression203 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression221 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_Equals_in_equalityExpression225 = new BitSet(new long[]{0x00000002440D0550L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression228 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression250 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_Relational_in_relationalExpression254 = new BitSet(new long[]{0x00000002440D0550L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression257 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression279 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_Additive_in_additiveExpression283 = new BitSet(new long[]{0x00000002440D0550L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression286 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_primary_in_multiplicativeExpression308 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_Multiplicative_in_multiplicativeExpression312 = new BitSet(new long[]{0x00000002440D0550L});
    public static final BitSet FOLLOW_primary_in_multiplicativeExpression315 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_parExpression_in_primary339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary347 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_Dot_in_primary350 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_selector_in_primary353 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_Identifier_in_primary363 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_Dot_in_primary366 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_selector_in_primary369 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_Identifier_in_primary379 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_arguments_in_primary382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_selector405 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_arguments_in_selector408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_arguments435 = new BitSet(new long[]{0x0000000E440D0550L});
    public static final BitSet FOLLOW_expressionList_in_arguments438 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_arguments441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Additive_in_literal462 = new BitSet(new long[]{0x0000000004050400L});
    public static final BitSet FOLLOW_integerLiteral_in_literal466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_literal476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharacterLiteral_in_literal487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BooleanLiteral_in_literal507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_synpred17_Fel438 = new BitSet(new long[]{0x0000000000000002L});

}