package com.greenpineyu.fel.antlr;


import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.TokenStream;

import com.greenpineyu.fel.exception.ParseException;

public abstract class AbstErParser extends Parser {
	public void emitErrorMessage(String msg) {
		throw new ParseException(msg);
	}

	public AbstErParser(TokenStream input) {
		super(input);
	}

	public AbstErParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	public void displayRecognitionError(String tokenNames[], RecognitionException e) {
		String hdr = getErrorHeader(e);
		String msg = getErrorMessage(e, tokenNames);
		emitErrorMessage("解析表达式[" + e.input.toString() + "]出错:" + hdr + " " + msg);
	}

}
