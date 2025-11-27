package com.string;

public class CountAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Welcome to java programming class 123";
		//variable for the count
		
		int letter=0,digit=0,space=0;
		//push the String into the char
        for(int i=0;i<str.length();i++) {
        	char ch=str.charAt(i);
        	
        	if(Character.isLetter(ch)) {
        		letter++;
        	}
        	else if(Character.isDigit(ch)){
        		digit++;
        	}
        	else if(Character.isSpace(ch)) {
        		space++;
        	}
       
        }
        
        System.out.println("letters-"+letter);
        System.out.println("digits-"+digit);
        System.out.println("spaces-"+space);
	}

}
