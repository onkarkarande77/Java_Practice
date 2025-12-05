package com.random;

import java.util.Random;

public class RandomOTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Random rd=new Random();
       
       String otp="";
       
       for(int i=0;i<6;i++) {
    	   otp+=rd.nextInt(10);
       }
    
       System.out.println("Enter this otp "+otp);
	}
}
