package academy.everyonecodes.java.evaluation1.exercise3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LineLengthReaderTest {
    LineLengthReader reader = new LineLengthReader();

    @Test
    void read() {
        // craft an expectedList that has 4,2,3,5,10 values, because the read method reads strings.txt file
        // and write length of lines which in the strings.txt into integer list as integer value, and
        // return a list of integers

        List<Integer> expectedList = List.of(4, 2, 3, 5, 10);
        List<Integer> resultList = reader.read();
        assertEquals(expectedList, resultList);
    }

    @Test
    void readFileButCompareWrongExpectedList() {
        List<Integer> expectedList = List.of(10, 2, 4, 5, 3);
        List<Integer> resultList = reader.read();
        // both lists are not equal because both has integers on the different index
        assertNotEquals(expectedList, resultList);
    }
}