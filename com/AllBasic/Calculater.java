package com.AllBasic;

import java.util.Scanner;

public class Calculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first no ");
		int a=sc.nextInt();
		System.out.println("Enter the second no ");
		int b=sc.nextInt();
        
		System.out.println("Enter the operator(+,-,*./)");
		char op=sc.next().charAt(0);
	   int c=0;
	    switch(op) {case '+':c=a+b;
	                         System.out.println("Addition is "+c);
	                         break;
	                case '-':c=a-b;
	                         System.out.println("Subtraction is "+c);
 	                         break;
	                case '*':c=a*b;
	                         System.out.println("multiplicatio is "+c);
	                         break;
	                case '/':c=a/b;
	                         System.out.println("division is "+c);
	                         break;
	                default:System.out.println("enter the correct operator");
	                        break;
	    
	    
	    } 
	
	}

}
