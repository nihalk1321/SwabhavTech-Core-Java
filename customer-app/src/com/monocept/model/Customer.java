package com.monocept.model;

public class Customer {
	private String name;
	private int purchase;
	private static int nextId = 1000;
	private int cid;

	public Customer(String name, int purchase) {
		this.name = name;
		this.purchase = purchase;
		this.cid = ++nextId;

	}

	public String getName() {
		return name;
	}

	public int getPurchase() {
		return purchase;
	}

	public int getCid() {
		return cid;
	}
}
