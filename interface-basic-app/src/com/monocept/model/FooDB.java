package com.monocept.model;

public abstract class FooDB implements IDataAccessible {

	@Override
	public void create() {
		System.out.println("create method in fooDB");
	}
}
