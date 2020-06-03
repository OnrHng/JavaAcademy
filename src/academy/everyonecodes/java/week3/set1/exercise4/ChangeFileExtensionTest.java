package academy.everyonecodes.java.week3.set1.exercise4;

import org.junit.jupiter.api.Test;

import static academy.everyonecodes.java.week3.set1.exercise4.ChangeFileExtension.generateNewName;
import static org.junit.jupiter.api.Assertions.*;

class ChangeFileExtensionTest {

    @Test
    void generateNewNameTest() {
        assertEquals("picture.png", generateNewName("picture.jpg"));
    }
}