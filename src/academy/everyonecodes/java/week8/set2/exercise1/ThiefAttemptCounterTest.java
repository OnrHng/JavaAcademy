package academy.everyonecodes.java.week8.set2.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThiefAttemptCounterTest {

    Thief beginnerThief = new BeginnerThief();
    Thief advancedThief = new AdvancedThief();
    ThiefAttemptCounter counter = new ThiefAttemptCounter();

    Safe secureSafe = new Safe(50, "Beginner");
    Safe moreSecureSafe = new Safe(150, "Advanced");

    @Test
    void countAttempts() {

        int resultBeginnerThiefAttempt = counter.countAttempts(secureSafe, beginnerThief);
        assertEquals(49, resultBeginnerThiefAttempt);

        int resultAdvancedThiefAttempt = counter.countAttempts(moreSecureSafe, advancedThief);
        assertEquals(74, resultAdvancedThiefAttempt);
    }

    @Test
    void countAttemptIsNotPassLevelOfThief() {
        int resultBeginnerThiefAttempt = counter.countAttempts(moreSecureSafe, beginnerThief);
        int expected = -1; // because thief is just beginner, he/she can not open the more secure safe

        assertEquals(expected, resultBeginnerThiefAttempt);

    }
}