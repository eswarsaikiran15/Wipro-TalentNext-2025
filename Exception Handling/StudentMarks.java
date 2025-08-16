import java.util.Scanner;

class NegativeValueException extends Exception {
    public NegativeValueException(String msg) {
        super(msg);
    }
}

class OutOfRangeException extends Exception {
    public OutOfRangeException(String msg) {
        super(msg);
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            for (int i = 1; i <= 2; i++) {
                System.out.println("Enter name of Student " + i);
                String name = sc.nextLine();

                int total = 0;
                for (int j = 1; j <= 3; j++) {
                    System.out.println("Enter marks for subject " + j);
                    int mark = Integer.parseInt(sc.nextLine());

                    if (mark < 0) throw new NegativeValueException("Negative marks entered");
                    if (mark > 100) throw new OutOfRangeException("Marks out of range");

                    total += mark;
                }

                System.out.println("Average marks of " + name + ": " + (total / 3.0));
            }
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter integers only.");
        } catch (NegativeValueException | OutOfRangeException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
