package com.monocept.model;

public class CustomerDB implements IDataAccessible {

	@Override
	public void create() {
		System.out.println("create method in CustomerDB");
	}

	@Override
	public void read() {
		System.out.println("read method in CustomerDB");

	}

	@Override
	public void update() {
		System.out.println("update method in CustomerDB");

	}

	@Override
	public void delete() {
		System.out.println("delete method in CustomerDB");

	}

}
