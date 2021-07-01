package com.HN.HiredKnight;

public class Sword extends EquipDecorator {

    public Sword(Soldier newSoldier) {

        super(newSoldier);
        System.out.println("with a great sword");
    }

    @Override
    public String getDescription() {
        return tempSoldier.getDescription() + "_sword";
    }

    @Override
    public double getCost() {
        return tempSoldier.getCost() + 30;
    }
}
