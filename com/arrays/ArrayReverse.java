package com.arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//reverse print 
		int ar[]= {10,20,30,40,50};
		
		//we are use the for loop to print the reverse array
		System.out.println("Array reverse is:-");
		System.out.print("{");
        for(int i=ar.length-1;i>=0;i--) {
        	System.out.print(+ar[i]+",");
        }
        System.out.println("}");
        
        //now swapping the array  
        for(int i=0,j=ar.length-1;i<j;i++,j--) {
        	int temp=ar[i];
        	     ar[i]=ar[j];
        	     ar[j]=temp;
        }
        
        //int rev=0;
        for(int rev:ar) {
        	System.out.println("Reverse Array is:"+rev);
        }
	}

}
