package academy.everyonecodes.java.week4.set1.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PngCheckerTest {

    @ParameterizedTest
    @CsvSource({
            "true, pic.PNG",
            "false, pic_png",
            "true, pic.PNG",
            "true, pic.PNg",
            "true, pic.pNg",
            "false, .pnG",
            "false, ''"

    })
    void check(boolean expected, String filename) {
        assertEquals(expected, PngChecker.check(filename));
    }
}