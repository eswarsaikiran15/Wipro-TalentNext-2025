// Save this file as Factorial.java
public class Factorial {
    public static void main(String[] args) {
        if (args.length == 1) {
            try {
                int num = Integer.parseInt(args[0]);
                long result = 1;
                for (int i = 2; i <= num; i++) {
                    result *= i;
                }
                System.out.println("Factorial of " + num + " is " + result);
            } catch (NumberFormatException e) {
                System.out.println("Please provide a valid integer.");
            }
        } else {
            System.out.println("Please provide exactly one integer argument.");
        }
    }
}