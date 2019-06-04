import Attractions.Flight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;

    @Before
    public void setUp() {
        flight = new Flight();
    }

    @Test
    public void hasName() {
        assertEquals("Pterodactyl Rides", flight.getName());
    }
}
