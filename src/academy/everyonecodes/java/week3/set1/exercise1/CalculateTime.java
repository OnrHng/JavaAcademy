package academy.everyonecodes.java.week3.set1.exercise1;

import java.util.Scanner;

public class CalculateTime {
    public static double calculateWalkingTime(double distanceAsKm){

        return distanceAsKm * 15;
    }
    public static double calculateTramTime(int numbersOfStation) {

        return numbersOfStation * 4;

    }
    public static double calculateTotalTime(double distanceToStation, double distanceFromStationToHome, int numbersOfStations) {

        double minToStation = calculateWalkingTime(distanceToStation);
        double minFromStationToHome = calculateWalkingTime(distanceFromStationToHome);
        double minTramTime = calculateTramTime(numbersOfStations);

        return minFromStationToHome + minToStation + minTramTime;
    }

    /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter distance from your home to Tram Station as Km : ");
        double distanceToStation = scanner.nextDouble();
        System.out.println("Enter number of the Tram stations : ");
        int numbersOfStation = scanner.nextInt();
        System.out.println("Enter distance from Tram station to your friends Home as Km : ");
        double distanceToFriendHome = scanner.nextDouble();

        System.out.println("Total time to go to your friend home is : "
                            + calculateTotalTime(distanceToStation, distanceToFriendHome, numbersOfStation) + " minutes"
                            );

    } */
}
