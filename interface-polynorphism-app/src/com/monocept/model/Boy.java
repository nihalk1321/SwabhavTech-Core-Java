package com.monocept.model;

public class Boy implements IEmotionable, IMannerable {

	@Override
	public void wish() {
		System.out.println("boy wishes");
	}

	@Override
	public void depart() {
		System.out.println("boy departs");
	}

	@Override
	public void cry() {
		System.out.println("boy cries");
	}

	@Override
	public void laugh() {
		System.out.println("boy laughs");
	}

}
