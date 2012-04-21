package com.greenpineyu.fel.parser;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;

import com.greenpineyu.fel.common.NumberUtil;
import com.greenpineyu.fel.compile.SourceBuilder;
import com.greenpineyu.fel.context.FelContext;

public class NodeAdaptor extends CommonTreeAdaptor {
	@Override
	public Object create(Token token) {
		if (token == null) {
			return new AbstFelNode(token){

				@Override
				public SourceBuilder toMethod(FelContext ctx) {
					return null;
				}};
		}
//		System.out.println(token.getText());

		/*
		Dot
		LikeIn
		Logical
		Equals
		Relational
		Additive
		Multiplicative
		Identifier
		FloatingPointLiteral
		CharacterLiteral
		StringLiteral
		BooleanLiteral
		HexLiteral
		OctalLiteral
		DecimalLiteral
		*/
		Object returnMe = null;
		int type = token.getType();
		String text = token.getText();
		switch (type) {
			case FelParser.Identifier:
				if("null".equals(text)){
//					returnMe = AbstFelNode.NULL;
					returnMe = new ConstNode(token, null);
			} else {
				returnMe = new VarAstNode(token);
			}
				break;

		/* 函数、操作符 开始 */
		case FelParser.Dot://.
		case FelParser.Additive:// +、-
		case FelParser.Multiplicative:// *、/
		case FelParser.Equals:// ==、!=
		case FelParser.Relational:// >、<、>=、<=
		case FelParser.And:// AND
		case FelParser.Or:// OR
		case FelParser.Ques:
		case FelParser.Bracket:
		case FelParser.Not:
				returnMe = new FunNode(token);
				break;
		/* 函数、操作符 结束 */

			/* 常量开始 */
			case FelParser.DecimalLiteral:
			// 数字-10进制
				returnMe = NumberUtil.parseNumber(new Long(text));
				break;
			case FelParser.HexLiteral:
			// 数字-16进制
				String num = text;
				if(text.startsWith("0x")||text.startsWith("0X")){
					num = text.substring(2);
				}
				returnMe =  NumberUtil.parseNumber(new Long(Long.parseLong(num, 16)));
				break;
			case FelParser.OctalLiteral:
			// 数字-8进制
				returnMe =  NumberUtil.parseNumber(new Long(Long.parseLong(text, 8)));
				break;

			case FelParser.FloatingPointLiteral:
			// 浮点型
				returnMe = new Double(text);
				break;
			case FelParser.BooleanLiteral:
			// 布尔值
				returnMe = Boolean.valueOf(text);
				break;
			case FelParser.CharacterLiteral:
			case FelParser.StringLiteral:
			// 字符串
			// 出掉字符串两端的单引号和双引号
				returnMe = text.substring(1, text.length() - 1);
				break;
		/* 常量结束 */
			default:
				break;
		}
		if (returnMe == null) {
			// 不能正确解析
			return CommonTree.INVALID_NODE;
		}
		if (returnMe instanceof CommonTree) {
			return returnMe;
		}
		return new ConstNode(token, returnMe);
	}


}
