package academy.everyonecodes.java.week9.set2.exercise1.units;

import academy.everyonecodes.java.week9.set2.exercise1.MoneyUnit;

import java.util.List;

public class Units {

    public static List<MoneyUnit> get() {
        return List.of(new Euro(200), new Euro(100), new Euro(50), new Euro(20), new Euro(10), new Euro(5), new Euro(2), new Euro(1),
                new Cent(50), new Cent(20), new Cent(10), new Cent(5), new Cent(2), new Cent(1));
    }
}
