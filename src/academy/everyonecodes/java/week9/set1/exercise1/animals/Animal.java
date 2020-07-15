package academy.everyonecodes.java.week9.set1.exercise1.animals;

public class Animal {

    private String name;
    private String animalKind;
    private String movement;

    public Animal(String name, String animalKind, String movement) {
        this.name = name;
        this.animalKind = animalKind;
        this.movement = movement;
    }

    public String getName() {
        return name;
    }

    public String getAnimalKind() {
        return animalKind;
    }

    public String getMovement() {
        return movement;
    }
}
