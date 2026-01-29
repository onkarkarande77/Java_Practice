package com.AllBasic;

import java.util.Scanner;

public class FactorialNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the No ");
         int num=sc.nextInt();
         
         int fact=1;
         
         for(int i=1;i<=num;i++) {
        	 fact*=i;
         }
         
         System.out.println("factorial of the no is  "+fact);
	}

}
