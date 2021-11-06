package com.monocept.model;

public class Account {
	private final int accountNumber;
	private final String name;
	private double balance;

	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public Account(int accountNumber, String name) {
		this(accountNumber, name, 1000);
	}

	public void deposit(double depositAmount) {
		this.balance += depositAmount;
	}

	public void withdraw(double withdrawAmount) {
		if (this.balance - withdrawAmount < 500) {
			System.out.println("cannot withdraw " + withdrawAmount + " \n500 is min-balance limit");
			return;
		}
		this.balance -= withdrawAmount;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

}
