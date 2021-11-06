package com.monocept.test;

import java.util.Set;
import java.util.TreeSet;

import com.monocept.model.test.Student;
import com.monocept.model.test.SortByNameComparator;
import com.monocept.model.test.SortBycgpa;

public class TreeSetTest {
	public static void main(String[] args) {
		caseStudy1();
		caseStudy2();
		caseStudy3();

	}

	private static void caseStudy1() {
		Student s1 = new Student(101, "Nihal", 8);
		Student s2 = new Student(101, "Nihal", 8);
		Student s3 = new Student(102, "aditya", 9);

		Set<Student> students;
		students = new TreeSet<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		System.out.println("size of treeset:" + students.size());
		for (Student iter : students) {
			System.out.println(iter.getId());
			System.out.println(iter.getName());
			System.out.println(iter.getGpa());
			System.out.println(" ");
		}

	}

	private static void caseStudy2() {
		Student s1 = new Student(101, "nihal", 8);
		Student s2 = new Student(101, "nihal", 8);
		Student s3 = new Student(102, "aditya", 9);
		Student s4 = new Student(103, "raj", 7);
		Set<Student> students;
		students = new TreeSet<Student>(new SortByNameComparator());
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		System.out.println("sort by name comparator");
		System.out.println("size of treeset:" + students.size());
		for (Student iter : students) {
			System.out.println(iter.getId());
			System.out.println(iter.getName());
			System.out.println(iter.getGpa());
			System.out.println(" ");
		}

	}

	private static void caseStudy3() {
		Student s1 = new Student(101, "Nihal", 8);
		Student s2 = new Student(101, "Nihal", 8);
		Student s3 = new Student(102, "aditya", 9);
		Student s4 = new Student(103, "raj", 7);

		Set<Student> students;
		students = new TreeSet<Student>(new SortBycgpa());
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		System.out.println("size of treeset :" + students.size());
		System.out.println("sort by cgpa comparator");
		System.out.println("\nsort by cgpa");
		for (Student iter : students) {
			System.out.println("id is :" + iter.getId());
			System.out.println("name is :" + iter.getName());
			System.out.println("cgpa is :" + iter.getGpa());
			System.out.println(" ");
		}

	}

}
