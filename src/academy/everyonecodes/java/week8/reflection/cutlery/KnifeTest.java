package academy.everyonecodes.java.week8.reflection.cutlery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnifeTest {
    Knife knife = new Knife();

    @Test
    void getName() {
        String expected = "Knife";
        assertEquals(expected, knife.getName());

    }

    @Test
    void isUsedFor() {
        String dishName1 = "PIzza";
        assertTrue(knife.isUsedFor(dishName1.toLowerCase()));

        String dishName2 = "FISH";
        assertTrue(knife.isUsedFor(dishName2.toLowerCase()));

        String dishName3 = "SOUP";
        assertFalse(knife.isUsedFor(dishName3.toLowerCase()));
    }
}