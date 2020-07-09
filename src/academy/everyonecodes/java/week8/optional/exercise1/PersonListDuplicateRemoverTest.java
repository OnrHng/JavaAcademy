package academy.everyonecodes.java.week8.optional.exercise1;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class PersonListDuplicateRemoverTest {

    PersonListDuplicateRemover remover = new PersonListDuplicateRemover();

    @Test
    void remove() {

        Person person1 = new Person("Lora", 32);
        Person person2 = new Person("Gigi", 29);
        Person person3 = new Person("Daniel", 55);
        Person person4 = new Person("Lora", 32);
        List<Person> personList = List.of(person1, person2, person3, person4);

        Set<Person> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);

        assertEquals(personSet, remover.remove(personList));
    }
}