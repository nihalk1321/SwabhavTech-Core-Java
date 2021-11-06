package com.monocept.model;

public class Rectangle {
	private int width;
	private int height;
	private final String bgColor;

	public Rectangle(int pwidth, int pheight) {
		this(pwidth, pheight, "Red");
	}

	public Rectangle(int pwidth, int pheight, String pbgColor) {
		this.bgColor = pbgColor;
		setWidth(pwidth);
		setHeight(pheight);
		System.out.println("Object Created");
	}

	public String getColor() {
		return validateBgColor(bgColor);
	}

	private String validateBgColor(String color) {
		if (color.equalsIgnoreCase("red") || color.equalsIgnoreCase("green") || color.equalsIgnoreCase("blue")) {
			return color;
		}
		return "Red";
	}

	public void setWidth(int pwidth) {
		width = checkValue(pwidth);
	}

	public void setHeight(int pheight) {
		height = checkValue(pheight);

	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	private int checkValue(int number) {
		if (number < 1) {
			return 1;
		}
		if (number > 100) {
			return 100;
		}
		return number;
	}

}
