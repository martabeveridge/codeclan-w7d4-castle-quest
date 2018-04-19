import Characters.Fighter;
import Items.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {
    private Fighter fighter1;
    private Sword sword1;

    @Before
    public void before(){
        sword1 = new Sword(15, "Schwing", 20);
        fighter1 = new Fighter("Marta", 80, sword1);
    }

    @Test
    public void hasName(){
        assertEquals("Marta",fighter1.getName());

    }
}
