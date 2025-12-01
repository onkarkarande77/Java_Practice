package com.arrays;

public class SimpleArray {
   
	 public static void main(String[] args) {
		//simple Array
		 
		 int ar[]=new int[5];
		 
		 ar[0]=10;
		 ar[1]=20;
		 ar[2]=30;
		 ar[3]=40;
		 ar[4]=50;
		 
		 for(int i=0;i<ar.length;i++) {
			 System.out.println("ARRAY IS:"+ar[i]);
		 }
		 
		 for(int num:ar) {
			 System.out.println("Array element is:"+num);
		 }
	 }
	
}
