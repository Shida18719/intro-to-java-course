package com.cbfacademy.accounts;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accounts;
    

    public Bank() {
        accounts = new ArrayList<>();
        // accounts.add(new Account(1, 99.99));
        // accounts.add(new Account(2, 199.99));
    }

    // opening a new account, given a type and balance.
    public void openNewAccount(String accountType, int accountNumber, double initialBalance, double interestRate, double overdraftLimit){
        if (accountType.equals("savings")){
            accounts.add(new SavingsAccount(accountNumber, initialBalance, interestRate));
        } else if (accountType.equals("current")){
            accounts.add(new CurrentAccount(accountNumber, initialBalance, overdraftLimit));
        } else {
            accounts.add(new Account(accountNumber, initialBalance));
        }
    }
    

    // getting a list of account numbers held by the bank
    public List<Integer> getAccountNumbers(){
        List<Integer> accountNumbers = new ArrayList<>();
        for (Account account : accounts){
            accountNumbers.add(account.getAccountNumber());
        }
        return accountNumbers;
    }

    // getting an account, given an account number
    public Account getAccount(int accountNumber){
        for (Account account : accounts){
            if (account.getAccountNumber() == accountNumber){
                return account;
            }
        }
        return null;
    }

    // closing an account, given an account number
    public boolean closeAccount(int accountNumber){
        for (Account account : accounts){
            if (account.getAccountNumber() == accountNumber){
                accounts.remove(account);
                return true;
            } else {
                System.out.println("Account has been closed.");  
            }
        }
        return false;
    }

    // displaying a report of all accounts held by the bank
    public void displayReport(){
        for (Account account : accounts){
            System.out.println(account.getAccountNumber() + " " + account.getBalance());
        }
    }
    // public void displayReport(){
    //     Account savings = Bank.getAccountNumber();
    //     Account current = Bank.getAccount();

    // }

    // paying a dividend to all accounts held by the bank


    
}




// create a Bank class to manage accounts. Consider the following ideas — you may choose to implement some, all or come up with your own:

// storing a internal list of accounts. Remember that accounts in the list could be instances of the Account class, the SavingsAccount class, or the CurrentAccount class.
// opening a new account, given a type and balance.
// getting a list of account numbers held by the bank
// getting an account, given an account number
// closing an account, given an account number
// displaying a report of all accounts held by the bank
// paying a dividend to all accounts held by the bank
// applying interest to all savings accounts
// contacting all current account holders if their account is in overdraft.
// Update App.java to create a bank instance and then execute your bank's operations