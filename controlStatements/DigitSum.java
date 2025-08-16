
public class DigitSum {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide one number as input.");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]);
            int sum = 0;
            num = Math.abs(num);

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            System.out.println("Sum of digits: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}