package com.arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {10,20,33,65,44};
		
		int large=0;
		int second=0;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]>large) {
				second=large;
				large=ar[i];
			}
			else if(ar[i]!=large && ar[i]>second ) {
				second=ar[i];
			} 
		}
		System.out.println("second largest no is "+second);

	}

}
