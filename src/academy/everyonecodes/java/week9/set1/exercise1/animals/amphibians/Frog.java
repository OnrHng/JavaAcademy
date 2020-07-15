package academy.everyonecodes.java.week9.set1.exercise1.animals.amphibians;

public class Frog extends Amphibians {

    private boolean hasLegs;

    public Frog() {
        super("frog", "walk,jump,swim");
        this.hasLegs = true;
    }

    public boolean isHasLegs() {
        return hasLegs;
    }
}
