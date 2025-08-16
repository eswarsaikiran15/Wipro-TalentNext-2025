import java.time.LocalTime;

public class TimeAfter25Minutes {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime after25Minutes = now.plusMinutes(25);

        System.out.println("Current Time: " + now);
        System.out.println("Time After 25 Minutes: " + after25Minutes);
    }
}
