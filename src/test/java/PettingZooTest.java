import AltJurassicPark.Visitor;
import Attractions.PettingZoo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PettingZooTest {

    private PettingZoo pettingZoo;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before
    public void setUp() {
        pettingZoo = new PettingZoo();
        visitor1 = new Visitor(10, 100, 10);
        visitor2 = new Visitor(20, 200, 150);
    }

    @Test
    public void hasName() {
        assertEquals("Petting Zoo", pettingZoo.getName());
    }

    @Test
    public void isYoungEnoughToEnter() {
        assertTrue(pettingZoo.isAllowedTo(visitor1));
    }

    @Test
    public void isTooOldToEnter() {
        assertFalse(pettingZoo.isAllowedTo(visitor2));
    }
}
