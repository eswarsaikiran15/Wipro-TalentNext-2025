import java.util.*;
import java.util.stream.Collectors;

class Student {
    int rollNo;
    String name;
    int mark;

    Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }
}

public class StudentFilter {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "John", 45));
        students.add(new Student(2, "Anita", 75));
        students.add(new Student(3, "Ravi", 62));
        students.add(new Student(4, "Kiran", 48));
        students.add(new Student(5, "Sara", 55));

        List<Student> passedStudents = students.stream()
            .filter(s -> s.mark >= 50)
            .collect(Collectors.toList());

        System.out.println("Total students who cleared: " + passedStudents.size());
    }
}
