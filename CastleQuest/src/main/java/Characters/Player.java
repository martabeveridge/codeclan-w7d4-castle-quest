package Characters;

import Behaviours.ITargetable;
import Behaviours.ITreasurable;

import java.util.ArrayList;

public abstract class Player implements ITargetable{
    private String name;
    private int healthPoints;
    private ArrayList<ITreasurable> inventory;

    public Player (String name, int healthPoints){
        this.name = name;
        this.healthPoints = healthPoints;
        this.inventory = new ArrayList<ITreasurable>();
    }

    public String getName() {
        return name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public String takeDamage(int damage){
        healthPoints -= damage;
        return "Ouch";
    }

    public String beHealed(int health){
        healthPoints += health;
        return "Sigh of relief ahhhhh";
    }

    public int completeAction(ITargetable target){
        return 0;
    }
}
