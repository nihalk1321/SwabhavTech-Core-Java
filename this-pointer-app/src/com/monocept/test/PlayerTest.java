package com.monocept.test;

import com.monocept.model.GenderType;
import com.monocept.model.Player;

public class PlayerTest {
	public static void main(String[] args) {
		Player p1 = new Player(101, "Dhoni");
		printInfo(p1);
		System.out.println(" ");
		Player p2 = new Player(102, "Sachin", GenderType.MALE, 50);
		printInfo(p2);

		Player elder = p1.whoIsElder(p2);
		System.out.println("printing elder details \n");
		printInfo(elder);
	}

	private static void printInfo(Player p) {
		System.out.println("Id is:" + p.getid());
		System.out.println("Name is:" + p.getName());
		System.out.println("gender is:" + p.getGender());
		System.out.println("Age is:" + p.getAge());
		System.out.println("hashcode value " + p.hashCode() + "\n");

	}

}
