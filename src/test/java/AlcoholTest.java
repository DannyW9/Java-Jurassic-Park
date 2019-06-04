import AltJurassicPark.Visitor;
import Stalls.Alcohol;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlcoholTest {

    private Alcohol alcohol;
    private Visitor visitor1;
    private Visitor visitor2;

    @Before
    public void setUp() {
        alcohol = new Alcohol();
        visitor1 = new Visitor(18, 200, 200);
        visitor2 = new Visitor(17, 180, 100);
    }

    @Test
    public void hasName() {
        assertEquals("Dino Bar", alcohol.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Jeff Goldblum", alcohol.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals("North", alcohol.getParkingSpot());
    }

    @Test
    public void isOfLegalAge() {
        assertTrue(alcohol.isAllowedTo(visitor1));
    }

    @Test
    public void willNotServe__Underage() {
        assertFalse(alcohol.isAllowedTo(visitor2));
    }
}
