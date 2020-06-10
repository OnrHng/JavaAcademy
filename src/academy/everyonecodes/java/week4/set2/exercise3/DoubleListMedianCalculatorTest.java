package academy.everyonecodes.java.week4.set2.exercise3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoubleListMedianCalculatorTest {

    @Test
    void calculateDoubleListHasOddNumElement() {
        List<Double> doubleList = List.of(11.11, -3.2, 3.5, 0.0, 5.9);
        assertEquals(3.5, DoubleListMedianCalculator.calculate(doubleList));
    }

    @Test
    void calculateDoubleListHasEvenNumElement() {
        List<Double> doubleList = List.of(11.11, -3.2, 4.2, 0.0, 5.6, 9.9);
        assertEquals(4.9, DoubleListMedianCalculator.calculate(doubleList));
    }

    @Test
    void calculateDoubleListAnElement() {
        List<Double> doubleList = List.of(11.50);
        assertEquals(11.50, DoubleListMedianCalculator.calculate(doubleList));
    }

    @Test
    void calculateDoubleListNegativeElement() {
        List<Double> doubleList = List.of(-12.40, -8.0);
        assertEquals(-10.2, DoubleListMedianCalculator.calculate(doubleList));
    }

    @Test
    void calculateDoubleListNotElement() {
        List<Double> doubleList = List.of();
        assertEquals(0.0, DoubleListMedianCalculator.calculate(doubleList));
    }
}