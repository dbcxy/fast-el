package com.greenpineyu.fel.compile.opti;

import com.greenpineyu.fel.common.ReflectUtil;
import com.greenpineyu.fel.compile.SourceBuilder;
import com.greenpineyu.fel.compile.VarBuffer;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.optimizer.Optimizer;
import com.greenpineyu.fel.parser.ConstNode;
import com.greenpineyu.fel.parser.FelNode;

/**
 * 当
 * @author yuqingsong
 *
 */
public class ConstExpOpti implements Optimizer {

	@Override
	public FelNode call(FelContext ctx, FelNode node) {
		if (node instanceof ConstNode) {
			final Object value = node.eval(ctx);

			// 重新构建常量节点的java源码
			node.setSourcebuilder(new SourceBuilder() {

				@Override
				public String source(FelContext ctx, FelNode node) {
					// Class<?> type = returnType(ctx, node);
					return VarBuffer.push(value, Object.class);
				}

				@Override
				public Class<?> returnType(FelContext ctx, FelNode node) {
					if (value != null) {
						Class<?> cls = value.getClass();
						if (cls.isPrimitive()) {
							return ReflectUtil.toWrapperClass(cls);
						}
						return cls;
					}
					return FelContext.NULL.getClass();
				}
			});
		}
		return node;
	}

}
