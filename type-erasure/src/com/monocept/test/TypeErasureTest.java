package com.monocept.test;

import com.monocept.model.BoundStack;
import com.monocept.model.Stack;

public class TypeErasureTest {
	public static void main(String[] args) {
		Stack s = new Stack(2);
		BoundStack b = new BoundStack(2);
		
		System.out.println(s.getClass());
	
		System.out.println(b.getClass());
		System.out.println("Success");
	}
}
