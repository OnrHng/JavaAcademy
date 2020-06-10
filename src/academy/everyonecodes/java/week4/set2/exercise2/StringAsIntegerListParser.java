package academy.everyonecodes.java.week4.set2.exercise2;

import java.util.ArrayList;
import java.util.List;

public class StringAsIntegerListParser {
    public static List<Integer> parse(String text) {
        // split the text
        String[] textList = text.split(";");
        List<Integer> integerListFromText = new ArrayList<>(); // create Arr List to add numbers

        if(text.length() < 1){
            return integerListFromText; // if text is nothing, return empty integer List
        }

        for( String element : textList){
            int num = Integer.parseInt(element);// convert text to number
            integerListFromText.add(num);
        }
        return integerListFromText;
    }
}
