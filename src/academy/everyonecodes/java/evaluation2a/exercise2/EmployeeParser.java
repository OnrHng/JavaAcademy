package academy.everyonecodes.java.evaluation2a.exercise2;

public class EmployeeParser {

    public Employee parseLine(String line) {

        String[] splittedLine = line.split(",");

        return new Employee(splittedLine[0], splittedLine[1], Integer.parseInt(splittedLine[2]));
    }
}
