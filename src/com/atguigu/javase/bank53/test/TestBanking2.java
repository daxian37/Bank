package com.atguigu.javase.bank53.test;


import com.atguigu.javase.bank53.Account;
import com.atguigu.javase.bank53.Customer;

/*
 * This class creates the program to test the banking classes.
 * It creates a new Bank, sets the Customer (with an initial balance),
 * and performs a series of transactions with the Account object.
 */
public class TestBanking2 {

        public static void main(String[] args) {
            Customer customer = null;
            Account account = null;

            // Create an account that can has a 500.00 balance.
            account = new Account(500);

            System.out.println("Creating the customer Jane Smith.");
            //code
            customer = new Customer("Jane","Smith");
            System.out.println("Creating her account with a 500.00 balance.");
            //code

            System.out.println("Withdraw 150.00");
            account.withdraw(150.00);
            //code
            System.out.println("Deposit 22.50");
            account.deposit(22.50);
            //code
            System.out.println("Withdraw 47.62");
            account.withdraw(47.62);
            //code


            // Print out the final account balance
            System.out.println("Customer [" + customer.getLastName()
                    + ", " + customer.getFirstName()
                    + "] has a balance of " + account.getBalance());
        }

}
