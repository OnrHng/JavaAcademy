package academy.everyonecodes.java.week7.optinalEnums.exercise2;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class DrawerTest {

    Drawer drawer = new Drawer();
    MonthlyCalendar monthlyCalendar = new MonthlyCalendar();
    WeeklyCalendar weeklyCalendar = new WeeklyCalendar();

    @Test
    void getOutfitForToday() {

//      Month month = monthlyCalendar.askForMonth() ;
//      DayOfWeek day = weeklyCalendar.askForDayOfWeek();

        Outfit outfit = drawer.getOutfitForToday(Month.of(6), DayOfWeek.of(2) );

        Outfit expectedOutfit = new Outfit();
        expectedOutfit.sock = Socks.YELLOWSOCKS;
        expectedOutfit.headpiece = Headpiece.HAT;

        assertEquals(expectedOutfit.headpiece, outfit.headpiece);

    }
}