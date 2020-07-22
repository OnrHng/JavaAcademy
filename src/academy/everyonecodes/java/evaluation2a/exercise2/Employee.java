package academy.everyonecodes.java.evaluation2a.exercise2;

import java.util.Objects;

public class Employee {
    private String department;
    private String name;
    private int salary;

    public Employee(String department, String name, int salary) {
        this.department = department;
        this.name = name;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary &&
                Objects.equals(department, employee.department) &&
                Objects.equals(name, employee.name);
    }

}
