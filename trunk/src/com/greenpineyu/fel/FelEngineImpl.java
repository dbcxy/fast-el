package com.greenpineyu.fel;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;

import com.greenpineyu.fel.context.AbstractContext;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.exception.ParseException;
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

	FelEngineImpl(FelContext context) {
		this.context = context;
	}

	public FelEngineImpl() {
		this(new AbstractContext() {
			@Override
			protected Object getObject(Object name) {
				return null;
			}
		});
	}


	public Object eval(String exp) {
		return parse(exp).eval(this.context);
	}

	public Object eval(String exp, FelContext ctx) {
		return parse(exp).eval(ctx);
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
		FelEngine engine = new FelEngineImpl();
		Object eval = engine.eval("1+2");
		System.out.println(eval);
	}

	public FelContext getContext() {
		return this.context;
	}

}
