package com.pluralsight;

public class CreditCard {
    private String name;
    private String accountNumber;
    private double balance;

    public CreditCard(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
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

    public double charge(){
        // todo: this one will add to the debt balance.
        return 0;
    }

    public double pay(){
        // todo: this one will subtract from the debtBalance.
        return 0;
    }

    public double getValue(){
        // todo: this code will display the full value.
        return 0;
    }
}
