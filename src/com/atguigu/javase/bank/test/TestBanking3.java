package com.atguigu.javase.bank.test;


import com.atguigu.javase.bank.Account;
import com.atguigu.javase.bank.Customer;

public class TestBanking3 {

    public static void main(String[] args) {
        Customer customer;
        Account  account;

        // Create an account that can has a 500.00 balance.
        customer = new Customer("Jane","Smith");
        account = new Account(500);

        System.out.println("Creating the customer Jane Smith.");
        //code
        System.out.println("Creating her account with a 500.00 balance.");

        //code
        // Perform some account transactions
        System.out.println("Withdraw 150.00: " + account.withdraw(150.00));
        System.out.println("Deposit 22.50: " + account.deposit(22.50));
        System.out.println("Withdraw 47.62: " + account.withdraw(47.62));
        System.out.println("Withdraw 400.00: " + account.withdraw(400.00));

        // Print out the final account balance
        System.out.println("Customer [" + customer.getLastName()
                + ", " + customer.getFirstName()
                + "] has a balance of " + account.getBalance());
    }

}
