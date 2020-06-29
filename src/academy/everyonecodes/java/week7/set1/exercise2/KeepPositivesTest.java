package academy.everyonecodes.java.week7.set1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class KeepPositivesTest {
    @Test
    void test() {
        List<Integer> numbers = Stream.of(-1, 0, 1, 2, 3)
                .filter(number -> number > 0)
                .collect(Collectors.toList());
        List<Integer> expectedList = List.of(1, 2, 3);
        Assertions.assertEquals(expectedList, numbers);
    }
}
