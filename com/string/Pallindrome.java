package com.string;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="madam";
		String rev="";
		//taking simple array for the swapping
         char a[]=str.toCharArray();
         
         for(int i=0,j=a.length-1;i<j;i++,j--) {
        	 char temp=a[i];
        	     a[i]=a[j];
                 a[j]=temp;
         }
         
         for(int i=0;i<a.length;i++) {
        	 rev+=a[i];
         }
	  System.out.println("-"+rev);
	  
	  if(rev.endsWith(str)) {
		  System.out.println("in is pallindrome");
	  }
	  else {
		  System.out.println("this is not pallindrome");
	  }
	  
	//reverse string in the simple way  
	 String re="";
	   for(int i=str.length()-1;i>=0;i--) {
		    re+=str.charAt(i);
	   } 
	   
	   System.out.println("--"+re);
     
	 //check pallindrome
	 if(re.equals(str)) {
		 System.out.println("pallindrom");
	 }
	 else {
		 System.out.println("not pallindrome");
	 }
	
	}
	
	
	

}
