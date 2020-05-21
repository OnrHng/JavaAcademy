package academy.everyonecodes.java.week1.set2.exercise3;

public class SmallestBiggest {
    public static void main(String[] args) {
        int[] arr = {-1, 4, 3, 0, 5, 2, 10, -9, 6};
        System.out.println("Biggest number in the Array is : " + getBiggest(arr));
        System.out.println("Smallest number in the Array is : " + getSmallest(arr));
    }
    public static boolean isBigger(int num1, int num2) { return num1 > num2; }
    public static boolean isSmallest(int num1, int num2) { return num1 < num2; }
    public static int getBiggest(int[] arr){
        int biggest = arr[0];
        int i = 0;
        while(i < arr.length) {
            if (isBigger(biggest, arr[i])){
                biggest = arr[i];
            }
            i++;
        }
        return biggest;
    }
    public static int getSmallest(int[] arr){
        int smallest = arr[0];
        int i = 0;
        while(i < arr.length) {
            if (isSmallest(smallest, arr[i])){
                smallest = arr[i];
            }
            i++;
        }
        return smallest;
    }
}
