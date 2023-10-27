package com.sunbeam;

import java.util.Scanner;

public class BinarySearchCounter {

	public static int binarySearch(int arr[], int size, int key) {
		int left = 0, right = size - 1, mid, count = 0;
		
		while (left <= right) {
			count++;
		mid = (left + right)/2;
		if(key == arr[mid]) {
			System.out.println("Number of comparision: " + count);
			return mid;
		}
		else if(key < arr[mid])
			right = mid;
		else 
			left = mid+1;
			
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {12,14, 15, 17, 19, 22, 24, 100};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Key to be Searched: ");
		int key = sc.nextInt();
		
		int index = binarySearch(arr, arr.length, key);
		if(index != -1)
			System.out.println("Key is found at index " + index);
		else
			System.out.println("Key is not found");
		
		sc.close();
	}
}
