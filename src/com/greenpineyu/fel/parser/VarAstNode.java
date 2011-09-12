package com.greenpineyu.fel.parser;

import org.antlr.runtime.Token;

import com.greenpineyu.fel.compile.InterpreterSourceBuilder;
import com.greenpineyu.fel.compile.SourceBuilder;
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
			
			public String source(FelContext ctx, FelNode node) {
				if(!node.isDefaultInterpreter()){
					// 用户自定义解析器
					return InterpreterSourceBuilder.getInstance().source(ctx, node);
				}
				String code = "";
				Class<?> type = returnType(ctx, node);
				boolean isNumber = Number.class.isAssignableFrom(type);
				String getVarCode = "context.get(\""+node.getText()+"\")";
				if(isNumber){
					// 当float转double时，会丢失精度
					code = "(("+type.getName()+")"+getVarCode+").doubleValue()";
				}else{
					code = "(" + type.getName() + ")" + getVarCode;
				}
				return code;
			}
			public Class<?> returnType(FelContext ctx, FelNode node) {
				Class<?> type = InterpreterSourceBuilder.getInstance().returnType(ctx, node);
				if(type == null){
					type = ctx.getVarType(node.getText());
				}
				return type;
			}
		};
	}
}
