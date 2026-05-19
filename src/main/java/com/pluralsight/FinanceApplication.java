package com.pluralsight;

public class FinanceApplication {
    public static void main(String[] args){
        Portfolio portfolio = new Portfolio("Alexis Barrett", "Alexis Barrett");
        House house = new House("My House", 18000, 2021,210,2);
        BankAccount investments = new BankAccount("71993","Alexis Barrett",79271);
        CreditCard Card = new CreditCard("Alexis Barrett", "4920489", 8207.37);
        Gold gold = new Gold("Coin collection", 1000,50);
        Jewelry jewelry = new Jewelry("My bling",500,5,"gold",2.5);

        //Add them to the portfolio
        portfolio.add(house);
        portfolio.add(investments);
        portfolio.add(Card);
        portfolio.add(gold);
        portfolio.add(jewelry);

        //Total portfolio value
        System.out.printf("Net Worth: $%.2f%n", portfolio.getValue());

        //Most valuable item
        Valuable mostValuable = portfolio.getMostValuable();
        System.out.printf("Most Valuable: $%.2f%n", mostValuable.getValue());

        //Least valuable item
        

    }
}
