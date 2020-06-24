package academy.everyonecodes.java.week6.exercise2;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class FirstVowelFinderTest {
    FirstVowelFinder finder = new FirstVowelFinder();
    @ParameterizedTest
    @CsvSource({"o, Onur",
                "'', 232432432",
                "a, Skyscanner",
                "'', ''"
        })
    void find(String expected, String input) {
        assertEquals(expected, finder.find(input));
    }
}