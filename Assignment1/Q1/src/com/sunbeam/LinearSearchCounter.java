package com.sunbeam;

import java.util.Scanner;

public class LinearSearchCounter {
	public static int linrar_search_counter (int arr[], int size, int key) {
		int count = 0;
		for (int i = 0; i < size; i++) {
			count++;
			if(arr[i]==key)
				
				return count;
		}
		
		return count;
	}
	
	
		
	
	public static void main(String[] args) {
	
		int arr[] = {321,23,342,231,43,23,43};
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter key to be searched");
		int key = sc.nextInt();
		
		int count = linrar_search_counter(arr, arr.length, key);
		
		System.out.println("total count is: " + count);
		
		
		
		sc.close();
		
	}

}
