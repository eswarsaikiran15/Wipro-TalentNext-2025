public class PalindromeCheck {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a single number.");
            return;
        }

        try {
            int num = Integer.parseInt(args[0]);
            int original = num;
            int reversed = 0;

            while (num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }

            if (original == reversed) {
                System.out.println(original + " is a palindrome");
            } else {
                System.out.println(original + " is not a palindrome");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}