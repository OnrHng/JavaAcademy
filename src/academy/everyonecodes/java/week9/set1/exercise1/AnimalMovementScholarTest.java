package academy.everyonecodes.java.week9.set1.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AnimalMovementScholarTest {

    AnimalMovementScholar movementScholar = new AnimalMovementScholar();

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(
                        Optional.empty(), " "
                ),
                Arguments.of(
                        Optional.of("walk,run"), "dog"
                ),
                Arguments.of(
                        Optional.of("walk,fly,swim"), "goose"
                )
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void elaborate(Optional<String> expected, String animalName) {
        assertEquals(expected, movementScholar.elaborate(animalName));

    }
}