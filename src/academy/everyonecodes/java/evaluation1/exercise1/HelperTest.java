package academy.everyonecodes.java.evaluation1.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class HelperTest {

    @ParameterizedTest
    @CsvSource({"4, 4,1,3", "0, 0,0,0", "-2, -10,-2,-14", "5, 5,5,3"})
    void highest(int expected, int num1, int num2, int num3) {
        assertEquals(expected, Helper.highest(num1, num2, num3));
    }
}