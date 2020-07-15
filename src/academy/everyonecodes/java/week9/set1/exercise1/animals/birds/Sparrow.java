package academy.everyonecodes.java.week9.set1.exercise1.animals.birds;

public class Sparrow extends Birds  {

    private String featherColor;

    public Sparrow() {
        super("sparrow", "jump,fly");
        this.featherColor = "brown";
    }

    public String getFeatherColor() {
        return featherColor;
    }
}
