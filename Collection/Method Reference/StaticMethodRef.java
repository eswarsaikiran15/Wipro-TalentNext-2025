@FunctionalInterface
interface DigitCounter {
    int count(int n);
}

class NumberUtil {
    public static int digitCount(int n) {
        return String.valueOf(Math.abs(n)).length();
    }
}

public class StaticMethodRef {
    public static void main(String[] args) {
        DigitCounter dc = NumberUtil::digitCount;
        System.out.println("Digits in 12345: " + dc.count(12345));
    }
}
