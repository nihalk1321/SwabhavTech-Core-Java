package com.monocept.model;

public class OrderDB implements IDataAccessible {

	@Override
	public void create() {
		System.out.println("create method in orderDB");
	}

	@Override
	public void read() {
		System.out.println("read method in orderDB");

	}

	@Override
	public void update() {
		System.out.println("update method in orderDB");

	}

	@Override
	public void delete() {
		System.out.println("delete method in orderDB");

	}

}
