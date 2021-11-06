package com.monocept.model;

public class Man implements IMannerable {

	@Override
	public void wish() {
		System.out.println("man wishes");
	}

	@Override
	public void depart() {
		System.out.println("man departs");
	}

}
