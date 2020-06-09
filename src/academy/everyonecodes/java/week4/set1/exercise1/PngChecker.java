package academy.everyonecodes.java.week4.set1.exercise1;

public class PngChecker {
    public static boolean check(String fileName) {
        return fileName.length() > 4 && fileName.substring(fileName.length()-4).toLowerCase().equals(".png");
    }
}
