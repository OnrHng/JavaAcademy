package academy.everyonecodes.java.week9.set1.exercise1.animals.reptiles;

public class Snake extends Reptiles {

    private boolean hasShell;

    public Snake() {
        super("Snake", "crawl,climb");
        this.hasShell = false;
    }

    public boolean isHasShell() {
        return hasShell;
    }
}
