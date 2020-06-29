package academy.everyonecodes.java.week7.set1.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NotStartWithTLengthTest {
    @Test
    void test() {
        List<Integer> lengthOfStringList = Stream.of("Hello", "there", "General", "Kenobi")
                .filter(string -> !string.startsWith("t"))
                .map(String::length)
                .collect(Collectors.toList());
        List<Integer> expectedList = List.of(5, 7, 6);
        Assertions.assertEquals(expectedList, lengthOfStringList);

    }
}
