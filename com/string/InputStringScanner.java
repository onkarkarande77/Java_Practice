package com.string;

import java.util.Scanner;

public class InputStringScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=sc.nextLine();
		 
		 //reverse string or swapping of the string 
		System.out.println();
		char ar[]=str.toCharArray();
		for(int i=0,j=ar.length-1;i<j;i++,j--) {
			char temp=ar[i];
			   ar[i]=ar[j];
			   ar[j]=temp;
		}
		
		for(char ch:ar) {
			System.out.print(" "+ch);
		}
      //check the count
		int letter=0,digit=0,space=0,symbol=0,vowels=0,consonats=0; 
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
		        ch=Character.toLowerCase(ch);
		        
		      if(ch>='a' && ch<='z') {
		    	  if(ch=='a' || ch=='i' || ch=='o' || ch=='u'||ch=='e') {
		    		  vowels++;
		    	  }
		    	  else {
		    		  consonats++;
		    	  }
		      }
		    
		    if(Character.isLetter(ch)) {
		    	letter++;
		    }
		    else if(Character.isDigit(ch)) {
		    	digit++;
		    }
		    else if(Character.isSpace(ch)) {
		    	space++;
		    }
		    else {
		    	symbol++;
		    }
		}
		System.out.println();
		System.out.println("vowels-"+vowels);
		System.out.println("consonats-"+consonats);
		System.out.println("letter-"+letter);
		System.out.println("digit-"+digit);
		System.out.println("space-"+space);
		System.out.println("symbol-"+symbol);
	}

}
