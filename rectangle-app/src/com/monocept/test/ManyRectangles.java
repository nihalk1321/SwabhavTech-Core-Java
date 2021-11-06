package com.monocept.test;

import com.monocept.model.Rectangle;

public class ManyRectangles {
	public static void main(String[] args) {
		Rectangle manyRectangles[] = new Rectangle[3];
		Rectangle r1 = new Rectangle();
		manyRectangles[0] = r1;
		Rectangle r2 = new Rectangle();
		manyRectangles[1] = r2;
		Rectangle r3 = new Rectangle();
		manyRectangles[2] = r3;

		r1.canYouChangeWidth(-1);
		r1.canYouChangeHeight(5);

		r2.canYouChangeWidth(120);
		r2.canYouChangeHeight(7);

		r3.canYouChangeWidth(15);
		r3.canYouChangeHeight(8);

		printInfo(r1);
		printInfo(r2);
		printInfo(r3);
	}

	private static void printInfo(Rectangle r) {
		System.out.println("Width is " + r.canYouGiveMeWidth());
		System.out.println(" Height is " + r.canYouGetMeHeight());
		System.out.println("Area is " + r.calculateArea());
	}

}
