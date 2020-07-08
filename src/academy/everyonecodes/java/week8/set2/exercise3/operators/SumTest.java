package academy.everyonecodes.java.week8.set2.exercise3.operators;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    Sum sum = new Sum();
    @ParameterizedTest
    @CsvSource({"0.0, -4.0, 4.0", "-3.5, -1.5, -2.0", "10.1 , 9.1, 1.0"})
    void operate(double expected, double num1, double num2) {
        assertEquals(expected, sum.operate(num1, num2));

    }
}