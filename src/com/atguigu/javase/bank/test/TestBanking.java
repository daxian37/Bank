/*
 * This class creates the program to test the banking classes.
 * It creates a new Bank, sets the Customer (with an initial balance),
 * and performs a series of transactions with the Account object.
 */
package com.atguigu.javase.bank.test;

import com.atguigu.javase.bank.Account;

public class TestBanking {

  public static void main(String[] args) {
    Account account=null;

    // Create an account that can has a 500.00 balance.
    System.out.println("Creating an account with a 500.00 balance.");
    account= new Account(500);
    
	//code
    System.out.println("Withdraw 150.00");
   	//code
    account.withdrow(150);

    System.out.println("Deposit 22.50");
   
	//code
    account.deposit(22.50);

    System.out.println("Withdraw 47.62");
   	//code
    account.withdrow(47.62);

    // Print out the final account balance
    System.out.println("The account has a balance of " + account.getBalance());
  }
}
