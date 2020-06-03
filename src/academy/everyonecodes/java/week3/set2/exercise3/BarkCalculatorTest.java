package academy.everyonecodes.java.week3.set2.exercise3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BarkCalculatorTest {

    @ParameterizedTest
    @CsvSource({"1, 2", "0, 1"})

    void calculateBark(int foodType, int expected) {
        assertEquals(expected, BarkCalculator.calculateBarks(foodType));
    }
}