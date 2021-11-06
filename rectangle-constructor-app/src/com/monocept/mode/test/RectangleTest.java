package com.monocept.mode.test;

import java.util.Scanner;

import com.monocept.model.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		printInfo(new Rectangle(20, 30));

		scanner.nextLine();
	}

	private static void printInfo(Rectangle r) {
		System.out.println("Width is " + r.getWidth());
		System.out.println("Height is " + r.getHeight());

	}

}
