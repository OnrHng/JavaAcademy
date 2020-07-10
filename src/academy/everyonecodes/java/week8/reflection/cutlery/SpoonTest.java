package academy.everyonecodes.java.week8.reflection.cutlery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpoonTest {
    Spoon spoon = new Spoon();
    @Test
    void getName() {
        String expected = "Spoon";
        assertEquals(expected, spoon.getName());
    }

    @Test
    void isUsedFor() {
        String dishName = "Soup";
        assertTrue(spoon.isUsedFor(dishName.toLowerCase()));

        String dishName1 = "PIZZA";
        // false case
        assertFalse(spoon.isUsedFor(dishName1.toLowerCase()));

    }
}