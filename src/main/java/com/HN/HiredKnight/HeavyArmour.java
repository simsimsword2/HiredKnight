package com.HN.HiredKnight;

public class HeavyArmour extends EquipDecorator {

    public HeavyArmour(Soldier newSoldier) {

        super(newSoldier);
        System.out.println("with a sturdy and heavy armour");
    }

    @Override
    public String getDescription() {
        return tempSoldier.getDescription() + "_heavyarmour";
    }

    @Override
    public int getCost() {
        return tempSoldier.getCost() + 45;
    }
}
