package academy.everyonecodes.java.week9.set1.exercise1.animals.fishs;

public class Salmon extends Fishs {

    private String waterKind;


    public Salmon() {
        super("Salmon", "swim");
        this.waterKind = "saltwater";
    }

    public String getWaterKind() {
        return waterKind;
    }
}
