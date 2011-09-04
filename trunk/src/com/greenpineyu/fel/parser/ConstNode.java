package com.greenpineyu.fel.parser;

import org.antlr.runtime.Token;

import com.greenpineyu.fel.compile.FelMethod;
import com.greenpineyu.fel.compile.SourceBuilder;
import com.greenpineyu.fel.compile.InterpreterSourceBuilder;
import com.greenpineyu.fel.context.FelContext;

/**
 * 常量节点
 * 
 * @author yqs
 * 
 */
public class ConstNode extends AbstFelNode {

	private Object value;

	private Class<?> type;

	public ConstNode(Token token, Object value) {
		super(token);
		if (value == null) {
			type = Object.class;
		} else {
			type = value.getClass();
		}
		this.value = value;
	}

	public Object interpret(FelContext context, FelNode node) {
		return value;
	}

	public SourceBuilder toMethod(FelContext ctx) {
		if(!this.isDefaultInterpreter()){
			return InterpreterSourceBuilder.getInstance();  
		}
		return new FelMethod(this.getValueType(), this.toJavaSrc(ctx));
	}

	public Class<?> getValueType() {
		return type;
	}

	public String toJavaSrc(FelContext ctx) {
		if (this.value == null) {
			return "null";
		}
		if (type == String.class) {
			return "\"" + value + "\"";
		}
		return this.getToken().getText();
	}

	public boolean stable() {
		return true;
	}

}
