package com.arrays;

public class ArraySort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {3,2,7,9,1};
		
		
		for(int i=0;i<ar.length;i++) {
			
		  for(int j=0;j<ar.length;j++) {
			  if(ar[i]<ar[j]) {
				  int temp=ar[i];
				      ar[i]=ar[j];
				      ar[j]=temp;
				  } 
		  }
		}
		
		for(int num:ar) {
			System.out.println(num);
		}
	}

}
