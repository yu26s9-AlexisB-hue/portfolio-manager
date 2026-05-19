package com.pluralsight;

public class House extends FixedAsset{
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }


    @Override
    public double getValue(){
        //todo:Figuring out the math for the value of a house.
        double pricePerSquareFoot = 0;

        //According to bing.com bedrooms increase the value of a house.
        double increaseValuePercentage = .10;

        if (yearBuilt >= 2023){
            pricePerSquareFoot = 180;
        }else if (yearBuilt >= 2020){
            pricePerSquareFoot = 130;
        }else if(yearBuilt >= 2016){
            pricePerSquareFoot = 90;
        }else{
            pricePerSquareFoot = 80;
        }
        double houseValue = pricePerSquareFoot * squareFeet;
        
        // depending on the number of bedroom it will increase the value of the house.
        double bedroomIncrease = 1 + (increaseValuePercentage * bedrooms);

        return houseValue * bedroomIncrease;
    }
}
