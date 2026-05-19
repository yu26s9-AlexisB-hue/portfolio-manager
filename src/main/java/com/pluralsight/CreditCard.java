package com.pluralsight;

public class CreditCard {
    private String name;
    private String accountNumber;
    private double balance;
    private double creditLimit;

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

    public void charge(double charge){
        // todo: this one will add to the debt balance.
        // check if charges would exceed limit
        if(balance + charge <= creditLimit){
            balance += charge;
            System.out.println("Charge approved.");
        }else{
            System.out.println("Charge denied. Credit limit exceeded.");
        }

    }

    public void pay(double pay){
        // todo: this one will subtract from the debtBalance.
        balance -= pay;

        //Prevent negative balance
        if (balance < 0){
            balance = 0;
        }
    }

    public double getValue(){
        // todo: this code will display the full value.
        return -balance;
    }
}
