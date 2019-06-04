import AltJurassicPark.Visitor;
import Attractions.Fight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FightTest {

    private Fight fight;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before
    public void setUp() {
        fight = new Fight();
        visitor1 = new Visitor(18, 200, 200);
        visitor2 = new Visitor(17, 180, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Dinosaur Boxing", fight.getName());
    }

    @Test
    public void isOldEnoughTOGamble() {
        assertTrue(fight.isAllowedTo(visitor1));
    }

    @Test
    public void isTooYoungToGamble() {
        assertFalse(fight.isAllowedTo(visitor2));
    }
}
