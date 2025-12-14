package com.revise.string;

import java.util.Arrays;

public class StringRevise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="silent";
		String s2="listen";
		
		char[] a1=s1.toCharArray();
		char[] a2=s2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		if(Arrays.equals(a1 ,a2)) {
			System.out.println("It is Angramm");
		}
		else {
			System.out.println("is not angram");
		}
		
		
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
		}
		
		System.out.println();
		
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.println(s1.charAt(i));
		}
		
		char ar[]=s1.toCharArray();
		
		for(int i=0,j=s1.length()-1;i<j;i++,j--) {
			char temp=ar[i];
			     ar[i]=ar[j];
			     ar[j]=temp;
		}
		
		String name="";
		for(int i=0;i<ar.length;i++) {
			name+=ar[i];
		}
		System.out.println(name);
		if(name.equals(s1)) {
			System.out.println("Is it Pallindrom ");
		}
		else {
			System.out.println("it was not pallindrom");
		}

	}

}
