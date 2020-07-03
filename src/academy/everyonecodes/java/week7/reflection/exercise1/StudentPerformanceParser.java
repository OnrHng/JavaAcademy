package academy.everyonecodes.java.week7.reflection.exercise1;

public class StudentPerformanceParser {
    public StudentPerformance parseLine(String line) {
        line = line.toLowerCase(); // all strings convert to lowercase

        String[] parsedLine = line.split(";");

        return new StudentPerformance(parsedLine[0], parsedLine[2],
                Integer.parseInt(parsedLine[5]), Integer.parseInt(parsedLine[6]), Integer.parseInt(parsedLine[7]));
    }
}
