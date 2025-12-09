package com.AllBasic;

import java.util.Scanner;

public class SumAndOddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No is Even or Odd ");
         int no=sc.nextInt();
         
         if(no%2==0)
        	 System.out.println("The No is Even No");
         else
        	 System.out.println("These is an Odd No");
	}

}
