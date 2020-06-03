package academy.everyonecodes.java.week3.set1.exercise2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrangerStudentsTest {
    StrangerStudents strangerStudents = new StrangerStudents();
    @Test
    void getTotalTimeForFirstSeason() {
        assertEquals(210, strangerStudents.getTotalTimeForFirstSeason(5));
    }
}