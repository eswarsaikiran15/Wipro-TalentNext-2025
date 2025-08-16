package Collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {
    public static void main(String[] args) {
        HashSet<String> employees = new HashSet<>();
        employees.add("Alice");
        employees.add("Bob");
        employees.add("Charlie");

        System.out.println("Employee Names:");
        Iterator<String> it = employees.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
