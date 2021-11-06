package com.monocept.model;

public class InsufficientFundsException extends RuntimeException {

	public InsufficientFundsException(Account a) {
		super();
	}

	@Override
	public String getMessage() {
		return "Min-balance limit is 500";
	}

}
