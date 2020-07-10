package academy.everyonecodes.java.week8.reflection;

import academy.everyonecodes.java.week8.reflection.cutlery.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WaiterTest {

    Waiter waiter = new Waiter();

    @ParameterizedTest
    @MethodSource("parameters")
    void getCutlery(List<String> expected, String input) {

        assertEquals(expected, waiter.getCutlery(input));
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(
                        List.of(), "" //empty dish Name
                ),
                Arguments.of(
                        List.of(), "Steak" //wrong dish Name
                ),
                Arguments.of(
                        List.of(new Fork().getName(), new Knife().getName()), "PIZZA"
                ),
                Arguments.of(
                        List.of(new Fork().getName()), "Pasta"
                ),
                Arguments.of(
                        List.of(new Fork().getName(), new Knife().getName()), "Fish"
                ),
                Arguments.of(
                        List.of(new Spoon().getName()), "Soup"
                )
        );
    }
}