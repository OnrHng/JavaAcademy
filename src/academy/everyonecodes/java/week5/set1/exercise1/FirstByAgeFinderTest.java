package academy.everyonecodes.java.week5.set1.exercise1;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class FirstByAgeFinderTest {

    FirstByAgeFinder ageFinder = new FirstByAgeFinder(); // ageFinder

    // global persons to can use all test method
    Person person1 = new Person("John", 20);
    Person person2 = new Person("Sally", 18);
    Person person3 = new Person("Michael", 32);

    @Test
    void findAgeFromEmptyList() {
        List<Person> personList = List.of(); // empty list
        Optional<Person> result = ageFinder.find(personList, 20);
        assertTrue(result.isEmpty());
    }
    @Test
    void findAgeFromListHasElementHasSameAge() {
        List<Person> personList = List.of(person1, person2, person3);
        Optional<Person> result = ageFinder.find(personList, 20);

        assertTrue(result.isPresent());
        assertEquals(person1, result.get());

        // and also check person name and age are same the result name and age
        assertEquals(person1.getName(), result.get().getName());
        assertEquals(person1.getAge(), result.get().getAge());

    }

    @Test
    void findAgeFromListHasElementHasNotSameAge() {
        List<Person> personList = List.of(person1, person2, person3);
        Optional<Person> result = ageFinder.find(personList, 63);

        assertTrue(result.isEmpty()); // there is not an object has same age
    }
}