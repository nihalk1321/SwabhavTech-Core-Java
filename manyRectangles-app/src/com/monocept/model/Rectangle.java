package com.monocept.model;

public class Rectangle {
	private int width;
	private int height;
	private int area;

	public int calculateArea() {
		return setArea(width * height);
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

	public void setWidth(int width) {
		this.width = checkValue(width);
	}

	public void setHeight(int height) {
		this.height = checkValue(height);
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getArea() {
		return area;
	}

	public int setArea(int area) {
		this.area = area;
		return area;
	}

}
