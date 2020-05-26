package academy.everyonecodes.java.week2.set2.exercise4;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        // create instance distance calculator, steps collector and average
        DistanceCalculator distance = new DistanceCalculator();
        StepCollector steps = new StepCollector();
        AverageCalculator avg = new AverageCalculator();

        //crate List of Integer using steps collector
        List<Integer> stepList = steps.collect();


        System.out.println("Total Distance as KM : " + distance.calculateDistance(stepList));
        System.out.println("Average of Distance as KM : " + (avg.calculateAVG(stepList) * 0.000762));
        System.out.println("Average of Total Steps : " + avg.calculateAVG(stepList));
    }
}
