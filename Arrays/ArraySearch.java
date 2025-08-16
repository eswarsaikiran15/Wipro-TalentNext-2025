package Arrays;
public class ArraySearch {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide one number to search.");
            return;
        }

        int[] numbers = {1, 4, 34, 56, 7};

        try {
            int target = Integer.parseInt(args[0]);
            int index = -1;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == target) {
                    index = i;
                    break;
                }
            }

            System.out.println(index);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}