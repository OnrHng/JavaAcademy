package academy.everyonecodes.java.week7.reflection.exercise1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Top5ParentalEducationFinderTest {

    Top5ParentalEducationFinder finder = new Top5ParentalEducationFinder();
    StudentPerformanceReader reader = new StudentPerformanceReader();

    @Test
    void find() {

        List<String> expectedTop5ParentalEduList = List.of("associate's degree", "some college", "bachelor's degree", "some college",
                "some college");

        List<StudentPerformance> studentPerformanceList = reader.read();
        List<String> resultTop5ParentalEduList = finder.find(studentPerformanceList);

        assertEquals(expectedTop5ParentalEduList, resultTop5ParentalEduList);


    }
}