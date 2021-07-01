package com.HN.HiredKnight;

public class Lance extends EquipDecorator {

    public Lance(Soldier newSoldier) {

        super(newSoldier);
        System.out.println("with a great lance");
    }

    @Override
    public String getDescription() {
        return tempSoldier.getDescription() + "_lance";
    }

    @Override
    public double getCost() {
        return tempSoldier.getCost() + 15;
    }
}
