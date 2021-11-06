package com.monocept.test;

import java.io.*;

import com.monocept.model.Rectangle;

public class ManyRectangles {
	public static void main(String[] args) {
		Rectangle manyRectangles[] = new Rectangle[3];
		Rectangle r1 = new Rectangle();
		manyRectangles[0] = r1;
		Rectangle r2 = new Rectangle();
		manyRectangles[1] = r2;
		Rectangle r3 = new Rectangle();
		manyRectangles[2] = r3;

		r1.setWidth(-1);
		r1.setHeight(5);

		r2.setWidth(120);
		r2.setHeight(7);

		r3.setWidth(99);
		r3.setHeight(99);

		serialization(manyRectangles);

		deSerialization();
	}

	private static void deSerialization() {
		try {
			FileInputStream file = new FileInputStream("rectangles.bin");
			ObjectInputStream in = new ObjectInputStream(file);
			System.out.println("Object has been Deserialized");
			Rectangle[] p = (Rectangle[]) in.readObject();
			System.out.println(p.length);
			printInfo(p);
			System.out.println(" ");
			in.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void serialization(Rectangle[] manyRectangles) {
		try {
			FileOutputStream file = new FileOutputStream("rectangles.bin");
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(manyRectangles);
			out.flush();
			out.close();
			file.close();
			System.out.println("Success,Object has been serialized \n");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private static void printInfo(Rectangle[] p) {
		for (int i = 0; i < p.length; i++) {
			System.out.println("width is " + p[i].getWidth());
			System.out.println("height is " + p[i].getHeight());
			System.out.println("area is " + p[i].calculateArea());
			System.out.println(" ");
		}

	}

}
