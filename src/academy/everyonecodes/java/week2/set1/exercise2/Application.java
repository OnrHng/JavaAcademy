package academy.everyonecodes.java.week2.set1.exercise2;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tell me your car's color: ");
        String color = scanner.nextLine();
        System.out.print("Tell me which year your car is builted: ");
        int yearBuilt = scanner.nextInt();

        Car car = new Car(color , yearBuilt);
        System.out.println("Your car is " + color + " color and on " + yearBuilt + " year is builted");
    }
}
