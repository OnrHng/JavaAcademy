package academy.everyonecodes.java.week3.reflection;

import java.util.List;

public class DoubleListSumCalculator {
    public static double calculate(List<Double> doubleList) {
        double sum = 0.0;
        for (double num : doubleList) {
            sum += num;
        }
        return sum;
    }

}
