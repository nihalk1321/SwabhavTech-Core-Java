package com.monocept.model;

public class SavingsAccount extends Account {

	public SavingsAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}

//	@Override
	public void withdraw(double withdrawAmount) {
		if (this.balance - withdrawAmount < 1000) {
			System.out.println("cannot withdraw " + withdrawAmount + " \n500 is min-balance limit");
			return;
		}
		this.balance -= withdrawAmount;
	}
}
