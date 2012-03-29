package com.greenpineyu.fel.parser;

import org.antlr.runtime.Token;

import com.greenpineyu.fel.common.ReflectUtil;
import com.greenpineyu.fel.compile.InterpreterSourceBuilder;
import com.greenpineyu.fel.compile.SourceBuilder;
import com.greenpineyu.fel.context.AbstractContext;
import com.greenpineyu.fel.context.ArrayCtx;
import com.greenpineyu.fel.context.FelContext;

public class VarAstNode extends AbstFelNode  {
	private final String text;

	public VarAstNode(Token token) {
		super(token);
		this.text = token.getText();
	}

	@Override
	public String getText() {
		return this.text;
	}
	
	@Override
	public Object interpret(FelContext context, FelNode node) {
		return context.get(text);
	}
	
	{
		this.builder = new SourceBuilder() {
			
			@Override
			public String source(FelContext ctx, FelNode node) {
				if(!node.isDefaultInterpreter()){
					// 用户自定义解析器
					return InterpreterSourceBuilder.getInstance().source(ctx, node);
				}
				String code = "";
				Class<?> type = returnType(ctx, node);
				boolean isNumber = Number.class.isAssignableFrom(type);
				String varName = node.getText();
				String getVarCode = "context.get(\""+varName+"\")";
				if (ctx instanceof ArrayCtx) {
					ArrayCtx c = (ArrayCtx) ctx;
					getVarCode = "((ArrayCtx)context).get("+c.getIndex(varName)+")";
				}
					
				String typeName = type.getCanonicalName();
				if(ReflectUtil.isPrimitiveOrWrapNumber(type)){
					code = "(("+typeName+")"+getVarCode+")";
				}else if(isNumber){
					// 当float转double时，会丢失精度
					code = "(("+typeName+")"+getVarCode+").doubleValue()";
				}else{
					code = "((" + typeName + ")" + getVarCode + ")";
				}
				return code;
			}
			@Override
			public Class<?> returnType(FelContext ctx, FelNode node) {
				Class<?> type = AbstractContext.getVarType(node.getText(),ctx);
				if(type == null){
				   type = InterpreterSourceBuilder.getInstance().returnType(ctx, node);
				}
				return type;
			}
		};
	}
}
