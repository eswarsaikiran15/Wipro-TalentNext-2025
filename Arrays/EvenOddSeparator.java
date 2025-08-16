package Arrays;
public class EvenOddSeparator {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1, 1};
        int[] result = new int[arr.length];
        int idx = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                result[idx++] = num;
            }
        }
        for (int num : arr) {
            if (num % 2 != 0) {
                result[idx++] = num;
            }
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}