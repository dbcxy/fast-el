package com.greenpineyu.fel.compile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.greenpineyu.fel.Expression;
import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
import com.greenpineyu.fel.common.Callable;
import com.greenpineyu.fel.common.ReflectUtil;
import com.greenpineyu.fel.common.StringUtils;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.optimizer.ConstExpOpti;
import com.greenpineyu.fel.optimizer.ConstOpti;
import com.greenpineyu.fel.optimizer.Optimizer;
import com.greenpineyu.fel.parser.AbstFelNode;
import com.greenpineyu.fel.parser.ConstNode;
import com.greenpineyu.fel.parser.FelNode;
import com.greenpineyu.fel.parser.VarAstNode;

public class SourceGeneratorImpl implements SourceGenerator {

	private List<Optimizer> opt;

	private static String template;

	private static int count = 0;

	private Map<String, StringKeyValue> localvars;

	/**
	 * 包名
	 */
	static final String PACKAGE;

	{
		opt = new ArrayList<Optimizer>();
		localvars = new HashMap<String, StringKeyValue>();
		initOpti();
	}

	static {
		String fullName = SourceGeneratorImpl.class.getName();
		PACKAGE = fullName.substring(0, fullName.lastIndexOf("."));

		StringBuilder sb = new StringBuilder();
		InputStream in = SourceGeneratorImpl.class
				.getResourceAsStream("java.template");
		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
		String line = null;
		try {
			while ((line = reader.readLine()) != null) {
				sb.append(line).append("\r\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		template = sb.toString();
	}

	@Override
	public JavaSource getSource(FelContext ctx, FelNode node) {

		String src = "";
		String className = getClassName();
		synchronized(this){
			node = optimize(ctx, node);
			if (node instanceof ConstNode) {
				ConstNode n = (ConstNode) node;
				return new ConstExpSrc(n.interpret(null, null));
			}
			SourceBuilder builder = node.toMethod(ctx);
			String 	exp = builder.source(ctx, node);
			src = buildsource(exp, className);
			this.localvars.clear();
		}
		// System.out.println("****************\n" + src);
		JavaSource returnMe = new JavaSource();
		returnMe.setSimpleName(className);
		returnMe.setSource(src);
		returnMe.setPackageName(PACKAGE);
		return returnMe;
	}

	private String buildsource(String expression, String className) {
		String src = StringUtils.replace(template,"${classname}", className);
		// src = src.replaceAll("\\$\\{extends\\}", "Object");
		StringBuilder attrs = new StringBuilder();
		String pop = VarBuffer.pop();
		if (pop != null) {
			// 第一行不需要添加空格
			attrs.append(pop).append("\r\n");
			pop = VarBuffer.pop();
		}
		while(pop!=null){
			attrs.append("    ").append(pop).append("\r\n");
			pop = VarBuffer.pop();
		}
		// removeLastEnter(attrs);
		src = StringUtils.replace(src, "${attrs}", attrs.toString());
		src = StringUtils.replace(src, "${localVars}", getLocalVarsCode());
		src = StringUtils.replace(src, "${expression}", expression);
//		src = src.replaceAll("\\$\\{attrs\\}", attrs.toString());
//		src = src.replaceAll("\\$\\{localVars\\}", getLocalVarsCode());
//		src = src.replaceAll("\\$\\{expression\\}", expression);
		return src;
	}

	private String getClassName() {
		String className = null;
		synchronized (SourceGeneratorImpl.class) {
			className = "Fel_" + count++;
		}
		return className;
	}

	private String getLocalVarsCode() {
		StringBuilder sb = new StringBuilder();
		Collection<StringKeyValue> values = localvars.values();
		boolean isFirst = true;
		for (StringKeyValue code : values) {
			if (isFirst) {
				// 第一行不需要添加空格
				isFirst = false;
			} else {
				sb.append("        ");
			}
			sb.append(code.value).append("\r\n");
		}
		removeLastEnter(sb);
		return sb.toString();
	}

	private void removeLastEnter(StringBuilder sb) {
		if(sb.length()>0){
			sb.delete(sb.length()-2, sb.length());
		}
	}

	// private final int localVarCount = 0;

	/*
	 * private String getLocalVarName() { String varName = null; synchronized
	 * (SourceGeneratorImpl.class) { varName = "var_" + localVarCount++; }
	 * return varName; }
	 */

	class StringKeyValue {
		String key;
		String value;

		public StringKeyValue(String key, String value) {
			this.key = key;
			this.value = value;
		}
	}

	/**
	 * 对节点进行优化
	 * 
	 * @param ctx
	 * @param node
	 * @return
	 */
	private FelNode optimize(FelContext ctx, FelNode node) {
		for (Optimizer o : opt) {
			node = o.call(ctx, node);
		}
		return node;
	}

	private void initOpti() {
		// 进行常量优化(计算表达式中的常量节点)
		Optimizer constOpti = new ConstOpti();
		this.addOpti(constOpti);
		
		// 如果整个表达式是一个常量，再进行一次优化(可以减少装包拆包花费的时间)
		Optimizer constExpOpti = new ConstExpOpti();

		this.addOpti(constExpOpti);
		
		
		// 进行变量优化
		Optimizer optimizVars = getVarOpti();
		this.addOpti(optimizVars);
	}

	public static final	Callable<Boolean, FelNode> varsFilter = new Callable<Boolean, FelNode>() {
		@Override
		public Boolean call(FelNode... node) {
			FelNode n = node[0];
			return VarAstNode.isVar(n);
		}
	};

	/**
	 * 获取变量优化方案
	 * 
	 * @return
	 */
	private Optimizer getVarOpti() {
		Optimizer optimizVars = new Optimizer() {
			@Override
			public FelNode call(FelContext ctx, FelNode node) {
				List<FelNode> nodes = AbstFelNode.getNodes(node,varsFilter);
				// 多次出现的变量
//				List<FelNode> repeatNodes = new ArrayList<FelNode>();
				
				Map<String,List<FelNode>> repeatNodeMap = new HashMap<String, List<FelNode>>();
				for (FelNode n : nodes) {
					String name = n.getText();
					List<FelNode> repeatNodes = repeatNodeMap.get(name);
					if(repeatNodes == null){
						repeatNodes = new ArrayList<FelNode>();
						repeatNodeMap.put(name, repeatNodes);
					}
					repeatNodes.add(n);
//					if(count != null){
//						repeatNodes.add(n);
//						count.increment();
//					}else{
//						count = new MutableInt(1);
//						varCount.put(name, count);
//					}
				}
				for (List<FelNode> repeatNodes : repeatNodeMap.values()) {
					if(repeatNodes.size()>1){
						for (FelNode n : repeatNodes) {
							n.setSourcebuilder(getVarSrcBuilder(n.toMethod(ctx)));
						}
					}
				}
				
				return node;
			}

			/**
			 * 修改变量的代码生成方式
			 * 
			 * @param ctx
			 * @param node
			 */
			@SuppressWarnings("unused")
			private void setVarSourceBuilder(FelContext ctx, FelNode node) {
				if (node instanceof VarAstNode) {
					node.setSourcebuilder(getVarSrcBuilder(node.toMethod(ctx)));
				} else {
					List<FelNode> children = node.getChildren();
					if (children != null && !children.isEmpty()) {
						for (FelNode child : children) {
							setVarSourceBuilder(ctx, child);
						}
					}

				}
			}

			private SourceBuilder getVarSrcBuilder(final SourceBuilder old) {

				return new SourceBuilder() {

					@Override
					public String source(FelContext ctx, FelNode node) {
						String text = node.getText();
						if (localvars.containsKey(text)) {
							StringKeyValue kv = localvars.get(text);
							return kv.key;
						}
						// String varName = getLocalVarName();
						String varName = text;
						Class<?> type = this.returnType(ctx, node);
						String declare = "";
						String typeDeclare = type.getCanonicalName();
						if(ReflectUtil.isPrimitiveOrWrapNumber(type)){
							Class<?> primitiveClass = ReflectUtil.toPrimitiveClass(type);
							typeDeclare = primitiveClass.getSimpleName();
						}else	if (Number.class.isAssignableFrom(type)) {
							typeDeclare = "double";
						}
						
						declare = typeDeclare + " " + varName + " = "
								+ old.source(ctx, node) + ";   //" + text;
						StringKeyValue kv = new StringKeyValue(varName, declare);
						localvars.put(text, kv);
						return varName;
					}

					@Override
					public Class<?> returnType(FelContext ctx, FelNode n) {
//						VarAstNode node = (VarAstNode) old;
						return old.returnType(ctx, n);
					}
				};
			}
		};
		return optimizVars;
	}

	@Override
	public void addOpti(Optimizer opti) {
		this.opt.add(opti);
	}
	
	public static void main(String[] args) {
		FelEngine engine = new FelEngineImpl();
		FelContext ctx = engine.getContext();
		ctx.set("i", 100);
		ctx.set("pi", 3.14f);
		String exp = "pi*i*i*pi";
		Expression expObj = engine.compile(exp, ctx);
		Object eval = expObj.eval(ctx);
//		cost(ctx, new Abcd());
		cost(ctx, expObj);
		System.out.println(eval);
	}

	private static void cost(FelContext ctx, Expression expObj) {
		int count = 10*1000*1000;
		long start = System.currentTimeMillis();
		for (int i = 0; i < count; i++) {
			expObj.eval(ctx);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}

