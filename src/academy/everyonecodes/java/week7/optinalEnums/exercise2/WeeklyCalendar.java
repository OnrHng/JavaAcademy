package academy.everyonecodes.java.week7.optinalEnums.exercise2;

import java.time.DayOfWeek;
import java.util.Scanner;

public class WeeklyCalendar {
    public DayOfWeek askForDayOfWeek() {
        System.out.println("What day of the week is it?");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        return DayOfWeek.of(day);

    }
}
