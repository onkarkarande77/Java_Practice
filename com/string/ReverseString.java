package com.string;

public class ReverseString {
	public static void main(String[] args) {
		
		String str="javaProgram";
		String rev="";
		//simple way to reverse the string
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		System.out.println("Reverse String is:"+rev);
	}

}
