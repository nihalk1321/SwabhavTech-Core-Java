package com.monocept.test;

import com.monocept.model.Account;

public class AccountEqualsToStringTest {
	public static void main(String[] args) {
		Account acc1 = new Account(101, "Nihal", 5000);

		System.out.println(acc1);
		System.out.println(" ");
		System.out.println(acc1.toString());

//		String output = acc1.toString();
//		System.out.println("ouput is :"+output);

	}

}
