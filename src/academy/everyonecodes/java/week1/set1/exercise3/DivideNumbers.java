package academy.everyonecodes.java.week1.set1.exercise3;

public class DivideNumbers {
    public static double divideNums(double num1, double num2){
        return num1 / num2;
    }

    public static void main(String[] args) {
        System.out.println("The quotient is : " + divideNums(40.5 , 10.05));
        System.out.println("The quotient is by 0 : " + divideNums(3.0 , 0));

    }
}
