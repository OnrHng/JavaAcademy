package academy.everyonecodes.java.week8.reflection.cutlery;

public class Spoon implements Cutlery {
    @Override
    public String getName() {
        return "Spoon";
    }

    @Override
    public boolean isUsedFor(String dishName) {
        return dishName.equals("soup");
    }
}
