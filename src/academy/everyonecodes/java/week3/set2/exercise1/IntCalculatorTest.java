package academy.everyonecodes.java.week3.set2.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class IntCalculatorTest {

    @ParameterizedTest
    @CsvSource({"2, 3, 5", " -2, -3, -5", "100, -100, 0"})
    void sumDouble(int num1, int num2, int expected) {
        assertEquals(expected, IntCalculator.sumInt(num1, num2));
    }
}