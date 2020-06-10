package academy.everyonecodes.java.week4.set2.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineSumCalculatorTest {

    @Test
    void calculate() {
        assertEquals(15, LineSumCalculator.calculate("7;4;4"));
        assertEquals(0, LineSumCalculator.calculate("0;-5;5"));
        assertEquals(-30, LineSumCalculator.calculate("-11;-24;5"));
        assertEquals(800, LineSumCalculator.calculate("300;400;100"));

        assertEquals(0, LineSumCalculator.calculate(""));
        assertEquals(5, LineSumCalculator.calculate("5"));
        assertEquals(-9877, LineSumCalculator.calculate("-9877"));
    }
}