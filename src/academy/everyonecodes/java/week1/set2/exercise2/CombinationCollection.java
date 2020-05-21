package academy.everyonecodes.java.week1.set2.exercise2;

import java.util.ArrayList;

public class CombinationCollection {
    public static void main(String[] args) {
        String[] arr1 = {"one", "three", "five", "seven"};
        String[] arr2 = {"two", "four","six"};
        String[] result = combine(arr1, arr2);
        for (String element : result) {
            System.out.println(element);
        }
    }
    public static int getSmaller(String[] arr1, String[] arr2){
        return Math.min(arr1.length, arr2.length);
    }
    public static String[] combine(String[] arr1, String[] arr2){
        ArrayList<String> newArr = new ArrayList<>(); // Create an ArrayList object
        int i = 0;
        int smallOne = getSmaller(arr1, arr2); // get smaller array size
        // Put the elements as many as the number of the small array in the new array.
        while (i != smallOne){
            newArr.add(arr1[i]);
            newArr.add(arr2[i]);
            i++;
        }
        // With the IF statement check and put the remaining elements of the large array in the new array.
        if (arr2.length > i) {
            while (i < arr2.length) {
                newArr.add(arr2[i]);
                i++;
            }
        }else {
                while(i < arr1.length){
                    newArr.add(arr1[i]);
                    i++;
            }
        }
        // toArray return Object[] instead of String[] and again need to convert String[]
        return newArr.toArray(new String[0]);
    }
}
