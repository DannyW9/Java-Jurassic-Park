import AltJurassicPark.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    private Visitor visitor;

    @Before
    public void setUp() {
        visitor = new Visitor(20, 200, 100);
    }

    @Test
    public void hasAge() {
        assertEquals(20, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(200, visitor.getHeight());
    }

    @Test
    public void hasWaller() {
        assertEquals(100, visitor.getWallet());
    }
}
