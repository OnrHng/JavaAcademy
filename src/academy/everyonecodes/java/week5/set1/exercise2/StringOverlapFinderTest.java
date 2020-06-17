package academy.everyonecodes.java.week5.set1.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StringOverlapFinderTest {

    StringOverlapFinder finder = new StringOverlapFinder();

    @ParameterizedTest
    @CsvSource({"el, MICHAEL, elias",
                "christ, christoph, Christian",
                "onur, onur, onur",
    })
    void find(String expected, String text1, String text2) {
        Optional<String> result = finder.find(text1, text2);
        assertTrue(result.isPresent());
        assertEquals(expected, result.get());
    }

    @ParameterizedTest
    @CsvSource({"'', '', John",
                "'', cheese, ''",
                "'', '', ''"
    })
    void findEmpty(String expected, String text1, String text2) {
        Optional<String> result = finder.find(text1, text2);
        assertTrue(result.isEmpty());
    }
}