package academy.everyonecodes.java.week1.set2.exercise2;

public class CombinationCollection {
    public static void main(String[] args) {
        String[] arr1 = {"one", "three", "five"};
        String[] arr2 = {"two", "four","six"};
        String[] result = combine(arr1, arr2);
        for (String element : result) {
            System.out.println(element);
        }
    }
    public static String[] combine(String[] arr1, String[] arr2){

        String newArr[] = new String[arr1.length + arr2.length];
        int i = 0;
        while (i < arr1.length){
            newArr[i] = arr1[i];
            newArr[i] = arr2[i];
            i++;
        }
        
        return newArr;
    }
}
