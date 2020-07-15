package academy.everyonecodes.java.week9.set1.exercise1.animals.mamals;

public class Gorilla extends Mamals {

    private String hairColor;

    public Gorilla() {
        super("Gorilla", "walk,run,climb");
        this.hairColor = "black";
    }

    public String getHairColor() {
        return hairColor;
    }
}
