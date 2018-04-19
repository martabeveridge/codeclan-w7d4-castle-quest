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

    public void takeDamage(int damage){
        healthPoints -= damage;
    }

    public void beHealed(int health){
        healthPoints += health;
    }

    public int completeAction(ITargetable target){
        return 0;
    }
}
