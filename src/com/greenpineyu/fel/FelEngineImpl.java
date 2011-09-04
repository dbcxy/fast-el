package com.greenpineyu.fel;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;

import com.greenpineyu.fel.compile.CompileService;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.context.MapContext;
import com.greenpineyu.fel.exception.ParseException;
import com.greenpineyu.fel.optimizer.Optimizer;
import com.greenpineyu.fel.parser.FelLexer;
import com.greenpineyu.fel.parser.FelNode;
import com.greenpineyu.fel.parser.FelParser;
import com.greenpineyu.fel.parser.NodeAdaptor;

/**
 * 执行引擎
 * @author yqs
 *
 */
public class FelEngineImpl implements FelEngine {
	

	private FelContext context;
	
	private CompileService compiler	;

	public FelEngineImpl(FelContext context) {
		this.context = context;
		compiler = new CompileService();
	}

	public FelEngineImpl() {
		this(new MapContext());
	}


	public Object eval(String exp) {
		return parse(exp).eval(this.context);
	}

	public Object eval(String exp, FelContext ctx) {
		return parse(exp).eval(ctx);
	}
	
	public Expression compile(String exp,FelContext ctx,Optimizer... opts){
		if(ctx == null){
			ctx = this.context;
		}
		FelNode node = parse(exp);
		if(opts!= null){
			for (Optimizer opt : opts) {
				node = opt.call(ctx, node);
			}
		}
		return compiler.compile(ctx, node);
	}

	public FelNode parse(String exp) {
		if (exp == null || "".equals(exp)) {
			return null;
		}
		ByteArrayInputStream is = new ByteArrayInputStream(exp.getBytes());
		ANTLRInputStream input = null;
		try {
			input = new ANTLRInputStream(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		FelLexer lexer = new FelLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		FelParser parser = new FelParser(tokens);
		parser.setTreeAdaptor(new NodeAdaptor());
		ParserRuleReturnScope r = null;
		try {
			r = parser.program();
		} catch (RecognitionException e) {
			throw new ParseException(e.getMessage(), e);
		}
		if (r != null) {
			Object tree = r.getTree();
			if (tree instanceof FelNode) {
				return (FelNode) tree;
			}
		}
		return null;
	}


	public String toString() {
		return "FelEngine[ANTLR]";
	}

	public static void main(String[] args) {
		FelEngineImpl engine = new FelEngineImpl();
		Object eval = engine.eval("1+2");
		Expression expr = engine.compile("1+(2-(5+6))",engine.context);
		
		int count = 1000*1000*100;
		long start =  System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			eval = expr.eval(engine.getContext());
		}
		long end = System.currentTimeMillis();
		long cost = end-start;
		System.out.println(cost);
		System.out.println("result:"+eval+",每秒执行："+(count/10/cost));
		System.out.println(eval);
	}

	public FelContext getContext() {
		return this.context;
	}


}
