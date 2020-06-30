package academy.everyonecodes.java.week7.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class NegativesTimesNegative2BiggerThan5Test {
    @Test
    void test() {
        long amountNumberNegativesTimesNegative2BiggerThan5 = Stream.of(1.2, 0.4, -0.1, -2.0, -3.1, 2.0, -2.6)
                .filter(num -> num < 0)
                .map(num -> num * -2)
                .filter(num -> num > 5)
                .count();
        int expected = 2;
        Assertions.assertEquals(expected, amountNumberNegativesTimesNegative2BiggerThan5);
    }
}
