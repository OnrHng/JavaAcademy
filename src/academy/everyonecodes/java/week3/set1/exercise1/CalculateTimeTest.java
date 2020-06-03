package academy.everyonecodes.java.week3.set1.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTimeTest {
    CalculateTime calculateTime = new CalculateTime();

    @Test
    void calculateWalkingTime() {
        double distanceAsKm = 0.5;
        assertEquals(7.5,  calculateTime.calculateWalkingTime(distanceAsKm));
    }

    @Test
    void calculateTramTime() {
        assertEquals(16, calculateTime.calculateTramTime(4));
    }

    @Test
    void calculateTotalTime() {
        assertEquals(46.5, calculateTime.calculateTotalTime(0.8, 0.7, 6));
    }
}