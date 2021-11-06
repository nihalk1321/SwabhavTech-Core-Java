package com.monocept.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.monocept.model.Accountant;
import com.monocept.model.Developer;
import com.monocept.model.Employee;
import com.monocept.model.Manager;

public class EmployeeTest {

	public static void main(String[] args) throws Exception {
		Employee a = new Manager("bezos", 4000, 101);
		printToText(a);
		printToHtml(a);

		Employee b = new Developer("harry", 6000, 102);
		printToText(b);
		printToHtml(b);

		Employee c = new Accountant("charlie", 3000, 103);
//		printToText(c);
		printToHtml(c);

	}
	public static void printToHtml(Employee emp) throws Exception {
		File employee = new File(emp.getName() + "_" + emp.getId() + ".html");
		BufferedWriter bw = new BufferedWriter(new FileWriter(employee));

		bw.write("<html><body style=background-color:BurlyWood><h1>Salary of Employee</h1>");
		bw.write(
				"<style>table,th,td {border: 1px solid black; border-collapse: collapse;}th, td {padding-top: 10px;  padding-bottom: 20px; padding-left: 30px; padding-right: 40px;\r\n"
						+ "}</style>");
		bw.write(
				"<table style=width:50% ><tr><th>Role</th><th>Employee name</th><th>Employee ID</th><th>Salary details</th></tr></table>");
		bw.write("<table style=width:50%><tr><td>" + emp.getRole() + "</td><td>" + emp.getName() + "</td><td>"
				+ emp.getId() + "</td><td><textarea rows=4 cols=50>" + emp.getCTC() + "</textarea> </td></tr></table>");
		bw.write("</body></html>");
		bw.close();

		String path = employee.getAbsolutePath();
		System.out.println("salary slip generated at " + path);
	}
	public static void printToText(Employee emp) {
		try {
			File employee = new File(emp.getName() + "_" + emp.getId() + ".txt");
			PrintWriter pw = new PrintWriter(employee);
			pw.println("Salary slip of Employee - " + emp.getCTC());
			pw.close();
			String path = employee.getAbsolutePath();
			System.out.println("salary slip generated at " + path);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
