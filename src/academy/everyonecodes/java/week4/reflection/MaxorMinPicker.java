package academy.everyonecodes.java.week4.reflection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MaxorMinPicker {
    public static int pick(List<Integer> integers) {
        Random random = new Random();// create Random to get random num

        if (integers.size() < 1) { // if list of integers is empty, return just random int
            return random.nextInt();
        }

        // craft an Array list to sort list of integers
        List<Integer> integersCopy = new ArrayList<>(integers);
        Collections.sort(integersCopy);

        // craft a List of Min or Max value to add into.
        List<Integer> minAndMaxList = new ArrayList<>();
        minAndMaxList.add(integersCopy.get(0)); // add smallest value into minMaxList
        minAndMaxList.add(integersCopy.get(integersCopy.size() - 1)); // add biggest value into minMaxList

        // first get random index number between 0 to size of minMaxList, and then
        // get the element in this index of the list and return it
        return minAndMaxList.get(random.nextInt(minAndMaxList.size()));

    }
}
