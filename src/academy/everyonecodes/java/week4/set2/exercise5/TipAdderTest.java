package academy.everyonecodes.java.week4.set2.exercise5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TipAdderTest {

    @Test
    void addTip() {
        assertEquals(24.5, TipAdder.addTip(23.14));
        assertEquals(3.0, TipAdder.addTip(2.45));
        assertEquals(16.5, TipAdder.addTip(15.5));
        assertEquals(0.0, TipAdder.addTip(0.0));
    }
}