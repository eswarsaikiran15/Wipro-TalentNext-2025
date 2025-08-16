@FunctionalInterface
interface PrimeChecker {
    MyNumber check(int n);
}

class MyNumber {
    MyNumber(int n) {
        boolean isPrime = true;
        if (n <= 1) isPrime = false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(n + " is " + (isPrime ? "Prime" : "Not Prime"));
    }
}

public class ConstructorMethodRef {
    public static void main(String[] args) {
        PrimeChecker pc = MyNumber::new;
        pc.check(7);
        pc.check(10);
    }
}
