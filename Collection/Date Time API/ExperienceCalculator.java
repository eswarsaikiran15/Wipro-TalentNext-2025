import java.time.LocalDate;
import java.time.Period;

public class ExperienceCalculator {
    public static void main(String[] args) {
        LocalDate joinDate = LocalDate.of(2021, 7, 1); // Replace with actual joining date
        LocalDate today = LocalDate.now();

        Period experience = Period.between(joinDate, today);
        System.out.println("Experience: " + experience.getYears() + " Years, "
                + experience.getMonths() + " Months, "
                + experience.getDays() + " Days");
    }
}
