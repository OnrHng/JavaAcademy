package academy.everyonecodes.java.week7.optinalEnums.exercise2;

import java.time.DayOfWeek;
import java.time.Month;

public class Application {

    public static void main(String[] args) {
        MonthlyCalendar monthlyCalendar = new MonthlyCalendar();
        WeeklyCalendar weeklyCalendar = new WeeklyCalendar();
        Drawer drawer = new Drawer();
        Mirror mirror = new Mirror();

        Month month = monthlyCalendar.askForMonth() ;
        DayOfWeek day = weeklyCalendar.askForDayOfWeek();

        Outfit outfit = drawer.getOutfitForToday(month, day);
        mirror.sayHowItLooks(month, day, outfit);
    }
}
