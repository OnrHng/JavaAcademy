package academy.everyonecodes.java.week5.set1.exercise4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class DoubleListMaximumFinder {
    public Optional<Double> find(List<Double> doubleList) {
       if (doubleList.size() < 1) return Optional.empty();
       List<Double> doubleListCopy = new ArrayList<>(doubleList);

       Collections.sort(doubleListCopy);

       return Optional.of(doubleListCopy.get(doubleListCopy.size() - 1));
    }
}
