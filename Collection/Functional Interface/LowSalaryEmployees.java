import java.util.*;
import java.util.function.Predicate;

class Emp {
    private int id;
    private String name;
    private double salary;

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() { return salary; }
    public String getName() { return name; }
}

public class LowSalaryEmployees {
    public static void main(String[] args) {
        ArrayList<Emp> employees = new ArrayList<>(Arrays.asList(
            new Emp(1, "A", 8000),
            new Emp(2, "B", 12000),
            new Emp(3, "C", 7000),
            new Emp(4, "D", 10000),
            new Emp(5, "E", 9500)
        ));

        Predicate<Emp> isLowSalary = e -> e.getSalary() < 10000;

        employees.stream()
            .filter(isLowSalary)
            .map(Emp::getName)
            .forEach(System.out::println);
    }
}
