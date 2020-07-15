package academy.everyonecodes.java.week9.set1.exercise1.animals.birds;

public class Goose extends Birds {

    private String featherColor;

    public Goose() {
        super("goose", "walk,fly,swim");
        this.featherColor = "white";
    }

    public String getFeatherColor() {
        return featherColor;
    }
}
