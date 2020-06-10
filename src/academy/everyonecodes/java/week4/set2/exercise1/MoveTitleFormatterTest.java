package academy.everyonecodes.java.week4.set2.exercise1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MoveTitleFormatterTest {

    @ParameterizedTest
    @CsvSource({"THE GODFATHER, The Godfather", "STAR WARS, star Wars", "'', ''", "A, a"})
    void format(String expected, String movieTitle) {
        assertEquals(expected, MoveTitleFormatter.format(movieTitle));
    }
}