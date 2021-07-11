package com.HN.HiredKnight;

public class HeavyArmor extends EquipDecorator {

    public HeavyArmor(Soldier newSoldier) {

        super(newSoldier);
        System.out.println("with a sturdy and heavy armor");
    }

    @Override
    public String getDescription() {
        return tempSoldier.getDescription() + "_heavyarmor";
    }

    @Override
    public int getCost() {
        return tempSoldier.getCost() + 45;
    }
}
