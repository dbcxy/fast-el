package com.greenpineyu.fel;

import com.greenpineyu.fel.compile.CompileService;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.context.MapContext;
import com.greenpineyu.fel.function.Function;
import com.greenpineyu.fel.function.FunctionFactory;
import com.greenpineyu.fel.optimizer.Optimizer;
import com.greenpineyu.fel.parser.AntlrParser;
import com.greenpineyu.fel.parser.FelNode;
import com.greenpineyu.fel.parser.Parser;

/**
 * 执行引擎
 * 
 * @author yqs
 * 
 */
public class FelEngineImpl implements FelEngine {

	private final FelContext context;

	private final CompileService compiler;

	private final Parser parser;

	public FelEngineImpl(FelContext context) {
		this.context = context;
		compiler = new CompileService();
		parser = new AntlrParser();

	}

	public FelEngineImpl() {
		this(new MapContext());
	}

	public FelNode parse(String exp) {
		return parser.parse(exp);
	}

	public Object eval(String exp) {
		return this.eval(exp, this.context);
	}

	public Object eval(String exp, FelContext ctx) {
		return parse(exp).eval(ctx);
	}

	public Expression compile(String exp, FelContext ctx, Optimizer... opts) {
		if (ctx == null) {
			ctx = this.context;
		}
		FelNode node = parse(exp);
		if (opts != null) {
			for (Optimizer opt : opts) {
				node = opt.call(ctx, node);
			}
		}
		return compiler.compile(ctx, node);
	}

	@Override
	public String toString() {
		return "FelEngine[ANTLR]";
	}

	public static void main(String[] args) {
		FelEngineImpl engine = new FelEngineImpl();
		Object eval = engine.eval("1+2");
		Expression expr = engine.compile("1+(2-(5+6))", engine.context);

		int count = 1000 * 1000 * 100;
		long start = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			eval = expr.eval(engine.getContext());
		}
		long end = System.currentTimeMillis();
		long cost = end - start;
		System.out.println(cost);
		System.out.println("result:" + eval + ",每秒执行：" + (count / 10 / cost));
		System.out.println(eval);
	}

	public FelContext getContext() {
		return this.context;
	}

	public boolean addFun(Function fun) {
		if (fun != null) {
			String name = fun.getName();
			if (name != null) {
				FunctionFactory instance = FunctionFactory.getInstance();
				if (instance.getFun(name) != null) {
					return false;
				}
				instance.add(fun);
			}
		}
		return true;
	}

}
