package com.monocept.test;

import com.monocept.model.Account;

public class AccountTest {
	public static void main(String[] args) throws Exception {
		Account acc1 = new Account(101, "sachin", 1000);
		printAccountDetails(acc1);
		
		try {
			acc1.withdraw(500);
		} catch (Exception e) {
			System.out.println("inside catch");
			System.out.println(e);
		} finally {
			System.out.println("\ninside finally");
			printAccountDetails(acc1);
		}
	}

	private static void printAccountDetails(Account a) {
		System.out.println("Account number is:" + a.getAccountNumber());
		System.out.println("Name is:" + a.getName());
		System.out.println("balance is:" + a.getBalance());
		System.out.println(" ");

	}

}
