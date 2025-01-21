package com.cbfacademy.accounts;

import java.util.List;

public class Account {

    protected int accountNumber;
    protected double balance;

    // Constructor that accepts parameters representing the account number and balance
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Returns the current account balance
    public double getBalance() {
        return this.balance;
    }
    
    // Returns the account number
    public int getAccountNumber() {
        return this.accountNumber;
    }
    
    // Deposits funds to the account and returns the new balance
    public double deposit(double amount) {
        this.balance += amount;
        return this.balance;
    }
    
    
    // Withdraws funds from the account and returns the requested amount or 0,
    // if the account has an insufficient balance
    public double withdraw(double requested) {
        if (this.balance < requested || requested < 0) {
          return 0;
        } else {
          this.balance -= requested;
          return requested;
        }
      }
    
}
