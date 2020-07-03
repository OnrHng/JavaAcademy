package academy.everyonecodes.java.week7.reflection.exercise1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StudentPerformanceReader {
    public List<StudentPerformance> read() {

        StudentPerformanceParser parser = new StudentPerformanceParser();
        List<StudentPerformance> studentPerformanceList = new ArrayList<>();
        List<String> lines = new ArrayList<>();

        Path path = Path.of("src/academy/everyonecodes/java/week7/reflection/exercise1/students-performance.csv");
        try {
            lines = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        lines.remove(0);// first line remove

        for (String line : lines) {
            StudentPerformance studentPerformance = parser.parseLine(line);
            studentPerformanceList.add(studentPerformance);
        }

        return studentPerformanceList;
    }

}
