package com.greenpineyu.fel.compile;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public  class  VarBuffer {
	static private ThreadLocal<Stack<String>> varCodes;
	static private ThreadLocal<Map<String,Object>> vars;
	static {
		varCodes = new ThreadLocal<Stack<String>>();
		vars = new ThreadLocal<Map<String, Object>>();
	}
	
	private static int  count;

	/**
	 * 获取当前线程中的变量代码(类的属性代码)stack
	 * 
	 * @return
	 */
	private static Stack<String> getVarCodes(){
		Stack<String> stack = varCodes.get();
		if(stack == null){
			stack = new Stack<String>();
			varCodes.set(stack);
		}
		return stack;
	}

	/**
	 * 获取当前线程中的保存的对象Map。
	 * 
	 * @return
	 */
	private static Map<String, Object> getVars(){
		Map<String, Object> map = vars.get();
		if(map == null){
			map = new HashMap<String, Object>();
			vars.set(map);
		}
		return map;
	}

	/**
	 * 将变量存入线程
	 * 
	 * @param attrCode
	 */
	static public String push(Object var){
		return push(var,var.getClass());
		
	}
	static public String push(Object var,Class<?> cls){
		String varName = getVarName();
		
		String type = cls.getName();
		String varId = UUID.randomUUID().toString();
		
		getVars().put(varId, var);
		String code = "private static final " + type + " " + varName
		+" = ("+type+")"+VarBuffer.class.getSimpleName()+".pop(\""+varId+"\");";
		getVarCodes().push(code);
		return varName;
	}
	
	
	
	synchronized static private String getVarName(){
		return "attr_"+count++;
	}

	/**
	 * 从线程取出变量
	 * 
	 * @param attrCode
	 * @return
	 */
	public static String pop(){
		Stack<String> stack = getVarCodes();
		if(stack.empty()){
			return null;
		}
		return stack.pop();
	}
	
	public static Object pop(String name){
		return	getVars().remove(name);
	}
	
	private static ThreadLocal<String> tl = new ThreadLocal<String>();
	public static void main(String[] args) {
	int i = 100;
	ExecutorService pool = Executors.newFixedThreadPool(i);
	for (int j = 0; j < i; j++) {
		pool.submit(new Runnable() {
			
			@Override
			public void run() {
				String name = Thread.currentThread().getName();
				System.out.println("*******************"+name+" start************************");
				tl.set(name);
				get(name);
				System.out.println("*******************"+name+" end************************");
				
			}

			private void get(String name) {
				String string = tl.get();
				System.out.println(name+":"+(name == string));
			}
		});
	}
	}
}
