package com.greenpineyu.fel.parser;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

import com.greenpineyu.fel.common.ReflectUtil;
import com.greenpineyu.fel.compile.InterpreterSourceBuilder;
import com.greenpineyu.fel.compile.SourceBuilder;
import com.greenpineyu.fel.context.AbstractContext;
import com.greenpineyu.fel.context.ArrayCtx;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.function.operator.Dot;

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
	
	public static boolean isVar(FelNode n) {
		if (n == null) {
			return false;
		}
		boolean isVar = n instanceof VarAstNode;
		if (isVar) {
			if (n instanceof CommonTree) {
				CommonTree treeNode = (CommonTree) n;
				CommonTree p = treeNode.parent;
				if (p != null) {
					if (Dot.DOT.equals(p.getText())) {
						// 点运算符后的变量节点不是真正意义上的变量节点。
						isVar = p.getChildren().get(0) == n;
					}
				}

			}
		}
		return isVar;
	}

	{
		this.builder = new SourceBuilder() {
			
			@Override
			public String source(FelContext ctx, FelNode node) {
				if(!node.isDefaultInterpreter()){
					// 用户自定义解析器
					return InterpreterSourceBuilder.getInstance().source(ctx, node);
				}
				Class<?> type = returnType(ctx, node);
				String varName = node.getText();
				String getVarCode = "context.get(\""+varName+"\")";
				if (ctx instanceof ArrayCtx) {
					ArrayCtx c = (ArrayCtx) ctx;
					getVarCode = "((context instanceof ArrayCtx)?((ArrayCtx)context).get("
							+ c.getIndex(varName)
							+ "):context.get(\""
							+ varName + "\"))";
				}
					
				String code = getVarFullCode(type, getVarCode);
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

	public static String getVarFullCode(Class<?> type, String getVarCode) {
		String typeName = type.getCanonicalName();
		boolean isNumber = Number.class.isAssignableFrom(type);
		String code = "";
		if (ReflectUtil.isPrimitiveOrWrapNumber(type)) {
			code = "((" + typeName + ")" + getVarCode + ")";
		} else if (isNumber) {
			// 当float转double时，会丢失精度
			code = "((" + typeName + ")" + getVarCode + ").doubleValue()";
		} else {
			code = "((" + typeName + ")" + getVarCode + ")";
		}
		return code;
	}
}
