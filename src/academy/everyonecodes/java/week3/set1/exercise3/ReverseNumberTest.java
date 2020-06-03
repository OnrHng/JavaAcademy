package academy.everyonecodes.java.week3.set1.exercise3;

import org.junit.jupiter.api.Test;
import static academy.everyonecodes.java.week3.set1.exercise3.ReverseNumber.reverseNumber;
import static org.junit.jupiter.api.Assertions.*;

class ReverseNumberTest {

    @Test
    void reverseNumberTest() {
        int[] numbers = {1,2,3,4,5};
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, reverseNumber(numbers));
    }
}