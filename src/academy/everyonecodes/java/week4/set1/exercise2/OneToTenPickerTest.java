package academy.everyonecodes.java.week4.set1.exercise2;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class OneToTenPickerTest {

    @Test
    void pick() {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        assertTrue(numbers.contains(OneToTenPicker.pick()));
    }
}