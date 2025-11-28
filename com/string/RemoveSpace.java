package com.string;

public class RemoveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="welcome to java class";
		System.out.println(str);
		//remove space from the sentence
		str=str.replaceAll(" ","");
		System.out.println(str);
		
		//find the last and first letter of the string 
		System.out.println("First:"+str.charAt(0));
		System.out.println("Last:"+str.charAt(str.length()-1));
		

	}

}
