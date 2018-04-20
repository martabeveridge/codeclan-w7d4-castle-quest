package Rooms;

import Beasts.Creature;
import Beasts.Dragon;
import Behaviours.ITargetable;
import Characters.Fighter;
import Characters.Player;
import Items.Sword;

public class Room {

    private String name;
    private Player hero;
    private Creature baddie;

    public Room(String name, Player hero, Creature baddie){
        this.name = name;
        this.hero = hero;
        this.baddie = baddie;
    }

    public ITargetable fightRound(){
        hero.action(baddie);
        baddie.attack(hero);
        if (hero.getHealthPoints() > baddie.getHealthPoints()){
            return hero;
        }
        else {
            return baddie;
        }
    }

}
