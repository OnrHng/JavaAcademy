package academy.everyonecodes.java.week7.optinalEnums.exercise2;

import java.time.Month;
import java.util.Scanner;

public class MonthlyCalendar {

    public Month askForMonth() {
        System.out.println("What month is it?");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        return Month.of(month);
    }

    public static void main(String[] args) {
        MonthlyCalendar m = new MonthlyCalendar();
        System.out.println(m.askForMonth());
    }
}
