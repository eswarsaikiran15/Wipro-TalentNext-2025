import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PerfectSquares {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(4, 9, 16, 7, 25, 10, 1, 36, 40, 64));

        Predicate<Integer> isPerfectSquare = n -> Math.sqrt(n) % 1 == 0;

        List<Integer> perfectSquares = numbers.stream()
            .filter(isPerfectSquare)
            .collect(Collectors.toList());

        System.out.println("Perfect Squares: " + perfectSquares);
    }
}
