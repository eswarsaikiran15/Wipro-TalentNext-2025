import java.util.*;
import java.util.stream.Collectors;

public class NegativeEvenFilter {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(-10, -3, 4, -8, 9, -5, 2, -12));

        List<Integer> negativeEven = numbers.stream()
            .filter(n -> n < 0 && n % 2 == 0)
            .collect(Collectors.toList());

        System.out.println("Negative even numbers: " + negativeEven);
    }
}
