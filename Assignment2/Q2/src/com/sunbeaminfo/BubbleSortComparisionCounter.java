package com.sunbeaminfo;

public class BubbleSortComparisionCounter {
	

	public static int bubbleSortCounter(int arr[], int N) {
		int count = 0;
		int passes = 0;
		int flag;
		//1. count number of passes
		for(int i = 1 ; i < N ; i++) {
			passes++;
			flag = 0;
			//2. compare two consecutive elements
			for(int j = 0 ; j < N - i ; j++) {
				count++;
				//3. if left element is greater than right element then swap
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if(flag == 0)
				break;
		}
		return count;
	}
	public static void main(String[] args) {
		int arr[] = {33, 22, 66, 55, 44, 11};
		int count = bubbleSortCounter(arr, arr.length);
		System.out.println("Total number of comparision is: " + count);
		
	}

}
