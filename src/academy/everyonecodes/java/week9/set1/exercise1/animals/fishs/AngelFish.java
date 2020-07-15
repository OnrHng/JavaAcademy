package academy.everyonecodes.java.week9.set1.exercise1.animals.fishs;

public class AngelFish extends Fishs {

    private String waterKind;

    public AngelFish() {
        super("angelfish", "swim");
        this.waterKind = "freshwater";
    }

    public String getWaterKind() {
        return waterKind;
    }
}
