package com.monocept.model;

public class Manager extends Employee {

	private double hra = 0.6 * (this.basicSalary);
	private double ta = 0.5 * (this.basicSalary);
	private double salaryIncentives = 0.4 * (this.basicSalary);

	public Manager(String name, double basicSalary, int id) {
		super(name, basicSalary, id);
	}

	@Override
	public String getCTC() {
		double salary;
		salary = this.basicSalary + this.hra + this.ta + this.salaryIncentives;

		return "\nJob Role : " + this.getRole() + "\nName of employee : " + this.getName() + "\nID of employee : "
				+ this.getId() + "\nBasic pay :" + this.basicSalary + "\nHRA :" + this.hra + "\nTA :" + this.ta
				+ "\nsales incentives :" + this.salaryIncentives + "\nAnnual salary :" + salary;
	}

	@Override
	public String getHtmlCTC() {
		double salary;
		salary = this.basicSalary + this.hra + this.ta + this.salaryIncentives;
		
		return "\nJob Role : " + this.getRole() + "\nName of employee : " + this.getName() + "\nID of employee : "
				+ this.getId() + "\nBasic pay :" + this.basicSalary + "\nHRA :" + this.hra + "\nTA :" + this.ta
				+ "\nsales incentives :" + this.salaryIncentives + "\nAnnual salary :" + salary;
	}

}
