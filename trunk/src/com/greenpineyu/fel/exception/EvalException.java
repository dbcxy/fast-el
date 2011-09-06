package com.greenpineyu.fel.exception;

@SuppressWarnings("serial")
public class EvalException extends RuntimeException {
	public EvalException(String msg) {
		super(msg);
	}

	public EvalException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
