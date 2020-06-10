package academy.everyonecodes.java.week4.set2.exercise1;

public class MoveTitleFormatter {
    public static String format(String movieTitle) {
        if (movieTitle.length() < 1){
            return "";
        }
        return movieTitle.toUpperCase();
    }
}
