package academy.everyonecodes.java.week9.set2.exercise2;

public class Player {
    private String name;
    private String move;

    public Player(String name, String move) {
        this.name = name;
        this.move = move;
    }

    public String getName() {
        return name;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }
}
