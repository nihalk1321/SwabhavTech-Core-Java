package com.monocept.test;

public class CmdLineTest {
	public static void main(String[] names) {

		System.out.println(names);
		System.out.println(names.length);
		System.out.println("Nihal");

		if (names.length == 0) {
			System.out.println("Please provide arguemnts");
			return;
		}

		System.out.println("for loop");
		for (int i = 0; i < names.length; i++) {
			System.out.println(" Hello " + names[i]);
		}

		System.out.println("foreach");
		for (String name : names) {
			System.out.println(" Hello " + name);
		}
	}
}
