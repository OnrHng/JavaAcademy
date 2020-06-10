package academy.everyonecodes.java.week4.set2.exercise2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringAsIntegerListParserTest {

    @Test
    void parse() {
        List<Integer> integerList = List.of(1,2,3,4,5);
        assertEquals(integerList, StringAsIntegerListParser.parse("1;2;3;4;5"));

        List<Integer> integerList2 = List.of(0,0);
        assertEquals(integerList2, StringAsIntegerListParser.parse("0;0"));

        List<Integer> integerList3 = List.of(123, 987, 564);
        assertEquals(integerList3, StringAsIntegerListParser.parse("123;987;564"));
    }

    @Test
    void parseTextHasNothing() {
        List<Integer> integerList = List.of();
        assertEquals(integerList, StringAsIntegerListParser.parse(""));
    }
}