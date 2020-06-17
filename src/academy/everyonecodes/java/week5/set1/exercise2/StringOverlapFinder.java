package academy.everyonecodes.java.week5.set1.exercise2;

import java.util.Optional;

public class StringOverlapFinder {
    public Optional<String> find(String text1, String text2) {
        String text1LowerCase = text1.toLowerCase();
        String text2LowerCase = text2.toLowerCase();
        if (text1LowerCase.equals("") || text2LowerCase.equals("")) {
            return Optional.empty();
        }
        for (int i = text2LowerCase.length(); i > 0; i--) {
            String overlapPart  = text2LowerCase.substring(0, i);
            if (text1LowerCase.contains(overlapPart)) {
                return Optional.of(overlapPart);
            }
        }
        return Optional.empty();
    }
}
