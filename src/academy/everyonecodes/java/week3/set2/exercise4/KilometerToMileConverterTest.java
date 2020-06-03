package academy.everyonecodes.java.week3.set2.exercise4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class KilometerToMileConverterTest {

    @ParameterizedTest
    @CsvSource({"10.5, 6.51", "23.9, 14.818", "5.1, 3.162"})
    void convert(double km, double expected) {
        assertEquals(expected, KilometerToMileConverter.convert(km));
    }
}