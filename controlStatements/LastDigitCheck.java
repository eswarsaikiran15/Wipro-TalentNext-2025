

import java.util.Scanner;

public class LastDigitCheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            boolean result = (a % 10) == (b % 10);
            System.out.println("Result: " + result);
        }
    }
}
