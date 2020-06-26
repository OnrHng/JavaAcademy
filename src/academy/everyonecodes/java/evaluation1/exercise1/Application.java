package academy.everyonecodes.java.evaluation1.exercise1;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int firstNum = scanner.nextInt();

        System.out.println("Enter second Number:");
        int secondNum = scanner.nextInt();

        System.out.println("Enter third Number:");
        int thirdNum = scanner.nextInt();

        int highest = Helper.highest(firstNum, secondNum, thirdNum);
        System.out.println("The highest num is " + highest);
    }
}
