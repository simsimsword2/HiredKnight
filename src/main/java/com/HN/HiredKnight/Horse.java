package com.HN.HiredKnight;

public class Horse extends EquipDecorator {

    public Horse(Soldier newSoldier) {

        super(newSoldier);
        System.out.println("with a fierce horse");
    }

    @Override
    public String getDescription() {
        return tempSoldier.getDescription() + "_horse";
    }

    @Override
    public int getCost() {
        return tempSoldier.getCost() + 45;
    }
}
