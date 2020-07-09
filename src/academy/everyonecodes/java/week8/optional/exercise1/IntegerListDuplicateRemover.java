package academy.everyonecodes.java.week8.optional.exercise1;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntegerListDuplicateRemover {

    public Set<Integer> remove(List<Integer> integerList) {
        try {
            return new HashSet<>(integerList);
        } catch (Exception e) {
            e.printStackTrace();
            return new HashSet<>(Collections.emptySet());
        }
    }
}
