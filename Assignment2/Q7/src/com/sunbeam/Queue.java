package com.sunbeam;

public class Queue {
	private int[] arr;
	private final int SIZE;
	private int front, rear;

	public Queue(int size) {
		this.SIZE = size;
		arr = new int[SIZE + 1];
		front = 0;
		rear = 0;
	}

	public void push(int data) {
		rear++;
		arr[rear] = data;
	}

	public void pop() {
		front++;
	}

	public int peek() {
		return arr[front + 1];
	}

	public boolean isFull() {
		return rear == SIZE;
	}

	public boolean isEmpty() {
		return rear == front;
	}
}