package com.monocept.test;

import com.monocept.model.GenderType;
import com.monocept.model.Human;

public class HumanTest {
	public static void main(String[] args) {
		Human h1 = new Human("sharon", 5.3, 55, GenderType.OTHER);
		printInfo(h1);
		h1.eat();
		System.out.println("after eat");
		printInfo(h1);
		h1.play();
		System.out.println("after play");
		printInfo(h1);

		Human h2 = new Human("mark", 5.8, 65);
		printInfo(h2);
		h2.eat();
		System.out.println("after eat");
		printInfo(h2);
		h2.play();
		System.out.println("after play");
		printInfo(h2);
	}

	private static void printInfo(Human h) {
		System.out.println("Name is:" + h.getName());
		System.out.println("gender is:" + h.getGender());
		System.out.println("Height is:" + h.getHeight());
		System.out.println("wieght is:" + h.getWeight());
		System.out.println("");
		System.out.println(" ");

	}

}
