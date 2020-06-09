package academy.everyonecodes.java.week4.set1.exercise3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListSecondHalfPickerTest {

//    add to if String list has not an element??????

    @Test
    void pickFromListThatHasEvenNumberSize() {
        List<String> stringList = List.of("apple", "banana", "melon", "orange");

        String result = StringListSecondHalfPicker.pick(stringList);

        List<String> expectedList = List.of("melon", "orange");

        assertTrue(expectedList.contains(result));
    }

    @Test
    void pickFromListThatHasOddNumberSize() {
        List<String> stringList = List.of("potato", "pumpkin", "corn", "spinach", "salat", "onion", "tomato");

        String result = StringListSecondHalfPicker.pick(stringList);

        List<String> expectedList = List.of("spinach", "salat", "onion", "tomato");

        assertTrue(expectedList.contains(result));
    }

    @Test
    void pickFromListThatHasNotAnElement() {
        List<String> stringList = List.of();

        String result = StringListSecondHalfPicker.pick(stringList);

        List<String> expectedList = List.of("");

        assertTrue(expectedList.contains(result));
    }

    @Test
    void pickFromListThatHasAnEmptyElement() {
        List<String> stringList = List.of("");

        String result = StringListSecondHalfPicker.pick(stringList);

        List<String> expectedList = List.of("");

        assertTrue(expectedList.contains(result));
    }
}