package com.revise.AllBasic;

public class StdMain {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		StdData sd=new StdData(1,"java",87,98);

		StdProcess sp=new StdProcess();
		
		System.out.println("Total Mark is "+sp.getTot(sd));
		System.out.println("Averaege of the "+sp.getAvg(sd));
		System.out.println("Result Status "+sp.getResult(sd));
		System.out.println("Grade point "+sp.getGrade(sd));
	}

}
