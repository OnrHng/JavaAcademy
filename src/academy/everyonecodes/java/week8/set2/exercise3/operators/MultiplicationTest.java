package academy.everyonecodes.java.week8.set2.exercise3.operators;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {
    Multiplication multiplication = new Multiplication();

    @ParameterizedTest
    @CsvSource({"0.0, 0.0, 0.0", "0.0, 5.5, 0.0", "40.0, -10.0, -4.0", "-6.4, 3.2, -2.0"})
    void operate(double expected, double num1, double num2) {
        assertEquals(expected, multiplication.operate(num1, num2));
    }
}