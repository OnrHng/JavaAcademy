package academy.everyonecodes.java.week8.optional.exercise2;

import java.util.*;

public class BasicDictionary {

    private List<String> knowWords;

    public BasicDictionary() {
        this.knowWords = List.of("hi", "house", "dog", "cat", "table", "chair", "elephant");
    }

    public List<String> getKnowWords() {
        return knowWords;
    }

    public Set<String> findUnknownWords (String input) {
        // convert lowercase and at the begin and end remove spaces
        input = input.toLowerCase().trim();

        //input is empty , return empty SET
        if (input.isEmpty()) {
            return new HashSet<>(Collections.emptySet());
        }


        Set<String> inputSet = new HashSet<>(Arrays.asList(input.split(" ")));

        Set<String> knowWords = new HashSet<>(getKnowWords());
        inputSet.removeAll(knowWords); // remove same words
        return inputSet;
    }
}
