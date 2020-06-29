package academy.everyonecodes.java.week7.set1.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MultiplyBy10Test {
    @Test
    void test() {
        List<Integer> numbers = Stream.of(-2, -1, 0, 1, 2)
                .map(num -> num * 10)
                .collect(Collectors.toList());
        List<Integer> expectedList = List.of(-20, -10, 0, 10, 20);
        Assertions.assertEquals(expectedList, numbers);
    }
}
