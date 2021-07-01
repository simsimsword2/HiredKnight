package com.HN.HiredKnight;

public class NakedSoldier implements Soldier {

    public NakedSoldier() {
        System.out.println("A young and strong body");
    }

    @Override
    public String getDescription() {
        return "man";
    }

    @Override
    public double getCost() {
        return 80;
    }
}
