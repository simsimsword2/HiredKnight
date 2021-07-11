package com.HN.HiredKnight;

public class LightArmor extends EquipDecorator {

    public LightArmor(Soldier newSoldier) {

        super(newSoldier);
        System.out.println("with a comfortable light armor");
    }

    @Override
    public String getDescription() {
        return tempSoldier.getDescription() + "_lightarmor";
    }

    @Override
    public int getCost() {
        return tempSoldier.getCost() + 25;
    }
}
