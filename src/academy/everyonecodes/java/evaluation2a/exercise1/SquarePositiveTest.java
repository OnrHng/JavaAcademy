package academy.everyonecodes.java.evaluation2a.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class SquarePositiveTest {

    @Test
    void test() {

        List<Integer> numbers = List.of(-3, -2, -1, 0, 1, 2, 3);

        List<Integer> result = numbers.stream().filter(num -> num > 0).map(x -> x * x).collect(Collectors.toList());
        List<Integer> expected = List.of(1, 4, 9);
        Assertions.assertEquals(expected, result);
    }
}
