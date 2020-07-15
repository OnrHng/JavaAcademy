package academy.everyonecodes.java.week9.set2.exercise3;

import academy.everyonecodes.java.week9.set2.exercise2.RockScissorsPaperGame;

import java.util.Scanner;

public class RockScissorsPaperLizardSpockApplication {

    public static void main(String[] args) {
        System.out.println("Let’s play rock, paper, scissors, lizard, spock!");

        RockScissorsPaperGame game = new RockScissorsPaperGame();
        game.play();

        boolean wantToPlayAgain = true;
        while (wantToPlayAgain) {
            System.out.println("Do you want to play again? (yes/no) ");
            Scanner scanner = new Scanner(System.in);
            String answer =  scanner.nextLine();
            if (answer.toLowerCase().equals("yes")) {
                game.play();
            } else if (answer.toLowerCase().equals("no")){
                wantToPlayAgain = false;
            }
        }
    }
}
