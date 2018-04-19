package Beasts;

import Behaviours.ITargetable;

public abstract class Creature implements ITargetable{
    private String name;
    private int healthPoints;

    public Creature (String name, int healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}
