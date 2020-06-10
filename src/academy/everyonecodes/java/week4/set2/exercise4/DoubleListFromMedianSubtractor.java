package academy.everyonecodes.java.week4.set2.exercise4;

import academy.everyonecodes.java.week4.set2.exercise3.DoubleListMedianCalculator;

import java.util.ArrayList;
import java.util.List;

public class DoubleListFromMedianSubtractor {
    public static List<Double> calculate(List<Double> doubleList) {
        // get the median using Double list Median Calculator class
        double median = DoubleListMedianCalculator.calculate(doubleList);
        // create a new arraylist to add difference between median and value from original list
        List<Double> newDoubleList = new ArrayList<>();

        // for each element in the original list, get difference and add into array list
        for (double number: doubleList) {
            newDoubleList.add(number - median);
        }
        return newDoubleList; // return new double list
    }
}
