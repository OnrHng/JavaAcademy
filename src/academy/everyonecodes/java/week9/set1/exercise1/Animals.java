package academy.everyonecodes.java.week9.set1.exercise1;

import academy.everyonecodes.java.week9.set1.exercise1.animals.Animal;
import academy.everyonecodes.java.week9.set1.exercise1.animals.amphibians.Caecilian;
import academy.everyonecodes.java.week9.set1.exercise1.animals.amphibians.Frog;
import academy.everyonecodes.java.week9.set1.exercise1.animals.arthropods.Butterfly;
import academy.everyonecodes.java.week9.set1.exercise1.animals.arthropods.Spider;
import academy.everyonecodes.java.week9.set1.exercise1.animals.birds.Goose;
import academy.everyonecodes.java.week9.set1.exercise1.animals.birds.Sparrow;
import academy.everyonecodes.java.week9.set1.exercise1.animals.fishs.AngelFish;
import academy.everyonecodes.java.week9.set1.exercise1.animals.fishs.Salmon;
import academy.everyonecodes.java.week9.set1.exercise1.animals.mamals.Dog;
import academy.everyonecodes.java.week9.set1.exercise1.animals.mamals.Gorilla;
import academy.everyonecodes.java.week9.set1.exercise1.animals.reptiles.Snake;
import academy.everyonecodes.java.week9.set1.exercise1.animals.reptiles.Turtle;

import java.util.List;

public class Animals {

    public static List<Animal> getAnimal() {

        return List.of(new Dog(), new Gorilla(), new Goose(), new Sparrow(), new Salmon(), new AngelFish(),
                new Snake(), new Turtle(), new Frog(), new Caecilian(), new Spider(), new Butterfly());
    }
}
