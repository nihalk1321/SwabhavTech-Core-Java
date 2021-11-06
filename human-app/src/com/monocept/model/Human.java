package com.monocept.model;

public class Human {
	private String name;
	private double height;
	private int weight;
	private GenderType gender;
	private static int count = 0;

	public Human(String name, double height, int weight) {
		this(name, height, weight, GenderType.FEMALE);
	}

	public Human(String name, double height, int weight, GenderType gender) {
		this.name = name;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
		count++;

	}

	public String getName() {
		return name;
	}

	public GenderType getGender() {
		return gender;
	}

	public double getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public void eat() {
		this.weight += (0.05) * weight;
	}

	public void play() {
		this.height += (0.02) * height;
	}

	public int getCount() {
		return count;
	}

	public static int headCount() {
		return count;
	}
}
