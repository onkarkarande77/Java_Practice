package com.arrays;

import java.util.Scanner;

public class ArraySwapping {
  
	 public static void main(String[] args) {
		//swapping the user entered array
	   //taking the array element from the user
		
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the size if an array");
		 int n=sc.nextInt();
	     //taking for loop to taking the element from the console
	     int ar[]=new int[n];
	     System.out.println("Enter the "+n+" element");
	     for(int i=0;i<n;i++) {
	    	 ar[i]=sc.nextInt();
	     }
	     
	     //swapping the user entered array
	     for(int i=0,j=ar.length-1;i<j;i++,j--) {
	    	int temp=ar[i];
	    	     ar[i]=ar[j];
	    	     ar[j]=temp;
	     }
	     System.out.println("reverse array is");
	     for(int rev:ar) {
	    	 System.out.println(rev);
	     }
	     
		 
	 }
}
