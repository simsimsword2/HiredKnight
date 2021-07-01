package com.HN.HiredKnight;

public class LightArmour extends EquipDecorator {

    public LightArmour(Soldier newSoldier) {

        super(newSoldier);
        System.out.println("with a comfortable light armour");
    }

    @Override
    public String getDescription() {
        return tempSoldier.getDescription() + "_light armour";
    }

    @Override
    public double getCost() {
        return tempSoldier.getCost() + 25;
    }
}
