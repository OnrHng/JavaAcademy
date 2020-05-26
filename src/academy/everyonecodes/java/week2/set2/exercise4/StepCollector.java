package academy.everyonecodes.java.week2.set2.exercise4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StepCollector {
    public List<Integer> collect() {
        List<Integer> stepList = new ArrayList<>();
        List<String> friends;
        friends = List.of("Matilda", "Hansel", "Derek");
        for (int i = 0; i < 3; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Heyy! " + friends.get(i) + " Tell me number of your steps: ");
            int steps = scan.nextInt();
            stepList.add(steps);
        }
        return stepList;
    }
}
