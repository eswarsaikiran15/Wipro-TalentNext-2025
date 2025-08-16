@FunctionalInterface
interface FactorialFunction {
    int compute(int n);
}

class MyMath {
    public int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++)
            result *= i;
        return result;
    }
}

public class FactorialMethodRef {
    public static void main(String[] args) {
        MyMath obj = new MyMath();
        FactorialFunction f = obj::factorial;
        System.out.println("Factorial of 5: " + f.compute(5));
    }
}
