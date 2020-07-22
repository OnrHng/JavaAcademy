package academy.everyonecodes.java.evaluation2a.exercise3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @ParameterizedTest
    @CsvSource({"95.03317777109123 , 5.5", "0, 0", "1.5393804002589986, 0.7"})
    void calculateArea(double expected, double radious) {
        Circle circle = new Circle(radious);
        assertEquals(expected, circle.calculateArea());
    }
}