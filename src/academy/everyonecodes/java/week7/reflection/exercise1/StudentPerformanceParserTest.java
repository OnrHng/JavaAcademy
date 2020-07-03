package academy.everyonecodes.java.week7.reflection.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentPerformanceParserTest {
    StudentPerformanceParser parser = new StudentPerformanceParser();

    @Test
    void parseLine() {
        StudentPerformance expectedStudentPerformance = new StudentPerformance("female",
                "bachelor's degree", 72, 72, 74);

        String line = "female;group B;bachelor's degree;standard;none;72;72;74";

        StudentPerformance resultStudentPerformance = parser.parseLine(line);

        assertEquals(expectedStudentPerformance, resultStudentPerformance);
    }
}