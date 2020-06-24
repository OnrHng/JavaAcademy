package academy.everyonecodes.java.week6.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PictureNameExtractorTest {
    PictureNameExtractor extractor = new PictureNameExtractor();

    @ParameterizedTest
    @CsvSource({"sunshine, 01222013SunshinePic.jpg",
                "snowflake, 24122019SnowflakePic.jpg",
                "dereks birthday, 01082003Dereks-BirthdayPic.jpg",
                "onurpi , Onur12345678Pi.jpg",
                "coding, 01Coding41.jpg",
                "'', ''",
                "'' , 12324.jpg"
    })
    void extract(String expected, String input) {
        assertEquals(expected, extractor.extract(input));
    }
}