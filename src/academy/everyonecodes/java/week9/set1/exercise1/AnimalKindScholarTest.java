package academy.everyonecodes.java.week9.set1.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AnimalKindScholarTest {

    AnimalKindScholar scholar = new AnimalKindScholar();

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(
                    Optional.empty(), " "
                ),
                Arguments.of(
                    Optional.of("mamals"), "dog"
                ),
                Arguments.of(
                    Optional.of("bird"), "goose"
                )
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void animalKindScholar(Optional<String> expected, String animalName) {
        assertEquals(expected, scholar.elaborate(animalName));
    }

}