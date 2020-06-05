package academy.everyonecodes.java.week3.reflection;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoubleListSumCalculatorTest {
    List<Double> doubleList1 = Arrays.asList(-7.2, 4.2, 3.0);
    List<Double> doubleList2 = Arrays.asList(0.5, 2.9, -5.3);
    List<Double> doubleList3 = Arrays.asList(11.4, 32.6, 5.5);

    @Test
    void calculateList1() {
        assertEquals(0.0, DoubleListSumCalculator.calculate(doubleList1));
    }

    @Test
    void calculateList2() {
        assertEquals(-1.9, DoubleListSumCalculator.calculate(doubleList2));
    }

    @Test
    void calculateList3() {
        assertEquals(49.5, DoubleListSumCalculator.calculate(doubleList3));
    }
}