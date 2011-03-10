package com.greenpineyu.fel.function.operator;

import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.function.Function;
import com.greenpineyu.fel.parser.FelNode;

/**
 * 冒号(:)操作符，仅用于解析单元格区域。返回单元格区域中所有单元格的值。
 * @author yqs
 *
 */
public class Colon implements Function {

	public Object call(FelNode node, FelContext context) {
		throw new UnsupportedOperationException("还没有实现");
		//		List children = node.getChildren();
		//		if (children != null && children.size() == 2) {
		//			Object left = children.get(0);
		//			Object right = children.get(1);
		//			String start = getNodeText(left);
		//			String end = getNodeText(right);
		//			if (start == null || end == null) {
		//				return null;
		//			}
		//			Object[] returnMe = null;
		//			return returnMe;
		//		}
		//		return null;
	}

	private String getNodeText(Object left) {
		if (left instanceof FelNode) {
			FelNode startNode = (FelNode) left;
			return startNode.getText();
		}
		return null;
	}

	public String getName() {
		return ":";
	}

}
