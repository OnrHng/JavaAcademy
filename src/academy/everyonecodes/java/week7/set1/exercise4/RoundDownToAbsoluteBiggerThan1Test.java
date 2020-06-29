package academy.everyonecodes.java.week7.set1.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class RoundDownToAbsoluteBiggerThan1Test {
    @Test
    void test() {
        List<Double> doubleList = List.of(1.5, -1.8, 3.5);
        Optional<Double> number = doubleList.stream()
                .map(Math::floor)
                .map(Math::abs)
                .filter(num -> num > 1)
                .findFirst();

        double expected = 2.0;
        Assertions.assertTrue(number.isPresent());
        Assertions.assertEquals(expected, number.get());
    }
}
