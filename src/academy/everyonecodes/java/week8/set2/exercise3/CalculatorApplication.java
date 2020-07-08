package academy.everyonecodes.java.week8.set2.exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the operation: ");
        String operation = scanner.nextLine();

        operation = operation.trim(); //remove all spaces at the begin and end
        //Replace all the consecutive white  spaces with a single space
        operation = operation.replaceAll(" +", " ");
        String[] operationArr = operation.split(" ");

        Calculator calculator = new Calculator();

        try {
            double number1 = Double.parseDouble(operationArr[0]);
            String symbol = operationArr[1];
            double number2 = Double.parseDouble(operationArr[2]);

            Calculation calculation = new Calculation(symbol, number1, number2);
            String solution = calculator.calculate(calculation);
            System.out.println("Solution : " + solution);

        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Something goes wrong, maybe Formats are  unexpected!");
        }
    }
}
