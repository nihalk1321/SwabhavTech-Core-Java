package com.monocept.model;

public class Calculator {

	public int cubeEvenNumber(int n) throws OddNumberNotSupportedException {
		if (n % 2 != 0) {
			throw new OddNumberNotSupportedException("\n" + n + " is odd ,odd numbers not allowed");
		}
		return n * n * n;
	}

}
