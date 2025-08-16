import java.io.*;
import java.util.Date;

public class EmployeeTest {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("Sudhir", new Date(), "HR", "Manager", 90000.0);

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data"))) {
            oos.writeObject(emp);
            System.out.println("Employee object serialized to 'data'");
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data"))) {
            Employee deserializedEmp = (Employee) ois.readObject();
            System.out.println("---- Deserialized Employee Details ----");
            System.out.println("Name: " + deserializedEmp.getName());
            System.out.println("Date of Birth: " + deserializedEmp.getDateOfBirth());
            System.out.println("Department: " + deserializedEmp.getDepartment());
            System.out.println("Designation: " + deserializedEmp.getDesignation());
            System.out.println("Salary: " + deserializedEmp.getSalary());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}
