package ClassesAndObjects;

public class Calculator {
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        int resultInt = powerInt(2, 3);        // 2^3 = 8
        double resultDouble = powerDouble(2.5, 3); // 2.5^3 = 15.625

        System.out.println("Integer Power Result: " + resultInt);
        System.out.println("Double Power Result: " + resultDouble);
    }
}