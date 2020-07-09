package academy.everyonecodes.java.week8.optional.exercise2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BasicDictionaryTest {

    BasicDictionary basicDictionary =  new BasicDictionary();

    @ParameterizedTest
    @MethodSource("parameters")
    void findUnknownWords(Set<String> expected, String input) {
        assertEquals(expected, basicDictionary.findUnknownWords(input));

    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(
                        new HashSet<>(Collections.emptySet()), " "
                ),
                Arguments.of(
                        new HashSet<>(Arrays.asList("the", "elegant", "jumped", "up")), "  The elegant cat jumped up the table  "
                ),
                Arguments.of(
                        new HashSet<>(Arrays.asList("derek's", "sleep", "under", "the", "near", "at", "his", "home")),
                        "Derek's DOG sleep under the Table near the ChAiR at his home"
                )
        );
    }

}