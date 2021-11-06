package com.monocept.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.monocept.model.Account;

import junit.framework.Assert;

public class AccountUnitTest {

	@Test
	public void initialize_2param_constructor() {
		Account a1 = new Account(101, "Nihal");
		int expectedAccountNumber = 101;
		String expectedAccountName = "Nihal";

		assertEquals(expectedAccountNumber, a1.getAccountNumber());
		assertEquals(expectedAccountName, a1.getName());
	}

	@Test
	public void defaultBalance_value_500() {
		Account a1 = new Account(101, "Nihal");
		double expectedAccountBalance = 500;

		assertTrue(expectedAccountBalance == a1.getBalance());
	}

	@Test
	public void withDrw() {
		Account a1 = new Account(101, "Nihal");
		double expectedAccountBalance = 500;

		assertTrue(expectedAccountBalance == a1.getBalance());
	}

}
