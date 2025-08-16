

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int num = sc.nextInt();

            if (num > 0) {
                System.out.println(num + " is Positive");
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println("The number is Zero");
            }
        }
    }
}
