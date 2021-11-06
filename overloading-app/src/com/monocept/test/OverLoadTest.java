package com.monocept.test;

public class OverLoadTest {
	public static void main(String[] args) {
		printInfo("Nihal");
		printInfo(10);
		printInfo(10.55f);
	}

	private static void printInfo(String value) {
		System.out.println("Inside printInfo with String");
		System.out.println(value);
	}

	private static void printInfo(int value) {
		System.out.println("Inside printInfo with Integer");
		System.out.println(value);
	}

	private static void printInfo(float value) {
		System.out.println("Inside printInfo with Float");
		System.out.println(value);
	}
}