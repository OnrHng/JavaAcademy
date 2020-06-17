package academy.everyonecodes.java.week5.set1.exercise4;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class DoubleListMinimumFinderTest {
    DoubleListMinimumFinder finder = new DoubleListMinimumFinder();

    @Test
    void findMaxFromEmptyList() {
        List<Double> doubleList = List.of();
        Optional<Double> result = finder.find(doubleList);
        assertTrue(result.isEmpty());
    }
    @Test
    void findMaxFromList() {
        List<Double> doubleList = List.of(99.0, 0.0, -54.3, 99.1, -33.33);
        Optional<Double> result = finder.find(doubleList);
        assertTrue(result.isPresent());
        assertEquals(-54.3, result.get());

        List<Double> doubleList2 = List.of(-1.1, -101.1, -9.9);
        Optional<Double> result2 = finder.find(doubleList2);
        assertTrue(result2.isPresent());
        assertEquals(-101.1, result2.get());
    }
    @Test
    void findMaxFromListHasAElement() {
        List<Double> doubleList = List.of(0.0);
        Optional<Double> result = finder.find(doubleList);
        assertTrue(result.isPresent());
        assertEquals(0.0, result.get());
    }
}