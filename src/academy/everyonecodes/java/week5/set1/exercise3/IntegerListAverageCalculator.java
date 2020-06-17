package academy.everyonecodes.java.week5.set1.exercise3;

import java.util.List;
import java.util.Optional;

public class IntegerListAverageCalculator {

    public Optional<Double> calculateAverage(List<Integer> integerList) {
        if (integerList.size() < 1) return Optional.empty();
        int sum = 0;
        for (Integer num : integerList){
            sum += num;
        }
        double avg = (double) sum / integerList.size();
        return Optional.of(avg);
    }
}
