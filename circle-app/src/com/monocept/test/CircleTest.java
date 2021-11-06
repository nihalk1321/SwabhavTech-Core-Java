package com.monocept.test;

import com.monocept.model.Circle;

public class CircleTest {
	public static void main(String[] args) {

		Circle smallCircle = new Circle();
		Circle bigCircle = new Circle();

		smallCircle.setRadius((float) 5.7);
		smallCircle.setColor("red");
		smallCircle.setArea();
		smallCircle.setPerimeter();
		printInfo(smallCircle);

		bigCircle.setRadius(7);
		bigCircle.setColor("yellow");
		bigCircle.setArea();
		bigCircle.setPerimeter();
		printInfo(bigCircle);
	}

	private static void printInfo(Circle c) {
		System.out.println(" radius is " + c.getRadius());
		System.out.println("color is :" + c.getColor());
		System.out.println(" Perimeter is " + c.getPerimeter());
		System.out.println(" Area is " + c.getArea());
		System.out.println(" ");
	}
}
