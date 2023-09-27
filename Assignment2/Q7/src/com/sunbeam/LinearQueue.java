package com.sunbeam;

import java.util.Scanner;

public class LinearQueue {

	public static void main(String[] args) {
		Queue q = new Queue(4);
		int choice;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("\n0. Exit\n1. Push\n2. Pop\n3. Peek\n");
			System.out.print("Enter Your Choice: \t");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (q.isFull())
					System.out.println("Queue is full");
				else {
					System.out.print("Enter Data to add: \t");
					int data = sc.nextInt();
					q.push(data);
				}
				break;

			case 2:
				if (q.isEmpty())
					System.out.println("Queue is Empty");
				else {
					q.pop();
				}
				break;

			case 3:
				if (q.isEmpty())
					System.out.println("Queue is Empty");
				else {
					System.out.print("Peeked Data: " + q.peek());
				}
				break;

			default:
				break;
			}
		} while (choice != 0);

		sc.close();

	}

}
