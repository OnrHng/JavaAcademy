package academy.everyonecodes.java.week3.set2.exercise1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DoubleCalculatorTest {

    @ParameterizedTest
    @CsvSource({"2.5, 3.5, 6.0", " -2.3, -3.01, -5.31", "100.0, -100.0, 0.0"})
    void sumDouble(double num1, double num2, double expected) {
        assertEquals(expected, DoubleCalculator.sumDouble(num1, num2));
    }
}