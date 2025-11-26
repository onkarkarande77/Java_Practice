package com.string;

public class CharFrequncey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//here we check the frequency of the word character	
		 String str="onkarkarande";
      
		 //take a freq as temporary variable
		 int freq[]=new int[256];
	
		 //first we pushing the all the string in to the our reff
		 
		 for(int i=0;i<str.length();i++) {
			 freq[str.charAt(i)]++;
		 }
		 
		 //we check and print the frequency
		 
		 for(int i=0;i<freq.length;i++) {
			 if(freq[i]>0) {
				 
				 System.out.println((char)i+"-"+freq[i]);
			 }
		 }
	}

}
