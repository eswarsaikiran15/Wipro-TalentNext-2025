package Collection.List;

public class EmployeeVector {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    public EmployeeVector(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public void getEmployeeDetails() {
        System.out.println("ID: " + empId + ", Name: " + empName + ", Email: " + email +
                ", Gender: " + gender + ", Salary: " + salary);
    }
}
