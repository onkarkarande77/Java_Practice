package com.string;

import java.util.Arrays;

public class AnagramChk {

	public static void main(String[] args) {
 
		//simple string
		
		String str1="silent";
		String str2="listen";
		
	   char []a1=str1.toCharArray();
	   char []a2=str2.toCharArray();
		
	   Arrays.sort(a1);
	   Arrays.sort(a2);
	   
       if(Arrays.equals(a1,a2)) {
    	   System.out.println("this is an anagram");
       }	   
       else {
    	   System.out.println("this is not anagram");
       }
	}
 
		// TODO Auto-generated method stub
		 
	}

 

