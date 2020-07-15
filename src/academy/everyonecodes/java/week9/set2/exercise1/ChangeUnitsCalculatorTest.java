package academy.everyonecodes.java.week9.set2.exercise1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ChangeUnitsCalculatorTest {

    ChangeUnitsCalculator changeUnitsCalculator = new ChangeUnitsCalculator();

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of(
                    List.of(), 0
                ),
                Arguments.of(
                    List.of("Cent50"), 0.50
                ),
                Arguments.of(
                    List.of("Euro100", "Euro10", "Euro1", "Cent50", "Cent20", "Cent10", "Cent5", "Cent1"), 111.86
                ),
                Arguments.of(
                    List.of("Euro20", "Cent5", "Cent2"), 20.07
                )
        );
    }

    @ParameterizedTest
    @MethodSource("parameters")
    void calculate(List<MoneyUnit> expectedUnits, double change) {
        List<MoneyUnit> resultUnits = changeUnitsCalculator.calculate(change);
        List<String> resultUnitsAsStringlist = new ArrayList<>();
        for (MoneyUnit unit : resultUnits){
            resultUnitsAsStringlist.add(unit.getCurrency() + unit.getValue());
        }
        assertEquals(expectedUnits, resultUnitsAsStringlist);
    }
}