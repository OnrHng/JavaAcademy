package academy.everyonecodes.java.evaluation1.exercise2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TotalCalculatorTest {
    TotalCalculator calculator = new TotalCalculator();
    @Test
    void calculate() {
        Product laptop = new Product("Laptop", 600.0);
        Product tv = new Product("Samsung Tv", 550.50);
        Product phone = new Product("LG", 180.50);

        List<Product> products = List.of(laptop, tv, phone);
        double expected = 1597.2;
        assertEquals(expected, calculator.calculate(products));
    }

    @Test
    void calculateFromEmptyList() {
        List<Product> products = List.of();
        double expected = 0.0;
        assertEquals(expected, calculator.calculate(products));
    }

    @Test
    void calculateFromListHasAnElement() {
        Product laptop = new Product("Laptop", 600.0);

        List<Product> products = List.of(laptop);
        double expected = 720.0;
        assertEquals(expected, calculator.calculate(products));
    }
}