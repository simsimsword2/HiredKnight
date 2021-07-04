package com.HN.HiredKnight;

public class Axe extends EquipDecorator {

    public Axe(Soldier newSoldier) {

        super(newSoldier);
        System.out.println("with a mighty axe");
    }

    @Override
    public String getDescription() {
        return tempSoldier.getDescription() + "_axe";
    }

    @Override
    public int getCost() {
        return tempSoldier.getCost() + 20;
    }
}
