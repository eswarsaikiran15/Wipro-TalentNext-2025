import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;

public class SecondSundayNextMonth {
    public static void main(String[] args) {
        LocalDate firstOfNextMonth = LocalDate.now().plusMonths(1).withDayOfMonth(1);
        LocalDate firstSunday = firstOfNextMonth.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
        LocalDate secondSunday = firstSunday.plusWeeks(1);

        System.out.println("Next Month's Second Sunday: " + secondSunday);
    }
}
