package com.monocept.test;

import com.monocept.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		Account acc1 = new Account(101, "sachin");
		System.out.println(acc1);
		printAccountDetails(acc1);

		acc1.withdraw(600);
		printAccountDetails(acc1);

		acc1.deposit(500);
		printAccountDetails(acc1);

		acc1.withdraw(500);
		printAccountDetails(acc1);
	}

	private static void printAccountDetails(Account a) {
		System.out.println("Account number is:" + a.getAccountNumber());
		System.out.println("Name is:" + a.getName());
		System.out.println("gender is:" + a.getBalance());
		System.out.println(" ");

	}

}
