package academy.everyonecodes.java.week3.optional.exercise2;

import java.util.Scanner;

public class TicTacToe {

    public static Scanner scan = new Scanner(System.in);

    private static String[][] getEmptyGameField(){  // creata new empty 3x3 matrix array
        return new String[3][3];
    }

    // design empty game field for interface
    private static void printEmptyGameField(String[][] gameField){
        // loop for rows
        for (int i = 0; i < 3; i++) {
            // loop for columns
            for (int j = 0; j < 3; j++) {
                System.out.print("[ ");
                gameField[i][j] = " ";
                System.out.print(gameField[i][j] + " ] ");
            }
            System.out.println(); // for new line
        }
    }

    private static void printGameField(String[][] gameField){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[ ");
                System.out.print(gameField[i][j] + " ] ");
            }
            System.out.println(); // for new line
        }
    }

    // check game field is full
    public static boolean isGameFieldFull(String[][] gameField) {
        boolean isFull = true; // first case is game field full

        // check each row and column if there is not X or O
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!gameField[i][j].equals("X") || !gameField[i][j].equals("O")) {
                    isFull = false;
                }
            }
        }
        return isFull;
    }

    // find winner if there is or not
    public static boolean checkWinner(String[][] gameField) {

        boolean forRowWin = false; // first case is false
        //Loop through rows and see if any are winners
        for (int j = 0; j < 3; j++) {
            if (checkRowAndCol(gameField[j][0], gameField[j][1], gameField[j][2])) {
                forRowWin = true; // in the same Row all three String is same then return true
            }
        }

        boolean forColWin = false; // first case is false
        //Loop through columns and see if any are winners
        for (int j = 0; j < 3; j++) {
            if (checkRowAndCol(gameField[0][j], gameField[1][j], gameField[2][j])) {
                forColWin = true; // in the same Column all three String is same then return true
            }
        }

        boolean forDiagonalWin = false; // first case is false
        // check the two diagonals to if there is a winners
        if (checkRowAndCol(gameField[0][0], gameField[1][1], gameField[2][2])) {
            forDiagonalWin = true;
        }

        return (forColWin || forRowWin || forDiagonalWin);
    }

    public static boolean checkRowAndCol(String ch1, String ch2, String ch3) {
        return (!ch1.equals(" ") && !ch2.equals(" ") && !ch3.equals(" ")) && (ch1.equals(ch2)) && (ch2.equals(ch3));
        //
    }

    //get the Name of first player.
    public static String getFirstPlayerName() {
        System.out.println("HI FIRST PLAYER!, What is your name?");
        return scan.nextLine();
    }

    public static String getPlayerSymbol() {
        String playerSymbol = scan.nextLine();
        playerSymbol = playerSymbol.toUpperCase(); // convert always uppercase Symbol of Player
        return playerSymbol;
    }

    // change player method  and get second player name
    public static String changePlayer() {
        System.out.println("HI SECOND PLAYER!, What is your name?");
        return scan.nextLine();
    }

    private static String[][] playOneRound(String[][] gameField, String playerName, String playerSymbol) {

        // get the row line and column line from the player where he/she wants to put his symbol
        System.out.println(playerName + " Tell me What is your next move position. Which Row?");
        int moveRow = scan.nextInt();
        System.out.println(playerName + " Tell me What is your next move position. Which Column?");
        int moveColumn = scan.nextInt();

        // game field matrix is 3x3 if the row or column values greater then 3 and also smaller then 1, show the message
        if ((moveRow > 3 || moveRow < 1) || (moveColumn > 3 || moveColumn < 1)) {
            System.out.println("We have just small game field. There please enter 1,2 or 3");
        }

        // in prog. lines start with 0 , therefore minus one for human readable
        gameField[moveRow-1][moveColumn-1] = playerSymbol; // initialize the player's symbol in the specified location
        return gameField;
    }

    public static void play(){

        String[][] emptyGameField = getEmptyGameField(); // create new empty game field and print it for start interface
        printEmptyGameField(emptyGameField);

        String[][] gameField; // define game field

        // first player information
        String playerName = getFirstPlayerName(); // get the first player name
        System.out.println(playerName + " Lets Start!. What is your symbol? O or X");
        String playerSymbol = getPlayerSymbol(); // get the player symbol

        // second player information
        String secondPlayer = changePlayer();
        // first player has already choose own symbol, then second player should get other one.
        String secondPlayerSymbol;
        if ( playerSymbol.equals("X") ){
            secondPlayerSymbol = "O";
        } else {
            secondPlayerSymbol = "X";
        }

        // play the game by replacing the player in order
        String whoIsNext = playerName;
        String currSymbol = playerSymbol;

        for (int i = 0; i < 9; i++) {
            if (whoIsNext.equals(playerName)) {
                // each player play one round
                gameField = playOneRound(emptyGameField, whoIsNext, currSymbol);
                printGameField(gameField);
                whoIsNext = secondPlayer;
                currSymbol = secondPlayerSymbol;
            } else {
                // each player play one round
                gameField = playOneRound(emptyGameField, whoIsNext, currSymbol);
                printGameField(gameField);
                whoIsNext = playerName;
                currSymbol = playerSymbol;
            }

            // if there is a Winner, break loops and congrats winner!
            if (checkWinner(gameField)){
                System.out.println("We have WINNER! CONGRATS " + playerName);
                break;
            }
            if ( isGameFieldFull(gameField) ) { // if game field is full, break loop
                break;
            }
        }
    }
}
