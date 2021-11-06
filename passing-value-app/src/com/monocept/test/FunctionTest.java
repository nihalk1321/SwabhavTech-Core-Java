package com.monocept.test;

public class FunctionTest {
	public static void main(String[] args) {
		int mark = 100;
		int res = updateMarkToZero(mark);
		System.out.println(res);
		System.out.println(" ");

		int[] marks = { 10, 20, 30, 40, 50 };
		updateMarksToZero(marks);
		for (int m : marks) {
			System.out.println(m);
		}
	}

	private static int updateMarkToZero(int mark) {
		mark = 0;
		return mark;
	}

	private static void updateMarksToZero(int[] marksPassed) {
		for (int i = 0; i < marksPassed.length; i++) {
			marksPassed[i] = 0;
		}
	}
}
