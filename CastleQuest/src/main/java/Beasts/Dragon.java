package Beasts;

import Behaviours.ITargetable;

public class Dragon extends Creature {

    private String flameColour;

    public Dragon(String name, int healthPoints, int damagePoints, String flameColour){
        super(name, healthPoints, damagePoints);
        this.flameColour = flameColour;
    }

    public String getFlameColour() {
        return flameColour;
    }

    public void setName(String newColour){
        flameColour = newColour;
    }


}
