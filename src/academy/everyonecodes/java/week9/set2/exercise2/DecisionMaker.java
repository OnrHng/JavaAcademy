package academy.everyonecodes.java.week9.set2.exercise2;

public class DecisionMaker {

    public Player compare(Player player1, Player player2) {

        while (player1.getMove().equals(player2.getMove())) {
            System.out.println("Your moves are same! One more time!");
            RockScissorsPaperGame game = new RockScissorsPaperGame();
            player1.setMove(game.chooseAgainMoveForHuman());
            player2.setMove(game.chooseAgainMoveRandom());
        }

        //it is modified for set2 ex3
        if ((player1.getMove().equals("rock") && player2.getMove().equals("scissors") || player2.getMove().equals("lizard")) ||
            (player1.getMove().equals("scissors") && player2.getMove().equals("paper") || player2.getMove().equals("lizard")) ||
            (player1.getMove().equals("paper") && player2.getMove().equals("rock") || player2.getMove().equals("spock")) ||
            (player1.getMove().equals("lizard") && player2.getMove().equals("spock") || player2.getMove().equals("paper")) ||
            (player1.getMove().equals("spock") && player2.getMove().equals("scissors") || player2.getMove().equals("rock"))) {
            return player1;
        } else {
            return player2;
        }
    }
}
