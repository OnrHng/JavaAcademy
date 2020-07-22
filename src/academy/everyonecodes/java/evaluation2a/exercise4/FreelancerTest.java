package academy.everyonecodes.java.evaluation2a.exercise4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreelancerTest {

    @Test
    void getSalary() {
        Freelancer freelancer = new Freelancer("Sue", 20.5, 100);
        assertEquals(2050, freelancer.getSalary());
    }
}