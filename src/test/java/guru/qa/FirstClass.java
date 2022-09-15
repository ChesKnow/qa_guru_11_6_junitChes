package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstClass {

    @Test
    void firstSimpleTest () {
        Assertions.assertTrue(3 > 2);
    }
    @Test
    void secondSimpleTest () {
        Assertions.assertTrue(3 > 1);
    }
}
