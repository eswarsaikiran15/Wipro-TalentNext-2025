import java.time.LocalDate;

public class LeapYearCheck {
    public static void main(String[] args) {
        int year = LocalDate.now().getYear();
        boolean isLeap = LocalDate.of(year, 1, 1).isLeapYear();

        System.out.println("Is " + year + " a Leap Year? " + isLeap);
    }
}
