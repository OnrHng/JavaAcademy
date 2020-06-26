package academy.everyonecodes.java.evaluation1.exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ArraysMatrix {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("How many rows?");
        int rows = scan.nextInt();
        System.out.println("How many cols?");
        int cols = scan.nextInt();
        Integer[][] field = new Integer[rows][cols]; // create a new matrix array with values

        for (int i = 0; i < rows; i++) {
            // loop for columns
            for (int j = 0; j < cols; j++) {
                int randomNum = random.nextInt(9);
                field[i][j] = randomNum;
                System.out.print(field[i][j]);
                if (j != cols -1) { // dont write " | " char if there is end of line
                    System.out.print(" | ");
                }
            }
            System.out.println(); // for new line
        }
        List<Integer> vectors = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += field[i][j];
            }
            vectors.add(sum);
            sum = 0; //clear sum
        }
        System.out.println("The sum vectors : " + vectors);

    }
}
