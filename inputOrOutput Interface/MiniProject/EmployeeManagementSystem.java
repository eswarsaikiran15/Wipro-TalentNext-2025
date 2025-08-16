import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id;
    String name;
    int age;
    double salary;

    Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + age + " " + salary;
    }
}

public class EmployeeManagementSystem {
    static final String FILE_NAME = "employees.dat";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = readFromFile();

        while (true) {
            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Employee Age: ");
                    int age = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Employee Salary: ");
                    double salary = Double.parseDouble(sc.nextLine());

                    Employee emp = new Employee(id, name, age, salary);
                    employeeList.add(emp);
                    writeToFile(employeeList);
                    break;

                case 2:
                    System.out.println("----Report-----");
                    for (Employee e : employeeList) {
                        System.out.println(e);
                    }
                    System.out.println("----End of Report-----");
                    break;

                case 3:
                    System.out.println("Exiting the System");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    static List<Employee> readFromFile() {
        List<Employee> list = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            list = (List<Employee>) ois.readObject();
        } catch (FileNotFoundException e) {
            // File not created yet — return empty list
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return list;
    }

    static void writeToFile(List<Employee> list) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(list);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
