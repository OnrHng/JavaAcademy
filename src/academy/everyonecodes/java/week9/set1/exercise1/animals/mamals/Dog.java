package academy.everyonecodes.java.week9.set1.exercise1.animals.mamals;

public class Dog extends Mamals {

    private String hairColor;

    public Dog() {
        super("dog", "walk,run");
        this.hairColor = "brown";
    }

    public String getHairColor() {
        return hairColor;
    }
}
