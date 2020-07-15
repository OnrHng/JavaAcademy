package academy.everyonecodes.java.week9.set1.exercise1.animals.arthropods;

public class Spider extends Arthropods {

    private int numberLegs;

    public Spider() {
        super("Spider", "walk,climb");
        this.numberLegs = 8;
    }

    public int getNumberLegs() {
        return numberLegs;
    }
}
