public class NumberReverse {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter a number to reverse");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]);
            int reversed = 0;

            while (num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }

            System.out.println(reversed);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide a valid integer.");
        }
    }
}