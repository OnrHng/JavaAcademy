package academy.everyonecodes.java.week6.exercise2;

public class VowelCounter {
    public int count(String input) {
        input = input.toLowerCase();
        String[] inputArr = input.split("");
        int count = 0;
        for (String ch : inputArr) {
            if (ch.equals("a") || ch.equals("e")|| ch.equals("i") ||ch.equals("o") ||ch.equals("u")){
                count++;
            }
        }
        return count;
    }
}
