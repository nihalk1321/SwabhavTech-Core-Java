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

	@Override
	public String toString() {
		return "account number :" + getAccountNumber() + ", Name :" + getName() + ", Balance :" + getBalance() + "\n"
				+ super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		Account acc = (Account) obj;
		if (this.getAccountNumber() != acc.getAccountNumber()) {
			return false;
		}
		if (this.getName() != acc.getName()) {
			return false;
		}
		return true;
	}

}
