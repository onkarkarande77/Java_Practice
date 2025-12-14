package com.revise.string;

public class SwappingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "sanket";
		char ar[] = name.toCharArray();
		for (int i = 0, j = ar.length - 1; i < j; i++, j--) {
			char temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;

		}
		for(char ch:ar)
		{
			System.out.print(""+ch);
			
		}
      
	}

	}


