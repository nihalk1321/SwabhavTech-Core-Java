package com.monocept.model;

import java.io.IOException;

public abstract class Employee extends IOException{
	protected String name;
	protected double basicSalary;
	protected int id;

	public Employee(String name, double basicSalary, int id) {
		this.name = name;
		this.basicSalary = basicSalary;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public abstract String getCTC();

	public String getRole() {
		String role = this.getClass().toString().substring(25);
		return role;
	}

	public abstract String getHtmlCTC();	
}
