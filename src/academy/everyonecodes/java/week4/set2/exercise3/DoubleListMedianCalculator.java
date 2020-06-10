package academy.everyonecodes.java.week4.set2.exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoubleListMedianCalculator {
    public static double calculate(List<Double> doubleList) {
        List<Double> doubleListCopy = new ArrayList<>(doubleList);
        Collections.sort(doubleListCopy);
        if(doubleListCopy.size() >= 1) {

            if (doubleListCopy.size() % 2 == 1) {
                return doubleListCopy.get(doubleListCopy.size() / 2);
            }

            double firstMiddle = doubleListCopy.get(doubleListCopy.size()/ 2 -1 );
            double secondMiddle = doubleListCopy.get(doubleListCopy.size()/ 2);
            return (firstMiddle + secondMiddle) / 2;
        }
        return 0.0;
    }
}
