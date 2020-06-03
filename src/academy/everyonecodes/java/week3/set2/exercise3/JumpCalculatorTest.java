package academy.everyonecodes.java.week3.set2.exercise3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class JumpCalculatorTest {

    @ParameterizedTest
    @CsvSource({"1, 6", "0, 0"})

    void calculateJump(int foodType, int expected) {
        assertEquals(expected, JumpCalculator.calculateJump(foodType));
    }

}