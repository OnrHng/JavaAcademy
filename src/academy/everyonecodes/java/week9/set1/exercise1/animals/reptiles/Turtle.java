package academy.everyonecodes.java.week9.set1.exercise1.animals.reptiles;

public class Turtle extends Reptiles {

    private boolean hasShell;

    public Turtle() {
        super("Turtle", "crawl");
        this.hasShell = true;
    }

    public boolean isHasShell() {
        return hasShell;
    }
}
