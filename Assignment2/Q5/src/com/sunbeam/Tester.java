package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		Employee[] arr = new Employee[4];
		arr[0] = new Employee(101, "Pranoti", 75000);
		arr[1] = new Employee(105, "Anisha", 85000);
		arr[2] = new Employee(104, "Rohit", 90000);
		arr[3] = new Employee(102, "Rutvik", 70000);

		System.out.println("Array before sort: ");
		for (Employee employee : arr) {
			System.out.println(employee);
		}
		SortBySalary.bubbleSort(arr);
		System.out.println();
		System.out.println("Array after sort: ");
		for (Employee employee : arr) {
			System.out.println(employee);
		}

	}

}