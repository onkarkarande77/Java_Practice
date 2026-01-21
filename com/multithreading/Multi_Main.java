package com.multithreading;


//this is the main class that handle all task
 public class Multi_Main {
	public static void main(String[] args) {
        Account acc = new Account();
        User u1 = new User(acc);
        User u2 = new User(acc);

        u1.start();
        u2.start();
    }
}

 
 //in this class that can be help hold account details
class Account {
    int balance = 1000;

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdraw successful. Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}



//this class perform the user task 
class User extends Thread {
    Account acc;

    User(Account acc) {
        this.acc = acc;
    }

    public void run() {
        acc.withdraw(500);
    }
}
