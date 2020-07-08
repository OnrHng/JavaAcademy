package academy.everyonecodes.java.week8.set2.exercise3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    Calculation calculationSum = new Calculation("+", 23.5, 17.0);
    Calculation calculationSub = new Calculation("-", 23.5, 17.0);
    Calculation calculationMulti = new Calculation("*", 23.0, 2.0);
    Calculation calculationDiv = new Calculation("/", 25.0, 5.0);


    @Test
    void calculateWithAvailableOperator() {
        String expectedSum = "40.5";
        assertEquals(expectedSum, calculator.calculate(calculationSum));

        String expectedSub = "6.5";
        assertEquals(expectedSub, calculator.calculate(calculationSub));

        String expectedMulti = "46.0";
        assertEquals(expectedMulti, calculator.calculate(calculationMulti));

        String expectedDiv = "5.0";
        assertEquals(expectedDiv, calculator.calculate(calculationDiv));
    }

    @Test
    void calculateWithNotAvailableOperator() {
        Calculation calculation1 = new Calculation("**", 23.5, 17.0);
        Calculation calculation2 = new Calculation("//", 23.5, 17.0);
        Calculation calculation3 = new Calculation("%", 23.0, 2.0);
        Calculation calculation4 = new Calculation("--", 25.0, 5.0);
        String expectedSum = "Operation not available";
        assertEquals(expectedSum, calculator.calculate(calculation1));

        assertEquals(expectedSum, calculator.calculate(calculation2));

        assertEquals(expectedSum, calculator.calculate(calculation3));

        assertEquals(expectedSum, calculator.calculate(calculation4));
    }
}