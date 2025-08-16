
import java.util.*;
import java.util.stream.*;

public class PrimeNumbersWithLambda {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 25; i++) {
            al.add(rand.nextInt(100) + 1);
        }

        System.out.println("Prime numbers in the list:");
        al.stream().filter(n -> isPrime(n)).forEach(n -> System.out.println(n));
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        return IntStream.rangeClosed(2, (int)Math.sqrt(n)).allMatch(i -> n % i != 0);
    }
}
