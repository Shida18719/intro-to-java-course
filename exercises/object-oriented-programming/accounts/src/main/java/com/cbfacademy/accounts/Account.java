package com.cbfacademy.accounts;

import java.util.List;

public class Account {

    protected int accountNumber;
    protected double balance;

    // constructor that accepts parameters representing the account number and balance
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }
        
    public int getAccountNumber() {
        return this.accountNumber;
    }
        
    public double deposit(double amount) {
        this.balance += amount;
        return this.balance;
    }
    
    // public double withdraw(double requested) {
    //     if (requested < 0 || this.balance < requested) {
    //         return 0;
    //     } else {
    //         this.balance -= requested;
    //         return requested;
    //     }
        
    public double withdraw(double requested) {
        if (this.balance < requested || requested < 0) {
          return 0;
        } else {
          this.balance -= requested;
          return requested;
        }
      }
    
}
