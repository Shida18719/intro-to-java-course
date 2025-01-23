package com.cbfacademy.accounts;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accountsList;

    protected double dividend;
    
   // storing a internal list of accountsList.
    public Bank() {
        accountsList = new ArrayList<>();
    }

    // opening a new account, given a type and balance.
    public void openNewAccount(String accountType, int accountNumber, double initialBalance, double interestRate, double overdraftLimit){
        if (accountType.equals("savings")){
            accountsList.add(new SavingsAccount(accountNumber, initialBalance, interestRate));
        } else if (accountType.equals("current")){
            accountsList.add(new CurrentAccount(accountNumber, initialBalance, overdraftLimit));
        } else {
            accountsList.add(new Account(accountNumber, initialBalance));
        }
    }
    

    // getting a list of account numbers held by the bank
    public List<Integer> getAccountNumbers(){
        List<Integer> accountNumbers = new ArrayList<>();
        for (Account account : accountsList){
            accountNumbers.add(account.getAccountNumber());
        }
        return accountNumbers;
    }

    // getting an account, given an account number
    public Account getAccount(int accountNumber){
        for (Account account : accountsList){
            if (account.getAccountNumber() == accountNumber){
                return account;
            }
        }
        return null;
    }

    // closing an account, given an account number
    public boolean closeAccount(int accountNumber){
        for (Account account : accountsList){
            if (account.getAccountNumber() == accountNumber){
                accountsList.remove(account);
                return true;
            } else {
                System.out.println("Account has been closed.");  
            }
        }
        return false;
    }

    // displaying a report of all accounts held by the bank
    public List<Account> displayReport(){
       return this.accountsList;
    }


    // paying a dividend to all accounts held by the bank
    public void payDividend(double dividend) {
        for (Account account : accountsList){
            account.deposit(dividend);
        }
    }

    // Applying interest to all savings accounts
    public void applyInterest(){
        for (Account account : accountsList){
            if (account instanceof SavingsAccount){
                ((SavingsAccount) account).applyInterest();
            }
        }
    }

    // Contacting all current account holders if their account is in overdraft.
    public void contactCurrentAccounts(){
        for (Account account : accountsList){
            if (account instanceof CurrentAccount){
                if (account.getBalance() < 0){
                    System.out.println("Account number: " + account.getAccountNumber() + " is in overdraft.");
                }
            }
        }
    }
    
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