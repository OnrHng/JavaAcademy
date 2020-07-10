package academy.everyonecodes.java.week8.reflection.cutlery;

public class Knife implements Cutlery {
    @Override
    public String getName() {
        return "Knife";
    }

    @Override
    public boolean isUsedFor(String dishName) {
        return dishName.equals("pizza") || dishName.equals("fish");
    }
}
