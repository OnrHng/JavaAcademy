package academy.everyonecodes.java.evaluation1.exercise1;

public class Helper {

    public static int highest(int num1, int num2, int num3) {
        int highest = Math.max(num1, num2); // if the both num is equals, returns one of them
        highest = Math.max(highest, num3);
        return highest;
    }
}
