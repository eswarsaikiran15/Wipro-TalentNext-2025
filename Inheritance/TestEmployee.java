public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice Johnson", 75000.0, 2015, "NI123456A");

        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Start Year: " + emp.getStartYear());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());

        emp.setAnnualSalary(80000.0);
        System.out.println("Updated Salary: " + emp.getAnnualSalary());
    }
}