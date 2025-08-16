package Arrays;
public class WithoutTen {
    public static void main(String[] args) {
        int[] input = {1, 10, 10, 2};
        int[] output = new int[input.length];
        int idx = 0;

        for (int num : input) {
            if (num != 10) {
                output[idx++] = num;
            }
        }

        for (int num : output) {
            System.out.print(num + " ");
        }
    }
}