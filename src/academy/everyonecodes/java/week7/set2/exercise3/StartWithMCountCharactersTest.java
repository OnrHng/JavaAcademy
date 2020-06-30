package academy.everyonecodes.java.week7.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.stream.Stream;

public class StartWithMCountCharactersTest {
    @Test
    void test() {
        Optional<Integer> sumLengthStringStartWithM = Stream.of("Mary", "Joe", "Max", "Laura")
                .filter(string -> string.startsWith("M"))
                .map(String::length)
                .reduce(Integer::sum);
        int expected = 7;
        Assertions.assertTrue(sumLengthStringStartWithM.isPresent());
        Assertions.assertEquals(expected, sumLengthStringStartWithM.get());
    }
}
