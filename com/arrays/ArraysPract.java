package com.arrays;

import java.util.*;

public class ArraysPract {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		int [] arr= {1,2,3,4,5};
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
		System.out.println();
		
		//reverse
		for(int i=0,j=arr.length-1;i<j;i++,j--) {
			int temp=arr[i];
			   arr[i]=arr[j];
			   arr[j]=temp;
		}
		
		for(int rev:arr) {
			System.out.print(rev);
		}
		
		System.out.println();
		
		//second largest
		
		int large=0;
		int second=0;
		
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>large) {
				second=large;
				large=arr[i];
			}
			
			else if(arr[i] !=large && arr[i]>second) {
				second=arr[i];
			}
		}
		
		System.out.println("Second Large element "+second);
		
		System.out.println();
		
		//max 
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
		    
			if(arr[i]>max) {
			 
				 max=arr[i];
			}
		
		}
		
		System.out.println("max no is "+max);
		
		System.out.println();
		
		//min value 
		 int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.print("min no is "+min);
		
	    System.out.println();
	    
	    //sorting array
	    int []order =new int[arr.length];
	    for(int i=0;i<arr.length;i++) {
	    	
	    	for(int j=0;j<arr.length;j++) {
	    	
	    		if(arr[i]>arr[j]){
	    			order[i]=arr[i];
	    			
	    		}
	    	}
	    }
	    
	    System.out.println(Arrays.toString(order));
	    
	    System.out.println();
	    
	    
	    //using the swapping
	    
	    for(int i=0;i<arr.length;i++) {
	    	for(int j=0;j<arr.length;j++) {
	    		
	    		if(arr[i]<arr[j]) {
	    			
	    			int temp=arr[i];
	    			  arr[i]=arr[j];
	    			    arr[j]=temp;
	    		}
	    	}
	    }
	    
	   for(int i=0;i<arr.length;i++) {
		   System.out.print(arr[i]+",");
	   }
	   
	   System.out.println();
	   System.out.println(Arrays.toString(arr));
	
	}

}
