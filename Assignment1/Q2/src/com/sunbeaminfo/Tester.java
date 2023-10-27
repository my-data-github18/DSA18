package com.sunbeaminfo;

import java.util.Scanner;

public class Tester {

	public static int LinearSearch(Employee[] arr,int empid) {
		int cnt=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getEmpid()==empid) {
				return i;
				
			}
			
		}	
		return -1;		
		}
	
	public static int LinearSearch(Employee[] arr,String name) {
		int cnt=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getName().equals(name)) {
				return i;	
			}
		}	
		return -1;		
		}
	public static int LinearSearch(Employee[] arr,Double sal) {
		int cnt=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getSalary()==sal) {
				return i;	
			}
		}	
		return -1;		
		}
	
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		Employee[] emparr= new Employee[5];
		emparr[0]=new Employee(100,"Akash",80000);
		emparr[1]=new Employee(101,"Sahil",50000);
		emparr[2]=new Employee(103,"Roni",500000);
		emparr[3]=new Employee(104,"SD",500000);
		emparr[4]=new Employee(105,"PS",500000);
		
//		System.out.println("Enter emp id to search:");
//		int id=sc.nextInt();
//		int index=LinearSearch(emparr,id);
//		if (index==-1) {
//			System.out.println("Employee not found");
//			
//		}
//		else
//			System.out.println("Employee found at index:"+index);
//		
		System.out.println("Enter emp name to search:");
		String name=sc.next();
		int index2=LinearSearch(emparr,name);
		if (index2==-1) {
			System.out.println("Employee not found");
			
		}
		else
			System.out.println("Employee found at index:"+index2);
		
		System.out.println("Enter emp salary to search:");
		double salary=sc.nextDouble();
		int index3=LinearSearch(emparr,salary);
		if (index3==-1) {
			System.out.println("Employee not found");	
		}
		else
			System.out.println("Employee found at index:"+index3);
		
	}

}
