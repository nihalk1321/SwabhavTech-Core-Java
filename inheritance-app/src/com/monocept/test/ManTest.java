package com.monocept.test;

import com.monocept.model.Boy;
import com.monocept.model.Infant;
import com.monocept.model.Kid;
import com.monocept.model.Man;

public class ManTest {
	public static void main(String[] args) {
//		caseStudy1();
//		caseStudy2();
//		caseStudy3();
//		caseStudy4();
		caseStudy5();
	}

	private static void caseStudy5() {
		System.out.println("case Study 5 \n");
		Object x;
		x = 10;
		System.out.println(x.toString());
		System.out.println(x.getClass() + "\n");

		x = "hello";
		System.out.println(x.toString());
		System.out.println(x.getClass() + "\n");

		x = "#";
		System.out.println(x.toString());
		System.out.println(x.getClass() + "\n");

		x = new Man();
		System.out.println(x.toString());
		System.out.println(x.getClass() + "\n");

		x = new Infant();
		System.out.println(x.toString());
		System.out.println(x.getClass() + "\n");
		System.out.println(" ");

		Infant y = (Infant) x;
		y.play();
		y.read();
		System.out.println(y.getClass());
		
	}

	private static void caseStudy4() {
		System.out.println("case Study 4");
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Infant());
		atThePark(new Kid());

	}

	private static void atThePark(Man x) {
		System.out.println("At the PArk");
		x.play();
		System.out.println(x.getClass());

	}

	private static void caseStudy3() {
		System.out.println("case Study 3");
		Man x;
		x = new Boy();
		x.play();
		x.read();
	}

	private static void caseStudy2() {
		System.out.println("case Study 2");
		Boy b;
		b = new Boy();
		b.eat();
		b.play();
		b.read();

	}

	private static void caseStudy1() {
		System.out.println("case Study 1");
		Man x;
		x = new Man();
		x.play();
		x.read();

	}

}
