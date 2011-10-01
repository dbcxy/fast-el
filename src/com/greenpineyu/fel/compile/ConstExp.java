package com.greenpineyu.fel.compile;

import com.greenpineyu.fel.Expression;
import com.greenpineyu.fel.context.FelContext;

public final class ConstExp implements Expression {
	public ConstExp(Object o) {
		this.value = o;
	}

	private final Object value;

	@Override
	public final Object eval(FelContext context) {
		return value;
	}
}
