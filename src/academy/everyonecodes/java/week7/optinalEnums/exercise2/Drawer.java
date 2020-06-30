package academy.everyonecodes.java.week7.optinalEnums.exercise2;

import java.time.DayOfWeek;
import java.time.Month;

public class Drawer {
    public Outfit getOutfitForToday(Month month, DayOfWeek day){
        Outfit outfit = new Outfit();
        outfit.headpiece = rightHeadpiece(month);
        outfit.sock = rightSock(day);
        return outfit;

    }

    private Headpiece rightHeadpiece(Month month){
        if (month.getValue() >= 3 && month.getValue() <= 10) {
            return Headpiece.HAT;
        }else {
            return Headpiece.BEANIE;
        }
    }

    private Socks rightSock(DayOfWeek day) {
        if (day.getValue() == 1) {
            return Socks.REDSOCKS;
        } else if (day.getValue() > 1 && day.getValue() < 6) {
            return Socks.YELLOWSOCKS;
        }else {
            return Socks.GREENSOCKS;
        }
    }
}
