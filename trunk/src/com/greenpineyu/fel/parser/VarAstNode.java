package com.greenpineyu.fel.parser;

import org.antlr.runtime.Token;
import org.apache.commons.lang3.ObjectUtils.Null;

import com.greenpineyu.fel.common.ReflectUtil;
import com.greenpineyu.fel.compile.FelMethod;
import com.greenpineyu.fel.context.FelContext;

public class VarAstNode extends AbstFelNode {
	private String text;

	public VarAstNode(Token token) {
		super(token);
		this.text = token.getText();
	}

	public String getText() {
		return this.text;
	}

	public Object interpret(FelContext context, FelNode node) {
		return context.get(text);
	}

	public FelMethod toMethod(FelContext ctx) {
		Class<?> type = ctx.getVarType(this.text);
		if(type == null){
			type = Null.class;
		}else if(type.isPrimitive()){
			//基本类型转换成包装类型
			type = ReflectUtil.toWrapperClass(type);
		}
		String getVarCode = "context.get(\""+this.text+"\")";
		String code = "";
		if(Number.class.isAssignableFrom(type)){
			type = Number.class;
			//当float转double时，会丢失精度
			code = "(("+type.getName()+")"+getVarCode+").doubleValue()";
		}else{
			code = "(" + type.getName() + ")" + getVarCode;
		}
		return new FelMethod(type, code);
		//			 return ctx.getValueType(ctx);
	}

}
