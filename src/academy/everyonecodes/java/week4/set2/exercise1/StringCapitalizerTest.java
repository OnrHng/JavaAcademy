package academy.everyonecodes.java.week4.set2.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringCapitalizerTest {

    @ParameterizedTest
    @CsvSource({"Onur, onur", "FH, FH", "'' , ''", "A, a"})
    void capitalize(String expected, String text) {
        assertEquals(expected, StringCapitalizer.capitalize(text));
    }
}