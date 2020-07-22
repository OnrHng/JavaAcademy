package academy.everyonecodes.java.evaluation2a.exercise2;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Top3SalaryTest {
    Top3Salary top3Salary = new Top3Salary();
    EmployeeParser parser = new EmployeeParser();

    @Test
    void find() {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Path.of("src/academy/everyonecodes/java/evaluation2a/exercise2/salary.csv"));
            lines.remove(0);
        } catch (IOException e) {
            System.out.println("Something goes wrong");
            e.printStackTrace();
        }

        List<Employee> employeeList = new ArrayList<>();
        for (String line : lines) {
            Employee employee = parser.parseLine(line);
            employeeList.add(employee);
        }

        List<Employee> top3salaryEmployees = top3Salary.find(employeeList);
        List<Employee> expected = List.of(new Employee("PM","Karin", 3000),
                new Employee("PM","Mike", 2600),
                new Employee("SE","Franz", 2500));
        assertEquals(expected, top3salaryEmployees);
    }


}