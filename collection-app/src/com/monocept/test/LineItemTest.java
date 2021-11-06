package com.monocept.test;

import java.util.ArrayList;
import java.util.Iterator;

import com.monocept.model.LineItem;

public class LineItemTest {

	public static void main(String[] args) {

		LineItem item1 = new LineItem(1001, "biscuits", 3, 150);
		LineItem item2 = new LineItem(1002, "books", 10, 70);

		ArrayList<LineItem> basket = new ArrayList<LineItem>();
		basket.add(item1);
		basket.add(item2);

		printUsingForEachLoop(basket);
		printYsingIterator(basket);

	}

	private static void printYsingIterator(ArrayList<LineItem> basket) {
		System.out.println("USING ITERATOR ");
		Iterator<LineItem> iter = basket.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " \n");
		}
	}

	private static void printUsingForEachLoop(ArrayList<LineItem> basket) {
		System.out.println("USING FOR EACH LOOP");
		for (LineItem item : basket) {
			System.out.println("item id : " + item.getItemID());
			System.out.println("item name: " + item.getItemName());
			System.out.println("item price per unit : " + item.getItemPrice());
			System.out.println("item quantity : " + item.getItemQuantity());
			System.out.println("item total price :" + item.itemTotalPrice());
			System.out.println("total bill :" + item.totalBillF());

			System.out.println(" ");
		}

	}

}
