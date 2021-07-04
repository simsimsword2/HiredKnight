package com.HN.HiredKnight;

public abstract class EquipDecorator implements Soldier {

    protected Soldier tempSoldier;

    public EquipDecorator(Soldier newSoldier) {
        this.tempSoldier = newSoldier;
    }

    public EquipDecorator() {
        super();
    }

    @Override
    public String getDescription() {
        return tempSoldier.getDescription();
    }

    @Override
    public int getCost() {
        return tempSoldier.getCost();
    }
}
