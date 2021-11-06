package com.monocept.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.monocept.model.test.Customer;
import com.monocept.model.test.SortByAmountComparator;
import com.monocept.model.test.SortByNameComparator;

public class MapTest {
	public static void main(String[] args) {
//		caseStudy1();
//		caseStudy2();
//		caseStudy3();
//		caseStudy4();
//		caseStudy5();
		caseStudy6();
	}

	private static void caseStudy6() {
		Customer c1 = new Customer(101, 3001, "nihal", 900);
		Customer c2 = new Customer(102, 3100, "aditya", 2000);
		Customer c3 = new Customer(103, 3251, "sayed", 1200);
		Customer c4 = new Customer(104, 3334, "vidya", 2900);

		Map<Customer, Customer> dictionary;
		dictionary = new TreeMap<Customer, Customer>(new SortByAmountComparator());

		dictionary.put(c1, c1);
		dictionary.put(c2, c2);
		dictionary.put(c3, c3);
		dictionary.put(c4, c4);
		System.out.println("TreeMap sort by Amount\n");
		for (Customer i : dictionary.values()) {
			System.out.println("id :" + i.getId());
			System.out.println("name :" + i.getName());
			System.out.println("order id :" + i.getOrderid());
			System.out.println("amount :" + i.getAmount());
			System.out.println(" ");
		}
		
		
	}

	private static void caseStudy5() {
		Customer c1 = new Customer(101, 3001, "nihal", 900);
		Customer c2 = new Customer(102, 3100, "aditya", 2000);
		Customer c3 = new Customer(103, 3251, "sayed", 1200);
		Customer c4 = new Customer(104, 3334, "vidya", 2900);

		Map<Customer, Customer> dictionary;
		dictionary = new TreeMap<Customer, Customer>(new SortByNameComparator());

		dictionary.put(c1, c1);
		dictionary.put(c2, c2);
		dictionary.put(c3, c3);
		dictionary.put(c4, c4);
		System.out.println("TreeMap sort by Name\n");
		for (Customer i : dictionary.values()) {
			System.out.println("id :" + i.getId());
			System.out.println("name :" + i.getName());
			System.out.println("order id :" + i.getOrderid());
			System.out.println("amount :" + i.getAmount());
			System.out.println(" ");
		}
		
	}

	private static void caseStudy4() {
		Customer c1 = new Customer(101, 3001, "nihal", 900);
		Customer c2 = new Customer(102, 3100, "aditya", 2000);
		Customer c3 = new Customer(103, 3251, "sayed", 1200);
		Customer c4 = new Customer(104, 3334, "vidya", 2900);

		Map<Customer, Customer> dictionary;
		dictionary = new TreeMap<Customer, Customer>();

		dictionary.put(c1, c1);
		dictionary.put(c2, c2);
		dictionary.put(c3, c3);
		dictionary.put(c4, c4);
		System.out.println("TreeMap sort by id\n");
		for (Customer i : dictionary.values()) {
			System.out.println("id :" + i.getId());
			System.out.println("name :" + i.getName());
			System.out.println("order id :" + i.getOrderid());
			System.out.println("amount :" + i.getAmount());
			System.out.println(" ");
		}

	}

	private static void caseStudy3() {
		Customer c1 = new Customer(101, 3001, "nihal", 900);
		Customer c2 = new Customer(102, 3100, "aditya", 2000);
		Customer c3 = new Customer(103, 3251, "sayed", 1200);
		Customer c4 = new Customer(104, 3334, "vidya", 2900);

		Map<Customer, Customer> dictionary;
		dictionary = new LinkedHashMap<Customer, Customer>();

		dictionary.put(c1, c1);
		dictionary.put(c2, c2);
		dictionary.put(c3, c3);
		dictionary.put(c4, c4);
		for (Customer i : dictionary.values()) {
			System.out.println("id :" + i.getId());
			System.out.println("name :" + i.getName());
			System.out.println("order id :" + i.getOrderid());
			System.out.println("amount :" + i.getAmount());
			System.out.println(" ");
		}

	}

	private static void caseStudy2() {
		Customer c1 = new Customer(101, 3001, "nihal", 900);
		Customer c2 = new Customer(102, 3100, "aditya", 2000);
		Customer c3 = new Customer(103, 3251, "sayed", 1200);
		Customer c4 = new Customer(104, 3334, "vidya", 2900);

		Map<Customer, Customer> dictionary;
		dictionary = new HashMap<Customer, Customer>();

		dictionary.put(c1, c1);
		dictionary.put(c2, c2);
		dictionary.put(c3, c3);
		dictionary.put(c4, c4);
		for (Customer i : dictionary.values()) {
			System.out.println("id :" + i.getId());
			System.out.println("name :" + i.getName());
			System.out.println("order id :" + i.getOrderid());
			System.out.println("amount :" + i.getAmount());
			System.out.println(" ");
		}
	}

	private static void caseStudy1() {
		Map<Integer, String> dictionary;
		dictionary = new HashMap<Integer, String>();
		System.out.println(dictionary.size());

		dictionary.put(4, "kamble");
		dictionary.put(2, "Nihal");
		System.out.println(dictionary.values());

		dictionary.put(1, "Aditya");
		dictionary.put(3, "vidya");
		dictionary.put(2, "raj");
		System.out.println(dictionary.values());

		dictionary.put(3, "kannan");
		dictionary.put(4, "sayed");
		System.out.println(dictionary.values());
		System.out.println(dictionary.size());

		dictionary.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));
	}
}
