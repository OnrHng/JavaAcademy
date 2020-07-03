package academy.everyonecodes.java.week7.reflection.exercise1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentPerformanceReaderTest {

    StudentPerformanceReader reader = new StudentPerformanceReader();

    @Test
    void read() {

        List<StudentPerformance> resultStudentPerformanceList =  reader.read();

        StudentPerformance expectedSecondStudentPerformance = new StudentPerformance("female",
                "some college", 69, 90, 88);

        assertFalse(resultStudentPerformanceList.isEmpty());
        assertEquals(expectedSecondStudentPerformance , resultStudentPerformanceList.get(1));

        //also
        assertEquals(expectedSecondStudentPerformance.getParentalEducation(), resultStudentPerformanceList.get(1).getParentalEducation());
        assertEquals(expectedSecondStudentPerformance.getReadingScore(), resultStudentPerformanceList.get(1).getReadingScore());
    }
}