package com.cbfacademy.accounts;


// Import the classes from the accounts package not required in this file
// import com.cbfacademy.accounts.Account;
// import com.cbfacademy.accounts.SavingsAccount;
// import com.cbfacademy.accounts.CurrentAccount;
// import com.cbfacademy.accounts.Bank; 


public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Bank myBank = new Bank();

        myBank.openNewAccount("savings", 1, 99.99, 0.01, 0.0);
        myBank.openNewAccount("current", 2, 199.99, 0.0, 100.0);

        System.out.println(myBank.getAccountNumbers());

        System.out.println(myBank.getAccount(1).getBalance());
    }
}
