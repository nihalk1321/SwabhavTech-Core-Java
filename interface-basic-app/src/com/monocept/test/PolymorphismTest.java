package com.monocept.test;

import com.monocept.model.CustomerDB;
import com.monocept.model.DepartmentDB;
import com.monocept.model.FooChildDB;
import com.monocept.model.FooDB;
import com.monocept.model.IDataAccessible;
import com.monocept.model.OrderDB;

public class PolymorphismTest {

	public static void main(String[] args) {
		doCrud(new CustomerDB());
		doCrud(new OrderDB());
		doCrud(new DepartmentDB());
//		doCrud(new FooDB());
		FooDB x = new FooChildDB();
		doCrud(x);

	}

	private static void doCrud(IDataAccessible obj) {
		System.out.println("doing crud operations\n");
		obj.create();
		obj.read();
		obj.update();
		obj.delete();
		System.out.println(" ");

	}

}
