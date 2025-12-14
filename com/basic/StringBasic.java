package com.revise.string;

public class StringBasic {
 public static void main(String[] args) {
	
	 String s="onkar";
	 //length
	 System.out.println( s.length());
	 //char index
	 System.out.println(s.charAt(1));
	 //join to String
	 System.out.println(s.concat(" karande"));
	 //equals
	 System.out.println(s.equals("onkar"));
	 //equal in ignore case
	 System.out.println(s.equalsIgnoreCase("ONKAR"));
	 //upper case
	 System.out.println(s.toUpperCase());
	 //lower case
	 System.out.println(s.toLowerCase());
	 //substring to extract some part of them
	 System.out.println(s.substring(0, 4));
	 // contain check if present
	 System.out.println(s.contains("kar"));
	 //index of the string 
	 System.out.println(s.indexOf("k"));
	 //trim remove space from the string 
	 System.out.println(s.trim());
	 
}
}
