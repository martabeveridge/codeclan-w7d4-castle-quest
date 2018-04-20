import Beasts.Dragon;
import Characters.Fighter;
import Items.Sword;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class FighterTest {
    private Fighter fighter1;
    private Sword sword1;
    private Dragon dragon1;

    @Before
    public void before(){
        sword1 = new Sword(15, "Schwing", 20);
        fighter1 = new Fighter("Marta", 80, sword1);
        dragon1 = new Dragon("Dragob", 120, 50, "Pink");
    }

    @Test
    public void hasName(){
        assertEquals("Marta",fighter1.getName());

    }

    @Test
    public void canTakeDamage(){
        fighter1.takeDamage(20);
        assertEquals(60, fighter1.getHealthPoints());
    }

    @Test
    public void canBeHealed(){
        fighter1.beHealed(20);
        assertEquals(100, fighter1.getHealthPoints());
    }

    @Test
    public void inventoryStartsEmpty(){
        assertEquals(0, fighter1.getInventory().size());
    }

    @Test
    public void fighterCanAttack(){
        fighter1.action(dragon1);
        assertEquals(105, dragon1.getHealthPoints());
    }

//    @Test
//    public void fighterCanBeAttacked(){
//        dragon1.attack(fighter1);
//        assertEquals(30, fighter1.getHealthPoints());
//    }
}
