package academy.everyonecodes.java.week8.reflection.cutlery;

public class Fork implements Cutlery {
    @Override
    public String getName() {
        return "Fork";
    }

    @Override
    public boolean isUsedFor(String dishName) {
        return dishName.equals("pizza") || dishName.equals("fish") || dishName.equals("pasta");
    }
}
