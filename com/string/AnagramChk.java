package com.string;

 
import java.util.Arrays;

public class AnagramChk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="listen";
		String str2="silent";
		
		char[] ar1=str1.toCharArray();
		char[] ar2=str2.toCharArray();
		
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		if(Arrays.equals(ar1,ar2)) {
			System.out.println("this is an anagram");
		}
		else {
			System.out.println("it was not anagram");
		}
         
	}

}
