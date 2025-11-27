package com.string;

<<<<<<< HEAD
=======
 
>>>>>>> fe3a080a89bde9ccd1d321ccb11dcdc9c0b0e6bf
import java.util.Arrays;

public class AnagramChk {

	public static void main(String[] args) {
<<<<<<< HEAD
		//simple string
		
		String str1="silent";
		String str2="listen";
		
	   char []a1=str1.toCharArray();
	   char []a2=str2.toCharArray();
		
	   Arrays.sort(a1);
	   Arrays.sort(a2);
	   
       if(Arrays.equals(a1,a2)) {
    	   System.out.println("this is an anagram");
       }	   
       else {
    	   System.out.println("this is not anagram");
       }
	}
=======
		// TODO Auto-generated method stub
		String str1="listen";
		String str2="silent";
		
		char[] ar1=str1.toCharArray();
		char[] ar2=str2.toCharArray();
		
		Arrays.sort(ar1);
		Arrays.sort(ar2);
		
		if(Arrays.equals(ar1,ar2)) {
			System.out.println("this is an anagram");
		}
		else {
			System.out.println("it was not anagram");
		}
         
	}

>>>>>>> fe3a080a89bde9ccd1d321ccb11dcdc9c0b0e6bf
}
