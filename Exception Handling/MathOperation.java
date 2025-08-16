public class MathOperation {
    public static void main(String[] args) {
        try {
            if (args.length != 5) {
                throw new IllegalArgumentException("Exactly 5 integers required.");
            }

            int[] nums = new int[5];
            int sum = 0;

            for (int i = 0; i < 5; i++) {
                nums[i] = Integer.parseInt(args[i]);
                sum += nums[i];
            }

            double avg = sum / 5.0;
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + avg);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
