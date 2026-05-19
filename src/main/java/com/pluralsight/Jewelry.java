package com.pluralsight;

public class Jewelry extends FixedAsset {
    private double karat;
    private String metal;
    private double weight;

    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getValue(){
        //todo: How to find the value of a Karat?
//        double grams = karat * .2;
//        double pureMetal = grams * (karat / 24);
        double metalValue = 0;

        if (metal.equalsIgnoreCase("gold")){
            metalValue = 146.66;
        }else if(metal.equalsIgnoreCase("silver")){
            metalValue = 2.45;
        }else if(metal.equalsIgnoreCase("platinum")){
            metalValue = 64;
        }

        //purity of gold (10k, 14k, 18k, etc.)
        double purity = karat / 24.0;

        return weight * purity * metalValue;
    }
}
