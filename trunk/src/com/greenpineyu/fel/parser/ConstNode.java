package com.greenpineyu.fel.parser;

import org.antlr.runtime.Token;

import com.greenpineyu.fel.common.Null;
import com.greenpineyu.fel.common.ReflectUtil;
import com.greenpineyu.fel.compile.FelMethod;
import com.greenpineyu.fel.compile.InterpreterSourceBuilder;
import com.greenpineyu.fel.compile.SourceBuilder;
import com.greenpineyu.fel.compile.VarBuffer;
import com.greenpineyu.fel.context.FelContext;

/**
 * 常量节点
 * 
 * @author yqs
 * 
 */
public class ConstNode extends AbstFelNode {

	private Object value;

	public ConstNode(Token token, Object value) {
		super(token);
		this.value = value;
	}

	public Object interpret(FelContext context, FelNode node) {
		return value;
	}

	public SourceBuilder toMethod(FelContext ctx) {
		if (this.builder != null) {
			return this.builder;
		}
		if (!this.isDefaultInterpreter()) {
			return InterpreterSourceBuilder.getInstance();
		}
		return new FelMethod(this.getValueType(), this.toJavaSrc(ctx));
	}

	public Class<?> getValueType() {
		Class<?> t = null;
		if (value == null) {
			t = Null.class;
		} else {
			t = value.getClass();
		}
		return t;
	}

	public String toJavaSrc(FelContext ctx) {
		if (value == null) {
			return "null";
		}
		if (value instanceof String) {
			return "\"" + value + "\"";
		}
		if (ReflectUtil.isPrimitiveOrWrapNumber(getValueType())) {
			return value.toString();
		}
		return VarBuffer.push(value);
	}

	public boolean stable() {
		return true;
	}

}
