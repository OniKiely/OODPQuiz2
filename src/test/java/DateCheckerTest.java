import Part2.DateChecker;
import Part2.Month;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

public class DateCheckerTest {
    DateChecker dateChecker = new DateChecker();

    @Test
    void testHas31Days() {
        assertTrue(dateChecker.has31Days(Month.JANUARY), "January should have 31 days");
    }
}
