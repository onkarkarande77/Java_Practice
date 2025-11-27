package com.string;

public class CheckFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		//simple string 
		String str="onkarkarande";
		
		//take reff for the count the frequency
	    int freq[]=new int[256];
	    
	    //count the frequency and push in to the variable
	    for(int i=0;i<str.length();i++) {
	    	freq[str.charAt(i)]++;
	    }
	
	  //print the result   
	  for(int i=0;i<freq.length;i++) {
		  
		  if(freq[i]>0) {
		  System.out.println((char)i+"-"+freq[i]);
	  }
	  }
	}

}
