package academy.everyonecodes.java.week2.set2.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HikerGatherer {
    public List<Hiker> gather(){
        List<Hiker> hikerList = new ArrayList<>(); //create new List of Hiker
        Scanner scan = new Scanner(System.in);
        System.out.println("-- Hiking Day -- \n What is the hiker name?");
        String name = scan.nextLine();
        if (name.equals(" ") || name.equals("")) { // if first name is empty String or nothing
            System.out.println("You didn't write your name");
        }
        while (!name.equals(" ") && !name.equals("")) {
            System.out.println("What is hiker phone number?");
            String phoneNumber = scan.nextLine();
            //scan.nextLine();
            Hiker hiker = new Hiker(name, phoneNumber); // create new Hiker to adding into List of Hiker
            hikerList.add(hiker);
            System.out.println("What is the next hiker name?");
            name = scan.nextLine();
        }
        return hikerList; // return List of Hiker
    }
}
