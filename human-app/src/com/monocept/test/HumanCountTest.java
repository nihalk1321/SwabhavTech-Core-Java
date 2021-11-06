package com.monocept.test;

import com.monocept.model.GenderType;
import com.monocept.model.Human;

public class HumanCountTest {
	public static void main(String[] args) {
		Human h1 = new Human("Vidya", 5, 50);
		printInfo(h1);

		Human h2 = new Human("Sayed", 5.5, 70, GenderType.MALE);
		printInfo(h2);

		Human h3 = new Human("Bhargavi", 5, 55);
		printInfo(h3);

	}

	private static void printInfo(Human h) {
		System.out.println("Instance method ,count value :" + h.getCount());
		System.out.println("static method , count value :" + Human.headCount());
		System.out.println(" ");
	}

}
