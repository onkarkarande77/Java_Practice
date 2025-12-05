package com.arrays;

import java.util.Arrays;

public class RemoveDuplicateStream_Java8 {
	public static void main(String[] args) {
		
		int ar[]= {10,20,30,40,50,10,20,30,40};
		
		  int[] result = Arrays.stream(ar).distinct().toArray();

         System.out.println(Arrays.toString(result)); 
				        
		
	}
}
