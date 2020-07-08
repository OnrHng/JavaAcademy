package academy.everyonecodes.java.week8.set2.exercise3.operators;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {
    Subtraction subtraction = new Subtraction();

    @ParameterizedTest
    @CsvSource({"0.0, 0.0, 0.0", "14.0, 20.0, 6.0", "-4.0, 2.0, 6.0"})
    void operate(double expected, double num1, double num2) {
        assertEquals(expected, subtraction.operate(num1, num2));
    }
}