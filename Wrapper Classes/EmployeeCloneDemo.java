class Employee implements Cloneable {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class EmployeeCloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp1 = new Employee("Alice", 101);
        Employee emp2 = (Employee) emp1.clone();

        emp1.name = "Bob";
        emp1.id = 202;

        System.out.println("Original Employee: " + emp1.name + ", " + emp1.id);
        System.out.println("Cloned Employee: " + emp2.name + ", " + emp2.id);
    }
}
