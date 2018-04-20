import Beasts.Dragon;
import Behaviours.ITargetable;
import Characters.Fighter;
import Items.Sword;
import Rooms.Room;

public class Game {

    public static void main(String[] args){
        Sword sword1 = new Sword(15, "Schwing", 20);
        Fighter fighter1 = new Fighter("Marta", 100, sword1);
        Dragon dragon1 = new Dragon("Dragob", 100, 50, "Pink");
        Room room1 = new Room("Fight Room!", fighter1, dragon1);
        ITargetable victor = room1.fightRound();
        System.out.println("There was a fight round!");
        System.out.println("And " + victor.getName() + " won...");
    }
}
