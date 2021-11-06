package com.monocept.model.test;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int gpa;

	public Student(int id, String name, int gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
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

	@Override
	public int compareTo(Student obj) {
		if (obj.getId() > this.getId()) {
			return 1;
		}
		if (obj.getId() < this.getId())
			return -1;
		return 0;
	}

}
