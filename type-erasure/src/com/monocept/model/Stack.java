package com.monocept.model;

public class Stack<E> {
	private E[] stackContent;

	public Stack(int capacity) {
		this.stackContent = (E[]) new Object[capacity];
	}

	public void push(E data) {
		// ..
	}

	public E pop() {
		return null;
		// ..
	}
}
