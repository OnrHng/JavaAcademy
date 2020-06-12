package academy.everyonecodes.java.week4.reflection;

public class BeforeDashExtractor {
    public static String extract(String text) {
        //if there is a '-', return index of '-', otherwise return -1
        int indexDash = text.indexOf("-");

        // if indexDash is -1 , return empty String , otherwise split text and return the first element
        return (indexDash == - 1) ? "" : text.split("-")[0];
    }
}
