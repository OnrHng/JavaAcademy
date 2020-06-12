package academy.everyonecodes.java.week4.reflection;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BeforeDashExtractorTest {

    @ParameterizedTest
    @CsvSource({
            "Some, Some-example",
            "my123=, my123=-list-",
            "'', ---my=2-list",
            "0123==, 0123==--=123",
            "'' ,MyExample"
    })
    void extract(String expected, String text) {
        assertEquals(expected, BeforeDashExtractor.extract(text));
    }
}