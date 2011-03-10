package com.greenpineyu.fel.antlr;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;

public class NodeAdaptor extends CommonTreeAdaptor {
	public Object create(Token token) {

		if (token == null) {
			return new FelNodeImpl(token);
		}

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
			case FelParser.Cell:
				returnMe = new VarAstNode(token);
				break;

			/* 函数、操作符 开始 */
			case FelParser.Dot://.
			case FelParser.Colon://:
			case FelParser.Additive:// +、-
			case FelParser.Multiplicative:// *、/
			case FelParser.Equals:// ==、!=
			case FelParser.LikeIn://like in
			case FelParser.Relational://>、<、>=、<=
			case FelParser.Logical://AND、OR
				returnMe = new FunAstNode(token);
				break;
			/* 函数、操作符 结束 */

			/* 常量开始 */
			case FelParser.DecimalLiteral:
				// 数字-10进制
				returnMe = new Long(text);
				break;
			case FelParser.HexLiteral:
				// 数字-16进制
				returnMe = new Long(Long.parseLong(text, 16));
				break;
			case FelParser.OctalLiteral:
				// 数字-8进制
				returnMe = new Long(Long.parseLong(text, 8));
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
			//不能正确解析
			return CommonTree.INVALID_NODE;
		}
		if (returnMe instanceof CommonTree) {
			return returnMe;
		}
		return new ConstAstNode(token, returnMe);
	}


}
