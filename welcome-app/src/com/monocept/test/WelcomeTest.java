package com.monocept.test;

public class WelcomeTest {

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);// ArrayIndexOutOfBounds exception - line 10
		int b = Integer.parseInt(args[1]);//
//
		int result = a / b;
//
		System.out.println(result);
		System.out.println("end");
		main(new String[] { "10,20,30" });
	}
}
