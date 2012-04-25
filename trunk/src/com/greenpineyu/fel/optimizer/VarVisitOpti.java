package com.greenpineyu.fel.optimizer;

import java.util.List;
import java.util.Map;

import com.greenpineyu.fel.compile.InterpreterSourceBuilder;
import com.greenpineyu.fel.compile.SourceBuilder;
import com.greenpineyu.fel.compile.SourceGeneratorImpl;
import com.greenpineyu.fel.compile.VarBuffer;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.context.MapContext;
import com.greenpineyu.fel.context.Var;
import com.greenpineyu.fel.interpreter.Interpreter;
import com.greenpineyu.fel.parser.AbstFelNode;
import com.greenpineyu.fel.parser.FelNode;
import com.greenpineyu.fel.parser.VarAstNode;

/**
 * 对访问节点进行优化，直接从Var中取变量
 * 
 * @author yuqingsong
 * 
 */
public class VarVisitOpti implements Optimizer {

	/**
	 * 用于保存变量
	 */
	private Map<String, Var> varMap;
	

	public VarVisitOpti(Var... vars) {
		varMap = new MapContext();
		if (vars != null) {
			for (Var var : vars) {
				if (var != null) {
					varMap.put(var.getName(), var);
				}
			}
		}
	}

	public VarVisitOpti() {
	}

	@Override
	public FelNode call(FelContext ctx, FelNode node) {
		List<FelNode> nodes = AbstFelNode.getNodes(node,
				SourceGeneratorImpl.varsFilter);
		for (FelNode varNode : nodes) {
			if (varNode instanceof VarAstNode) {
				final VarAstNode n = (VarAstNode) varNode;
				if (n.isDefaultInterpreter()) {
					// 当解释器是自身时，才能进行优化
					// 要先设置解释器，原因是createSourceBuilder会使用解释器。
					n.setInterpreter(createInterpreter());
					n.setSourcebuilder(createVarSourceBuilder(n));
				}
			}
		}
		return node;
	}

	private Interpreter createInterpreter() {
		return new Interpreter() {
			@Override
			public Object interpret(FelContext context, FelNode node) {
				Var var = getVar(context, node);
				return var != null ? var.getValue() : null;
			}
		};
	}

	private SourceBuilder createVarSourceBuilder(final VarAstNode n) {
		return new SourceBuilder() {

			private String src = null;
			private Class<?> returnType = null;

			@Override
			public String source(FelContext ctx, FelNode node) {
				if (src == null) {
					Var var = getVar(ctx, node);
					String varFieldName = VarBuffer.push(var);
					Class<?> type = returnType(ctx, node);
					src = VarAstNode.getVarFullCode(type, varFieldName
							+ ".getValue()");
				}
				return src;
			}

			@Override
			public Class<?> returnType(FelContext ctx, FelNode node) {
				if(returnType == null){
					returnType = InterpreterSourceBuilder.getInstance()
							.returnType(ctx, node);
				}
				return returnType; 
			}
		};
	}

	private Var getVar(FelContext context, FelNode node) {
		Var var = null;
		if (varMap != null) {
			var = varMap.get(node.getText());
		}
		if (var == null) {
			// 如果varMap中没有节点，从context中取。
			var = context.getVar(node.getText());
		}
		return var;
	}

}
