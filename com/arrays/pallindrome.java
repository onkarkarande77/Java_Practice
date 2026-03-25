package com.arrays;

public class pallindrome {
	public static void main(String[] args) {
		
		String a="madam";
		
		String rev="";
		
		for (int i=a.length()-1;i>=0;i--) {
			 
			rev+=a.charAt(i);
			
			
		}
		
		System.out.println(rev);
		
		if(rev.equals(a))
		{
			System.out.println("this is pallinderome");
		}
		
		else {
			System.out.println("not pallindrome");
		}
	}

}
