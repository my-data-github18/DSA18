package com.sunbeam;

public class CounterCircularQueue {
	private int[] arr;
	private int front, rear, count = 0;
	private final int SIZE;

	public CounterCircularQueue(int sIZE) {
		this.SIZE = sIZE;
		arr = new int[SIZE];
		front = -1;
		rear = -1;
	}

	public void push(int data) {
		rear = (rear + 1) % SIZE;
		arr[rear] = data;
		count++;
	}

	public void pop() {
		front = (front + 1) % SIZE;
		if (front == rear)
			front = rear = -1;
		count--;
	}

	public int peek() {
		return arr[(front + 1) % SIZE];
	}

	public boolean isFull() {
		if (count == SIZE)
			return true;
		return false;
	}

	public boolean isEmpty() {
		if (count == 0)
			return true;
		return false;
	}
}
