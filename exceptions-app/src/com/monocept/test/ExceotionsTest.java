package com.monocept.test;

public class ExceotionsTest {
	public static void main(String[] args) {
		System.out.println("----COPYRIGHT TO NIHAL KAMBLE----");
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[3]);
			int result = a / b;
			System.out.println(result);
			main(args);
		} catch (NullPointerException nullpointer) {
			System.out.println("provide values for a,b .");
		} catch (ArithmeticException arithmetic) {
			System.out.println("Denominator cant be zero");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("index out of bound");
		} catch (NumberFormatException numberFormat) {
			System.out.println("Cant convert an String to integer , wrong format");
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
		System.out.println("Thank You");
		System.out.println("End of main");
	}
}