package com.greenpineyu.fel.compile.opti;

import java.util.List;

import org.antlr.runtime.Token;
import org.apache.commons.lang3.ObjectUtils;

import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.optimizer.Optimizer;
import com.greenpineyu.fel.parser.ConstNode;
import com.greenpineyu.fel.parser.FelNode;

public class AndOpti implements Optimizer {

	@Override
	public FelNode call(FelContext ctx, FelNode node) {
		if (node.stable()) {
			Object value = node.getInterpreter().interpret(ctx, node);
			Token token = new ConstOptToken(node);
			token.setText(ObjectUtils.toString(value));
			return new ConstNode(token, value);
		} else {
			List<FelNode> children = node.getChildren();
			if (children != null) {
				for (int i = 0; i < children.size(); i++) {
					FelNode c = children.get(i);
					children.set(i, this.call(ctx, c));
				}
			}
			return node;
		}
	}

}
