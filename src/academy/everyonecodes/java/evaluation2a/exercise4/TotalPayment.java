package academy.everyonecodes.java.evaluation2a.exercise4;

import java.util.List;

public class TotalPayment {

    public double calculate(List<Person> personList) {
        double totalPayment = 0.0;
        for (Person person : personList) {
            totalPayment += person.getSalary();
        }
        return totalPayment;
    }

}
