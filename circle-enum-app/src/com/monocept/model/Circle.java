package com.monocept.model;

public class Circle {
	private float radius;
//	private float area;
	private BorderStyleType borderStyle;
	private BgColorType bgColor;

	public Circle(float pradius, BorderStyleType pborderstyle) {
		this(pradius, pborderstyle, BgColorType.RED);
	}

	public Circle(float pradius, BorderStyleType pborderstyle, BgColorType pbgcolor) {
		radius = pradius;
		setBorderStyle(pborderstyle);
		setBgColor(pbgcolor);

	}

	public float getRadius() {
		return radius;
	}

	public BorderStyleType getBorderStyle() {
		return borderStyle;
	}

	private void setBorderStyle(BorderStyleType pborderstyle) {
		borderStyle = pborderstyle;
	}

	private void setBgColor(BgColorType pbgcolor) {
		bgColor = pbgcolor;
	}

	public BgColorType getBgColor() {
		return bgColor;
	}

	public float calculateArea() {
		float area = (22 / 7) * radius * radius;
		return area;
	}
}
