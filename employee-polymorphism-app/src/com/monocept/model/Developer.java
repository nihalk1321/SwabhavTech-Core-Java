package com.monocept.model;

public class Developer extends Employee {

	private double peformanceAllowance = 0.5 * (this.basicSalary);
	private double annualIncentives = 0.4 * (this.basicSalary);

	public Developer(String name, double basicSalary, int id) {
		super(name, basicSalary, id);
	}

	@Override
	public String getCTC() {
		double salary;

		salary = this.basicSalary + this.peformanceAllowance + this.annualIncentives;
		return "\nJob Role : " + this.getRole() + "\nName of employee : " + this.getName() + "\nID of employee : "
				+ this.getId() + "\nBasic pay :" + this.basicSalary + "\nPerformance allowance :"
				+ this.peformanceAllowance + "\nAnnual incentives :" + this.annualIncentives + "\nAnnual ctc :"
				+ salary;
	}

	@Override
	public String getHtmlCTC() {
		double salary;

		salary = this.basicSalary + this.peformanceAllowance + this.annualIncentives;
		return "\nJob Role : " + this.getRole() + "\nName of employee : " + this.getName() + "\nID of employee : "
				+ this.getId() + "\nBasic pay :" + this.basicSalary + "\nPerformance allowance :"
				+ this.peformanceAllowance + "\nAnnual incentives :" + this.annualIncentives + "\nAnnual ctc :"
				+ salary;
	}

}
