package com.string;

public class VowelCount {
	
	public static void main(String[] args) {
		
		String str="OnkarKarande05@gmail.com   Hello";
		//take variable for the vowels count
		int vowel=0,
			consonants=0,
			letter=0,
		    space=0,
		    digits=0,
		    symbol=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			     ch=Character.toLowerCase(ch);
			     
			  //we taking loop to check the count of vowels and consonants
		     if(ch>='a' && ch<='z') {
		    	 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		    		 vowel++;
		    	 }
		    	 else {
		    		 consonants++;
		    	 }
		     }
		     
		     //here we check the all the count of letter,space,digit,symbol
		     
		      if(Character.isLetter(ch)) {
		        letter++;	 
		     }
		     else if(Character.isSpace(ch)) {
		    	 space++;
		     }
		
		     else if(Character.isDigit(ch)) {
		    	 digits++;
		     }
		     else {
		    	 symbol++;
		     }
        }
		
		System.out.println("Vowels-"+vowel);
		System.out.println("consonants-"+consonants);
		System.out.println("letters-"+letter);
		System.out.println("spaces-"+space);
		System.out.println("digits-"+digits);
		System.out.println("Symbol-"+symbol);
		
		
	}

}
