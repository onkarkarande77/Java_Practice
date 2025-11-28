package com.string;

public class SwappingString {
   public static void main(String[] args) {
	
	   String str="javaProgram";
	   //taking array to swap
	   char a[]=str.toCharArray();
	   //swapping
	   for(int i=0,j=a.length-1;i<j;i++,j--) {
		   char temp=a[i];
	             a[i]=a[j];
	             a[j]=temp; 
	   }
     String swap="";
     for(int i=0;i<a.length;i++) {
    	 swap+=a[i];
     }
      System.out.println("Swapping String is:"+swap);
   }
   
}
