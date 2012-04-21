package com.greenpineyu.fel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Foo {


	private final String name;

	private Foo foo = null;
	
	
	static private Foo[] f = new Foo[]{new Foo("array0"),new Foo("array1")};
	
	static private Foo[] fooes = f;

	public Foo[] getFooes() {
		return fooes;
	}

	public void setFooes(Foo[] fooes) {
		this.fooes = fooes;
	}

	private boolean beenModified = false;
	private String property1 = "some value";

	public Foo(String name) {
		this.name = name;
	}

	public Foo() {
		this("anonymity");
	}

	public static String sayHello(String str) {
		return "hello" + str;
	}


	public class Cheezy {
		public Iterator<String> iterator() {
			return getCheeseList().iterator();
		}
	}


	public String get(String arg) {
		if ("name".equals(arg)) {
			return name;
		}
		return "can't find " + arg;
	}

	public String convertBoolean(boolean b) {
		return "Boolean : " + b;
	}

	public int getCount() {
		return 5;
	}
	
	public String contact(String a,String b ,String c,String d){
		return a+b+c+c;
	}
//	public String contact(String... strs){
//		if(strs!=null){
//			StringBuilder sb = new StringBuilder();
//			for (String s : strs) {
//				sb.append(s);
//			}
//			return sb.toString();
//		}
//		return "";
//	}

	public List<String> getCheeseList() {
		ArrayList<String> answer = new ArrayList<String>();
		answer.add("cheddar");
		answer.add("edam");
		answer.add("brie");
		return answer;
	}

	public Cheezy getCheezy() {
		return new Cheezy();
	}

	public boolean isSimple() {
		return true;
	}

	public int square(int value) {
		return value * value;
	}

	public boolean getTrueAndModify() {
		beenModified = true;
		return true;
	}

	public boolean getModified() {
		return beenModified;
	}

	public int getSize() {
		return 22;
	}

	public String getProperty1() {
		return property1;
	}

	public void setProperty1(String newValue) {
		property1 = newValue;
	}

	public Foo getFoo() {
		return this.foo;
	}

	public void setFoo(Foo foo) {
		this.foo = foo;
	}
	

	@Override
	public String toString() {
		return this.name;
	}
}