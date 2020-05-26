package academy.everyonecodes.java.week2.set2.exercise4;

import java.util.List;

public class AverageCalculator {
    public double calculateAVG(List<Integer> amount) {
        int sum = 0;
        for (Integer steps : amount){
            sum += steps;
        }
        return sum / amount.size();
    }
}
