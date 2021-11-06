package com.monocept.case2;

public class Parent {
	private int foo;

	public Parent(int pfoo) {
		this.foo = pfoo;
		System.out.println("Parent Created");
	}

	public int getFoo() {
		return foo;
	}

}
