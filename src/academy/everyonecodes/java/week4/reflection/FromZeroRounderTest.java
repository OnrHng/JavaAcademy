package academy.everyonecodes.java.week4.reflection;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FromZeroRounderTest {

    @ParameterizedTest
    @CsvSource({"1.0, 0.09", "-4.0, -3.53", "0.0, 0.0"})
    void round(double expected, double doubleNum) {
        assertEquals(expected, FromZeroRounder.round(doubleNum));
    }
}