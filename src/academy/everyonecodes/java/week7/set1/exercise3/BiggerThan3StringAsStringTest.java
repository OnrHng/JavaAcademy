package academy.everyonecodes.java.week7.set1.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiggerThan3StringAsStringTest {
    @Test
    void test() {
        List<Integer> numbers = Stream.of(0, 1, 2, 3, 4, 5)
                .filter(num -> num > 3)
                .collect(Collectors.toList());
        List<String> numbersGretarThen3AsAString = numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.toList());
        List<String> expectedList = List.of("4", "5");
        Assertions.assertEquals(expectedList, numbersGretarThen3AsAString);
    }
}
