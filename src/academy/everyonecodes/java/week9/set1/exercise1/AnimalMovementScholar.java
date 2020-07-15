package academy.everyonecodes.java.week9.set1.exercise1;

import academy.everyonecodes.java.week9.set1.exercise1.animals.Animal;

import java.util.Optional;

public class AnimalMovementScholar {

    public Optional<String> elaborate (String name) {
        for (Animal animal : Animals.getAnimal()) {
            if (animal.getName().equals(name)) {
                return Optional.of(animal.getMovement());
            }
        }
        return Optional.empty();
    }
}
