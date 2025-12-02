package com.arrays;

public class MaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {10,20,33,50,40};
		
		int max=ar[0];
		
		for(int i=0;i<ar.length;i++) {
		 
			if(max<ar[i]) {
				max=ar[i];
			}
		}
		
		System.out.println("large no is "+max);

	}

}
