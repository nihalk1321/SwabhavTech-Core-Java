package com.monocept.test;

import com.monocept.model.Calculator;
import com.monocept.model.OddNumberNotSupportedException;

public class CalculatorTest {

	public static void main(String[] args) throws OddNumberNotSupportedException {
		Calculator calc = new Calculator();
		int res = 0;
		try {
			res = calc.cubeEvenNumber(12);
		} catch (Exception e) {
			System.out.println("Caught exception "+ e);
		}
		System.out.println(res);

	}

}
