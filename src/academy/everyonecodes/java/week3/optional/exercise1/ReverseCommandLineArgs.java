package academy.everyonecodes.java.week3.optional.exercise1;

public class ReverseCommandLineArgs {
    public static void main(String[] args) {

        for (int i = args.length - 1; i >= 0; i--){ // print all args in reverse order
            System.out.println(args[i]);
        }
    }
}
