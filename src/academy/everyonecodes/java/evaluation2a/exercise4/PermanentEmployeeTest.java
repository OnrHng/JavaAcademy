package academy.everyonecodes.java.evaluation2a.exercise4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermanentEmployeeTest {

    @Test
    void getSalary() {
        PermanentEmployee permanentEmployee = new PermanentEmployee("Kevin", 1990.90);
        assertEquals(1990.90, permanentEmployee.getSalary());
    }
}