package com.pluralsight;

public class FinanceApplication {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount("726371", "Alexis Barrett", 12500);
        Valuable account2 = new BankAccount("456878", "Gary", 1500);

        account1.deposit(100);

        // try to deposit money into both accounts
        System.out.println(account1.getValue());


    }
}
