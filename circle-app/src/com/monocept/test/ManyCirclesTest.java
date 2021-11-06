package com.monocept.test;

import com.monocept.model.Circle;

public class ManyCirclesTest {
	public static void main(String[] args) {
		Circle manyCircles[] = new Circle[3];
		Circle c1 = new Circle();
		manyCircles[0] = c1;
		Circle c2 = new Circle();
		manyCircles[1] = c2;
		Circle c3 = new Circle();
		manyCircles[2] = c3;

		c1.setRadius((float) 5.7);
		c1.setColor("red");
		c1.setArea();
		c1.setPerimeter();
		printInfo(c1);

		c2.setRadius((float) 3.1);
		c2.setColor("blue");
		c2.setArea();
		c2.setPerimeter();
		printInfo(c2);

		c3.setRadius((float) 2);
		c3.setColor("orange");
		c3.setArea();
		c3.setPerimeter();
		printInfo(c3);

		findLargestSmallest(manyCircles);
	}

	private static void findLargestSmallest(Circle[] manyCircles) {
		float large = 0, small = 0;
		large = small = manyCircles[0].getArea();
		for (int i = 0; i < manyCircles.length; i++) {
			if (manyCircles[i].getArea() > large)
				large = manyCircles[i].getArea();
			if (manyCircles[i].getArea() < small)
				small = manyCircles[i].getArea();
		}
		System.out.println("Circle with largest area is:" + large);
		System.out.println("Circle with smallest area is:" + small);
	}

	private static void printInfo(Circle c) {
		System.out.println("radius is " + c.getRadius());
		System.out.println("color is :" + c.getColor());
		System.out.println("Perimeter is " + c.getPerimeter());
		System.out.println("Area is " + c.getArea());
		System.out.println(" ");
	}

}