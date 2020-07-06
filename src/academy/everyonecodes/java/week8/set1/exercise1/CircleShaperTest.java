package academy.everyonecodes.java.week8.set1.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleShaperTest {

     CircleShaper circleShaper = new CircleShaper();
     Shaper anotherCircleShaper = new CircleShaper();
    @Test
    void getShape() {
        String result = circleShaper.getShape();
        String expected = "Circle";
        assertEquals(expected, result);

        Shaper shaper = circleShaper;
        assertEquals("Circle", shaper.getShape());

        assertEquals("Circle", anotherCircleShaper.getShape());

    }
}