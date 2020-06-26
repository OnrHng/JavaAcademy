package academy.everyonecodes.java.evaluation1.exercise3;

import java.util.ArrayList;
import java.util.List;

public class IntegerListToStringListConverter {
    public List<String> convert(List<Integer> integerList) {
        // craft string list to add after converted the integer value
        List<String> stringList = new ArrayList<>();

        for (Integer integerNum : integerList) {
            stringList.add(String.valueOf(integerNum));//convert int value to string and then add it.
        }
        return stringList;
    }
}
