package com.monocept.test;

public class RuntimeExceptionTest {
	public static void main(String[] args) {
		try {
			m1();
		} catch (RuntimeException e) {
			System.out.println("inside catch,hashcode :" + e.hashCode());
			e.printStackTrace();
//			System.out.println(e.getMessage());
		}
		System.out.println("end");
	}

	private static void m1() {
		System.out.println("inside m1");
		m2();
	}

	private static void m2() {
		System.out.println("inside m2");
		m3();
	}

	private static void m3() {
		System.out.println("inside m3");
		RuntimeException ex;
		ex = new RuntimeException("something went wrong");

		System.out.println("inside m3 hashcode :" + ex.hashCode());
		throw ex;

	}

}
