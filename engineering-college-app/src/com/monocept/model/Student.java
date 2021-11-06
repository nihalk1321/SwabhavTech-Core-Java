package com.monocept.model;

public class Student extends Person {
	private Branchtype branch;

	public Student(int id, String address, String dob, Branchtype branch) {
		super(id, address, dob);
		this.branch = branch;
	}

	public Branchtype getBranch() {
		return branch;
	}

}
