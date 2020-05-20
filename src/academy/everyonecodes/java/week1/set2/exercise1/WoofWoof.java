package academy.everyonecodes.java.week1.set2.exercise1;

import java.util.Scanner;

public class WoofWoof {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Woof food do I get today? -> : ");
        int foodType= sc.nextInt();
        if (foodType == 0 || foodType == 1){
            int jump = calculateJump(foodType);
            int bark = calculateBarks(foodType);
            System.out.println("I will jump " + jump + " times and bark "+ bark + " times!");
        }else{
            System.out.println("you have to give just 0 or 1 ");
        }

    }
    public static int calculateJump(int foodType){
        return 6 * foodType;
    }
    public static int calculateBarks(int foodType){
        return 1 + foodType;
    }
}
