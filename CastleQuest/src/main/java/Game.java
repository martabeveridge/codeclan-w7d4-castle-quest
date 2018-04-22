import Beasts.Dragon;
import Beasts.Sudowoodo;
import Behaviours.ITargetable;
import Characters.Fighter;
import Items.Sword;
import Rooms.Room;

public class Game {

    public static void main(String[] args){
        Sword sword1 = new Sword(15, "Schwing", 20);
        Sword sword2 = new Sword(72, "Shump", 50);
        Fighter fighter1 = new Fighter("Marta", 100, sword1);
        Fighter fighter2 = new Fighter("Craig", 100, sword2);
        Dragon dragon1 = new Dragon("Dragob", 100, 50, "Pink");
        Sudowoodo sudowoodo1 = new Sudowoodo("Fellaini", 100, 40, "green");
        Room room1 = new Room("Fight Room!", fighter1, dragon1);
        ITargetable victor = room1.fightRound();
        System.out.println("There was a fight round!");
        System.out.println("And " + victor.getName() + " won...");
        Room room2 = new Room("Another fight room!", fighter2, sudowoodo1);
        ITargetable victor2 = room2.fightRound();
        System.out.println("There was another fight round!");
        System.out.println("And " + victor2.getName() + " won...");
    }
}
