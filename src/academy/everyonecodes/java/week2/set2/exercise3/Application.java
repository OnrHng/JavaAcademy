package academy.everyonecodes.java.week2.set2.exercise3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        HikerGatherer hikerGather = new HikerGatherer(); // create new Hiker Gather to collect Hiker

        // ask Hiker which date would like to join Hike
        System.out.println("What date would you like to join to Hike? Enter the date format as dd.mm.yyyy .");
        Scanner scan = new Scanner(System.in);
        String date = scan.nextLine();
        if (date.equals(" ") || date.equals("")) { // if date is empty String or nothing
            System.out.println("You didn't choose date");
        }

        Hike hike = new Hike(date, hikerGather.gather()); // create new Hike and collect Hiker
        HikeDisplay displayHike = new HikeDisplay();
        displayHike.display(hike);
    }
}
