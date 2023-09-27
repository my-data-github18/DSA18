package com.sunbeam;

public class Stack {
	private int[] arr;
	private final int SIZE;
	private int top;

	public Stack(int size) {
		this.SIZE = size;
		arr = new int[SIZE];
		this.top = SIZE;
	}

	public void push(int data) {
		top--;
		arr[top] = data;
	}

	public int pop() {
		int data = arr[top++];
		return data;
	}

	public int peek() {
		return arr[top];
	}

	public boolean isFull() {
		return top == 0;
	}

	public boolean isEmpty() {
		return top == SIZE;
	}
}