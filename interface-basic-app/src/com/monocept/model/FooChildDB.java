package com.monocept.model;

public class FooChildDB extends FooDB {

	@Override
	public void read() {
		System.out.println("read method fooDB child");
	}

	@Override
	public void update() {
		System.out.println("update method fooDB child");
	}

	@Override
	public void delete() {
		System.out.println("delete method fooDB child");
	}
}
