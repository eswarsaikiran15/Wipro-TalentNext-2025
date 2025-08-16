package Arrays;
public class ArrayMax3x3 {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers");
            return;
        }

        int[][] arr = new int[3][3];
        int index = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = Integer.parseInt(args[index++]);
            }
        }

        System.out.println("The given array is :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        int max = arr[0][0];
        for (int[] row : arr) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }

        System.out.println("The biggest number in the given array is " + max);
    }
}