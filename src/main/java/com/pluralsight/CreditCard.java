package com.pluralsight;

public class CreditCard implements Valuable{
    private String name;
    private String accountNumber;
    private double balance;

    //Constant credit limit
    private final double CREDIT_LIMIT = 2000;

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

    public double getCreditLimit() {
        return CREDIT_LIMIT;
    }

    public double charge(double charge){
        // this one will add to the debt balance.
        // check if charges would exceed limit
        if(balance + charge <= CREDIT_LIMIT){
            balance += charge;
            System.out.println("Charge approved.");
        }else{
            System.out.println("Charge denied. Credit limit exceeded.");
        }
        return balance;
    }

    public double pay(double pay){
        //this one will subtract from the debtBalance.
        balance -= pay;

        //Prevent negative balance
        if (balance < 0){
            balance = 0;
        }
        return balance;
    }

    public double getValue(){
        //this code will display the full value.
        return -balance;
    }
}
