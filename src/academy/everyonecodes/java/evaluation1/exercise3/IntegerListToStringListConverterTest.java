package academy.everyonecodes.java.evaluation1.exercise3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListToStringListConverterTest {
    IntegerListToStringListConverter converter = new IntegerListToStringListConverter();

    @Test
    void convert() {
        List<Integer> integerList = List.of(-2, 0, 1, 4, 14);

        List<String> resultList = converter.convert(integerList);
        List<String> expectedList = List.of("-2", "0", "1", "4", "14");
        assertEquals(expectedList, resultList);
    }

    @Test
    void convertFromEmptyList() {
        List<Integer> integerList = List.of();

        List<String> resultList = converter.convert(integerList);
        List<String> expectedList = List.of();
        assertEquals(expectedList, resultList);
    }
}