package com.monocept.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.monocept.model.test.Student;
import com.monocept.model.test.StudentHash;

public class HashSetTest {
	public static void main(String[] args) {
		caseStudy();

	}

	private static void caseStudy() {
		StudentHash s1 = new StudentHash(101, "Nihal", 8);
		StudentHash s2 = new StudentHash(101, "Nihal", 8);
		StudentHash s3 = new StudentHash(102, "aditya", 9);

		Set<StudentHash> students;
		students = new HashSet<StudentHash>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		System.out.println(students.size());
		for (StudentHash iter : students) {
			System.out.println(iter.getId());
			System.out.println(iter.getName());
			System.out.println(iter.getGpa());
		}

	}

}
