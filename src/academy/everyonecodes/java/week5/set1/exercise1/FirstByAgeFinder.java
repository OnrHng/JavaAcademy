package academy.everyonecodes.java.week5.set1.exercise1;

import java.util.List;
import java.util.Optional;

public class FirstByAgeFinder {

    public Optional<Person> find(List<Person> persons, int age) {

        //if there is an object that same age with the age, return it.
        for (Person person : persons) {
            if (person.getAge() == age) return Optional.of(person);
        }

        // if there is not an object that has same age with the age, return again empty Optional
        return Optional.empty();
    }
}
