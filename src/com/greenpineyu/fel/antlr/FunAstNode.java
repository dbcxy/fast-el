package com.greenpineyu.fel.antlr;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.exception.EvalException;
import com.greenpineyu.fel.function.Function;

/**
 * 函数节点
 * @author yqs
 *
 */
public class FunAstNode extends AstNodeImpl {
	private Function fun;

	private static final Function NOT_FOUND_FUN = new Function() {

		public String getName() {
			throw new UnsupportedOperationException("还没有实现[2011-1-11]");
		}

		public Object call(AstNode node, FelContext context) {
			throw new EvalException("找不到函数[" + node.getText() + "]");
		}
	};

	public FunAstNode(CommonTree node) {
		super(node);
	}

	public FunAstNode(Token token) {
		super(token);
	}

	public Object interpret(FelContext context, AstNode node) {
		if (fun != null) {
			return fun.call(this, context);
		} else {
			fun = context.getFunction(getText());
			if (fun == null) {
				fun = NOT_FOUND_FUN;
			}
			return fun.call(this, context);
		}
	}
}
