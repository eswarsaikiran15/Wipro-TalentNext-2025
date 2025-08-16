import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    String location;
    double salary;

    Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }

    String getLocation() {
        return location;
    }
}

public class EmployeeLocations {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>(Arrays.asList(
            new Employee(1, "Alice", "Pune", 50000),
            new Employee(2, "Bob", "Mumbai", 45000),
            new Employee(3, "Cathy", "Hyderabad", 55000),
            new Employee(4, "David", "Chennai", 47000),
            new Employee(5, "Eva", "Delhi", 52000)
        ));

        Function<Employee, String> extractLocation = Employee::getLocation;

        ArrayList<String> locations = list.stream()
            .map(extractLocation)
            .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Locations: " + locations);
    }
}
