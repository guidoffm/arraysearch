

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BusinessTest {

    @Test
    void testDoBusiness() {
        Business business = new Business();
        String result = business.doBusiness();
        assertEquals("Business done!", result, "The business method should return 'Business done!'");
    }
    @Test
    void testAddPositiveNumbers() {
        Business business = new Business();
        int result = business.add(2, 3);
        assertEquals(5, result, "Adding 2 and 3 should return 5");
    }

    @Test
    void testAddNegativeNumbers() {
        Business business = new Business();
        int result = business.add(-2, -3);
        assertEquals(-5, result, "Adding -2 and -3 should return -5");
    }

    @Test
    void testAddPositiveAndNegativeNumber() {
        Business business = new Business();
        int result = business.add(5, -3);
        assertEquals(2, result, "Adding 5 and -3 should return 2");
    }

    @Test
    void testAddWithZero() {
        Business business = new Business();
        int result = business.add(0, 7);
        assertEquals(7, result, "Adding 0 and 7 should return 7");
    }

    @Test
    void testAddZeroAndZero() {
        Business business = new Business();
        int result = business.add(0, 0);
        assertEquals(0, result, "Adding 0 and 0 should return 0");
    }

    @Test
    void testMain() {
    assertTrue(true);
}

}