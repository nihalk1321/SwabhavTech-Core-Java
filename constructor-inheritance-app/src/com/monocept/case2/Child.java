package com.monocept.case2;

public class Child extends Parent {
	public Child() {
		super(100);
		System.out.println("child Created");
	}

	public Child(int newFoo) {
		super(newFoo);
		System.out.println("child Created");
	}

}
