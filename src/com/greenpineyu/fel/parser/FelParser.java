// $ANTLR 3.4 E:\\workspace\\Fel\\Fel.g 2012-04-09 19:50:52

package com.greenpineyu.fel.parser;
//import com.greenpineyu.fel.exception.ParseException;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class FelParser extends org.antlr.runtime.Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Additive", "And", "BooleanLiteral", "Bracket", "COMMENT", "CharacterLiteral", "Colon", "DecimalLiteral", "Dot", "Equals", "EscapeSequence", "Exponent", "FloatTypeSuffix", "FloatingPointLiteral", "HexDigit", "HexLiteral", "Identifier", "IntegerTypeSuffix", "JavaIDDigit", "LINE_COMMENT", "Letter", "Multiplicative", "Not", "OctalEscape", "OctalLiteral", "Or", "Ques", "Relational", "StringLiteral", "UnicodeEscape", "WS", "'('", "')'", "','", "']'"
    };

    public static final int EOF=-1;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int Additive=4;
    public static final int And=5;
    public static final int BooleanLiteral=6;
    public static final int Bracket=7;
    public static final int COMMENT=8;
    public static final int CharacterLiteral=9;
    public static final int Colon=10;
    public static final int DecimalLiteral=11;
    public static final int Dot=12;
    public static final int Equals=13;
    public static final int EscapeSequence=14;
    public static final int Exponent=15;
    public static final int FloatTypeSuffix=16;
    public static final int FloatingPointLiteral=17;
    public static final int HexDigit=18;
    public static final int HexLiteral=19;
    public static final int Identifier=20;
    public static final int IntegerTypeSuffix=21;
    public static final int JavaIDDigit=22;
    public static final int LINE_COMMENT=23;
    public static final int Letter=24;
    public static final int Multiplicative=25;
    public static final int Not=26;
    public static final int OctalEscape=27;
    public static final int OctalLiteral=28;
    public static final int Or=29;
    public static final int Ques=30;
    public static final int Relational=31;
    public static final int StringLiteral=32;
    public static final int UnicodeEscape=33;
    public static final int WS=34;

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
        this.state.ruleMemo = new HashMap[46+1];
         

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
    // E:\\workspace\\Fel\\Fel.g:20:1: parExpression : '(' ! expressionList ')' !;
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


            char_literal2=(Token)match(input,35,FOLLOW_35_in_parExpression82); if (state.failed) return retval;

            pushFollow(FOLLOW_expressionList_in_parExpression85);
            expressionList3=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList3.getTree());

            char_literal4=(Token)match(input,36,FOLLOW_36_in_parExpression87); if (state.failed) return retval;

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
    // E:\\workspace\\Fel\\Fel.g:24:1: expressionList : ( conditionalExpression )? ( ',' ! ( conditionalExpression )? )* ;
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

            // E:\\workspace\\Fel\\Fel.g:25:5: ( ( conditionalExpression )? ( ',' ! ( conditionalExpression )? )* )
            // E:\\workspace\\Fel\\Fel.g:25:9: ( conditionalExpression )? ( ',' ! ( conditionalExpression )? )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // E:\\workspace\\Fel\\Fel.g:25:9: ( conditionalExpression )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Additive||LA1_0==BooleanLiteral||LA1_0==CharacterLiteral||LA1_0==DecimalLiteral||LA1_0==FloatingPointLiteral||(LA1_0 >= HexLiteral && LA1_0 <= Identifier)||LA1_0==Not||LA1_0==OctalLiteral||LA1_0==StringLiteral||LA1_0==35) ) {
                alt1=1;
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


            // E:\\workspace\\Fel\\Fel.g:31:4: ( ',' ! ( conditionalExpression )? )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==37) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // E:\\workspace\\Fel\\Fel.g:31:5: ',' ! ( conditionalExpression )?
            	    {
            	    char_literal6=(Token)match(input,37,FOLLOW_37_in_expressionList146); if (state.failed) return retval;

            	    // E:\\workspace\\Fel\\Fel.g:31:10: ( conditionalExpression )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==Additive||LA2_0==BooleanLiteral||LA2_0==CharacterLiteral||LA2_0==DecimalLiteral||LA2_0==FloatingPointLiteral||(LA2_0 >= HexLiteral && LA2_0 <= Identifier)||LA2_0==Not||LA2_0==OctalLiteral||LA2_0==StringLiteral||LA2_0==35) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
            	            // E:\\workspace\\Fel\\Fel.g:31:10: conditionalExpression
            	            {
            	            pushFollow(FOLLOW_conditionalExpression_in_expressionList149);
            	            conditionalExpression7=conditionalExpression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression7.getTree());

            	            }
            	            break;

            	    }


            	    if ( state.backtracking==0 ) {
            	            if(conditionalExpression5 == null){
            	                //在解析abc(,)会添加两个空节点，相当于abc(NULL_NODE,NULL_NODE)
            	                //下面的代码是添加第一个空节点。
            	                root_0.addChild(com.greenpineyu.fel.parser.AbstFelNode.NULL_NODE);
            	                conditionalExpression5 = new FelParser.conditionalExpression_return();
            	            }

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
    // E:\\workspace\\Fel\\Fel.g:49:1: conditionalExpression : conditionalOrExpression ( Ques ^ conditionalExpression Colon ! conditionalExpression )? ;
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

            // E:\\workspace\\Fel\\Fel.g:50:5: ( conditionalOrExpression ( Ques ^ conditionalExpression Colon ! conditionalExpression )? )
            // E:\\workspace\\Fel\\Fel.g:50:9: conditionalOrExpression ( Ques ^ conditionalExpression Colon ! conditionalExpression )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_conditionalOrExpression_in_conditionalExpression191);
            conditionalOrExpression8=conditionalOrExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalOrExpression8.getTree());

            // E:\\workspace\\Fel\\Fel.g:50:33: ( Ques ^ conditionalExpression Colon ! conditionalExpression )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Ques) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // E:\\workspace\\Fel\\Fel.g:50:35: Ques ^ conditionalExpression Colon ! conditionalExpression
                    {
                    Ques9=(Token)match(input,Ques,FOLLOW_Ques_in_conditionalExpression195); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Ques9_tree = 
                    (CommonTree)adaptor.create(Ques9)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Ques9_tree, root_0);
                    }

                    pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression198);
                    conditionalExpression10=conditionalExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression10.getTree());

                    Colon11=(Token)match(input,Colon,FOLLOW_Colon_in_conditionalExpression200); if (state.failed) return retval;

                    pushFollow(FOLLOW_conditionalExpression_in_conditionalExpression203);
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
    // E:\\workspace\\Fel\\Fel.g:52:1: conditionalOrExpression : conditionalAndExpression ( Or ^ conditionalAndExpression )* ;
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

            // E:\\workspace\\Fel\\Fel.g:53:2: ( conditionalAndExpression ( Or ^ conditionalAndExpression )* )
            // E:\\workspace\\Fel\\Fel.g:53:4: conditionalAndExpression ( Or ^ conditionalAndExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression219);
            conditionalAndExpression13=conditionalAndExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalAndExpression13.getTree());

            // E:\\workspace\\Fel\\Fel.g:53:29: ( Or ^ conditionalAndExpression )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Or) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // E:\\workspace\\Fel\\Fel.g:53:30: Or ^ conditionalAndExpression
            	    {
            	    Or14=(Token)match(input,Or,FOLLOW_Or_in_conditionalOrExpression222); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Or14_tree = 
            	    (CommonTree)adaptor.create(Or14)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Or14_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_conditionalAndExpression_in_conditionalOrExpression225);
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
    // E:\\workspace\\Fel\\Fel.g:56:1: conditionalAndExpression : equalityExpression ( And ^ equalityExpression )* ;
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

            // E:\\workspace\\Fel\\Fel.g:57:2: ( equalityExpression ( And ^ equalityExpression )* )
            // E:\\workspace\\Fel\\Fel.g:57:4: equalityExpression ( And ^ equalityExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression239);
            equalityExpression16=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression16.getTree());

            // E:\\workspace\\Fel\\Fel.g:57:23: ( And ^ equalityExpression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==And) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // E:\\workspace\\Fel\\Fel.g:57:24: And ^ equalityExpression
            	    {
            	    And17=(Token)match(input,And,FOLLOW_And_in_conditionalAndExpression242); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    And17_tree = 
            	    (CommonTree)adaptor.create(And17)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(And17_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_equalityExpression_in_conditionalAndExpression245);
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
    // E:\\workspace\\Fel\\Fel.g:60:1: equalityExpression : relationalExpression ( Equals ^ relationalExpression )* ;
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

            // E:\\workspace\\Fel\\Fel.g:61:5: ( relationalExpression ( Equals ^ relationalExpression )* )
            // E:\\workspace\\Fel\\Fel.g:61:9: relationalExpression ( Equals ^ relationalExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_relationalExpression_in_equalityExpression263);
            relationalExpression19=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression19.getTree());

            // E:\\workspace\\Fel\\Fel.g:61:30: ( Equals ^ relationalExpression )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Equals) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // E:\\workspace\\Fel\\Fel.g:61:32: Equals ^ relationalExpression
            	    {
            	    Equals20=(Token)match(input,Equals,FOLLOW_Equals_in_equalityExpression267); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Equals20_tree = 
            	    (CommonTree)adaptor.create(Equals20)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Equals20_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression270);
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
    // E:\\workspace\\Fel\\Fel.g:64:1: relationalExpression : additiveExpression ( Relational ^ additiveExpression )* ;
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

            // E:\\workspace\\Fel\\Fel.g:65:5: ( additiveExpression ( Relational ^ additiveExpression )* )
            // E:\\workspace\\Fel\\Fel.g:65:9: additiveExpression ( Relational ^ additiveExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_additiveExpression_in_relationalExpression292);
            additiveExpression22=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression22.getTree());

            // E:\\workspace\\Fel\\Fel.g:65:28: ( Relational ^ additiveExpression )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Relational) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // E:\\workspace\\Fel\\Fel.g:65:30: Relational ^ additiveExpression
            	    {
            	    Relational23=(Token)match(input,Relational,FOLLOW_Relational_in_relationalExpression296); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Relational23_tree = 
            	    (CommonTree)adaptor.create(Relational23)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Relational23_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression299);
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
    // E:\\workspace\\Fel\\Fel.g:68:1: additiveExpression : multiplicativeExpression ( Additive ^ multiplicativeExpression )* ;
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

            // E:\\workspace\\Fel\\Fel.g:69:5: ( multiplicativeExpression ( Additive ^ multiplicativeExpression )* )
            // E:\\workspace\\Fel\\Fel.g:69:9: multiplicativeExpression ( Additive ^ multiplicativeExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression321);
            multiplicativeExpression25=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression25.getTree());

            // E:\\workspace\\Fel\\Fel.g:69:34: ( Additive ^ multiplicativeExpression )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==Additive) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // E:\\workspace\\Fel\\Fel.g:69:35: Additive ^ multiplicativeExpression
            	    {
            	    Additive26=(Token)match(input,Additive,FOLLOW_Additive_in_additiveExpression324); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Additive26_tree = 
            	    (CommonTree)adaptor.create(Additive26)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Additive26_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression327);
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
    // E:\\workspace\\Fel\\Fel.g:72:1: multiplicativeExpression : unaryExpression ( Multiplicative ^ unaryExpression )* ;
    public final FelParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        FelParser.multiplicativeExpression_return retval = new FelParser.multiplicativeExpression_return();
        retval.start = input.LT(1);

        int multiplicativeExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Multiplicative29=null;
        FelParser.unaryExpression_return unaryExpression28 =null;

        FelParser.unaryExpression_return unaryExpression30 =null;


        CommonTree Multiplicative29_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:73:5: ( unaryExpression ( Multiplicative ^ unaryExpression )* )
            // E:\\workspace\\Fel\\Fel.g:73:9: unaryExpression ( Multiplicative ^ unaryExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression349);
            unaryExpression28=unaryExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression28.getTree());

            // E:\\workspace\\Fel\\Fel.g:73:25: ( Multiplicative ^ unaryExpression )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Multiplicative) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // E:\\workspace\\Fel\\Fel.g:73:27: Multiplicative ^ unaryExpression
            	    {
            	    Multiplicative29=(Token)match(input,Multiplicative,FOLLOW_Multiplicative_in_multiplicativeExpression353); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Multiplicative29_tree = 
            	    (CommonTree)adaptor.create(Multiplicative29)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Multiplicative29_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression356);
            	    unaryExpression30=unaryExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression30.getTree());

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
    // E:\\workspace\\Fel\\Fel.g:76:1: unaryExpression : ( Additive ^ unaryExpression | unaryExpressionNotPlusMinus );
    public final FelParser.unaryExpression_return unaryExpression() throws RecognitionException {
        FelParser.unaryExpression_return retval = new FelParser.unaryExpression_return();
        retval.start = input.LT(1);

        int unaryExpression_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Additive31=null;
        FelParser.unaryExpression_return unaryExpression32 =null;

        FelParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus33 =null;


        CommonTree Additive31_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:77:7: ( Additive ^ unaryExpression | unaryExpressionNotPlusMinus )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Additive) ) {
                alt11=1;
            }
            else if ( (LA11_0==BooleanLiteral||LA11_0==CharacterLiteral||LA11_0==DecimalLiteral||LA11_0==FloatingPointLiteral||(LA11_0 >= HexLiteral && LA11_0 <= Identifier)||LA11_0==Not||LA11_0==OctalLiteral||LA11_0==StringLiteral||LA11_0==35) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // E:\\workspace\\Fel\\Fel.g:77:9: Additive ^ unaryExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Additive31=(Token)match(input,Additive,FOLLOW_Additive_in_unaryExpression378); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Additive31_tree = 
                    (CommonTree)adaptor.create(Additive31)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Additive31_tree, root_0);
                    }

                    pushFollow(FOLLOW_unaryExpression_in_unaryExpression381);
                    unaryExpression32=unaryExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpression32.getTree());

                    }
                    break;
                case 2 :
                    // E:\\workspace\\Fel\\Fel.g:78:3: unaryExpressionNotPlusMinus
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression385);
                    unaryExpressionNotPlusMinus33=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus33.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 11, unaryExpression_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "unaryExpression"


    public static class unaryExpressionNotPlusMinus_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unaryExpressionNotPlusMinus"
    // E:\\workspace\\Fel\\Fel.g:81:1: unaryExpressionNotPlusMinus : ( Not ^ unaryExpressionNotPlusMinus | array ( Dot ^ parDot )* );
    public final FelParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus() throws RecognitionException {
        FelParser.unaryExpressionNotPlusMinus_return retval = new FelParser.unaryExpressionNotPlusMinus_return();
        retval.start = input.LT(1);

        int unaryExpressionNotPlusMinus_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Not34=null;
        Token Dot37=null;
        FelParser.unaryExpressionNotPlusMinus_return unaryExpressionNotPlusMinus35 =null;

        FelParser.array_return array36 =null;

        FelParser.parDot_return parDot38 =null;


        CommonTree Not34_tree=null;
        CommonTree Dot37_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:82:5: ( Not ^ unaryExpressionNotPlusMinus | array ( Dot ^ parDot )* )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Not) ) {
                alt13=1;
            }
            else if ( (LA13_0==BooleanLiteral||LA13_0==CharacterLiteral||LA13_0==DecimalLiteral||LA13_0==FloatingPointLiteral||(LA13_0 >= HexLiteral && LA13_0 <= Identifier)||LA13_0==OctalLiteral||LA13_0==StringLiteral||LA13_0==35) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // E:\\workspace\\Fel\\Fel.g:82:8: Not ^ unaryExpressionNotPlusMinus
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Not34=(Token)match(input,Not,FOLLOW_Not_in_unaryExpressionNotPlusMinus400); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Not34_tree = 
                    (CommonTree)adaptor.create(Not34)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Not34_tree, root_0);
                    }

                    pushFollow(FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpressionNotPlusMinus403);
                    unaryExpressionNotPlusMinus35=unaryExpressionNotPlusMinus();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryExpressionNotPlusMinus35.getTree());

                    }
                    break;
                case 2 :
                    // E:\\workspace\\Fel\\Fel.g:84:9: array ( Dot ^ parDot )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_array_in_unaryExpressionNotPlusMinus417);
                    array36=array();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, array36.getTree());

                    // E:\\workspace\\Fel\\Fel.g:84:15: ( Dot ^ parDot )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==Dot) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // E:\\workspace\\Fel\\Fel.g:84:16: Dot ^ parDot
                    	    {
                    	    Dot37=(Token)match(input,Dot,FOLLOW_Dot_in_unaryExpressionNotPlusMinus420); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    Dot37_tree = 
                    	    (CommonTree)adaptor.create(Dot37)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(Dot37_tree, root_0);
                    	    }

                    	    pushFollow(FOLLOW_parDot_in_unaryExpressionNotPlusMinus423);
                    	    parDot38=parDot();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parDot38.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
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
            if ( state.backtracking>0 ) { memoize(input, 12, unaryExpressionNotPlusMinus_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "unaryExpressionNotPlusMinus"


    public static class array_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array"
    // E:\\workspace\\Fel\\Fel.g:86:3: array : primary ( Bracket ^ conditionalExpression ']' !)* ;
    public final FelParser.array_return array() throws RecognitionException {
        FelParser.array_return retval = new FelParser.array_return();
        retval.start = input.LT(1);

        int array_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Bracket40=null;
        Token char_literal42=null;
        FelParser.primary_return primary39 =null;

        FelParser.conditionalExpression_return conditionalExpression41 =null;


        CommonTree Bracket40_tree=null;
        CommonTree char_literal42_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:87:3: ( primary ( Bracket ^ conditionalExpression ']' !)* )
            // E:\\workspace\\Fel\\Fel.g:87:6: primary ( Bracket ^ conditionalExpression ']' !)*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_primary_in_array444);
            primary39=primary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primary39.getTree());

            // E:\\workspace\\Fel\\Fel.g:87:14: ( Bracket ^ conditionalExpression ']' !)*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Bracket) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // E:\\workspace\\Fel\\Fel.g:87:15: Bracket ^ conditionalExpression ']' !
            	    {
            	    Bracket40=(Token)match(input,Bracket,FOLLOW_Bracket_in_array447); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Bracket40_tree = 
            	    (CommonTree)adaptor.create(Bracket40)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(Bracket40_tree, root_0);
            	    }

            	    pushFollow(FOLLOW_conditionalExpression_in_array450);
            	    conditionalExpression41=conditionalExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionalExpression41.getTree());

            	    char_literal42=(Token)match(input,38,FOLLOW_38_in_array452); if (state.failed) return retval;

            	    }
            	    break;

            	default :
            	    break loop14;
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
            if ( state.backtracking>0 ) { memoize(input, 13, array_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "array"


    public static class primary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "primary"
    // E:\\workspace\\Fel\\Fel.g:89:5: primary : ( parExpression | parDot ( Dot ^ parDot )* | literal );
    public final FelParser.primary_return primary() throws RecognitionException {
        FelParser.primary_return retval = new FelParser.primary_return();
        retval.start = input.LT(1);

        int primary_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Dot45=null;
        FelParser.parExpression_return parExpression43 =null;

        FelParser.parDot_return parDot44 =null;

        FelParser.parDot_return parDot46 =null;

        FelParser.literal_return literal47 =null;


        CommonTree Dot45_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:90:5: ( parExpression | parDot ( Dot ^ parDot )* | literal )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt16=1;
                }
                break;
            case Identifier:
                {
                alt16=2;
                }
                break;
            case StringLiteral:
                {
                int LA16_3 = input.LA(2);

                if ( (synpred17_Fel()) ) {
                    alt16=2;
                }
                else if ( (true) ) {
                    alt16=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 3, input);

                    throw nvae;

                }
                }
                break;
            case CharacterLiteral:
                {
                int LA16_4 = input.LA(2);

                if ( (synpred17_Fel()) ) {
                    alt16=2;
                }
                else if ( (true) ) {
                    alt16=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 4, input);

                    throw nvae;

                }
                }
                break;
            case BooleanLiteral:
            case DecimalLiteral:
            case FloatingPointLiteral:
            case HexLiteral:
            case OctalLiteral:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }

            switch (alt16) {
                case 1 :
                    // E:\\workspace\\Fel\\Fel.g:90:9: parExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_parExpression_in_primary476);
                    parExpression43=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression43.getTree());

                    }
                    break;
                case 2 :
                    // E:\\workspace\\Fel\\Fel.g:91:9: parDot ( Dot ^ parDot )*
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_parDot_in_primary496);
                    parDot44=parDot();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parDot44.getTree());

                    // E:\\workspace\\Fel\\Fel.g:91:16: ( Dot ^ parDot )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==Dot) ) {
                            switch ( input.LA(2) ) {
                            case Identifier:
                                {
                                int LA15_3 = input.LA(3);

                                if ( (synpred16_Fel()) ) {
                                    alt15=1;
                                }


                                }
                                break;
                            case StringLiteral:
                                {
                                int LA15_4 = input.LA(3);

                                if ( (synpred16_Fel()) ) {
                                    alt15=1;
                                }


                                }
                                break;
                            case CharacterLiteral:
                                {
                                int LA15_5 = input.LA(3);

                                if ( (synpred16_Fel()) ) {
                                    alt15=1;
                                }


                                }
                                break;

                            }

                        }


                        switch (alt15) {
                    	case 1 :
                    	    // E:\\workspace\\Fel\\Fel.g:91:17: Dot ^ parDot
                    	    {
                    	    Dot45=(Token)match(input,Dot,FOLLOW_Dot_in_primary499); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    Dot45_tree = 
                    	    (CommonTree)adaptor.create(Dot45)
                    	    ;
                    	    root_0 = (CommonTree)adaptor.becomeRoot(Dot45_tree, root_0);
                    	    }

                    	    pushFollow(FOLLOW_parDot_in_primary502);
                    	    parDot46=parDot();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, parDot46.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // E:\\workspace\\Fel\\Fel.g:92:7: literal
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_literal_in_primary513);
                    literal47=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal47.getTree());

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


    public static class parDot_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parDot"
    // E:\\workspace\\Fel\\Fel.g:102:5: parDot : ( identifierOrFun | StringLiteral | CharacterLiteral );
    public final FelParser.parDot_return parDot() throws RecognitionException {
        FelParser.parDot_return retval = new FelParser.parDot_return();
        retval.start = input.LT(1);

        int parDot_StartIndex = input.index();

        CommonTree root_0 = null;

        Token StringLiteral49=null;
        Token CharacterLiteral50=null;
        FelParser.identifierOrFun_return identifierOrFun48 =null;


        CommonTree StringLiteral49_tree=null;
        CommonTree CharacterLiteral50_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:103:5: ( identifierOrFun | StringLiteral | CharacterLiteral )
            int alt17=3;
            switch ( input.LA(1) ) {
            case Identifier:
                {
                alt17=1;
                }
                break;
            case StringLiteral:
                {
                alt17=2;
                }
                break;
            case CharacterLiteral:
                {
                alt17=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // E:\\workspace\\Fel\\Fel.g:103:7: identifierOrFun
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_identifierOrFun_in_parDot549);
                    identifierOrFun48=identifierOrFun();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, identifierOrFun48.getTree());

                    }
                    break;
                case 2 :
                    // E:\\workspace\\Fel\\Fel.g:104:7: StringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    StringLiteral49=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_parDot558); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral49_tree = 
                    (CommonTree)adaptor.create(StringLiteral49)
                    ;
                    adaptor.addChild(root_0, StringLiteral49_tree);
                    }

                    }
                    break;
                case 3 :
                    // E:\\workspace\\Fel\\Fel.g:105:7: CharacterLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    CharacterLiteral50=(Token)match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_parDot566); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CharacterLiteral50_tree = 
                    (CommonTree)adaptor.create(CharacterLiteral50)
                    ;
                    adaptor.addChild(root_0, CharacterLiteral50_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 15, parDot_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "parDot"


    public static class identifierOrFun_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "identifierOrFun"
    // E:\\workspace\\Fel\\Fel.g:108:5: identifierOrFun : ( Identifier | Identifier ^ arguments );
    public final FelParser.identifierOrFun_return identifierOrFun() throws RecognitionException {
        FelParser.identifierOrFun_return retval = new FelParser.identifierOrFun_return();
        retval.start = input.LT(1);

        int identifierOrFun_StartIndex = input.index();

        CommonTree root_0 = null;

        Token Identifier51=null;
        Token Identifier52=null;
        FelParser.arguments_return arguments53 =null;


        CommonTree Identifier51_tree=null;
        CommonTree Identifier52_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:109:6: ( Identifier | Identifier ^ arguments )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Identifier) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==EOF||(LA18_1 >= Additive && LA18_1 <= And)||LA18_1==Bracket||LA18_1==Colon||(LA18_1 >= Dot && LA18_1 <= Equals)||LA18_1==Multiplicative||(LA18_1 >= Or && LA18_1 <= Relational)||(LA18_1 >= 36 && LA18_1 <= 38)) ) {
                    alt18=1;
                }
                else if ( (LA18_1==35) ) {
                    alt18=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // E:\\workspace\\Fel\\Fel.g:109:8: Identifier
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Identifier51=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifierOrFun591); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier51_tree = 
                    (CommonTree)adaptor.create(Identifier51)
                    ;
                    adaptor.addChild(root_0, Identifier51_tree);
                    }

                    }
                    break;
                case 2 :
                    // E:\\workspace\\Fel\\Fel.g:110:9: Identifier ^ arguments
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    Identifier52=(Token)match(input,Identifier,FOLLOW_Identifier_in_identifierOrFun606); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier52_tree = 
                    (CommonTree)adaptor.create(Identifier52)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(Identifier52_tree, root_0);
                    }

                    pushFollow(FOLLOW_arguments_in_identifierOrFun609);
                    arguments53=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments53.getTree());

                    if ( state.backtracking==0 ) {
                         	if((arguments53!=null?input.toString(arguments53.start,arguments53.stop):null)!=null){
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
            if ( state.backtracking>0 ) { memoize(input, 16, identifierOrFun_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "identifierOrFun"


    public static class arguments_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arguments"
    // E:\\workspace\\Fel\\Fel.g:118:5: arguments : '(' ! ( expressionList )? ')' !;
    public final FelParser.arguments_return arguments() throws RecognitionException {
        FelParser.arguments_return retval = new FelParser.arguments_return();
        retval.start = input.LT(1);

        int arguments_StartIndex = input.index();

        CommonTree root_0 = null;

        Token char_literal54=null;
        Token char_literal56=null;
        FelParser.expressionList_return expressionList55 =null;


        CommonTree char_literal54_tree=null;
        CommonTree char_literal56_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:119:5: ( '(' ! ( expressionList )? ')' !)
            // E:\\workspace\\Fel\\Fel.g:119:9: '(' ! ( expressionList )? ')' !
            {
            root_0 = (CommonTree)adaptor.nil();


            char_literal54=(Token)match(input,35,FOLLOW_35_in_arguments644); if (state.failed) return retval;

            // E:\\workspace\\Fel\\Fel.g:119:14: ( expressionList )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Additive||LA19_0==BooleanLiteral||LA19_0==CharacterLiteral||LA19_0==DecimalLiteral||LA19_0==FloatingPointLiteral||(LA19_0 >= HexLiteral && LA19_0 <= Identifier)||LA19_0==Not||LA19_0==OctalLiteral||LA19_0==StringLiteral||LA19_0==35||LA19_0==37) ) {
                alt19=1;
            }
            else if ( (LA19_0==36) ) {
                int LA19_2 = input.LA(2);

                if ( (synpred21_Fel()) ) {
                    alt19=1;
                }
            }
            switch (alt19) {
                case 1 :
                    // E:\\workspace\\Fel\\Fel.g:119:14: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_arguments647);
                    expressionList55=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList55.getTree());

                    }
                    break;

            }


            char_literal56=(Token)match(input,36,FOLLOW_36_in_arguments650); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 17, arguments_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "arguments"


    public static class literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literal"
    // E:\\workspace\\Fel\\Fel.g:155:1: literal : ( integerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | BooleanLiteral );
    public final FelParser.literal_return literal() throws RecognitionException {
        FelParser.literal_return retval = new FelParser.literal_return();
        retval.start = input.LT(1);

        int literal_StartIndex = input.index();

        CommonTree root_0 = null;

        Token FloatingPointLiteral58=null;
        Token CharacterLiteral59=null;
        Token StringLiteral60=null;
        Token BooleanLiteral61=null;
        FelParser.integerLiteral_return integerLiteral57 =null;


        CommonTree FloatingPointLiteral58_tree=null;
        CommonTree CharacterLiteral59_tree=null;
        CommonTree StringLiteral60_tree=null;
        CommonTree BooleanLiteral61_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:156:5: ( integerLiteral | FloatingPointLiteral | CharacterLiteral | StringLiteral | BooleanLiteral )
            int alt20=5;
            switch ( input.LA(1) ) {
            case DecimalLiteral:
            case HexLiteral:
            case OctalLiteral:
                {
                alt20=1;
                }
                break;
            case FloatingPointLiteral:
                {
                alt20=2;
                }
                break;
            case CharacterLiteral:
                {
                alt20=3;
                }
                break;
            case StringLiteral:
                {
                alt20=4;
                }
                break;
            case BooleanLiteral:
                {
                alt20=5;
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
                    // E:\\workspace\\Fel\\Fel.g:156:9: integerLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_integerLiteral_in_literal689);
                    integerLiteral57=integerLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, integerLiteral57.getTree());

                    }
                    break;
                case 2 :
                    // E:\\workspace\\Fel\\Fel.g:157:9: FloatingPointLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    FloatingPointLiteral58=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_literal699); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    FloatingPointLiteral58_tree = 
                    (CommonTree)adaptor.create(FloatingPointLiteral58)
                    ;
                    adaptor.addChild(root_0, FloatingPointLiteral58_tree);
                    }

                    }
                    break;
                case 3 :
                    // E:\\workspace\\Fel\\Fel.g:158:9: CharacterLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    CharacterLiteral59=(Token)match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_literal709); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CharacterLiteral59_tree = 
                    (CommonTree)adaptor.create(CharacterLiteral59)
                    ;
                    adaptor.addChild(root_0, CharacterLiteral59_tree);
                    }

                    }
                    break;
                case 4 :
                    // E:\\workspace\\Fel\\Fel.g:159:9: StringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    StringLiteral60=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal719); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral60_tree = 
                    (CommonTree)adaptor.create(StringLiteral60)
                    ;
                    adaptor.addChild(root_0, StringLiteral60_tree);
                    }

                    }
                    break;
                case 5 :
                    // E:\\workspace\\Fel\\Fel.g:160:9: BooleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    BooleanLiteral61=(Token)match(input,BooleanLiteral,FOLLOW_BooleanLiteral_in_literal729); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BooleanLiteral61_tree = 
                    (CommonTree)adaptor.create(BooleanLiteral61)
                    ;
                    adaptor.addChild(root_0, BooleanLiteral61_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 18, literal_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "literal"


    public static class integerLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "integerLiteral"
    // E:\\workspace\\Fel\\Fel.g:162:1: integerLiteral : ( HexLiteral | OctalLiteral | DecimalLiteral );
    public final FelParser.integerLiteral_return integerLiteral() throws RecognitionException {
        FelParser.integerLiteral_return retval = new FelParser.integerLiteral_return();
        retval.start = input.LT(1);

        int integerLiteral_StartIndex = input.index();

        CommonTree root_0 = null;

        Token set62=null;

        CommonTree set62_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return retval; }

            // E:\\workspace\\Fel\\Fel.g:163:5: ( HexLiteral | OctalLiteral | DecimalLiteral )
            // E:\\workspace\\Fel\\Fel.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set62=(Token)input.LT(1);

            if ( input.LA(1)==DecimalLiteral||input.LA(1)==HexLiteral||input.LA(1)==OctalLiteral ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set62)
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
            if ( state.backtracking>0 ) { memoize(input, 19, integerLiteral_StartIndex); }

        }
        return retval;
    }
    // $ANTLR end "integerLiteral"

    // $ANTLR start synpred16_Fel
    public final void synpred16_Fel_fragment() throws RecognitionException {
        // E:\\workspace\\Fel\\Fel.g:91:17: ( Dot parDot )
        // E:\\workspace\\Fel\\Fel.g:91:17: Dot parDot
        {
        match(input,Dot,FOLLOW_Dot_in_synpred16_Fel499); if (state.failed) return ;

        pushFollow(FOLLOW_parDot_in_synpred16_Fel502);
        parDot();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred16_Fel

    // $ANTLR start synpred17_Fel
    public final void synpred17_Fel_fragment() throws RecognitionException {
        // E:\\workspace\\Fel\\Fel.g:91:9: ( parDot ( Dot parDot )* )
        // E:\\workspace\\Fel\\Fel.g:91:9: parDot ( Dot parDot )*
        {
        pushFollow(FOLLOW_parDot_in_synpred17_Fel496);
        parDot();

        state._fsp--;
        if (state.failed) return ;

        // E:\\workspace\\Fel\\Fel.g:91:16: ( Dot parDot )*
        loop22:
        do {
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==Dot) ) {
                alt22=1;
            }


            switch (alt22) {
        	case 1 :
        	    // E:\\workspace\\Fel\\Fel.g:91:17: Dot parDot
        	    {
        	    match(input,Dot,FOLLOW_Dot_in_synpred17_Fel499); if (state.failed) return ;

        	    pushFollow(FOLLOW_parDot_in_synpred17_Fel502);
        	    parDot();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop22;
            }
        } while (true);


        }

    }
    // $ANTLR end synpred17_Fel

    // $ANTLR start synpred21_Fel
    public final void synpred21_Fel_fragment() throws RecognitionException {
        // E:\\workspace\\Fel\\Fel.g:119:14: ( expressionList )
        // E:\\workspace\\Fel\\Fel.g:119:14: expressionList
        {
        pushFollow(FOLLOW_expressionList_in_synpred21_Fel647);
        expressionList();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred21_Fel

    // Delegated rules

    public final boolean synpred16_Fel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_Fel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_Fel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_Fel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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


 

    public static final BitSet FOLLOW_conditionalExpression_in_program67 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_parExpression82 = new BitSet(new long[]{0x00000039141A0A50L});
    public static final BitSet FOLLOW_expressionList_in_parExpression85 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_parExpression87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_expressionList107 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_expressionList146 = new BitSet(new long[]{0x00000029141A0A52L});
    public static final BitSet FOLLOW_conditionalExpression_in_expressionList149 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_conditionalOrExpression_in_conditionalExpression191 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_Ques_in_conditionalExpression195 = new BitSet(new long[]{0x00000009141A0A50L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression198 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_Colon_in_conditionalExpression200 = new BitSet(new long[]{0x00000009141A0A50L});
    public static final BitSet FOLLOW_conditionalExpression_in_conditionalExpression203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression219 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_Or_in_conditionalOrExpression222 = new BitSet(new long[]{0x00000009141A0A50L});
    public static final BitSet FOLLOW_conditionalAndExpression_in_conditionalOrExpression225 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression239 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_And_in_conditionalAndExpression242 = new BitSet(new long[]{0x00000009141A0A50L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalAndExpression245 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression263 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_Equals_in_equalityExpression267 = new BitSet(new long[]{0x00000009141A0A50L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression270 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression292 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_Relational_in_relationalExpression296 = new BitSet(new long[]{0x00000009141A0A50L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression299 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression321 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_Additive_in_additiveExpression324 = new BitSet(new long[]{0x00000009141A0A50L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression327 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression349 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_Multiplicative_in_multiplicativeExpression353 = new BitSet(new long[]{0x00000009141A0A50L});
    public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression356 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_Additive_in_unaryExpression378 = new BitSet(new long[]{0x00000009141A0A50L});
    public static final BitSet FOLLOW_unaryExpression_in_unaryExpression381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpression385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Not_in_unaryExpressionNotPlusMinus400 = new BitSet(new long[]{0x00000009141A0A40L});
    public static final BitSet FOLLOW_unaryExpressionNotPlusMinus_in_unaryExpressionNotPlusMinus403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_in_unaryExpressionNotPlusMinus417 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_Dot_in_unaryExpressionNotPlusMinus420 = new BitSet(new long[]{0x0000000100100200L});
    public static final BitSet FOLLOW_parDot_in_unaryExpressionNotPlusMinus423 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_primary_in_array444 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_Bracket_in_array447 = new BitSet(new long[]{0x00000009141A0A50L});
    public static final BitSet FOLLOW_conditionalExpression_in_array450 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_array452 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_parExpression_in_primary476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parDot_in_primary496 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_Dot_in_primary499 = new BitSet(new long[]{0x0000000100100200L});
    public static final BitSet FOLLOW_parDot_in_primary502 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_literal_in_primary513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifierOrFun_in_parDot549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_parDot558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharacterLiteral_in_parDot566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_identifierOrFun591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_identifierOrFun606 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_arguments_in_identifierOrFun609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_arguments644 = new BitSet(new long[]{0x00000039141A0A50L});
    public static final BitSet FOLLOW_expressionList_in_arguments647 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_arguments650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerLiteral_in_literal689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_literal699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharacterLiteral_in_literal709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BooleanLiteral_in_literal729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Dot_in_synpred16_Fel499 = new BitSet(new long[]{0x0000000100100200L});
    public static final BitSet FOLLOW_parDot_in_synpred16_Fel502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parDot_in_synpred17_Fel496 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_Dot_in_synpred17_Fel499 = new BitSet(new long[]{0x0000000100100200L});
    public static final BitSet FOLLOW_parDot_in_synpred17_Fel502 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_expressionList_in_synpred21_Fel647 = new BitSet(new long[]{0x0000000000000002L});

}