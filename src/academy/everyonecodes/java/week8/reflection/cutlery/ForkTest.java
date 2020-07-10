package academy.everyonecodes.java.week8.reflection.cutlery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForkTest {
    Fork fork = new Fork();

    @Test
    void getName() {
        String expected = "Fork";
        assertEquals(expected, fork.getName());
    }

    @Test
    void isUsedFor() {
        String dishName1 = "Pizza";
        assertTrue(fork.isUsedFor(dishName1.toLowerCase()));

        String dishName2 = "FISH";
        assertTrue(fork.isUsedFor(dishName2.toLowerCase()));

        String dishName3 = "Pasta";
        assertTrue(fork.isUsedFor(dishName3.toLowerCase()));

        String dishName4 = "Soup";
        // false case
        assertFalse(fork.isUsedFor(dishName4.toLowerCase()));

    }
}