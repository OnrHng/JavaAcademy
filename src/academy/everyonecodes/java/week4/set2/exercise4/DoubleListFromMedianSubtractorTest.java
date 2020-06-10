package academy.everyonecodes.java.week4.set2.exercise4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoubleListFromMedianSubtractorTest {

    @Test
    void calculateDoubleListHasOddNumElement() {
        List<Double> doubleList = List.of(11.5, -3.2, 3.5, 0.0, 5.5);
        List<Double> expected = List.of(8.0, -6.7, 0.0, -3.5, 2.0 );
        assertEquals(expected, DoubleListFromMedianSubtractor.calculate(doubleList));
    }

    @Test
    void calculateDoubleListHasEvenNumElement() {
        List<Double> doubleList = List.of(11.5, -3.2, 4.5, 0.0, 5.0, 9.1);
        List<Double> expected = List.of(6.75, -7.95, -0.25, -4.75, 0.25, 4.35);
        assertEquals(expected, DoubleListFromMedianSubtractor.calculate(doubleList));
    }

    @Test
    void calculateDoubleListAnElement() {
        List<Double> doubleList = List.of(11.50);
        List<Double> expected = List.of(0.0);
        assertEquals(expected, DoubleListFromMedianSubtractor.calculate(doubleList));
    }

    @Test
    void calculateDoubleListNegativeElement() {
        List<Double> doubleList = List.of(-12.0, -8.0);
        List<Double> expected = List.of(-2.0, 2.0);
        assertEquals(expected, DoubleListFromMedianSubtractor.calculate(doubleList));
    }

    @Test
    void calculateDoubleListNotElement() {
        List<Double> doubleList = List.of();
        List<Double> expected = List.of();
        assertEquals(expected, DoubleListFromMedianSubtractor.calculate(doubleList));
    }
}