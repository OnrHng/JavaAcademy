package academy.everyonecodes.java.week5.set1.exercise3;

import org.junit.jupiter.api.Test;

import java.net.Inet4Address;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListAverageCalculatorTest {

    IntegerListAverageCalculator averageCalculator = new IntegerListAverageCalculator();

    @Test
    void calculateAverageFromEmptyList() {
        List<Integer> integerList = List.of();
        Optional<Double> result = averageCalculator.calculateAverage(integerList);
        assertTrue(result.isEmpty());

    }

    @Test
    void calculateAverageFromIntList() {
        List<Integer> integerList = List.of(0,5,30,-20,10);
        Optional<Double> result = averageCalculator.calculateAverage(integerList);
        assertTrue(result.isPresent());
        assertEquals(5.0, result.get());

        List<Integer> integerList2 = List.of(-15,5,30,-40,10);
        Optional<Double> result2 = averageCalculator.calculateAverage(integerList2);
        assertTrue(result2.isPresent());
        assertEquals(-2.0, result2.get());

    }

    @Test
    void calculateAverageFromIntListHasAElement() {
        List<Integer> integerList = List.of(0);
        Optional<Double> result = averageCalculator.calculateAverage(integerList);
        assertTrue(result.isPresent());
        assertEquals(0.0, result.get());
    }
}