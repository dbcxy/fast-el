package com.greenpineyu.fel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Foo {

	private String name;

	private Foo foo = null;

	private boolean beenModified = false;
	private String property1 = "some value";

	public Foo(String name) {
		this.name = name;
	}

	public class Cheezy {
		public Iterator iterator() {
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

	public List getCheeseList() {
		ArrayList answer = new ArrayList();
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

	public String toString() {
		return this.name;
	}
}