

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class BusinessTest {

    @Test
    void testDoBusiness() {
        Business business = new Business();
        String result = business.doBusiness();
        assertEquals("Business done!", result, "The business method should return 'Business done!'");
    }
}