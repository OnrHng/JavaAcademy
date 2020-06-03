package academy.everyonecodes.java.week3.set2.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DivisonCalculatorTest {

    @ParameterizedTest
    @CsvSource({"4.0, 2.0, 2.0", " -10.05, -10.05, 1", "30.0, -6.0, -5.0", "6.9 , 0.0 , -1"})
    void sumDouble(double num1, double num2, double expected) {
        assertEquals(expected, DivisonCalculator.divide(num1, num2));
    }
}