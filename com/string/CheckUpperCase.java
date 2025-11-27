package com.string;

public class CheckUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="OnKaR";
        
		//this variable for the holding upper case count 
		int upper=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			//this is method in Character that count Upper Case
			if(Character.isUpperCase(ch)) {
				upper++;
			}
		}
		System.out.println("upper"+"-"+upper);
	}

}
