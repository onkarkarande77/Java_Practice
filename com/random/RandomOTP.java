package com.random;

import java.util.Random;
import java.util.RandomAccess;

public class RandomOTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random rd=new Random();
		 String otp="";
	   for(int i=0;i<4;i++) {
		    otp+=rd.nextInt(10);
	   }
	   
	   System.out.println(otp);

	}
//for the pass
  
}
