package academy.everyonecodes.java.week1.reflection.exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> newArr = new ArrayList<>(); // Create an ArrayList object
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.println("Enter a number : ");
        int number= sc.nextInt();
        if (number == 0) { //if first number is 0
            System.out.println("You entered 0 and program is ended... :(");
        }
        while (number != 0) {
            newArr.add(number);
            System.out.println("Enter a number : ");
            number = sc.nextInt();
        }
        for (int i = 0; i < newArr.size(); i++) {
            System.out.println(newArr.get(newArr.size() - i - 1));
        }
    }
}
