package academy.everyonecodes.java.week7.reflection.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenderRatioCalculatorTest {

    GenderRatioCalculator calculator = new GenderRatioCalculator();

    @Test
    void calculate() {

        String expectedGenderRatio = "518:482";
        String resultGenderRatio = calculator.calculate();

        assertEquals(expectedGenderRatio, resultGenderRatio);

    }
}