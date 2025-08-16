package Arrays;
public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {42, 7, 18, 99, 25, 64};

        java.util.Arrays.sort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}