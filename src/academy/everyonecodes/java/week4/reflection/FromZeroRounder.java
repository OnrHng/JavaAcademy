package academy.everyonecodes.java.week4.reflection;

public class FromZeroRounder {

    public static double round(double doubleNum) {
        return (doubleNum > 0) ? Math.ceil(doubleNum) : Math.floor(doubleNum);
    }
}
