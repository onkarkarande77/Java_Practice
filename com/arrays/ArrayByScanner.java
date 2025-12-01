package com.arrays;

import java.util.Scanner;

public class ArrayByScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int ar[]=new int[n];
		System.out.println("Enter the array elemnts");
		System.out.println();
		
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		
		for(int i=0;i<ar.length;i++) {
			System.out.println("user enter array is:"+ar[i]);
		}
   
	}

}
