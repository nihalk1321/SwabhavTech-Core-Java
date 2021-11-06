package com.monocept.model;

public class Circle {
	private float radius;
	private String color;
	private float area;
	private float perimeter;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = checkColor(color);
	}

	public float getArea() {
		return area;
	}

	public void setArea() {
		this.area = (22 / 7) * radius * radius;
	}

	public float getPerimeter() {
		return perimeter;
	}

	public void setPerimeter() {
		this.perimeter = (22 / 7) * radius * 2;
	}

	private String checkColor(String color) {
		if (!color.equals("red") && !color.equals("green") && !color.equals("blue")) {
			return "invalid color";
		}
		return color;
	}

}
