package com.monocept.model.test;

public class StudentHash {
	private int id;
	private String name;
	private int gpa;

	public StudentHash(int id, String name, int gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGpa() {
		return gpa;
	}

}
