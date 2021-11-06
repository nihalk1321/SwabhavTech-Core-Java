package com.monocept.test;

import com.monocept.model.BgColorType;
import com.monocept.model.BorderStyleType;
import com.monocept.model.Circle;

public class CircleColorTest {
	public static void main(String[] args) {
		Circle circles[] = new Circle[3];
		Circle c1 = new Circle(5.5f, BorderStyleType.SOLID, BgColorType.BLUE);
		circles[0] = c1;
		Circle c2 = new Circle(3.3f, BorderStyleType.DOUBLE, BgColorType.RED);
		circles[1] = c2;
		Circle c3 = new Circle(4.4f, BorderStyleType.DOTTED, BgColorType.GREEN);
		circles[2] = c3;

		printDetails(circles);
	}

	private static void printDetails(Circle[] circles) {
		for (Circle circle : circles) {
			printInfo(circle);
		}
	}

	private static void printInfo(Circle c) {
		System.out.println("radius is " + c.getRadius());
		System.out.println("Area is " + c.calculateArea());
		System.out.println("Border style is :" + c.getBorderStyle());
		System.out.println("Bg Color is : " + c.getBgColor());
		System.out.println(" ");
	}

}
