package academy.everyonecodes.java.week4.set1.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringListSecondHalfPicker {
    public static String pick(List<String> stringList) {
        // create new Array list to add into it half of first Strings
        List<String> halfOfStringList = new ArrayList<>();

        // size of stringList that given as a parameter is smaller then 1, return empty string
        if (stringList.size() < 1) {
            return "";
        }

        // get the element that is in the middle if list size are odd number
        for (int i = stringList.size()/2 ; i < stringList.size() ; i++) {
            halfOfStringList.add(stringList.get(i));
            System.out.println(stringList.get(i));
        }

        // if first string list size is smaller then 1 , exactly half of string list has not an element.
        // and return just empty string
        if (halfOfStringList.size() < 1) {
            return "";
        }

        Random random = new Random(); // create random object
        int randomIndex = random.nextInt(halfOfStringList.size()); // get the random index

        //return random String from the first half Of String Lists
        return halfOfStringList.get(randomIndex);
    }
}
