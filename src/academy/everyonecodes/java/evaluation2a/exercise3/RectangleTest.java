package academy.everyonecodes.java.evaluation2a.exercise3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @ParameterizedTest
    @CsvSource({"0.45, 0.9, 0.5", "0 , 0 , 0", "22.75, 6.5, 3.5"})
    void calculateArea(double expected, double length, double width) {
        Rectangle rectangle = new Rectangle(length, width);
        assertEquals(expected, rectangle.calculateArea());
    }
}