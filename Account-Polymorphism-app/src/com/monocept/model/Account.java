package com.monocept.model;

public abstract class Account {
	protected int accountNumber;
	protected String name;
	protected double balance;

	public Account(int accountNumber, String name, double balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;

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

	public void deposit(double depositAmount) {
		this.balance += depositAmount;
	}

	public abstract void withdraw(double withdrawAmount);
}
