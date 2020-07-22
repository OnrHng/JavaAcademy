package academy.everyonecodes.java.evaluation2a.exercise2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Top3Salary {

    public List<Employee> find(List<Employee> employeeList) {

       List<Employee> top3Salary =  employeeList.stream()
               .sorted(Comparator.comparingInt(Employee::getSalary).reversed()) // we need to reversed the list , because sorted smallest to highest
               .limit(3)
               .collect(Collectors.toList());
        return top3Salary;
    }
}
