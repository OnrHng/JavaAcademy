package academy.everyonecodes.java.week8.set2.exercise3.operators;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {
    Division division = new Division();

    @ParameterizedTest
    @CsvSource({"Infinity , 10.0, 0.0",
                "5.0, 45.0, 9.0",
                "-1.0, 1.0, -1.0"
    })
    void operate(double expected, double num1, double num2) {
        assertEquals(expected, division.operate(num1, num2));

    }
}