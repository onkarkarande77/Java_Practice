package com.arrays;

import java.util.Scanner;

public class MinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//taking from the console
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		int n=sc.nextInt();
	    //declare the array variable,it taking the size from the console
		System.out.println("enter the "+n+" array element ");
		int ar[]=new int[n];
		//now taking the array element and inject into the declare variable
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("user entered array element is :");
		for(int arr:ar) {
			System.out.println(arr);
		}
		
		//declare local variable that hold one value to compare
		int min=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(min>ar[i]) {
				min=ar[i];
			}
		}
		System.out.println("minimum value from the array is "+min);
	

	}

}
