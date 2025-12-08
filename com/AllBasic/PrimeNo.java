package com.AllBasic;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no ");
        int n=sc.nextInt();
         
        boolean isPrime=true;
        if(n<=1) {
        	isPrime=false;
        }
        else {
        	for(int i=2;i*i<=n;i++) {
        		if(n%i==0) {
        			isPrime=false;
        			break;
        		}
        	}
        }
        if(isPrime)
        	System.out.println("the no is prime");
        else
        	System.out.println("the no is not Prime");
	}

}
