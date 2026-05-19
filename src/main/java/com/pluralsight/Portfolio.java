package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void add(Valuable asset){
        assets.add(asset);
    }

    public double getValue(){
        double total = 0;

        for(Valuable item : assets){
            total += item.getValue();
        }
        return total;
    }

    public Valuable getMostValuable() {
        Valuable mostValuable = assets.get(0);

        for(Valuable item : assets){
            if (item.getValue() > mostValuable.getValue()){
                mostValuable = item;
            }
        }
        return mostValuable;
    }

    public Valuable getLeastValuable() {
        Valuable leastValuable = assets.get(0);

        for (Valuable item : assets){
            if (item.getValue() < leastValuable.getValue()){
                leastValuable = item;
            }
        }
        return leastValuable;
    }
}
