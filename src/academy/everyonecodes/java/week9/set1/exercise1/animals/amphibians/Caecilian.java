package academy.everyonecodes.java.week9.set1.exercise1.animals.amphibians;

public class Caecilian extends Amphibians {

    private boolean hasLegs;

    public Caecilian() {
        super("caecilian", "crawl,swim");
        this.hasLegs = false;
    }

    public boolean isHasLegs() {
        return hasLegs;
    }
}
