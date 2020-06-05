package academy.everyonecodes.java.week3.reflection;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PoundToEuroConverterTest {

    @ParameterizedTest
    @CsvSource({"10.4, 8.84", "3.90, 3.315", "20.0, 17.0"})
    void convert(double pound, double expected) {
        assertEquals(expected, PoundToEuroConverter.convert(pound));
    }
}