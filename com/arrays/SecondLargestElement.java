package com.arrays;

import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//TAKING ARRAY USING SACANNER CLASS
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int n=sc.nextInt();
		//taking the array element from the console
		System.out.println("enter the arrays element ");
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("simple array entered by the user");
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
			 
		}
		
		//now we check the second largest element from the 
		System.out.println("second largest array");
		int large=0;
		int second=0;
		for(int i=0;i<n;i++) {
			
			if(ar[i]>large) {
			second=large;
			large=ar[i]; 
			}
			else if(ar[i]!=large && ar[i]>second) {
				   second= ar[i];
		  		}
		}
		System.out.println(second);
		
		

	}

}
