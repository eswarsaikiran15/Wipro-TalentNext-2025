
public class FloydPattern {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please enter an integer number");
            return;
        }

        try {
            int rows = Integer.parseInt(args[0]);
            System.out.println("Using for loop:");
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            // Using while loop to print Floyd's pattern
            System.out.println("\nUsing while loop:");
            int i = 1;
            while (i <= rows) {
                int j = 1;
                while (j <= i) {
                    System.out.print("* ");
                    j++;
                }
                System.out.println();
                i++;
            }

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
        }
    }
}