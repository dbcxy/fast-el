package com.greenpineyu.fel.parser;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

import com.greenpineyu.fel.compile.FelMethod;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.exception.EvalException;
import com.greenpineyu.fel.function.Function;
import com.greenpineyu.fel.function.FunctionFactory;

/**
 * 函数节点
 * @author yqs
 *
 */
public  class FunNode extends AbstFelNode {
	private Function fun;

	private static final Function NOT_FOUND_FUN = new Function() {

		public String getName() {
			return "未知函数";
		}

		public Object call(FelNode node, FelContext context) {
			throw new EvalException("找不到函数[" + node.getText() + "]", null);
		}

		public FelMethod toMethod(FelNode node, FelContext ctx) {
			return null;
		}
	};

	public FunNode(CommonTree node) {
		super(node);
	}

	public FunNode(Token token) {
		super(token);

	}

	{
		initFun();
	}

	public Object interpret(FelContext context, FelNode node) {
		return fun.call(this, context);
	}


	private void initFun() {
		fun = FunctionFactory.getInstance().getFun(getText());
		if (fun == null) {
			fun = NOT_FOUND_FUN;
		}
	}
	
	public FelMethod toMethod(FelContext ctx) {
		return this.fun.toMethod(this,ctx);
	}
}
