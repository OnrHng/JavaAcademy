package academy.everyonecodes.java.week6.exercise2;

import java.util.Optional;

public class FirstVowelFinder {
    public String find(String input) {
        input = input.toLowerCase();
        String[] inputArr = input.split("");
        for (String ch : inputArr) {
            if (ch.equals("a") || ch.equals("e")|| ch.equals("i") ||ch.equals("o") ||ch.equals("u")){
                return ch;
            }
        }
        return "";
    }
}
