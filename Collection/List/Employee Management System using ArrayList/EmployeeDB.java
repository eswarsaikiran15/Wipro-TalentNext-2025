import java.util.ArrayList;

public class EmployeeDB {
    ArrayList<Employee> list = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    public boolean deleteEmployee(int empId) {
        return list.removeIf(emp -> emp.empId == empId);
    }

    public String showPaySlip(int empId) {
        for (Employee emp : list) {
            if (emp.empId == empId) {
                return "PaySlip for Employee ID " + empId + ": " + emp.salary;
            }
        }
        return "Employee not found!";
    }

    public void showAllEmployees() {
        for (Employee emp : list) {
            emp.getEmployeeDetails();
        }
    }
}
