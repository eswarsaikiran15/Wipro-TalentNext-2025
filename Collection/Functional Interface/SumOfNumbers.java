import java.util.*;
import java.util.function.Function;

public class SumOfNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 8, 12, 3, 7, 9, 14, 1, 6, 10));

        Function<ArrayList<Integer>, Integer> sumFunction = list ->
            list.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Sum = " + sumFunction.apply(numbers));
    }
}
