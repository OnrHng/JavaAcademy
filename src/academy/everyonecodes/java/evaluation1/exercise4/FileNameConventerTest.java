package academy.everyonecodes.java.evaluation1.exercise4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FileNameConventerTest {
    FileNameConventer conventer = new FileNameConventer();
    @ParameterizedTest
    @CsvSource({"Peter-Pan.pdf, 20200623_PETER_PAN.docx",
                "Peter-Pan.png, 20200613_PETER_pan.jpg",
                "Michael-Maier.pdf, 20200623_michael_Maier.docx",
                "Michael-Maier.png, 20200613_Michael_MAIER.jpg"
    })
    void convert(String expected, String fileName) {
        assertEquals(expected, conventer.convert(fileName));
    }

    @ParameterizedTest
    @CsvSource({"Peter-Pan.pdf, 20200623123_PETER_PAN.docx", // wrong case because first 9 is so long
                "Peter-Pan.png, 20200613_PETER_pan.jp", // extension is not .jpg
                "Michael-Maier.pdf, 20200623_michael__Maier.docx", // has double under minus char
                "Michael-Maier.png, 20200613_Michael_MAIER_FIle.jpg" // has one more name after last name
    })
    void convertWrongCase(String expected, String fileName) {
        // not equals
        assertNotEquals(expected, conventer.convert(fileName));
    }
}