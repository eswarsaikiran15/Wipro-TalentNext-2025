public class Main {
    public static void main(String[] args) {
        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(1, "Alice", "alice@gmail.com", "Female", 50000);
        Employee e2 = new Employee(2, "Bob", "bob@gmail.com", "Male", 55000);

        db.addEmployee(e1);
        db.addEmployee(e2);

        db.showAllEmployees();

        System.out.println(db.showPaySlip(1));
        db.deleteEmployee(1);
        db.showAllEmployees();
    }
}
