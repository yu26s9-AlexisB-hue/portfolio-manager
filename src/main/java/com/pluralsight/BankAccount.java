package com.pluralsight;

public class BankAccount implements Valuable{
    private String accountNumber;
    private String name;
    private double balance;

    public BankAccount(String accountNumber, String name,  double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double deposit){
        //code that adds deposit to the balance.
       balance += deposit;
    }

    public void withdraw(double withdraw){
        //code that subtracts withdraws from the balance.
        balance -= withdraw;
    }

    public double getValue(){
        //add together everything to hold a balance for the account.
        return balance;
    }
}
