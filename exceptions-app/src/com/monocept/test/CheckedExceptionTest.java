package com.monocept.test;

public class CheckedExceptionTest {
	public static void main(String[] args) throws Exception {
		try {
			m1();
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("end of main");
	}

	private static void m1() throws Exception {
		System.out.println("inside m1");
		m2();
	}

	private static void m2() throws Exception {
		System.out.println("inside m2");
		m3();
	}

	private static void m3() throws Exception {
		System.out.println("inside m3");
		throw new Exception("wrong in m3");
	}
}
