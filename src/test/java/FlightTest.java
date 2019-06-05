import AltJurassicPark.Visitor;
import Attractions.Flight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

public class FlightTest {

    private Flight flight;
    private Visitor visitor1;
    private Visitor visitor2;
    private Visitor visitor3;
    private Visitor visitor4;

    @Before
    public void setUp() {
        flight = new Flight();
        visitor1 = new Visitor(20, 175, 200);
        visitor2 = new Visitor(13, 140, 150);
        visitor3 = new Visitor(19, 185, 140);
        visitor4 = new Visitor(16, 170, 140);
    }

    @Test
    public void hasName() {
        assertEquals("Pterodactyl Rides", flight.getName());
    }

    @Test
    public void isAllowedToFlyAPterodactyl() {
        assertTrue(flight.isAllowedTo(visitor1));
    }

    @Test
    public void isNotAllowedToFlyAPterodactyl__TooYoung() {
        assertFalse(flight.isAllowedTo(visitor2));
    }

    @Test
    public void isNotAllowedToFlyAPterodactyl__TooTall() {
        assertFalse(flight .isAllowedTo(visitor3));
    }

    @Test
    public void chargeDefaultPrice() {
        assertEquals(5, flight.priceFor(visitor1), 0.01);
    }

    @Test
    public void chargeHalfPrice() {
        assertEquals(2.5, flight.priceFor(visitor4), 0.01);
    }
}
