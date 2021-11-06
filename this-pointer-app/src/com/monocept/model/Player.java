package com.monocept.model;

public class Player {
	private int id;
	private String name;
	private GenderType gender;
	private int age;

	public Player(int id, String name) {
		this(id, name, GenderType.MALE, 18);
	}

	public Player(int id, String name, GenderType gender, int age) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		System.out.println("object created");
		System.out.println("hashcode value using this:" + this.hashCode() + "\n");
	}

	public int getid() {
		return id;
	}

	public String getName() {
		return name;
	}

	public GenderType getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public Player whoIsElder(Player p2) {
		return (this.age < p2.age) ?  p2 :  this;
//		if (this.age < p2.age) {
//			return p2;
//		}
//		return this;
	}

}
