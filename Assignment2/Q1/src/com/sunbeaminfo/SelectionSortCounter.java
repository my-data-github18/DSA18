package com.sunbeaminfo;

public class SelectionSortCounter {
	static int count;
	
	public static int selectionSortCounter(int arr[], int N) {
		for(int i = 0; i< N-1; i++) {
			for(int j = i + 1; j<N; j++) {
				count++;
				if(arr[i] > arr[j]) {
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return count;
	}
	public static void main(String[] args) {
		
		int arr[] = {44, 11, 55, 22, 66, 33};
		
		int count = selectionSortCounter(arr, arr.length);
				System.out.println("count is: " + count);
	}

}
