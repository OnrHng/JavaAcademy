package academy.everyonecodes.java.week3.reflection;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteValueCalculatorTest {

    @ParameterizedTest
    @CsvSource({"4.0, 4", "-3.5, 3.5", "-11.9, 11.9"})
    void calculate(double num, double expected) {
        assertEquals(expected, AbsoluteValueCalculator.calculate(num));
    }
}