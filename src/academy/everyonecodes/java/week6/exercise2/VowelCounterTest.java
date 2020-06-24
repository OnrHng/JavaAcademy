package academy.everyonecodes.java.week6.exercise2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class VowelCounterTest {
    VowelCounter counter = new VowelCounter();
    @ParameterizedTest
    @CsvSource({"3, OnurHan",
                "0, sky",
                "0, ''",
                "0, 1321412412"
    })
    void count(int expected, String input) {
        assertEquals(expected, counter.count(input));
    }
}