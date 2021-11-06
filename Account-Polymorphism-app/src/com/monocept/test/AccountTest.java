package com.monocept.test;

import com.monocept.model.Account;
import com.monocept.model.CurrentAccount;
import com.monocept.model.SavingsAccount;

public class AccountTest {
	public static void main(String[] args) {

//		printInfo(new Account(101, "rahul", 5000));

		Account sa = new SavingsAccount(101, "rahul", 5000);
		printInfo(sa);
		sa.withdraw(4500);
		printInfo(sa);

		Account ca = new CurrentAccount(101, "rohan", 5000);
		printInfo(ca);
		ca.withdraw(5500);
		printInfo(ca);

	}

	private static void printInfo(Account a) {
		System.out.println("account number :" + a.getAccountNumber());
		System.out.println("Name :" + a.getName());
		System.out.println("balance :" + a.getBalance());
		System.out.println(" ");
	}

}
