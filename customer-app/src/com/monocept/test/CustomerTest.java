package com.monocept.test;

import com.monocept.model.Customer;

public class CustomerTest {
	public static void main(String[] args) {
		Customer c1 = new Customer("sachin", 10000);
		System.out.println("sachin id is " + c1.getCid());

		Customer c2 = new Customer("Rahul", 20000);
		System.out.println("rahul id is " + c2.getCid());

		Customer c3 = new Customer("virat", 30000);
		System.out.println("virat id is " + c3.getCid() + "\n");

		System.out.println("sachin id is " + c1.getCid() + "\n");
		System.out.println("rahul id is " + c2.getCid() + "\n");
		System.out.println("sachin id is " + c1.getCid() + "\n");
		System.out.println("virat id is " + c3.getCid() + "\n");
	}
}
