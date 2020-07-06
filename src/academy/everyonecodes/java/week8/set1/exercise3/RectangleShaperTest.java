package academy.everyonecodes.java.week8.set1.exercise3;

import academy.everyonecodes.java.week8.set1.exercise1.Shaper;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RectangleShaperTest {
    RectangleShaper rectangleShaper = new RectangleShaper();
    Colored colored = (Colored) rectangleShaper;
    Shaper shaper = (Shaper) rectangleShaper;
    List<RectangleShaper> rectangleShapers = List.of(rectangleShaper);

    @Test
    void getShape() {
        assertEquals("Rectangle", rectangleShaper.getShape());

        assertEquals("Rectangle", shaper.getShape());
    }

    @Test
    void getColor() {
        assertEquals("Green", rectangleShaper.getColor());

        assertEquals("Green", colored.getColor());


    }
}