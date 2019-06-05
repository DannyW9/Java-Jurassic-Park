import AltJurassicPark.Visitor;
import Attractions.Ride;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RideTest {

    private Ride ride;
    private Visitor visitor1;
    private Visitor visitor2;
    private Visitor visitor3;
    private Visitor visitor4;

    @Before
    public void setUp() {
        ride = new Ride();
        visitor1 = new Visitor(20, 195, 200);
        visitor2 = new Visitor(17, 200, 150);
        visitor3 = new Visitor(25, 175, 140);
        visitor4 = new Visitor(25, 210, 140);
    }

    @Test
    public void hasName() {
        assertEquals("T-Rex Rides", ride.getName());
    }

    @Test
    public void isAllowedToRideARex() {
        assertTrue(ride.isAllowedTo(visitor1));
    }

    @Test
    public void isNotAllowedToRideARex__TooYoung() {
        assertFalse(ride.isAllowedTo(visitor2));
    }

    @Test
    public void isNotAllowedToRideARex__TooShort() {
        assertFalse(ride.isAllowedTo(visitor3));
    }

    @Test
    public void chargesNormalFee() {
        assertEquals(10, ride.priceFor(visitor1), 0.01);
    }

    @Test
    public void chargesDoubleFee() {
        assertEquals(20, ride.priceFor(visitor4), 0.01);
    }
}
