package academy.everyonecodes.java.week9.set1.exercise1.animals.arthropods;

public class Butterfly extends Arthropods {

    private int numberLegs;

    public Butterfly() {
        super("Butterfly", "walk,climb,fly");
        this.numberLegs = 6;
    }

    public int getNumberLegs() {
        return numberLegs;
    }
}
