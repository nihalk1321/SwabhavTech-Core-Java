package com.monocept.model;

public class BoundStack<E extends Comparable<E>> {
	private E[] stackContent;

	public BoundStack(int capacity) {
		this.stackContent = (E[]) new Comparable[capacity];
//		this.stackContent = (E[]) new Object[capacity];
		
	}

	public void push(E data) {
	}

	public E pop() {
		return null;
	}
}
