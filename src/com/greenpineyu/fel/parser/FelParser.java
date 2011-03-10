package com.greenpineyu.fel.parser;

// $ANTLR 3.2 Sep 23, 2009 12:02:23 D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g 2011-01-27 11:41:10

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
			"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Logical", "Equals", "Relational", "LikeIn", "Additive",
			"Multiplicative", "Identifier", "Dot", "Cell", "Colon", "FloatingPointLiteral", "CharacterLiteral",
			"StringLiteral", "BooleanLiteral", "HexLiteral", "OctalLiteral", "DecimalLiteral", "HexDigit",
			"IntegerTypeSuffix", "Exponent", "FloatTypeSuffix", "EscapeSequence", "UnicodeEscape", "OctalEscape",
			"Letter", "JavaIDDigit", "WS", "COMMENT", "LINE_COMMENT", "'('", "')'", "','"
		};
	public static final int HexLiteral = 18;
	public static final int Multiplicative = 9;
	public static final int Cell = 12;
	public static final int LINE_COMMENT = 32;
	public static final int FloatTypeSuffix = 24;
	public static final int IntegerTypeSuffix = 22;
	public static final int OctalLiteral = 19;
	public static final int CharacterLiteral = 15;
	public static final int Exponent = 23;
	public static final int Colon = 13;
	public static final int DecimalLiteral = 20;
	public static final int EOF = -1;
	public static final int HexDigit = 21;
	public static final int Identifier = 10;
	public static final int StringLiteral = 16;
	public static final int Additive = 8;
	public static final int WS = 30;
	public static final int Logical = 4;
	public static final int T__33 = 33;
	public static final int T__34 = 34;
	public static final int T__35 = 35;
	public static final int LikeIn = 7;
	public static final int UnicodeEscape = 26;
	public static final int FloatingPointLiteral = 14;
	public static final int JavaIDDigit = 29;
	public static final int Dot = 11;
	public static final int Relational = 6;
	public static final int COMMENT = 31;
	public static final int Equals = 5;
	public static final int Letter = 28;
	public static final int OctalEscape = 27;
	public static final int EscapeSequence = 25;
	public static final int BooleanLiteral = 17;

	// delegates
	// delegators

	public FelParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}

	public FelParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[39 + 1];

	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}

	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}

	public String[] getTokenNames() {
		return FelParser.tokenNames;
	}

	public String getGrammarFileName() {
		return "D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g";
	}

	public static class program_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "program"
	// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:12:1: program : conditionalExpression ;
	public final FelParser.program_return program() throws RecognitionException {
		FelParser.program_return retval = new FelParser.program_return();
		retval.start = input.LT(1);
		int program_StartIndex = input.index();
		CommonTree root_0 = null;

		FelParser.conditionalExpression_return conditionalExpression1 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 1)) {
				return retval;
			}
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:12:9: ( conditionalExpression )
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:12:11: conditionalExpression
			{
				root_0 = (CommonTree) adaptor.nil();

				pushFollow(FOLLOW_conditionalExpression_in_program52);
				conditionalExpression1 = conditionalExpression();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, conditionalExpression1.getTree());

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

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 1, program_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "program"

	public static class parExpression_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "parExpression"
	// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:14:1: parExpression : '(' expressionList ')' ;
	public final FelParser.parExpression_return parExpression() throws RecognitionException {
		FelParser.parExpression_return retval = new FelParser.parExpression_return();
		retval.start = input.LT(1);
		int parExpression_StartIndex = input.index();
		CommonTree root_0 = null;

		Token char_literal2 = null;
		Token char_literal4 = null;
		FelParser.expressionList_return expressionList3 = null;

		CommonTree char_literal2_tree = null;
		CommonTree char_literal4_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 2)) {
				return retval;
			}
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:15:5: ( '(' expressionList ')' )
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:15:9: '(' expressionList ')'
			{
				root_0 = (CommonTree) adaptor.nil();

				char_literal2 = (Token) match(input, 33, FOLLOW_33_in_parExpression67);
				if (state.failed)
					return retval;
				pushFollow(FOLLOW_expressionList_in_parExpression70);
				expressionList3 = expressionList();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, expressionList3.getTree());
				char_literal4 = (Token) match(input, 34, FOLLOW_34_in_parExpression72);
				if (state.failed)
					return retval;

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

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 2, parExpression_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "parExpression"

	public static class expressionList_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "expressionList"
	// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:18:1: expressionList : ( conditionalExpression )? ( ',' ( conditionalExpression )? )* ;
	public final FelParser.expressionList_return expressionList() throws RecognitionException {
		FelParser.expressionList_return retval = new FelParser.expressionList_return();
		retval.start = input.LT(1);
		int expressionList_StartIndex = input.index();
		CommonTree root_0 = null;

		Token char_literal6 = null;
		FelParser.conditionalExpression_return conditionalExpression5 = null;

		FelParser.conditionalExpression_return conditionalExpression7 = null;

		CommonTree char_literal6_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 3)) {
				return retval;
			}
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:19:5: ( ( conditionalExpression )? ( ',' ( conditionalExpression )? )* )
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:19:9: ( conditionalExpression )? ( ',' ( conditionalExpression )? )*
			{
				root_0 = (CommonTree) adaptor.nil();

				// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:19:9: ( conditionalExpression )?
				int alt1 = 2;
				int LA1_0 = input.LA(1);

				if ((LA1_0 == Additive || LA1_0 == Identifier || LA1_0 == Cell
						|| (LA1_0 >= FloatingPointLiteral && LA1_0 <= DecimalLiteral) || LA1_0 == 33)) {
					alt1 = 1;
				}
				switch (alt1) {
					case 1:
						// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:0:0: conditionalExpression
					{
						pushFollow(FOLLOW_conditionalExpression_in_expressionList92);
						conditionalExpression5 = conditionalExpression();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, conditionalExpression5.getTree());

					}
						break;

				}

				if (state.backtracking == 0) {

					if (conditionalExpression5 == null) {
						root_0.addChild(com.greenpineyu.fel.parser.FelNodeImpl.NULL_NODE);
					}

				}
				// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:26:4: ( ',' ( conditionalExpression )? )*
				loop3: do {
					int alt3 = 2;
					int LA3_0 = input.LA(1);

					if ((LA3_0 == 35)) {
						alt3 = 1;
					}

					switch (alt3) {
						case 1:
							// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:26:5: ',' ( conditionalExpression )?
						{
							char_literal6 = (Token) match(input, 35, FOLLOW_35_in_expressionList106);
							if (state.failed)
								return retval;
							// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:26:10: ( conditionalExpression )?
							int alt2 = 2;
							int LA2_0 = input.LA(1);

							if ((LA2_0 == Additive || LA2_0 == Identifier || LA2_0 == Cell
									|| (LA2_0 >= FloatingPointLiteral && LA2_0 <= DecimalLiteral) || LA2_0 == 33)) {
								alt2 = 1;
							}
							switch (alt2) {
								case 1:
									// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:0:0: conditionalExpression
								{
									pushFollow(FOLLOW_conditionalExpression_in_expressionList109);
									conditionalExpression7 = conditionalExpression();

									state._fsp--;
									if (state.failed)
										return retval;
									if (state.backtracking == 0)
										adaptor.addChild(root_0, conditionalExpression7.getTree());

								}
									break;

							}

							if (state.backtracking == 0) {

								if (conditionalExpression7 == null) {
									root_0.addChild(com.greenpineyu.fel.parser.FelNodeImpl.NULL_NODE);
								} else {
									conditionalExpression7 = null;
								}

							}

						}
							break;

						default:
							break loop3;
					}
				} while (true);

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

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 3, expressionList_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "expressionList"

	public static class conditionalExpression_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "conditionalExpression"
	// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:39:1: conditionalExpression : equalityExpression ( Logical equalityExpression )* ;
	public final FelParser.conditionalExpression_return conditionalExpression() throws RecognitionException {
		FelParser.conditionalExpression_return retval = new FelParser.conditionalExpression_return();
		retval.start = input.LT(1);
		int conditionalExpression_StartIndex = input.index();
		CommonTree root_0 = null;

		Token Logical9 = null;
		FelParser.equalityExpression_return equalityExpression8 = null;

		FelParser.equalityExpression_return equalityExpression10 = null;

		CommonTree Logical9_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 4)) {
				return retval;
			}
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:40:5: ( equalityExpression ( Logical equalityExpression )* )
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:40:9: equalityExpression ( Logical equalityExpression )*
			{
				root_0 = (CommonTree) adaptor.nil();

				pushFollow(FOLLOW_equalityExpression_in_conditionalExpression153);
				equalityExpression8 = equalityExpression();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, equalityExpression8.getTree());
				// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:40:28: ( Logical equalityExpression )*
				loop4: do {
					int alt4 = 2;
					int LA4_0 = input.LA(1);

					if ((LA4_0 == Logical)) {
						alt4 = 1;
					}

					switch (alt4) {
						case 1:
							// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:40:30: Logical equalityExpression
						{
							Logical9 = (Token) match(input, Logical, FOLLOW_Logical_in_conditionalExpression157);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								Logical9_tree = (CommonTree) adaptor.create(Logical9);
								root_0 = (CommonTree) adaptor.becomeRoot(Logical9_tree, root_0);
							}
							pushFollow(FOLLOW_equalityExpression_in_conditionalExpression160);
							equalityExpression10 = equalityExpression();

							state._fsp--;
							if (state.failed)
								return retval;
							if (state.backtracking == 0)
								adaptor.addChild(root_0, equalityExpression10.getTree());

						}
							break;

						default:
							break loop4;
					}
				} while (true);

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

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 4, conditionalExpression_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "conditionalExpression"

	public static class equalityExpression_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "equalityExpression"
	// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:43:1: equalityExpression : relationalExpression ( Equals relationalExpression )* ;
	public final FelParser.equalityExpression_return equalityExpression() throws RecognitionException {
		FelParser.equalityExpression_return retval = new FelParser.equalityExpression_return();
		retval.start = input.LT(1);
		int equalityExpression_StartIndex = input.index();
		CommonTree root_0 = null;

		Token Equals12 = null;
		FelParser.relationalExpression_return relationalExpression11 = null;

		FelParser.relationalExpression_return relationalExpression13 = null;

		CommonTree Equals12_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 5)) {
				return retval;
			}
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:44:5: ( relationalExpression ( Equals relationalExpression )* )
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:44:9: relationalExpression ( Equals relationalExpression )*
			{
				root_0 = (CommonTree) adaptor.nil();

				pushFollow(FOLLOW_relationalExpression_in_equalityExpression182);
				relationalExpression11 = relationalExpression();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, relationalExpression11.getTree());
				// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:44:30: ( Equals relationalExpression )*
				loop5: do {
					int alt5 = 2;
					int LA5_0 = input.LA(1);

					if ((LA5_0 == Equals)) {
						alt5 = 1;
					}

					switch (alt5) {
						case 1:
							// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:44:32: Equals relationalExpression
						{
							Equals12 = (Token) match(input, Equals, FOLLOW_Equals_in_equalityExpression186);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								Equals12_tree = (CommonTree) adaptor.create(Equals12);
								root_0 = (CommonTree) adaptor.becomeRoot(Equals12_tree, root_0);
							}
							pushFollow(FOLLOW_relationalExpression_in_equalityExpression189);
							relationalExpression13 = relationalExpression();

							state._fsp--;
							if (state.failed)
								return retval;
							if (state.backtracking == 0)
								adaptor.addChild(root_0, relationalExpression13.getTree());

						}
							break;

						default:
							break loop5;
					}
				} while (true);

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

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 5, equalityExpression_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "equalityExpression"

	public static class relationalExpression_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "relationalExpression"
	// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:47:1: relationalExpression : additiveExpression ( ( Relational | LikeIn ) additiveExpression )* ;
	public final FelParser.relationalExpression_return relationalExpression() throws RecognitionException {
		FelParser.relationalExpression_return retval = new FelParser.relationalExpression_return();
		retval.start = input.LT(1);
		int relationalExpression_StartIndex = input.index();
		CommonTree root_0 = null;

		Token Relational15 = null;
		Token LikeIn16 = null;
		FelParser.additiveExpression_return additiveExpression14 = null;

		FelParser.additiveExpression_return additiveExpression17 = null;

		CommonTree Relational15_tree = null;
		CommonTree LikeIn16_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 6)) {
				return retval;
			}
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:48:5: ( additiveExpression ( ( Relational | LikeIn ) additiveExpression )* )
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:48:9: additiveExpression ( ( Relational | LikeIn ) additiveExpression )*
			{
				root_0 = (CommonTree) adaptor.nil();

				pushFollow(FOLLOW_additiveExpression_in_relationalExpression211);
				additiveExpression14 = additiveExpression();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, additiveExpression14.getTree());
				// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:48:28: ( ( Relational | LikeIn ) additiveExpression )*
				loop7: do {
					int alt7 = 2;
					int LA7_0 = input.LA(1);

					if (((LA7_0 >= Relational && LA7_0 <= LikeIn))) {
						alt7 = 1;
					}

					switch (alt7) {
						case 1:
							// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:48:30: ( Relational | LikeIn ) additiveExpression
						{
							// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:48:30: ( Relational | LikeIn )
							int alt6 = 2;
							int LA6_0 = input.LA(1);

							if ((LA6_0 == Relational)) {
								alt6 = 1;
							} else if ((LA6_0 == LikeIn)) {
								alt6 = 2;
							} else {
								if (state.backtracking > 0) {
									state.failed = true;
									return retval;
								}
								NoViableAltException nvae =
										new NoViableAltException("", 6, 0, input);

								throw nvae;
							}
							switch (alt6) {
								case 1:
									// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:48:31: Relational
								{
									Relational15 = (Token) match(input, Relational, FOLLOW_Relational_in_relationalExpression216);
									if (state.failed)
										return retval;
									if (state.backtracking == 0) {
										Relational15_tree = (CommonTree) adaptor.create(Relational15);
										root_0 = (CommonTree) adaptor.becomeRoot(Relational15_tree, root_0);
									}

								}
									break;
								case 2:
									// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:48:43: LikeIn
								{
									LikeIn16 = (Token) match(input, LikeIn, FOLLOW_LikeIn_in_relationalExpression219);
									if (state.failed)
										return retval;
									if (state.backtracking == 0) {
										LikeIn16_tree = (CommonTree) adaptor.create(LikeIn16);
										root_0 = (CommonTree) adaptor.becomeRoot(LikeIn16_tree, root_0);
									}

								}
									break;

							}

							pushFollow(FOLLOW_additiveExpression_in_relationalExpression223);
							additiveExpression17 = additiveExpression();

							state._fsp--;
							if (state.failed)
								return retval;
							if (state.backtracking == 0)
								adaptor.addChild(root_0, additiveExpression17.getTree());

						}
							break;

						default:
							break loop7;
					}
				} while (true);

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

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 6, relationalExpression_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "relationalExpression"

	public static class additiveExpression_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "additiveExpression"
	// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:51:1: additiveExpression : multiplicativeExpression ( Additive multiplicativeExpression )* ;
	public final FelParser.additiveExpression_return additiveExpression() throws RecognitionException {
		FelParser.additiveExpression_return retval = new FelParser.additiveExpression_return();
		retval.start = input.LT(1);
		int additiveExpression_StartIndex = input.index();
		CommonTree root_0 = null;

		Token Additive19 = null;
		FelParser.multiplicativeExpression_return multiplicativeExpression18 = null;

		FelParser.multiplicativeExpression_return multiplicativeExpression20 = null;

		CommonTree Additive19_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 7)) {
				return retval;
			}
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:52:5: ( multiplicativeExpression ( Additive multiplicativeExpression )* )
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:52:9: multiplicativeExpression ( Additive multiplicativeExpression )*
			{
				root_0 = (CommonTree) adaptor.nil();

				pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression245);
				multiplicativeExpression18 = multiplicativeExpression();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, multiplicativeExpression18.getTree());
				// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:52:34: ( Additive multiplicativeExpression )*
				loop8: do {
					int alt8 = 2;
					int LA8_0 = input.LA(1);

					if ((LA8_0 == Additive)) {
						alt8 = 1;
					}

					switch (alt8) {
						case 1:
							// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:52:36: Additive multiplicativeExpression
						{
							Additive19 = (Token) match(input, Additive, FOLLOW_Additive_in_additiveExpression249);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								Additive19_tree = (CommonTree) adaptor.create(Additive19);
								root_0 = (CommonTree) adaptor.becomeRoot(Additive19_tree, root_0);
							}
							pushFollow(FOLLOW_multiplicativeExpression_in_additiveExpression252);
							multiplicativeExpression20 = multiplicativeExpression();

							state._fsp--;
							if (state.failed)
								return retval;
							if (state.backtracking == 0)
								adaptor.addChild(root_0, multiplicativeExpression20.getTree());

						}
							break;

						default:
							break loop8;
					}
				} while (true);

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

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 7, additiveExpression_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "additiveExpression"

	public static class multiplicativeExpression_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "multiplicativeExpression"
	// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:55:1: multiplicativeExpression : unaryExpression ( Multiplicative unaryExpression )* ;
	public final FelParser.multiplicativeExpression_return multiplicativeExpression() throws RecognitionException {
		FelParser.multiplicativeExpression_return retval = new FelParser.multiplicativeExpression_return();
		retval.start = input.LT(1);
		int multiplicativeExpression_StartIndex = input.index();
		CommonTree root_0 = null;

		Token Multiplicative22 = null;
		FelParser.unaryExpression_return unaryExpression21 = null;

		FelParser.unaryExpression_return unaryExpression23 = null;

		CommonTree Multiplicative22_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 8)) {
				return retval;
			}
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:56:5: ( unaryExpression ( Multiplicative unaryExpression )* )
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:56:9: unaryExpression ( Multiplicative unaryExpression )*
			{
				root_0 = (CommonTree) adaptor.nil();

				pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression274);
				unaryExpression21 = unaryExpression();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, unaryExpression21.getTree());
				// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:56:25: ( Multiplicative unaryExpression )*
				loop9: do {
					int alt9 = 2;
					int LA9_0 = input.LA(1);

					if ((LA9_0 == Multiplicative)) {
						alt9 = 1;
					}

					switch (alt9) {
						case 1:
							// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:56:27: Multiplicative unaryExpression
						{
							Multiplicative22 = (Token) match(input, Multiplicative,
									FOLLOW_Multiplicative_in_multiplicativeExpression278);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								Multiplicative22_tree = (CommonTree) adaptor.create(Multiplicative22);
								root_0 = (CommonTree) adaptor.becomeRoot(Multiplicative22_tree, root_0);
							}
							pushFollow(FOLLOW_unaryExpression_in_multiplicativeExpression281);
							unaryExpression23 = unaryExpression();

							state._fsp--;
							if (state.failed)
								return retval;
							if (state.backtracking == 0)
								adaptor.addChild(root_0, unaryExpression23.getTree());

						}
							break;

						default:
							break loop9;
					}
				} while (true);

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

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 8, multiplicativeExpression_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "multiplicativeExpression"

	public static class unaryExpression_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "unaryExpression"
	// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:59:1: unaryExpression : primary ;
	public final FelParser.unaryExpression_return unaryExpression() throws RecognitionException {
		FelParser.unaryExpression_return retval = new FelParser.unaryExpression_return();
		retval.start = input.LT(1);
		int unaryExpression_StartIndex = input.index();
		CommonTree root_0 = null;

		FelParser.primary_return primary24 = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 9)) {
				return retval;
			}
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:60:5: ( primary )
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:60:9: primary
			{
				root_0 = (CommonTree) adaptor.nil();

				pushFollow(FOLLOW_primary_in_unaryExpression307);
				primary24 = primary();

				state._fsp--;
				if (state.failed)
					return retval;
				if (state.backtracking == 0)
					adaptor.addChild(root_0, primary24.getTree());

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

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 9, unaryExpression_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "unaryExpression"

	public static class primary_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "primary"
	// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:63:1: primary : ( parExpression | literal | Identifier ( Dot selector )* | Identifier arguments | Cell Colon Cell | Cell ( Dot selector )* );
	public final FelParser.primary_return primary() throws RecognitionException {
		FelParser.primary_return retval = new FelParser.primary_return();
		retval.start = input.LT(1);
		int primary_StartIndex = input.index();
		CommonTree root_0 = null;

		Token Identifier27 = null;
		Token Dot28 = null;
		Token Identifier30 = null;
		Token Cell32 = null;
		Token Colon33 = null;
		Token Cell34 = null;
		Token Cell35 = null;
		Token Dot36 = null;
		FelParser.parExpression_return parExpression25 = null;

		FelParser.literal_return literal26 = null;

		FelParser.selector_return selector29 = null;

		FelParser.arguments_return arguments31 = null;

		FelParser.selector_return selector37 = null;

		CommonTree Identifier27_tree = null;
		CommonTree Dot28_tree = null;
		CommonTree Identifier30_tree = null;
		CommonTree Cell32_tree = null;
		CommonTree Colon33_tree = null;
		CommonTree Cell34_tree = null;
		CommonTree Cell35_tree = null;
		CommonTree Dot36_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 10)) {
				return retval;
			}
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:64:5: ( parExpression | literal | Identifier ( Dot selector )* | Identifier arguments | Cell Colon Cell | Cell ( Dot selector )* )
			int alt12 = 6;
			switch (input.LA(1)) {
				case 33: {
					alt12 = 1;
				}
					break;
				case Additive:
				case FloatingPointLiteral:
				case CharacterLiteral:
				case StringLiteral:
				case BooleanLiteral:
				case HexLiteral:
				case OctalLiteral:
				case DecimalLiteral: {
					alt12 = 2;
				}
					break;
				case Identifier: {
					int LA12_3 = input.LA(2);

					if ((LA12_3 == 33)) {
						alt12 = 4;
					} else if ((LA12_3 == EOF || (LA12_3 >= Logical && LA12_3 <= Multiplicative) || LA12_3 == Dot || (LA12_3 >= 34 && LA12_3 <= 35))) {
						alt12 = 3;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae =
								new NoViableAltException("", 12, 3, input);

						throw nvae;
					}
				}
					break;
				case Cell: {
					int LA12_4 = input.LA(2);

					if ((LA12_4 == Colon)) {
						alt12 = 5;
					} else if ((LA12_4 == EOF || (LA12_4 >= Logical && LA12_4 <= Multiplicative) || LA12_4 == Dot || (LA12_4 >= 34 && LA12_4 <= 35))) {
						alt12 = 6;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae =
								new NoViableAltException("", 12, 4, input);

						throw nvae;
					}
				}
					break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae =
							new NoViableAltException("", 12, 0, input);

					throw nvae;
			}

			switch (alt12) {
				case 1:
					// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:64:9: parExpression
				{
					root_0 = (CommonTree) adaptor.nil();

					pushFollow(FOLLOW_parExpression_in_primary326);
					parExpression25 = parExpression();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, parExpression25.getTree());

				}
					break;
				case 2:
					// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:67:9: literal
				{
					root_0 = (CommonTree) adaptor.nil();

					pushFollow(FOLLOW_literal_in_primary346);
					literal26 = literal();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, literal26.getTree());

				}
					break;
				case 3:
					// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:73:9: Identifier ( Dot selector )*
				{
					root_0 = (CommonTree) adaptor.nil();

					Identifier27 = (Token) match(input, Identifier, FOLLOW_Identifier_in_primary376);
					if (state.failed)
						return retval;
					if (state.backtracking == 0) {
						Identifier27_tree = (CommonTree) adaptor.create(Identifier27);
						adaptor.addChild(root_0, Identifier27_tree);
					}
					// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:73:20: ( Dot selector )*
					loop10: do {
						int alt10 = 2;
						int LA10_0 = input.LA(1);

						if ((LA10_0 == Dot)) {
							alt10 = 1;
						}

						switch (alt10) {
							case 1:
								// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:73:21: Dot selector
							{
								Dot28 = (Token) match(input, Dot, FOLLOW_Dot_in_primary379);
								if (state.failed)
									return retval;
								if (state.backtracking == 0) {
									Dot28_tree = (CommonTree) adaptor.create(Dot28);
									root_0 = (CommonTree) adaptor.becomeRoot(Dot28_tree, root_0);
								}
								pushFollow(FOLLOW_selector_in_primary382);
								selector29 = selector();

								state._fsp--;
								if (state.failed)
									return retval;
								if (state.backtracking == 0)
									adaptor.addChild(root_0, selector29.getTree());

							}
								break;

							default:
								break loop10;
						}
					} while (true);

				}
					break;
				case 4:
					// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:74:8: Identifier arguments
				{
					root_0 = (CommonTree) adaptor.nil();

					Identifier30 = (Token) match(input, Identifier, FOLLOW_Identifier_in_primary393);
					if (state.failed)
						return retval;
					if (state.backtracking == 0) {
						Identifier30_tree = (CommonTree) adaptor.create(Identifier30);
						root_0 = (CommonTree) adaptor.becomeRoot(Identifier30_tree, root_0);
					}
					pushFollow(FOLLOW_arguments_in_primary396);
					arguments31 = arguments();

					state._fsp--;
					if (state.failed)
						return retval;
					if (state.backtracking == 0)
						adaptor.addChild(root_0, arguments31.getTree());
					if (state.backtracking == 0) {

						//      com.datanew.excel.script.antlr.AstNode p= ( com.datanew.excel.script.antlr.AstNode)root_0;
						if ((arguments31 != null ? input.toString(arguments31.start, arguments31.stop) : null) != null) {
							//    	p.setType(com.datanew.excel.script.antlr.AstNode.FUNCTION);
							root_0 = new com.greenpineyu.fel.parser.FunNode(root_0);
						}

					}

				}
					break;
				case 5:
					// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:85:7: Cell Colon Cell
				{
					root_0 = (CommonTree) adaptor.nil();

					Cell32 = (Token) match(input, Cell, FOLLOW_Cell_in_primary422);
					if (state.failed)
						return retval;
					if (state.backtracking == 0) {
						Cell32_tree = (CommonTree) adaptor.create(Cell32);
						adaptor.addChild(root_0, Cell32_tree);
					}
					Colon33 = (Token) match(input, Colon, FOLLOW_Colon_in_primary424);
					if (state.failed)
						return retval;
					if (state.backtracking == 0) {
						Colon33_tree = (CommonTree) adaptor.create(Colon33);
						root_0 = (CommonTree) adaptor.becomeRoot(Colon33_tree, root_0);
					}
					Cell34 = (Token) match(input, Cell, FOLLOW_Cell_in_primary427);
					if (state.failed)
						return retval;
					if (state.backtracking == 0) {
						Cell34_tree = (CommonTree) adaptor.create(Cell34);
						adaptor.addChild(root_0, Cell34_tree);
					}

				}
					break;
				case 6:
					// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:86:7: Cell ( Dot selector )*
				{
					root_0 = (CommonTree) adaptor.nil();

					Cell35 = (Token) match(input, Cell, FOLLOW_Cell_in_primary435);
					if (state.failed)
						return retval;
					if (state.backtracking == 0) {
						Cell35_tree = (CommonTree) adaptor.create(Cell35);
						adaptor.addChild(root_0, Cell35_tree);
					}
					// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:86:12: ( Dot selector )*
					loop11: do {
						int alt11 = 2;
						int LA11_0 = input.LA(1);

						if ((LA11_0 == Dot)) {
							alt11 = 1;
						}

						switch (alt11) {
							case 1:
								// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:86:13: Dot selector
							{
								Dot36 = (Token) match(input, Dot, FOLLOW_Dot_in_primary438);
								if (state.failed)
									return retval;
								if (state.backtracking == 0) {
									Dot36_tree = (CommonTree) adaptor.create(Dot36);
									root_0 = (CommonTree) adaptor.becomeRoot(Dot36_tree, root_0);
								}
								pushFollow(FOLLOW_selector_in_primary441);
								selector37 = selector();

								state._fsp--;
								if (state.failed)
									return retval;
								if (state.backtracking == 0)
									adaptor.addChild(root_0, selector37.getTree());

							}
								break;

							default:
								break loop11;
						}
					} while (true);

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

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 10, primary_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "primary"

	public static class selector_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "selector"
	// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:88:1: selector : Identifier ( arguments )? ;
	public final FelParser.selector_return selector() throws RecognitionException {
		FelParser.selector_return retval = new FelParser.selector_return();
		retval.start = input.LT(1);
		int selector_StartIndex = input.index();
		CommonTree root_0 = null;

		Token Identifier38 = null;
		FelParser.arguments_return arguments39 = null;

		CommonTree Identifier38_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 11)) {
				return retval;
			}
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:89:5: ( Identifier ( arguments )? )
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:89:10: Identifier ( arguments )?
			{
				root_0 = (CommonTree) adaptor.nil();

				Identifier38 = (Token) match(input, Identifier, FOLLOW_Identifier_in_selector462);
				if (state.failed)
					return retval;
				if (state.backtracking == 0) {
					Identifier38_tree = (CommonTree) adaptor.create(Identifier38);
					root_0 = (CommonTree) adaptor.becomeRoot(Identifier38_tree, root_0);
				}
				// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:89:22: ( arguments )?
				int alt13 = 2;
				int LA13_0 = input.LA(1);

				if ((LA13_0 == 33)) {
					alt13 = 1;
				}
				switch (alt13) {
					case 1:
						// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:0:0: arguments
					{
						pushFollow(FOLLOW_arguments_in_selector465);
						arguments39 = arguments();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, arguments39.getTree());

					}
						break;

				}

				if (state.backtracking == 0) {

					//      com.datanew.excel.script.antlr.AstNode p= ( com.datanew.excel.script.antlr.AstNode)root_0;
					if ((arguments39 != null ? input.toString(arguments39.start, arguments39.stop) : null) != null) {
						//    	p.setType(com.datanew.excel.script.antlr.AstNode.FUNCTION);
						root_0 = new com.greenpineyu.fel.parser.FunNode(root_0);
					}

				}

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

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 11, selector_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "selector"

	public static class arguments_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "arguments"
	// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:101:1: arguments : '(' ( expressionList )? ')' ;
	public final FelParser.arguments_return arguments() throws RecognitionException {
		FelParser.arguments_return retval = new FelParser.arguments_return();
		retval.start = input.LT(1);
		int arguments_StartIndex = input.index();
		CommonTree root_0 = null;

		Token char_literal40 = null;
		Token char_literal42 = null;
		FelParser.expressionList_return expressionList41 = null;

		CommonTree char_literal40_tree = null;
		CommonTree char_literal42_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 12)) {
				return retval;
			}
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:102:5: ( '(' ( expressionList )? ')' )
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:102:9: '(' ( expressionList )? ')'
			{
				root_0 = (CommonTree) adaptor.nil();

				char_literal40 = (Token) match(input, 33, FOLLOW_33_in_arguments492);
				if (state.failed)
					return retval;
				// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:102:14: ( expressionList )?
				int alt14 = 2;
				int LA14_0 = input.LA(1);

				if ((LA14_0 == Additive || LA14_0 == Identifier || LA14_0 == Cell
						|| (LA14_0 >= FloatingPointLiteral && LA14_0 <= DecimalLiteral) || LA14_0 == 33 || LA14_0 == 35)) {
					alt14 = 1;
				} else if ((LA14_0 == 34)) {
					int LA14_2 = input.LA(2);

					if ((synpred18_Er())) {
						alt14 = 1;
					}
				}
				switch (alt14) {
					case 1:
						// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:0:0: expressionList
					{
						pushFollow(FOLLOW_expressionList_in_arguments495);
						expressionList41 = expressionList();

						state._fsp--;
						if (state.failed)
							return retval;
						if (state.backtracking == 0)
							adaptor.addChild(root_0, expressionList41.getTree());

					}
						break;

				}

				char_literal42 = (Token) match(input, 34, FOLLOW_34_in_arguments498);
				if (state.failed)
					return retval;

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

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 12, arguments_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "arguments"

	public static class literal_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "literal"
	// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:105:1: literal : ( ( Additive )? ( integerLiteral | FloatingPointLiteral ) | CharacterLiteral | StringLiteral | BooleanLiteral );
	public final FelParser.literal_return literal() throws RecognitionException {
		FelParser.literal_return retval = new FelParser.literal_return();
		retval.start = input.LT(1);
		int literal_StartIndex = input.index();
		CommonTree root_0 = null;

		Token Additive43 = null;
		Token FloatingPointLiteral45 = null;
		Token CharacterLiteral46 = null;
		Token StringLiteral47 = null;
		Token BooleanLiteral48 = null;
		FelParser.integerLiteral_return integerLiteral44 = null;

		CommonTree Additive43_tree = null;
		CommonTree FloatingPointLiteral45_tree = null;
		CommonTree CharacterLiteral46_tree = null;
		CommonTree StringLiteral47_tree = null;
		CommonTree BooleanLiteral48_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 13)) {
				return retval;
			}
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:106:5: ( ( Additive )? ( integerLiteral | FloatingPointLiteral ) | CharacterLiteral | StringLiteral | BooleanLiteral )
			int alt17 = 4;
			switch (input.LA(1)) {
				case Additive:
				case FloatingPointLiteral:
				case HexLiteral:
				case OctalLiteral:
				case DecimalLiteral: {
					alt17 = 1;
				}
					break;
				case CharacterLiteral: {
					alt17 = 2;
				}
					break;
				case StringLiteral: {
					alt17 = 3;
				}
					break;
				case BooleanLiteral: {
					alt17 = 4;
				}
					break;
				default:
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);

					throw nvae;
			}

			switch (alt17) {
				case 1:
					// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:106:9: ( Additive )? ( integerLiteral | FloatingPointLiteral )
				{
					root_0 = (CommonTree) adaptor.nil();

					// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:106:17: ( Additive )?
					int alt15 = 2;
					int LA15_0 = input.LA(1);

					if ((LA15_0 == Additive)) {
						alt15 = 1;
					}
					switch (alt15) {
						case 1:
							// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:0:0: Additive
						{
							Additive43 = (Token) match(input, Additive, FOLLOW_Additive_in_literal519);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								Additive43_tree = (CommonTree) adaptor.create(Additive43);
								root_0 = (CommonTree) adaptor.becomeRoot(Additive43_tree, root_0);
							}

						}
							break;

					}

					// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:106:19: ( integerLiteral | FloatingPointLiteral )
					int alt16 = 2;
					int LA16_0 = input.LA(1);

					if (((LA16_0 >= HexLiteral && LA16_0 <= DecimalLiteral))) {
						alt16 = 1;
					} else if ((LA16_0 == FloatingPointLiteral)) {
						alt16 = 2;
					} else {
						if (state.backtracking > 0) {
							state.failed = true;
							return retval;
						}
						NoViableAltException nvae =
										new NoViableAltException("", 16, 0, input);

						throw nvae;
					}
					switch (alt16) {
						case 1:
							// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:106:20: integerLiteral
						{
							pushFollow(FOLLOW_integerLiteral_in_literal523);
							integerLiteral44 = integerLiteral();

							state._fsp--;
							if (state.failed)
								return retval;
							if (state.backtracking == 0)
								adaptor.addChild(root_0, integerLiteral44.getTree());

						}
							break;
						case 2:
							// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:107:9: FloatingPointLiteral
						{
							FloatingPointLiteral45 = (Token) match(input, FloatingPointLiteral,
									FOLLOW_FloatingPointLiteral_in_literal533);
							if (state.failed)
								return retval;
							if (state.backtracking == 0) {
								FloatingPointLiteral45_tree = (CommonTree) adaptor.create(FloatingPointLiteral45);
								adaptor.addChild(root_0, FloatingPointLiteral45_tree);
							}

						}
							break;

					}

				}
					break;
				case 2:
					// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:108:9: CharacterLiteral
				{
					root_0 = (CommonTree) adaptor.nil();

					CharacterLiteral46 = (Token) match(input, CharacterLiteral, FOLLOW_CharacterLiteral_in_literal544);
					if (state.failed)
						return retval;
					if (state.backtracking == 0) {
						CharacterLiteral46_tree = (CommonTree) adaptor.create(CharacterLiteral46);
						adaptor.addChild(root_0, CharacterLiteral46_tree);
					}

				}
					break;
				case 3:
					// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:109:9: StringLiteral
				{
					root_0 = (CommonTree) adaptor.nil();

					StringLiteral47 = (Token) match(input, StringLiteral, FOLLOW_StringLiteral_in_literal554);
					if (state.failed)
						return retval;
					if (state.backtracking == 0) {
						StringLiteral47_tree = (CommonTree) adaptor.create(StringLiteral47);
						adaptor.addChild(root_0, StringLiteral47_tree);
					}

				}
					break;
				case 4:
					// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:110:9: BooleanLiteral
				{
					root_0 = (CommonTree) adaptor.nil();

					BooleanLiteral48 = (Token) match(input, BooleanLiteral, FOLLOW_BooleanLiteral_in_literal564);
					if (state.failed)
						return retval;
					if (state.backtracking == 0) {
						BooleanLiteral48_tree = (CommonTree) adaptor.create(BooleanLiteral48);
						adaptor.addChild(root_0, BooleanLiteral48_tree);
					}

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

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 13, literal_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "literal"

	public static class integerLiteral_return extends ParserRuleReturnScope {
		CommonTree tree;

		public Object getTree() {
			return tree;
		}
	};

	// $ANTLR start "integerLiteral"
	// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:112:1: integerLiteral : ( HexLiteral | OctalLiteral | DecimalLiteral );
	public final FelParser.integerLiteral_return integerLiteral() throws RecognitionException {
		FelParser.integerLiteral_return retval = new FelParser.integerLiteral_return();
		retval.start = input.LT(1);
		int integerLiteral_StartIndex = input.index();
		CommonTree root_0 = null;

		Token set49 = null;

		CommonTree set49_tree = null;

		try {
			if (state.backtracking > 0 && alreadyParsedRule(input, 14)) {
				return retval;
			}
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:113:5: ( HexLiteral | OctalLiteral | DecimalLiteral )
			// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:
			{
				root_0 = (CommonTree) adaptor.nil();

				set49 = (Token) input.LT(1);
				if ((input.LA(1) >= HexLiteral && input.LA(1) <= DecimalLiteral)) {
					input.consume();
					if (state.backtracking == 0)
						adaptor.addChild(root_0, (CommonTree) adaptor.create(set49));
					state.errorRecovery = false;
					state.failed = false;
				} else {
					if (state.backtracking > 0) {
						state.failed = true;
						return retval;
					}
					MismatchedSetException mse = new MismatchedSetException(null, input);
					throw mse;
				}

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

		} finally {
			if (state.backtracking > 0) {
				memoize(input, 14, integerLiteral_StartIndex);
			}
		}
		return retval;
	}

	// $ANTLR end "integerLiteral"

	// $ANTLR start synpred18_Er
	public final void synpred18_Er_fragment() throws RecognitionException {
		// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:102:14: ( expressionList )
		// D:\\HappyBI\\trunk\\ExcelReport\\docs\\antlr\\Er.g:102:14: expressionList
		{
			pushFollow(FOLLOW_expressionList_in_synpred18_Er495);
			expressionList();

			state._fsp--;
			if (state.failed)
				return;

		}
	}

	// $ANTLR end synpred18_Er

	// Delegated rules

	public final boolean synpred18_Er() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred18_Er_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: " + re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed = false;
		return success;
	}

	public static final BitSet FOLLOW_conditionalExpression_in_program52 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_33_in_parExpression67 = new BitSet(new long[] { 0x0000000E001FD500L });
	public static final BitSet FOLLOW_expressionList_in_parExpression70 = new BitSet(new long[] { 0x0000000400000000L });
	public static final BitSet FOLLOW_34_in_parExpression72 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_conditionalExpression_in_expressionList92 = new BitSet(new long[] { 0x0000000800000002L });
	public static final BitSet FOLLOW_35_in_expressionList106 = new BitSet(new long[] { 0x0000000A001FD502L });
	public static final BitSet FOLLOW_conditionalExpression_in_expressionList109 = new BitSet(new long[] { 0x0000000800000002L });
	public static final BitSet FOLLOW_equalityExpression_in_conditionalExpression153 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_Logical_in_conditionalExpression157 = new BitSet(new long[] { 0x00000002001FD500L });
	public static final BitSet FOLLOW_equalityExpression_in_conditionalExpression160 = new BitSet(new long[] { 0x0000000000000012L });
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression182 = new BitSet(new long[] { 0x0000000000000022L });
	public static final BitSet FOLLOW_Equals_in_equalityExpression186 = new BitSet(new long[] { 0x00000002001FD500L });
	public static final BitSet FOLLOW_relationalExpression_in_equalityExpression189 = new BitSet(new long[] { 0x0000000000000022L });
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression211 = new BitSet(new long[] { 0x00000000000000C2L });
	public static final BitSet FOLLOW_Relational_in_relationalExpression216 = new BitSet(new long[] { 0x00000002001FD500L });
	public static final BitSet FOLLOW_LikeIn_in_relationalExpression219 = new BitSet(new long[] { 0x00000002001FD500L });
	public static final BitSet FOLLOW_additiveExpression_in_relationalExpression223 = new BitSet(new long[] { 0x00000000000000C2L });
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression245 = new BitSet(new long[] { 0x0000000000000102L });
	public static final BitSet FOLLOW_Additive_in_additiveExpression249 = new BitSet(new long[] { 0x00000002001FD500L });
	public static final BitSet FOLLOW_multiplicativeExpression_in_additiveExpression252 = new BitSet(new long[] { 0x0000000000000102L });
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression274 = new BitSet(new long[] { 0x0000000000000202L });
	public static final BitSet FOLLOW_Multiplicative_in_multiplicativeExpression278 = new BitSet(new long[] { 0x00000002001FD500L });
	public static final BitSet FOLLOW_unaryExpression_in_multiplicativeExpression281 = new BitSet(new long[] { 0x0000000000000202L });
	public static final BitSet FOLLOW_primary_in_unaryExpression307 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_parExpression_in_primary326 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_literal_in_primary346 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_Identifier_in_primary376 = new BitSet(new long[] { 0x0000000000000802L });
	public static final BitSet FOLLOW_Dot_in_primary379 = new BitSet(new long[] { 0x0000000000000400L });
	public static final BitSet FOLLOW_selector_in_primary382 = new BitSet(new long[] { 0x0000000000000802L });
	public static final BitSet FOLLOW_Identifier_in_primary393 = new BitSet(new long[] { 0x0000000200000000L });
	public static final BitSet FOLLOW_arguments_in_primary396 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_Cell_in_primary422 = new BitSet(new long[] { 0x0000000000002000L });
	public static final BitSet FOLLOW_Colon_in_primary424 = new BitSet(new long[] { 0x0000000000001000L });
	public static final BitSet FOLLOW_Cell_in_primary427 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_Cell_in_primary435 = new BitSet(new long[] { 0x0000000000000802L });
	public static final BitSet FOLLOW_Dot_in_primary438 = new BitSet(new long[] { 0x0000000000000400L });
	public static final BitSet FOLLOW_selector_in_primary441 = new BitSet(new long[] { 0x0000000000000802L });
	public static final BitSet FOLLOW_Identifier_in_selector462 = new BitSet(new long[] { 0x0000000200000002L });
	public static final BitSet FOLLOW_arguments_in_selector465 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_33_in_arguments492 = new BitSet(new long[] { 0x0000000E001FD500L });
	public static final BitSet FOLLOW_expressionList_in_arguments495 = new BitSet(new long[] { 0x0000000400000000L });
	public static final BitSet FOLLOW_34_in_arguments498 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_Additive_in_literal519 = new BitSet(new long[] { 0x00000000001C4000L });
	public static final BitSet FOLLOW_integerLiteral_in_literal523 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_FloatingPointLiteral_in_literal533 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_CharacterLiteral_in_literal544 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_StringLiteral_in_literal554 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_BooleanLiteral_in_literal564 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_set_in_integerLiteral0 = new BitSet(new long[] { 0x0000000000000002L });
	public static final BitSet FOLLOW_expressionList_in_synpred18_Er495 = new BitSet(new long[] { 0x0000000000000002L });

}