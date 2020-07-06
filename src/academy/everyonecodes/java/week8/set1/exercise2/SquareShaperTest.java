package academy.everyonecodes.java.week8.set1.exercise2;

import academy.everyonecodes.java.week8.set1.exercise1.CircleShaper;
import academy.everyonecodes.java.week8.set1.exercise1.Shaper;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SquareShaperTest {

    Shaper circleShaper = new CircleShaper();
    Shaper squareShaper = new SquareShaper();
    Shaper triangleShaper = new TriangleShaper();


    @Test
    void getShape() {
        assertEquals("Circle", circleShaper.getShape());

        assertEquals("Square", squareShaper.getShape());

        assertEquals("Triangle", triangleShaper.getShape());

        List<Shaper> shapers = List.of(circleShaper, squareShaper, triangleShaper);
        List<String> expectedShaperList = List.of("Circle", "Square", "Triangle");
        List<String> resultList = shapers.stream().map(Shaper::getShape).collect(Collectors.toList());
        assertEquals(expectedShaperList, resultList);
    }
}