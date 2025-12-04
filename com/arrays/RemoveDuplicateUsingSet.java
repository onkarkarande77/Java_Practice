package com.arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateUsingSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {10,20,30,40,50,10,20,30,40};
		
		Set<Integer> s=new HashSet<>();
		
		for(int n:ar) {
			s.add(n);
		}
	
		System.out.println("array element by removing dupplicate "+s);
		

	}

}
