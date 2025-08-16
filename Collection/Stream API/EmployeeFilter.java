import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int empNo;
    String name;
    int age;
    String location;

    Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    void printDetails() {
        System.out.println(empNo + " " + name + " " + age + " " + location);
    }
}

public class EmployeeFilter {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", 28, "Pune"));
        employees.add(new Employee(102, "Bob", 30, "Delhi"));
        employees.add(new Employee(103, "Charlie", 25, "Pune"));
        employees.add(new Employee(104, "David", 27, "Mumbai"));
        employees.add(new Employee(105, "Eva", 32, "Pune"));

        List<Employee> puneEmployees = employees.stream()
            .filter(e -> e.location.equalsIgnoreCase("Pune"))
            .collect(Collectors.toList());

        System.out.println("Employees in Pune:");
        puneEmployees.forEach(Employee::printDetails);
    }
}
