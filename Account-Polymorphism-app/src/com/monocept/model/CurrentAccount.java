package com.monocept.model;

public class CurrentAccount extends Account {
	private double overDraft = 10000;

	public CurrentAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
	}

//	@Override
	public void withdraw(double withdrawAmount) {
		if (this.balance - withdrawAmount < -(this.overDraft)) {
			System.out.println("cannot withdraw " + withdrawAmount + " \n overdraft limit is " + this.overDraft);
			return;
		}
		this.balance -= withdrawAmount;
	}

}
