package com.arrays;

public class MinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar[]= {10,20,30,40,50};
		
		int min=ar[0];
		
		for(int i=0;i<ar.length;i++) {
			if(min>ar[i]) {
				min=ar[i];
			}
		}
		
		System.out.println("Minimum number is "+min);

	}

}
