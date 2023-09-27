
package com.sunbeam;

import java.util.Arrays;

public class InsertionSortAscending {

	public static int insertionSort(int[] arr) {
		int comparisons = 0;
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			comparisons++;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
		return comparisons;
	}

	public static void main(String[] args) {
		int arr[] = { 55, 44, 22, 66, 11, 33 };
//		int arr[] = {11, 22, 33, 44, 55, 66};

		System.out.println("Array before sort : " + Arrays.toString(arr));
		int count = insertionSort(arr);
		System.out.println("Array after sort : " + Arrays.toString(arr));
		System.out.println("No. of Comparisons: " + count);
	}
}
