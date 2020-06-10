package academy.everyonecodes.java.week4.set2.exercise2;

import java.util.List;

public class LineSumCalculator {
    public static int calculate(String text) {
        // use StringAsIntegerListParser class to get an integer list from text
        List<Integer> integerListFromText = StringAsIntegerListParser.parse(text);
        int sum = 0;
        for(int num : integerListFromText){
            sum += num;
        }
        return sum;
    }
}
