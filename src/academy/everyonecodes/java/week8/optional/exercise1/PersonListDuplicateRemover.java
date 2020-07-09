package academy.everyonecodes.java.week8.optional.exercise1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonListDuplicateRemover {

    public Set<Person> remove(List<Person> personList) {
        return new HashSet<>(personList);
    }
}
