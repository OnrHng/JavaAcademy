package academy.everyonecodes.java.week8.optional.exercise1;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class IntegerListDuplicateRemoverTest {

    IntegerListDuplicateRemover remover = new IntegerListDuplicateRemover();

    @Test
    void remove() {
        List<Integer> integerList = List.of(4, 6, 4, 0, -3, -10, -3, 0);
        Set<Integer> expectedList = new HashSet<>(Arrays.asList(4, 6, 0, -3, -10));
        assertEquals(expectedList, remover.remove(integerList));

        // empty list
        List<Integer> emptyIntList = List.of();
        Set<Integer> expected = new HashSet<>(Collections.emptySet());
        assertEquals(expected, remover.remove(emptyIntList));
    }
}