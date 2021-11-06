package com.monocept.test;

import com.monocept.model.Account;

public class AccountEqualsTest {
	public static void main(String[] args) {
		Account acc1 = new Account(101, "Sachin", 5000);
		Account acc2 = new Account(101, "Nihal", 5000);

		System.out.println(acc1 == acc1);
		System.out.println(acc1.equals(acc1));

		System.out.println(acc1 == acc2);
		System.out.println(acc1.equals(acc2));

		Account acc3 = acc1;
		System.out.println(acc3 == acc1);
		System.out.println(acc3.equals(acc1));

//		String str = "nihal";
//		String str2 = "kamble";
//		System.out.println(str.equals(str2));
	}

}
