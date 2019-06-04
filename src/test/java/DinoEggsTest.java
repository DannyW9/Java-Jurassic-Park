import Stalls.DinoEggs;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DinoEggsTest {

    private DinoEggs dinoEggs;

    @Before
    public void setUp() {
        dinoEggs = new DinoEggs();
    }

    @Test
    public void hasName() {
        assertEquals("Dinosaur Eggs", dinoEggs.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Dennis Nedry", dinoEggs.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals("South", dinoEggs.getParkingSpot());
    }
}
