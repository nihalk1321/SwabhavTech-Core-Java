package com.monocept.model;

public class DepartmentDB implements IDataAccessible {

	@Override
	public void create() {
		System.out.println("create method in DeptDB");
	}

	@Override
	public void read() {
		System.out.println("read method in DeptDB");

	}

	@Override
	public void update() {
		System.out.println("update method in DeptDB");

	}

	@Override
	public void delete() {
		System.out.println("delete method in DeptDB");

	}

}
