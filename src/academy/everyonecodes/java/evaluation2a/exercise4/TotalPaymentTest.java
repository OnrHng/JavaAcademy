package academy.everyonecodes.java.evaluation2a.exercise4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TotalPaymentTest {

    TotalPayment totalPayment = new TotalPayment();

    @Test
    void calculate() {
        List<Person> emplooyees = new ArrayList<>();
        Person permanentEmployee1 = new PermanentEmployee("Derek", 2100);
        Person permanentEmployee2 = new PermanentEmployee("Hansel", 1990.50);
        Person permanentEmployee3 = new PermanentEmployee("Matilda", 2000.10);

        Person freelancer1 = new Freelancer("John", 15.5, 100);
        Person freelancer2 = new Freelancer("Sally", 20, 50);
        Person freelancer3 = new Freelancer("David", 30, 20);

        emplooyees.add(permanentEmployee1);
        emplooyees.add(permanentEmployee2);
        emplooyees.add(permanentEmployee3);
        emplooyees.add(freelancer1);
        emplooyees.add(freelancer2);
        emplooyees.add(freelancer3);

        assertEquals(9240.60, totalPayment.calculate(emplooyees));

    }
}