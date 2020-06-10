package academy.everyonecodes.java.week4.set2.exercise1;

public class StringCapitalizer {
    public static String capitalize(String text) {
        if (text.length() < 1) {
            return "";
        }
        return text.substring(0,1).toUpperCase() + text.substring(1);
    }
}
