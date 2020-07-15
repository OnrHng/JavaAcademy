package academy.everyonecodes.java.week9.set2.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaperGame {
    Scanner scanner = new Scanner(System.in);
    List<Move> moves = List.of(new Move("rock"), new Move("scissors"), new Move("paper"), new Move("lizard"), new Move("spock"));
    Random random = new Random();

    public void play(){
        /*
            GAME is modified for set2 ex3
         */
        System.out.println("These are options : \"rock\", \"paper\", \"scissors\", \"lizard\", \"spock\"");
        System.out.println("Choose one! :");
        String move = scanner.nextLine();

        // if the player choose unacceptable move, choose again until to get right move
        boolean isContains = true;
        List<String> movesNames = new ArrayList<>();
        while (isContains) {
            for (Move option : moves) {
                movesNames.add(option.getName());
            }
            if (!movesNames.contains(move)){
                move = chooseMoveAgain();
            } else {
                isContains = false;
            }
        }

        Player player1 = new Player("Human", move);
        Player player2 = new Player("Robot", moves.get(random.nextInt(moves.size())).getName());

        System.out.println("Player 1 chose : " + player1.getMove());
        System.out.println("Player 2 chose : " + player2.getMove());

        DecisionMaker decisionMaker = new DecisionMaker();
        Player winner = decisionMaker.compare(player1, player2);

        if (winner.getName().equals("Human")){
            System.out.println(player1.getName() + " Player win!");
        }else  {
            System.out.println(player2.getName() + " Player win!");
        }

    }

    public String chooseMoveAgain() {
        System.out.println("These are options : \"rock\", \"paper\", \"scissors\", \"lizard\", \"spock\"");
        System.out.println("Choose one! :");
        return scanner.nextLine();

    }

    public String chooseAgainMoveForHuman() {
        System.out.println("These are options : \"rock\", \"paper\", \"scissors\", \"lizard\", \"spock\"");
        System.out.println("Choose one! :");
        String move = scanner.nextLine();
        System.out.println("Player 1 chose : " + move);
        return move;
    }

    public String chooseAgainMoveRandom() {
        String move = moves.get(random.nextInt(moves.size())).getName();
        System.out.println("Player 1 chose : " + move);
        return move;
    }
}
