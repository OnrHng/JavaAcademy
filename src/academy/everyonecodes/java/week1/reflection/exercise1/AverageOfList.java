package academy.everyonecodes.java.week1.reflection.exercise1;

public class AverageOfList {
    public static void main(String[] args) {
        int[] arr = {-5, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Average of List is : " + getAverage(arr));
    }
    public static double getAverage(int[] arr){
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (double) sum / arr.length;
    }
}
