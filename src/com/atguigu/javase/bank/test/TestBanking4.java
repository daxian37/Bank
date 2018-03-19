package com.atguigu.javase.bank.test;

import com.atguigu.javase.bank.Bank;
import com.atguigu.javase.bank.Customer;

public class TestBanking4 {

    /*
     * This class creates the program to test the banking classes.
     * It creates a new Bank, sets the Customer (with an initial balance),
     * and performs a series of transactions with the Account object.
     */


        public static void main(String[] args) {
            Bank     bank = new Bank();

            // Add Customer Jane, Simms
            //code
            bank.addCustomer("Simmis","jane");
            //Add Customer Owen, Bryant
            //code
            bank.addCustomer("Bryant","Owen");
            // Add Customer Tim, Soley
            //code
            bank.addCustomer("Soley","Tim");
            // Add Customer Maria, Soley
            //code
            bank.addCustomer("Soley","Maria");

            for ( int i = 0; i < bank.getNumOfCustomers(); i++ ) {
                Customer customer = bank.getCustomer(i);

                System.out.println("Customer [" + (i+1) + "] is "
                        + customer.getLastName()
                        + ", " + customer.getFirstName());
            }
        }


}
