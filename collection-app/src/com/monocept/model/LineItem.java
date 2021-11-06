package com.monocept.model;

public class LineItem {
	private int itemID;
	private String itemName;
	private int itemQuantity;
	private double itemPrice;
	private double itemTotalPrice;
	static double abill = 0;
	static double bbill = 0;

	@Override
	public String toString() {

		return "\nitem id : " + this.getItemID() + "\nitem name: " + this.getItemName() + "\nitem price per unit : "
				+ this.getItemPrice() + "\nitem quantity : " + this.getItemQuantity() + "\nitem total price :"
				+ this.itemTotalPrice() + "\ntotal bill :" + totalBillI();
	}

	public LineItem(int itemID, String itemName, int itemQuantity, double itemPrice) {
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
	}

	public double itemTotalPrice() {
		return this.itemTotalPrice = this.itemQuantity * this.itemPrice;
	}

	public double totalBillF() {

		abill += this.itemTotalPrice;
		return abill;
	}

	public double totalBillI() {

		bbill += this.itemTotalPrice;
		return bbill;
	}

	public int getItemID() {
		return itemID;
	}

	public String getItemName() {
		return itemName;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public double getItemTotalPrice() {
		return itemTotalPrice;
	}

}
