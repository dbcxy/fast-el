package com.greenpineyu.fel.parser;

// $ANTLR 3.3 Nov 30, 2010 12:45:30 fel.g 2011-03-16 09:26:30

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

public class FelParser extends AbstFelParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Logical", "Equals", "Relational", "Additive", "Multiplicative", "Identifier", "Dot", "FloatingPointLiteral", "CharacterLiteral", "StringLiteral", "BooleanLiteral", "HexLiteral", "OctalLiteral", "DecimalLiteral", "HexDigit", "IntegerTypeSuffix", "Exponent", "FloatTypeSuffix", "EscapeSequence", "UnicodeEscape", "OctalEscape", "Letter", "JavaIDDigit", "WS", "COMMENT", "LINE_COMMENT", "'('", "')'", "','"
    };
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


        public FelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public FelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
            this.state.ruleMemo = new HashMap[34+1];
             
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return FelParser.tokenNames; }

	public String getGrammarFileName() {
		return "fel.g";
	}


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
	// fel.g:12:1: program : conditionalExpression ;
    public final FelParser.program_return program() throws RecognitionException {
        FelParser.program_return retval = new FelParser.program_return();
        retval.start = input.LT(1);
        int program_StartIndex = input.index();
        CommonTree root_0 = null;

        FelParser.conditionalExpression_return conditionalExpression1 = null;



        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return retval; }
			// fel.g:12:9: ( conditionalExpression )
			// fel.g:12:11: conditionalExpression
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
	// fel.g:14:1: parExpression : '(' expressionList ')' ;
    public final FelParser.parExpression_return parExpression() throws RecognitionException {
        FelParser.parExpression_return retval = new FelParser.parExpression_return();
        retval.start = input.LT(1);
        int parExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal2=null;
        Token char_literal4=null;
        FelParser.expressionList_return expressionList3 = null;


        CommonTree char_literal2_tree=null;
        CommonTree char_literal4_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }
			// fel.g:15:5: ( '(' expressionList ')' )
			// fel.g:15:9: '(' expressionList ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal2=(Token)match(input,30,FOLLOW_30_in_parExpression66); if (state.failed) return retval;
            pushFollow(FOLLOW_expressionList_in_parExpression69);
            expressionList3=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList3.getTree());
            char_literal4=(Token)match(input,31,FOLLOW_31_in_parExpression71); if (state.failed) return retval;

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
	// fel.g:18:1: expressionList : ( conditionalExpression )? ( ',' ( conditionalExpression )? )* ;
    public final FelParser.expressionList_return expressionList() throws RecognitionException {
        FelParser.expressionList_return retval = new FelParser.expressionList_return();
        retval.start = input.LT(1);
        int expressionList_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal6=null;
        FelParser.conditionalExpression_return conditionalExpression5 = null;

        FelParser.conditionalExpression_return conditionalExpression7 = null;


        CommonTree char_literal6_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }
			// fel.g:19:5: ( ( conditionalExpression )? ( ',' ( conditionalExpression )? )* )
			// fel.g:19:9: ( conditionalExpression )? ( ',' ( conditionalExpression )? )*
            {
            root_0 = (CommonTree)adaptor.nil();

				// fel.g:19:9: ( conditionalExpression )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Additive||LA1_0==Identifier||(LA1_0>=FloatingPointLiteral && LA1_0<=DecimalLiteral)||LA1_0==30) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
						// fel.g:0:0: conditionalExpression
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
                   	    root_0.addChild(com.greenpineyu.fel.parser.FelNodeImpl.NULL_NODE);
                  	}
                  
            }
				// fel.g:25:4: ( ',' ( conditionalExpression )? )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==32) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
							// fel.g:25:5: ',' ( conditionalExpression )?
            	    {
            	    char_literal6=(Token)match(input,32,FOLLOW_32_in_expressionList105); if (state.failed) return retval;
							// fel.g:25:10: ( conditionalExpression )?
            	    int alt2=2;
            	    int LA2_0 = input.LA(1);

            	    if ( (LA2_0==Additive||LA2_0==Identifier||(LA2_0>=FloatingPointLiteral && LA2_0<=DecimalLiteral)||LA2_0==30) ) {
            	        alt2=1;
            	    }
            	    switch (alt2) {
            	        case 1 :
									// fel.g:0:0: conditionalExpression
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
            	           		root_0.addChild(com.greenpineyu.fel.parser.FelNodeImpl.NULL_NODE);
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
	// fel.g:36:1: conditionalExpression : equalityExpression ( Logical equalityExpression )* ;
    public final FelParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
        FelParser.conditionalExpression_return retval = new FelParser.conditionalExpression_return();
        retval.start = input.LT(1);
        int conditionalExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Logical9=null;
        FelParser.equalityExpression_return equalityExpression8 = null;

        FelParser.equalityExpression_return equalityExpression10 = null;


        CommonTree Logical9_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }
			// fel.g:37:5: ( equalityExpression ( Logical equalityExpression )* )
			// fel.g:37:9: equalityExpression ( Logical equalityExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_equalityExpression_in_conditionalExpression150);
            equalityExpression8=equalityExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression8.getTree());
				// fel.g:37:28: ( Logical equalityExpression )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==Logical) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
							// fel.g:37:30: Logical equalityExpression
            	    {
            	    Logical9=(Token)match(input,Logical,FOLLOW_Logical_in_conditionalExpression154); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Logical9_tree = (CommonTree)adaptor.create(Logical9);
            	    root_0 = (CommonTree)adaptor.becomeRoot(Logical9_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_equalityExpression_in_conditionalExpression157);
            	    equalityExpression10=equalityExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, equalityExpression10.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
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
            if ( state.backtracking>0 ) { memoize(input, 4, conditionalExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "conditionalExpression"

    public static class equalityExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equalityExpression"
	// fel.g:40:1: equalityExpression : relationalExpression ( Equals relationalExpression )* ;
    public final FelParser.equalityExpression_return equalityExpression() throws RecognitionException {
        FelParser.equalityExpression_return retval = new FelParser.equalityExpression_return();
        retval.start = input.LT(1);
        int equalityExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Equals12=null;
        FelParser.relationalExpression_return relationalExpression11 = null;

        FelParser.relationalExpression_return relationalExpression13 = null;


        CommonTree Equals12_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }
			// fel.g:41:5: ( relationalExpression ( Equals relationalExpression )* )
			// fel.g:41:9: relationalExpression ( Equals relationalExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_relationalExpression_in_equalityExpression179);
            relationalExpression11=relationalExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression11.getTree());
				// fel.g:41:30: ( Equals relationalExpression )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==Equals) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
							// fel.g:41:32: Equals relationalExpression
            	    {
            	    Equals12=(Token)match(input,Equals,FOLLOW_Equals_in_equalityExpression183); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Equals12_tree = (CommonTree)adaptor.create(Equals12);
            	    root_0 = (CommonTree)adaptor.becomeRoot(Equals12_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_relationalExpression_in_equalityExpression186);
            	    relationalExpression13=relationalExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, relationalExpression13.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 5, equalityExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "equalityExpression"

    public static class relationalExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalExpression"
	// fel.g:44:1: relationalExpression : additiveExpression ( Relational additiveExpression )* ;
    public final FelParser.relationalExpression_return relationalExpression() throws RecognitionException {
        FelParser.relationalExpression_return retval = new FelParser.relationalExpression_return();
        retval.start = input.LT(1);
        int relationalExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Relational15=null;
        FelParser.additiveExpression_return additiveExpression14 = null;

        FelParser.additiveExpression_return additiveExpression16 = null;


        CommonTree Relational15_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }
			// fel.g:45:5: ( additiveExpression ( Relational additiveExpression )* )
			// fel.g:45:9: additiveExpression ( Relational additiveExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_additiveExpression_in_relationalExpression208);
            additiveExpression14=additiveExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression14.getTree());
				// fel.g:45:28: ( Relational additiveExpression )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Relational) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
							// fel.g:45:30: Relational additiveExpression
            	    {
            	    Relational15=(Token)match(input,Relational,FOLLOW_Relational_in_relationalExpression212); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Relational15_tree = (CommonTree)adaptor.create(Relational15);
            	    root_0 = (CommonTree)adaptor.becomeRoot(Relational15_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_additiveExpression_in_relationalExpression215);
            	    additiveExpression16=additiveExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, additiveExpression16.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 6, relationalExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "relationalExpression"

    public static class additiveExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additiveExpression"
	// fel.g:48:1: additiveExpression : multiplicativeExpression ( Additive multiplicativeExpression )* ;
    public final FelParser.additiveExpression_return additiveExpression() throws RecognitionException {
        FelParser.additiveExpression_return retval = new FelParser.additiveExpression_return();
        retval.start = input.LT(1);
        int additiveExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Additive18=null;
        FelParser.multiplicativeExpression_return multiplicativeExpression17 = null;

        FelParser.multiplicativeExpression_return multiplicativeExpression19 = null;


        CommonTree Additive18_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }
			// fel.g:49:5: ( multiplicativeExpression ( Additive multiplicativeExpression )* )
			// fel.g:49:9: multiplicativeExpression ( Additive multiplicativeExpression )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression237);
            multiplicativeExpression17=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression17.getTree());
				// fel.g:49:34: ( Additive multiplicativeExpression )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Additive) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
							// fel.g:49:36: Additive multiplicativeExpression
            	    {
            	    Additive18=(Token)match(input,Additive,FOLLOW_Additive_in_additiveExpression241); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Additive18_tree = (CommonTree)adaptor.create(Additive18);
            	    root_0 = (CommonTree)adaptor.becomeRoot(Additive18_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression244);
            	    multiplicativeExpression19=multiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, multiplicativeExpression19.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 7, additiveExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "additiveExpression"

    public static class multiplicativeExpression_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplicativeExpression"
	// fel.g:52:1: multiplicativeExpression : primary ( Multiplicative primary )* ;
    public final FelParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
        FelParser.multiplicativeExpression_return retval = new FelParser.multiplicativeExpression_return();
        retval.start = input.LT(1);
        int multiplicativeExpression_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Multiplicative21=null;
        FelParser.primary_return primary20 = null;

        FelParser.primary_return primary22 = null;


        CommonTree Multiplicative21_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }
			// fel.g:53:5: ( primary ( Multiplicative primary )* )
			// fel.g:53:9: primary ( Multiplicative primary )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_primary_in_multiplicativeExpression266);
            primary20=primary();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, primary20.getTree());
				// fel.g:53:17: ( Multiplicative primary )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==Multiplicative) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
							// fel.g:53:19: Multiplicative primary
            	    {
            	    Multiplicative21=(Token)match(input,Multiplicative,FOLLOW_Multiplicative_in_multiplicativeExpression270); if (state.failed) return retval;
            	    if ( state.backtracking==0 ) {
            	    Multiplicative21_tree = (CommonTree)adaptor.create(Multiplicative21);
            	    root_0 = (CommonTree)adaptor.becomeRoot(Multiplicative21_tree, root_0);
            	    }
            	    pushFollow(FOLLOW_primary_in_multiplicativeExpression273);
            	    primary22=primary();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, primary22.getTree());

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
            if ( state.backtracking>0 ) { memoize(input, 8, multiplicativeExpression_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "multiplicativeExpression"

    public static class primary_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "primary"
	// fel.g:56:1: primary : ( parExpression | literal | Identifier ( Dot selector )* | Identifier arguments );
    public final FelParser.primary_return primary() throws RecognitionException {
        FelParser.primary_return retval = new FelParser.primary_return();
        retval.start = input.LT(1);
        int primary_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Identifier25=null;
        Token Dot26=null;
        Token Identifier28=null;
        FelParser.parExpression_return parExpression23 = null;

        FelParser.literal_return literal24 = null;

        FelParser.selector_return selector27 = null;

        FelParser.arguments_return arguments29 = null;


        CommonTree Identifier25_tree=null;
        CommonTree Dot26_tree=null;
        CommonTree Identifier28_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }
			// fel.g:57:5: ( parExpression | literal | Identifier ( Dot selector )* | Identifier arguments )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt10=1;
                }
                break;
            case Additive:
            case FloatingPointLiteral:
            case CharacterLiteral:
            case StringLiteral:
            case BooleanLiteral:
            case HexLiteral:
            case OctalLiteral:
            case DecimalLiteral:
                {
                alt10=2;
                }
                break;
            case Identifier:
                {
                int LA10_3 = input.LA(2);

                if ( (LA10_3==EOF||(LA10_3>=Logical && LA10_3<=Multiplicative)||LA10_3==Dot||(LA10_3>=31 && LA10_3<=32)) ) {
                    alt10=3;
                }
                else if ( (LA10_3==30) ) {
                    alt10=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
					// fel.g:57:9: parExpression
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_parExpression_in_primary299);
                    parExpression23=parExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, parExpression23.getTree());

                    }
                    break;
                case 2 :
					// fel.g:58:9: literal
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    pushFollow(FOLLOW_literal_in_primary309);
                    literal24=literal();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, literal24.getTree());

                    }
                    break;
                case 3 :
					// fel.g:59:9: Identifier ( Dot selector )*
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Identifier25=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary319); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier25_tree = (CommonTree)adaptor.create(Identifier25);
                    adaptor.addChild(root_0, Identifier25_tree);
                    }
					// fel.g:59:20: ( Dot selector )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==Dot) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
								// fel.g:59:21: Dot selector
                    	    {
                    	    Dot26=(Token)match(input,Dot,FOLLOW_Dot_in_primary322); if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) {
                    	    Dot26_tree = (CommonTree)adaptor.create(Dot26);
                    	    root_0 = (CommonTree)adaptor.becomeRoot(Dot26_tree, root_0);
                    	    }
                    	    pushFollow(FOLLOW_selector_in_primary325);
                    	    selector27=selector();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, selector27.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;
                case 4 :
					// fel.g:60:8: Identifier arguments
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Identifier28=(Token)match(input,Identifier,FOLLOW_Identifier_in_primary336); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    Identifier28_tree = (CommonTree)adaptor.create(Identifier28);
                    root_0 = (CommonTree)adaptor.becomeRoot(Identifier28_tree, root_0);
                    }
                    pushFollow(FOLLOW_arguments_in_primary339);
                    arguments29=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments29.getTree());
                    if ( state.backtracking==0 ) {

                            if((arguments29!=null?input.toString(arguments29.start,arguments29.stop):null)!=null){

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
            if ( state.backtracking>0 ) { memoize(input, 9, primary_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "primary"

    public static class selector_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "selector"
	// fel.g:68:1: selector : Identifier ( arguments )? ;
    public final FelParser.selector_return selector() throws RecognitionException {
        FelParser.selector_return retval = new FelParser.selector_return();
        retval.start = input.LT(1);
        int selector_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Identifier30=null;
        FelParser.arguments_return arguments31 = null;


        CommonTree Identifier30_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }
			// fel.g:69:5: ( Identifier ( arguments )? )
			// fel.g:69:10: Identifier ( arguments )?
            {
            root_0 = (CommonTree)adaptor.nil();

            Identifier30=(Token)match(input,Identifier,FOLLOW_Identifier_in_selector366); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            Identifier30_tree = (CommonTree)adaptor.create(Identifier30);
            root_0 = (CommonTree)adaptor.becomeRoot(Identifier30_tree, root_0);
            }
				// fel.g:69:22: ( arguments )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==30) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
						// fel.g:0:0: arguments
                    {
                    pushFollow(FOLLOW_arguments_in_selector369);
                    arguments31=arguments();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, arguments31.getTree());

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

                    if((arguments31!=null?input.toString(arguments31.start,arguments31.stop):null)!=null){
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
            if ( state.backtracking>0 ) { memoize(input, 10, selector_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "selector"

    public static class arguments_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arguments"
	// fel.g:77:1: arguments : '(' ( expressionList )? ')' ;
    public final FelParser.arguments_return arguments() throws RecognitionException {
        FelParser.arguments_return retval = new FelParser.arguments_return();
        retval.start = input.LT(1);
        int arguments_StartIndex = input.index();
        CommonTree root_0 = null;

        Token char_literal32=null;
        Token char_literal34=null;
        FelParser.expressionList_return expressionList33 = null;


        CommonTree char_literal32_tree=null;
        CommonTree char_literal34_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }
			// fel.g:78:5: ( '(' ( expressionList )? ')' )
			// fel.g:78:9: '(' ( expressionList )? ')'
            {
            root_0 = (CommonTree)adaptor.nil();

            char_literal32=(Token)match(input,30,FOLLOW_30_in_arguments396); if (state.failed) return retval;
				// fel.g:78:14: ( expressionList )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Additive||LA12_0==Identifier||(LA12_0>=FloatingPointLiteral && LA12_0<=DecimalLiteral)||LA12_0==30||LA12_0==32) ) {
                alt12=1;
            }
            else if ( (LA12_0==31) ) {
                int LA12_2 = input.LA(2);

                if ( (synpred14_Fel()) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
						// fel.g:0:0: expressionList
                    {
                    pushFollow(FOLLOW_expressionList_in_arguments399);
                    expressionList33=expressionList();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList33.getTree());

                    }
                    break;

            }

            char_literal34=(Token)match(input,31,FOLLOW_31_in_arguments402); if (state.failed) return retval;

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
            if ( state.backtracking>0 ) { memoize(input, 11, arguments_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "arguments"

    public static class literal_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
	// fel.g:81:1: literal : ( ( Additive )? ( integerLiteral | FloatingPointLiteral ) | CharacterLiteral | StringLiteral | BooleanLiteral );
    public final FelParser.literal_return literal() throws RecognitionException {
        FelParser.literal_return retval = new FelParser.literal_return();
        retval.start = input.LT(1);
        int literal_StartIndex = input.index();
        CommonTree root_0 = null;

        Token Additive35=null;
        Token FloatingPointLiteral37=null;
        Token CharacterLiteral38=null;
        Token StringLiteral39=null;
        Token BooleanLiteral40=null;
        FelParser.integerLiteral_return integerLiteral36 = null;


        CommonTree Additive35_tree=null;
        CommonTree FloatingPointLiteral37_tree=null;
        CommonTree CharacterLiteral38_tree=null;
        CommonTree StringLiteral39_tree=null;
        CommonTree BooleanLiteral40_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }
			// fel.g:82:5: ( ( Additive )? ( integerLiteral | FloatingPointLiteral ) | CharacterLiteral | StringLiteral | BooleanLiteral )
            int alt15=4;
            switch ( input.LA(1) ) {
            case Additive:
            case FloatingPointLiteral:
            case HexLiteral:
            case OctalLiteral:
            case DecimalLiteral:
                {
                alt15=1;
                }
                break;
            case CharacterLiteral:
                {
                alt15=2;
                }
                break;
            case StringLiteral:
                {
                alt15=3;
                }
                break;
            case BooleanLiteral:
                {
                alt15=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
					// fel.g:82:9: ( Additive )? ( integerLiteral | FloatingPointLiteral )
                    {
                    root_0 = (CommonTree)adaptor.nil();

					// fel.g:82:17: ( Additive )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==Additive) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
							// fel.g:0:0: Additive
                            {
                            Additive35=(Token)match(input,Additive,FOLLOW_Additive_in_literal423); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            Additive35_tree = (CommonTree)adaptor.create(Additive35);
                            root_0 = (CommonTree)adaptor.becomeRoot(Additive35_tree, root_0);
                            }

                            }
                            break;

                    }

					// fel.g:82:19: ( integerLiteral | FloatingPointLiteral )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=HexLiteral && LA14_0<=DecimalLiteral)) ) {
                        alt14=1;
                    }
                    else if ( (LA14_0==FloatingPointLiteral) ) {
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
							// fel.g:82:20: integerLiteral
                            {
                            pushFollow(FOLLOW_integerLiteral_in_literal427);
                            integerLiteral36=integerLiteral();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) adaptor.addChild(root_0, integerLiteral36.getTree());

                            }
                            break;
                        case 2 :
							// fel.g:83:9: FloatingPointLiteral
                            {
                            FloatingPointLiteral37=(Token)match(input,FloatingPointLiteral,FOLLOW_FloatingPointLiteral_in_literal437); if (state.failed) return retval;
                            if ( state.backtracking==0 ) {
                            FloatingPointLiteral37_tree = (CommonTree)adaptor.create(FloatingPointLiteral37);
                            adaptor.addChild(root_0, FloatingPointLiteral37_tree);
                            }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
					// fel.g:84:9: CharacterLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    CharacterLiteral38=(Token)match(input,CharacterLiteral,FOLLOW_CharacterLiteral_in_literal448); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    CharacterLiteral38_tree = (CommonTree)adaptor.create(CharacterLiteral38);
                    adaptor.addChild(root_0, CharacterLiteral38_tree);
                    }

                    }
                    break;
                case 3 :
					// fel.g:85:9: StringLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    StringLiteral39=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_literal458); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    StringLiteral39_tree = (CommonTree)adaptor.create(StringLiteral39);
                    adaptor.addChild(root_0, StringLiteral39_tree);
                    }

                    }
                    break;
                case 4 :
					// fel.g:86:9: BooleanLiteral
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    BooleanLiteral40=(Token)match(input,BooleanLiteral,FOLLOW_BooleanLiteral_in_literal468); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    BooleanLiteral40_tree = (CommonTree)adaptor.create(BooleanLiteral40);
                    adaptor.addChild(root_0, BooleanLiteral40_tree);
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
            if ( state.backtracking>0 ) { memoize(input, 12, literal_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class integerLiteral_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "integerLiteral"
	// fel.g:88:1: integerLiteral : ( HexLiteral | OctalLiteral | DecimalLiteral );
    public final FelParser.integerLiteral_return integerLiteral() throws RecognitionException {
        FelParser.integerLiteral_return retval = new FelParser.integerLiteral_return();
        retval.start = input.LT(1);
        int integerLiteral_StartIndex = input.index();
        CommonTree root_0 = null;

        Token set41=null;

        CommonTree set41_tree=null;

        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return retval; }
			// fel.g:89:5: ( HexLiteral | OctalLiteral | DecimalLiteral )
			// fel.g:
            {
            root_0 = (CommonTree)adaptor.nil();

            set41=(Token)input.LT(1);
            if ( (input.LA(1)>=HexLiteral && input.LA(1)<=DecimalLiteral) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (CommonTree)adaptor.create(set41));
                state.errorRecovery=false;state.failed=false;
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
            if ( state.backtracking>0 ) { memoize(input, 13, integerLiteral_StartIndex); }
        }
        return retval;
    }
    // $ANTLR end "integerLiteral"

    // $ANTLR start synpred14_Fel
    public final void synpred14_Fel_fragment() throws RecognitionException {   
		// fel.g:78:14: ( expressionList )
		// fel.g:78:14: expressionList
        {
        pushFollow(FOLLOW_expressionList_in_synpred14_Fel399);
        expressionList();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_Fel

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


 

    public static final BitSet FOLLOW_conditionalExpression_in_program51 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_parExpression66 = new BitSet(new long[]{0x00000001C003FA80L});
    public static final BitSet FOLLOW_expressionList_in_parExpression69 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_parExpression71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_conditionalExpression_in_expressionList91 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_expressionList105 = new BitSet(new long[]{0x000000014003FA82L});
    public static final BitSet FOLLOW_conditionalExpression_in_expressionList108 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalExpression150 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_Logical_in_conditionalExpression154 = new BitSet(new long[]{0x000000004003FA80L});
    public static final BitSet FOLLOW_equalityExpression_in_conditionalExpression157 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression179 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_Equals_in_equalityExpression183 = new BitSet(new long[]{0x000000004003FA80L});
    public static final BitSet FOLLOW_relationalExpression_in_equalityExpression186 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression208 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_Relational_in_relationalExpression212 = new BitSet(new long[]{0x000000004003FA80L});
    public static final BitSet FOLLOW_additiveExpression_in_relationalExpression215 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression237 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_Additive_in_additiveExpression241 = new BitSet(new long[]{0x000000004003FA80L});
    public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression244 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_primary_in_multiplicativeExpression266 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_Multiplicative_in_multiplicativeExpression270 = new BitSet(new long[]{0x000000004003FA80L});
    public static final BitSet FOLLOW_primary_in_multiplicativeExpression273 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_parExpression_in_primary299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_primary309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_primary319 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_Dot_in_primary322 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_selector_in_primary325 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_Identifier_in_primary336 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_arguments_in_primary339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_selector366 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_arguments_in_selector369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_arguments396 = new BitSet(new long[]{0x00000001C003FA80L});
    public static final BitSet FOLLOW_expressionList_in_arguments399 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_arguments402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Additive_in_literal423 = new BitSet(new long[]{0x0000000000038800L});
    public static final BitSet FOLLOW_integerLiteral_in_literal427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FloatingPointLiteral_in_literal437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CharacterLiteral_in_literal448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BooleanLiteral_in_literal468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_integerLiteral0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionList_in_synpred14_Fel399 = new BitSet(new long[]{0x0000000000000002L});

}