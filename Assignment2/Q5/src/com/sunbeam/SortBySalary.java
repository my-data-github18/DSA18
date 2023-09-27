package com.sunbeam;

public class SortBySalary {
	public static void bubbleSort(Employee[] arr) {
		int flag;
		for (int i = 1; i < arr.length; i++) {
			flag = 0;
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j].getSalary() > arr[j + 1].getSalary()) {
					Employee temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0)
				break;
		}
	}
}