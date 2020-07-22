package academy.everyonecodes.java.evaluation2a.exercise2;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeParserTest {
    EmployeeParser parser = new EmployeeParser();

    @Test
    void parseLine() {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Path.of("src/academy/everyonecodes/java/evaluation2a/exercise2/salary.csv"));
            lines.remove(0);
        } catch (IOException e) {
            System.out.println("Something goes wrong");
            e.printStackTrace();
        }
        Employee resultEmployee = parser.parseLine(lines.get(0));
        Employee expected = new Employee("SE", "Peter", 2000);

        assertEquals(expected, resultEmployee);

        // also
        Employee resultEmployee2 = parser.parseLine(lines.get(2));
        Employee expected2 = new Employee("HR", "Kevin", 1600);

        assertEquals(expected2, resultEmployee2);

    }
}