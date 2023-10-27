package com.sunbeaminfo;

public class PbwaMain {
	public static int LinearSearch(int[] arr,int key) {
		int count=0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==key) {
				count++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, -2, 5, 1, 0, 4, -2, 7, 8 };

		for (int i = 0; i < arr.length; i++) {
			int cnt=LinearSearch(arr, arr[i]);
			if (cnt==1) {
				System.out.println("1st non repeatating element is "+arr[i]);
				System.exit(0);
			}
		}

	}

}