import java.util.*;

public class EmployeeRegister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        System.out.println("Enter the Number of Employees");
        int count = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= count; i++) {
            System.out.println("Enter Employee " + i + " Details:");
            System.out.print("Enter the Firstname: ");
            String firstName = sc.nextLine();

            System.out.print("Enter the Lastname: ");
            String lastName = sc.nextLine();

            System.out.print("Enter the Mobile: ");
            String mobile = sc.nextLine();

            System.out.print("Enter the Email: ");
            String email = sc.nextLine();

            System.out.print("Enter the Address: ");
            String address = sc.nextLine();

            employeeList.add(new Employee(firstName, lastName, mobile, email, address));
        }

        Collections.sort(employeeList);

        System.out.println("Employee List:");
        System.out.format("%-15s %-15s %-15s %-30s %-15s\n", 
                          "Firstname", "Lastname", "Mobile", "Email", "Address");

        for (Employee emp : employeeList) {
            System.out.format("%-15s %-15s %-15s %-30s %-15s\n", 
                              emp.getFirstName(), emp.getLastName(), emp.getMobile(), emp.getEmail(), emp.getAddress());
        }
    }
}
