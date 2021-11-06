package com.monocept.mode.test;

import java.util.Scanner;

import com.monocept.model.Rectangle;

public class RectangleColorTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Rectangle r1 = new Rectangle(20, 10, "green");
		printInfo(r1);
		r1.setWidth(r1.getWidth() + 5);
		r1.setHeight(r1.getHeight() + 5);
		printInfo(r1);

		scanner.nextLine();
	}

	private static void printInfo(Rectangle r) {
		System.out.println("Width is " + r.getWidth());
		System.out.println("Height is " + r.getHeight());
		System.out.println("color is :" + r.getColor());

	}

}
