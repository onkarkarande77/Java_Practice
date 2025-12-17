package com.exception;

public class DemoChk {
	public static void main(String[] args) {
		
		ApplyForLicence al=new ApplyForLicence(1,"java",1);	
		try {
			al.applyForLicence(al.age);
			System.out.println("sth");
		} catch (AgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("eligible after "+(18-e.getAge())+"yrs");
		}
		
	}

}

//user define exceptions
 class AgeException extends Exception{
	 int age;
	 
	 public AgeException(int age) {
		 super();
		 this.age=age;
	 }
	 
	 int getAge() {
		 return age;
	 }
 }
 
 class ApplyForLicence{
	 int per_id;
	 String per_name;
	 int age;
	public ApplyForLicence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ApplyForLicence(int per_id, String per_name, int age) {
		super();
		this.per_id = per_id;
		this.per_name = per_name;
		this.age = age;
	}
	 
	 void applyForLicence(int age) throws AgeException{
		 if(age<18) {
			 AgeException ae=new AgeException(age);
			 throw ae;
		 }
		 else {
			 System.out.println("you are eligible");
		 }
		 
	 }
	 
 }
