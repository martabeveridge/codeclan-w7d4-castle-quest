import Beasts.Dragon;
import Characters.Fighter;
import Items.Sword;
import Rooms.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTest {
    private Fighter fighter1;
    private Sword sword1;
    private Dragon dragon1;
    private Room room1;

    @Before
    public void before(){
        sword1 = new Sword(15, "Schwing", 20);
        fighter1 = new Fighter("Marta", 100, sword1);
        dragon1 = new Dragon("Dragob", 100, 50, "Pink");
        room1 = new Room("Fight Room!", fighter1, dragon1);
    }

    @Test
    public void canFightRoundRandom() {
        assertEquals(true,fighter1 == room1.fightRound());
    }
}
