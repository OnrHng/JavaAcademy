package academy.everyonecodes.java.week4.reflection;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxorMinPickerTest {

    @Test
    void pickRandomElementFromList() {
        List<Integer> integerList = List.of(55,1,0,4,-20,9,-1,13);
        List<Integer> minMaxListFromIntList = List.of(-20,55);
        assertTrue(minMaxListFromIntList.contains(MaxorMinPicker.pick(integerList)));
    }

    @Test
    void pickRandomElementFromListHas0() {
        List<Integer> integerList = List.of(0,0,0,0,0,0);
        List<Integer> minMaxListFromIntList = List.of(0,0);
        assertTrue(minMaxListFromIntList.contains(MaxorMinPicker.pick(integerList)));
    }

    @Test
    void pickRandomElementFromListHasNotElement() {
        List<Integer> integerList = List.of();
        List<Integer> minMaxListFromIntList = List.of();
        assertFalse(minMaxListFromIntList.contains(MaxorMinPicker.pick(integerList)));
    }
}