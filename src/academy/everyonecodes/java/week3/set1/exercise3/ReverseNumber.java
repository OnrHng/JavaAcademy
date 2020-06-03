package academy.everyonecodes.java.week3.set1.exercise3;


public class ReverseNumber {
    public static int[] reverseNumber(int[] numbers) {
        for(int i = 0; i < numbers.length / 2; i++)
        {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        return numbers;
    }

    /* public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(reverseNumber(numbers)));
    } */
}
