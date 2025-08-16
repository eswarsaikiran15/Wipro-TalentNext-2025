package Mile1;

public class StudentMain {
    static Student[] data = new Student[4];

    public static void main(String[] args) {
        data[0] = new Student("Sekar", new int[]{85, 75, 95});
        data[1] = new Student(null, new int[]{11, 22, 33});
        data[2] = null;
        data[3] = new Student("Manoj", null);

        StudentReport report = new StudentReport();
        StudentService service = new StudentService();

        for (int i = 0; i < data.length; i++) {
            try {
                String status = report.validate(data[i]);
                if ("VALID".equals(status)) {
                    String grade = report.findGrades(data[i]);
                    System.out.println("Grade = " + grade);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println("Number of Null MarksArray objects = " + service.findNumberOfNullMarksArray(data));
        System.out.println("Number of Null Name objects = " + service.findNumberOfNullName(data));
        System.out.println("Number of Null Student objects = " + service.findNumberOfNullObjects(data));
    }

    static class Student {
        private String name;
        private int[] marks;
        private String grade;

        public Student() {}

        public Student(String name, int[] marks) {
            this.name = name;
            this.marks = marks;
        }

        public Student(String name, int[] marks, String grade) {
            this.name = name;
            this.marks = marks;
            this.grade = grade;
        }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        public int[] getMarks() { return marks; }
        public void setMarks(int[] marks) { this.marks = marks; }
        public String getGrade() { return grade; }
        public void setGrade(String grade) { this.grade = grade; }
    }

    static class NullStudentObjectException extends Exception {
        public String toString() {
            return "object is null";
        }
    }

    static class NullNameException extends Exception {
        public String toString() {
            return "name is null";
        }
    }

    static class NullMarksArrayException extends Exception {
        public String toString() {
            return "mark array is null";
        }
    }

    static class StudentReport {
        public String findGrades(Student student) {
            int[] marks = student.getMarks();
            for (int m : marks) {
                if (m < 35) return "F";
            }
            int sum = 0;
            for (int m : marks) sum += m;
            if (sum < 150) return "C";
            else if (sum < 200) return "B";
            else if (sum < 250) return "A";
            else return "A+";
        }

        public String validate(Student s) throws NullStudentObjectException,
                NullNameException, NullMarksArrayException {
            if (s == null) throw new NullStudentObjectException();
            if (s.getName() == null) throw new NullNameException();
            if (s.getMarks() == null) throw new NullMarksArrayException();
            return "VALID";
        }
    }

    static class StudentService {
        public int findNumberOfNullMarksArray(Student[] s) {
            int count = 0;
            if (s != null) {
                for (Student student : s) {
                    if (student != null && student.getMarks() == null) {
                        count++;
                    }
                }
            }
            return count;
        }

        public int findNumberOfNullName(Student[] s) {
            int count = 0;
            if (s != null) {
                for (Student student : s) {
                    if (student != null && student.getName() == null) {
                        count++;
                    }
                }
            }
            return count;
        }

        public int findNumberOfNullObjects(Student[] s) {
            int count = 0;
            if (s != null) {
                for (Student student : s) {
                    if (student == null) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
}