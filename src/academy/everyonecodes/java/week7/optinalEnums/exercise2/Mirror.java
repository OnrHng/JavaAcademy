package academy.everyonecodes.java.week7.optinalEnums.exercise2;

import java.time.DayOfWeek;
import java.time.Month;

public class Mirror {
    public void sayHowItLooks(Month month, DayOfWeek day, Outfit outfit) {
        System.out.println("On a " + day + " in " + month +
                            " Hansel is wearing a " + outfit.getDescription());
    }
}
