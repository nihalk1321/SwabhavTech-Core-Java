package com.monocept.test;

import com.monocept.model.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle smallRectangle = new Rectangle();
		Rectangle bigRectangle = new Rectangle();

		smallRectangle.canYouChangeWidth(-10);
		smallRectangle.canYouChangeHeight(110);
//		printInfo(smallRectangle);

		bigRectangle.canYouChangeWidth(20);
		bigRectangle.canYouChangeHeight(30);
//		printInfo(bigRectangle);

		Rectangle temp = bigRectangle;
		temp.canYouChangeWidth(25);
//		System.out.println("->temp");
//		printInfo(temp);

//		temp = null;
//		printInfo(temp);
		System.out.println("->Anonymous");
//		System.out.println(new Rectangle());
		printInfo(new Rectangle());
	}

	private static void printInfo(Rectangle r) {
		System.out.println("Width is " + r.canYouGiveMeWidth());
		System.out.println(" Height is " + r.canYouGetMeHeight());
		System.out.println("Area is " + r.calculateArea());
	}

}
