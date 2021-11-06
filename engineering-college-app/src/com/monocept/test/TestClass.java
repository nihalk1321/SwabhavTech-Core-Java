package com.monocept.test;

import com.monocept.model.Branchtype;
import com.monocept.model.Professor;
import com.monocept.model.Student;

public class TestClass {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Hyderabad", "13/10/1999", Branchtype.CIVIL);
		Student s2 = new Student(102, "Chennai", "22/5/1998", Branchtype.CSE);

		Professor p1 = new Professor(201, "Kolkata", "10/10/1989", 10000);
		Professor p2 = new Professor(202, "Delhi", "1/12/1992", 9500);

		printStudentDetails(s1);
		printStudentDetails(s2);
		printProfDetails(p1);
		printProfDetails(p2);
	}

	private static void printProfDetails(Professor p) {
		System.out.println("Professor id is " + p.getId());
		System.out.println("address is " + p.getAddress());
		System.out.println("dob  is " + p.getDob());
		System.out.println("basic salary :" + p.getbasicSalary());
		System.out.println("gross salary :" + p.grossSalary());
		System.out.println(" ");

	}

	private static void printStudentDetails(Student s) {
		System.out.println("Student id is " + s.getId());
		System.out.println("address is " + s.getAddress());
		System.out.println("dob  is " + s.getDob());
		System.out.println("branch :" + s.getBranch());
		System.out.println(" ");

	}

}
