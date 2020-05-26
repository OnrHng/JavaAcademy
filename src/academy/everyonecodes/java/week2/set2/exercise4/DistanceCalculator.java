package academy.everyonecodes.java.week2.set2.exercise4;

import java.util.List;

public class DistanceCalculator {
    public double calculateDistance(List<Integer> stepsList) {
        int sum = 0;
        for (int step : stepsList) {
            sum += step;
        }
        return sum * 0.000762;
    }
}
