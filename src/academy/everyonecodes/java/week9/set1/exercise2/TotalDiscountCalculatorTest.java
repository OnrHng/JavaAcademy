package academy.everyonecodes.java.week9.set1.exercise2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TotalDiscountCalculatorTest {

    TotalDiscountCalculator calculator = new TotalDiscountCalculator();

    @Test
    void calculate() {
        Product product1 = new Product("wine", 6.0);
        Product product2 = new Product("tomato", 3.0);
        Product product3 = new Product("bread", 2);
        Product product4 = new Product("cucumber", 3);
        Product product5 = new Product("ice", 4.5);

        List<Product> products = List.of(product1, product2, product3, product4, product5);

        assertEquals(17.6, calculator.calculate(products));

        Product product6 = new Product("cheese", 5.5);
        Product product7 = new Product("water", 1.5);

        List<Product> products1 = List.of(product1, product2, product3, product4, product5, product6, product7);

        assertEquals(24.6, calculator.calculate(products1));
    }
}