package academy.everyonecodes.java.week3.set2.exercise4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MileToKilometerConverterTest {

    @ParameterizedTest
    @CsvSource({"10.0, 16.1", "15.4, 24.794", "23.5, 37.835"})
    void convert(double mile, double expected) {
        assertEquals(expected, MileToKilometerConverter.convert(mile));
    }
}