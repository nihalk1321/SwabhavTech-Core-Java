package com.monocept.model;

public class Accountant extends Employee {

	private double perks = 0.3 * (this.basicSalary);

	public Accountant(String name, double basicSalary, int id) {
		super(name, basicSalary, id);
	}

	@Override
	public String getCTC() {
		double salary;
		salary = this.basicSalary + this.perks;
		return "\nJob Role : " + this.getRole() + "\nName of employee : " + this.getName() + "\nID of employee : "
				+ this.getId() + "\nBasic pay :" + this.basicSalary + "\nperks :" + this.perks + "\nannual salary "
				+ salary;
	}

	@Override
	public String getHtmlCTC() {
		double salary;
		salary = this.basicSalary + this.perks;
		return "\nJob Role : " + this.getRole() + "\nName of employee : " + this.getName() + "\nID of employee : "
				+ this.getId() + "\nBasic pay :" + this.basicSalary + "\nperks :" + this.perks + "\nannual salary "
				+ salary;
	}

}
