package com.multithreading;

public class Bank_Account {
	public static void main(String[] args) {
		Account1 a1=new Account1();
		
		User1 u1=new User1(a1);
		User1 u2=new User1(a1);
		
		u1.start();
		u2.start();
		
	}

}

//---------------------------------------------------------------------------------------------------------------------------------
class Account1{
	 int balance=700;

	 synchronized void withdraw(int amt) {
		 if(balance>=amt){
			 balance-=amt;
			 System.out.println("amt withdraw successfully"+balance);
		 }
		 
		 else {
			 System.out.println("fail to withdraw");
		 }
	 }
	
}


//---------------------------------------------------------------------------------------------------------------------------
class User1 extends Thread{
	Account1 acc;
	
	User1(Account1 acc){
		this.acc=acc;
	}
	
	public void run() {
		acc.withdraw(500);
	}
}
